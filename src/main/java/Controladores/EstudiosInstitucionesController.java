/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import DAO.AreasDao;
import DAO.AreasDaoImpl;
import DAO.ConceptosDao;
import DAO.ConceptosInstitucionDao;
import DAO.ConceptosDaoImp;
import DAO.ConceptosInstitucionDaoImpl;
import DAO.InstitucionDao;
import DAO.InstitucionDaoImp;
import Tables.TableConceptos;
import Tables.TableInstituciones;
import Utilidades.BarUtil;
import Vistas.EstudiosInstituciones;
import Vistas.Menu;
import clientews.servicio.Areas;
import clientews.servicio.Conceptos;
import clientews.servicio.ConceptosInstitucion;
import clientews.servicio.Institucion;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author alanm
 */
public class EstudiosInstitucionesController implements ActionListener, KeyListener, MouseListener {

    private EstudiosInstituciones vista;
    private ConceptosDao modeloConceptos;
    private InstitucionDao modeloInstituciones;
    private ConceptosInstitucionDao modeloConceptosInstituciones;
    private Institucion institucionSeleccionada;
    private Conceptos estudioSeleccionado;
    private ConceptosInstitucion relacionSeleccionada;
    private Areas areaBusqueda;
    private AreasDao modeloAreas;

    public EstudiosInstitucionesController(EstudiosInstituciones vista) {
        this.vista = vista;

        this.vista.btnCerrar.addActionListener(this);
        this.vista.btnMin.addActionListener(this);
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
        this.vista.btnRegresar.addActionListener(this);
        this.vista.btnCerrar.addActionListener(this);
        this.vista.btnMin.addActionListener(this);
        this.vista.comboArea.addActionListener(this);

        this.vista.txtBuscarEstudio.addKeyListener(this);
        this.vista.txtBuscarInstitucion.addKeyListener(this);
        this.vista.txtNombreInterno.addKeyListener(this);

        this.vista.tableEstudios.addMouseListener(this);
        this.vista.tableInstituciones.addMouseListener(this);
        this.vista.tableConceptosInstitucion.addMouseListener(this);
    }

    public void iniciar() {
        vista.setTitle("Vincular");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);

        modeloConceptos = new ConceptosDaoImp();
        modeloInstituciones = new InstitucionDaoImp();
        modeloConceptosInstituciones = new ConceptosInstitucionDaoImpl();
        modeloAreas = new AreasDaoImpl();

        vista.txtEstudio.setEditable(false);
        vista.txtInstitucion.setEditable(false);

        cargarTablaConceptosVacia();
        cargarTablaInstitucionesVacia();
        cargarTablaInstitucionesConceptosVacia();
        cargarAreas();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnCerrar) {
            cerrar();
        } else if (e.getSource() == vista.btnMin) {
            minimizar();
        } else if (e.getSource() == vista.btnGuardar) {
            guardar();
        } else if (e.getSource() == vista.btnModificar) {
            modificar();
        } else if (e.getSource() == vista.btnRegresar) {
            abrirMenu();
        } else if (e.getSource() == vista.btnMin) {
            BarUtil.minimizar(vista);
        } else if (e.getSource() == vista.btnCerrar) {
            BarUtil.cerrar(vista);
        } else if (e.getSource() == vista.comboArea) {
            if (vista.comboArea.getSelectedIndex() != 0) {
                encontrarAreaBusqueda();
            }
            realizarBusqueda();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == vista.txtBuscarInstitucion) {
            if (!vista.txtBuscarInstitucion.getText().equals("")) {
                cargarTablaInstitucionLikeNombre(vista.txtBuscarInstitucion.getText());
            } else {
                cargarTablaInstitucionesVacia();
            }
        } else if (e.getSource() == vista.txtBuscarEstudio) {
            realizarBusqueda();
        } else if (e.getSource() == vista.txtNombreInterno) {
            vista.txtNombreInterno.setText(vista.txtNombreInterno.getText().toUpperCase());
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vista.tableInstituciones) {
            if (vista.tableInstituciones.getSelectedRow() != -1) {
                int fila = vista.tableInstituciones.getSelectedRow();
                Long id = Long.parseLong(vista.tableInstituciones.getValueAt(fila, 1).toString());
                institucionSeleccionada = buscarInstitucionPorId(id);

                //Llevar al text
                vista.txtInstitucion.setText(institucionSeleccionada.getNombreInstitucion());

                cargarTablaInstitucionesConceptos();

            }
        } else if (e.getSource() == vista.tableEstudios) {
            if (vista.tableEstudios.getSelectedRow() != -1) {
                int fila = vista.tableEstudios.getSelectedRow();
                Long id = Long.parseLong(vista.tableEstudios.getValueAt(fila, 2).toString());

                estudioSeleccionado = buscarEstudioPorId(id);

                //LLevar al text
                vista.txtEstudio.setText(estudioSeleccionado.getConceptoTo());

            }
        } else if (e.getSource() == vista.tableConceptosInstitucion) {
            if (vista.tableConceptosInstitucion.getSelectedRow() != -1) {
                int fila = vista.tableConceptosInstitucion.getSelectedRow();
                Long id = Long.parseLong(vista.tableConceptosInstitucion.getValueAt(fila, 2).toString());

                estudioSeleccionado = buscarEstudioPorId(id);

                //LLevar al text
                vista.txtEstudio.setText(estudioSeleccionado.getConceptoTo());

                System.out.println("id institucion " + institucionSeleccionada.getIdInstitucion());
                System.out.println("id concepto " + estudioSeleccionado.getIdTo());

                relacionSeleccionada = modeloConceptosInstituciones.encontrarConceptoInstitucionPorIdConceptoIdInstitucion(estudioSeleccionado.getIdTo(), institucionSeleccionada.getIdInstitucion());

                cargarCampos(relacionSeleccionada);
            }
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    private void abrirMenu() {
        vista.dispose();
        MenuController menu = new MenuController(new Menu());
        menu.iniciar();
    }

    private void cerrar() {
        if (deseaCerrar()) {
            System.exit(0);
        }
    }

    private boolean deseaCerrar() {
        int dialog = JOptionPane.YES_NO_OPTION;
        return (JOptionPane.showConfirmDialog(null, "¿Seguro que desea cerrar el programa? ", "Cerrar", dialog) == 0);
    }

    private void minimizar() {
        vista.setExtendedState(ICONIFIED);
    }

    private void modificar() {
        if (datosValidosModificar() && deseaModificar()) {
            try {
                obtenerDatosParaModificacion();
                modificarDb();
                JOptionPane.showMessageDialog(null, "Se ha actualizado el estudio");
                limpiar();
                cargarTablaInstitucionesConceptos();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se ha podido actualizar el estudio");
                e.printStackTrace(System.out);
            }
        }
    }

    private void guardar() {
        if (datosValidosGuardar() && deseaGuardar()) {
            try {
                obtenerDatos();
                persistirDb();
                JOptionPane.showMessageDialog(null, "Se ha vinculado el estudio");
                limpiar();
                cargarTablaInstitucionesConceptos();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se ha podido asignar el estudio");
                e.printStackTrace(System.out);
            }
        }
    }

    private void cargarTablaConceptosVacia() {
        TableConceptos generadorTablaConceptos = new TableConceptos();
        generadorTablaConceptos.cargarTablaVacia(vista.tableEstudios);
    }

    private void cargarTablaInstitucionesVacia() {
        TableInstituciones generadorTablaInstituciones = new TableInstituciones();
        generadorTablaInstituciones.cargarTablaVacia(vista.tableInstituciones);
    }

    private void cargarTablaInstitucionesConceptosVacia() {
        TableConceptos generadorTablaConceptos = new TableConceptos();
        generadorTablaConceptos.cargarTablaVacia(vista.tableConceptosInstitucion);
    }

    private void cargarTablaInstitucionLikeNombre(String text) {
        TableInstituciones generadorTablaInstituciones = new TableInstituciones();
        generadorTablaInstituciones.cargarTabla(vista.tableInstituciones, modeloInstituciones.encontrarInstitucionesLikeNombre(text));
    }

    private void cargarTablaConceptosLikeNombre(String text) {
        TableConceptos generadorTablaConceptos = new TableConceptos();
        generadorTablaConceptos.cargarTabla(vista.tableEstudios, modeloConceptos.encontrarConceptoLikeNombre(text));
    }

    private Institucion buscarInstitucionPorId(Long id) {
        Institucion temporal = new Institucion();
        temporal.setIdInstitucion(id);
        return modeloInstituciones.encontrarPorId(temporal);
    }

    private void cargarTablaInstitucionesConceptos() {
        TableConceptos generadorTablaConceptos = new TableConceptos();
        generadorTablaConceptos.cargarTabla(vista.tableConceptosInstitucion, modeloConceptos.encontrarConceptosPorIdInstitucion(institucionSeleccionada.getIdInstitucion()));
    }

    private Conceptos buscarEstudioPorId(Long id) {
        Conceptos temporal = new Conceptos();
        temporal.setIdTo(id);
        return modeloConceptos.encontrarConceptoPorId(temporal);
    }

    private void cargarCampos(ConceptosInstitucion relacionSeleccionada) {
        vista.txtPrecioPublico.setText(relacionSeleccionada.getPrecioPublico() + "");
        vista.txtCosto.setText(relacionSeleccionada.getPrecio() + "");
        vista.txtClaveInstitucion.setText(relacionSeleccionada.getIdInternoInstitucion());
        vista.txtClaveContpaq.setText(relacionSeleccionada.getIdContpaq());
        vista.txtClaveAnteriorPensiones.setText(relacionSeleccionada.getPensionesClaveAnterior());
        vista.checkActivo.setSelected(relacionSeleccionada.isActivo());
        vista.txtNombreInterno.setText(relacionSeleccionada.getNombre());
    }

    private boolean datosValidosGuardar() {
        if (vista.tableInstituciones.getSelectedRow() == -1) {
            return false;
        }
        if (vista.tableEstudios.getSelectedRow() == -1) {
            return false;
        }
        if (vista.txtPrecioPublico.getText().equals("")) {
            return false;
        }
        if (vista.txtClaveInstitucion.getText().equals("")) {
            return false;
        }
        if (vista.txtClaveContpaq.getText().equals("")) {
            return false;
        }
        if (!esDecimal(vista.txtPrecioPublico.getText())) {
            return false;
        }
        if (!vista.txtCosto.getText().equals("")) {
            //Si hay costo
            if (!esDecimal(vista.txtCosto.getText())) {
                //Pero no es decimal
                return false;
            }
        }
        if (vista.txtNombreInterno.getText().equals("")) {
            return false;
        }
        return true;
    }

    private void obtenerDatos() {
        relacionSeleccionada = new ConceptosInstitucion();
        relacionSeleccionada.setActivo(vista.checkActivo.isSelected());
        relacionSeleccionada.setIdConcepto(estudioSeleccionado);
        relacionSeleccionada.setIdContpaq(vista.txtClaveContpaq.getText());
        relacionSeleccionada.setIdInstitucion(institucionSeleccionada);
        relacionSeleccionada.setIdInternoInstitucion(vista.txtClaveInstitucion.getText());
        relacionSeleccionada.setLimiteDiario(0); //Ya no es límite diario por estudio
        relacionSeleccionada.setPensionesClaveAnterior(vista.txtClaveAnteriorPensiones.getText());
        relacionSeleccionada.setNombre(vista.txtNombreInterno.getText());
        if (!vista.txtCosto.getText().equals("")) {
            relacionSeleccionada.setPrecio(Double.parseDouble(vista.txtCosto.getText()));
        }
        relacionSeleccionada.setPrecioPublico(Double.parseDouble(vista.txtPrecioPublico.getText()));
    }

    private boolean deseaGuardar() {
        int dialog = JOptionPane.YES_NO_OPTION;
        return (JOptionPane.showConfirmDialog(null, "¿Seguro que desea asignar el estudio? ", "Asignar", dialog)) == 0;
    }

    private void limpiar() {
        vista.txtEstudio.setText("");
        vista.txtInstitucion.setText("");
        vista.txtCosto.setText("");
        vista.txtPrecioPublico.setText("");
        vista.txtClaveInstitucion.setText("");
        vista.txtClaveContpaq.setText("");
        vista.txtClaveAnteriorPensiones.setText("");
        vista.checkActivo.setSelected(false);
        vista.txtNombreInterno.setText("");

        vista.txtBuscarEstudio.setText("");
        vista.txtBuscarInstitucion.setText("");
    }

    private void persistirDb() {
        modeloConceptosInstituciones.registrarConceptosInstitucion(relacionSeleccionada);
    }

    private boolean esDecimal(String text) {
        try {
            Double.parseDouble(text);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean datosValidosModificar() {
        if (vista.tableInstituciones.getSelectedRow() == -1) {
            return false;
        }
        if (vista.tableConceptosInstitucion.getSelectedRow() == -1) {
            return false;
        }
        if (vista.txtPrecioPublico.getText().equals("")) {
            return false;
        }
        if (vista.txtClaveInstitucion.getText().equals("")) {
            return false;
        }
        if (vista.txtClaveContpaq.getText().equals("")) {
            return false;
        }
        if (!esDecimal(vista.txtPrecioPublico.getText())) {
            return false;
        }
        if (!vista.txtCosto.getText().equals("")) {
            //Si hay costo
            if (!esDecimal(vista.txtCosto.getText())) {
                //Pero no es decimal
                return false;
            }
        }
        if (vista.txtNombreInterno.getText().equals("")) {
            return false;
        }
        return true;
    }

    private boolean deseaModificar() {
        int dialog = JOptionPane.YES_NO_OPTION;
        return (JOptionPane.showConfirmDialog(null, "¿Seguro que desea modificar el estudio? ", "Modificar", dialog)) == 0;
    }

    private void obtenerDatosParaModificacion() {
        System.out.println(vista.checkActivo.isSelected());
        relacionSeleccionada.setActivo(vista.checkActivo.isSelected());
        relacionSeleccionada.setIdConcepto(estudioSeleccionado);
        relacionSeleccionada.setIdContpaq(vista.txtClaveContpaq.getText());
        relacionSeleccionada.setIdInstitucion(institucionSeleccionada);
        relacionSeleccionada.setIdInternoInstitucion(vista.txtClaveInstitucion.getText());
        relacionSeleccionada.setLimiteDiario(0); //Ya no es límite diario por estudio
        relacionSeleccionada.setPensionesClaveAnterior(vista.txtClaveAnteriorPensiones.getText());
        relacionSeleccionada.setNombre(vista.txtNombreInterno.getText());
        if (!vista.txtCosto.getText().equals("")) {
            relacionSeleccionada.setPrecio(Double.parseDouble(vista.txtCosto.getText()));
        }
        relacionSeleccionada.setPrecioPublico(Double.parseDouble(vista.txtPrecioPublico.getText()));
    }

    private void modificarDb() {
        modeloConceptosInstituciones.actualizarConceptosInstitucion(relacionSeleccionada);
    }

    private void realizarBusqueda() {
        if (!vista.txtBuscarEstudio.getText().equals("") && vista.comboArea.getSelectedIndex() != 0) { //Buscar por los dos parámetros
            cargarEstudios(vista.txtBuscarEstudio.getText(), areaBusqueda);
            System.out.println("Buscando por dos parámetros");
        } else if (!vista.txtBuscarEstudio.getText().equals("")) { //Buscar solo por nombre
            cargarEstudios(vista.txtBuscarEstudio.getText());
            System.out.println("Buscando por nombre");
        } else if (vista.comboArea.getSelectedIndex() != 0) { //Buscar por area
            cargarEstudios(areaBusqueda);
            System.out.println("Buscando por área");
        } else {
            cargarEstudios(); //cargar todo
            System.out.println("Cargando todo");
        }
    }

    private void cargarEstudios(String text, Areas paraBuscar) {
        TableConceptos generadorTabla = new TableConceptos();
        generadorTabla.cargarTabla(vista.tableEstudios, modeloConceptos.encontrarConceptosPorAreaYNombre(paraBuscar.getIdA(), text));
    }

    private void cargarEstudios(Areas paraBuscar) {
        TableConceptos generadorTabla = new TableConceptos();
        generadorTabla.cargarTabla(vista.tableEstudios, modeloConceptos.encontrarConceptosPorIdArea(paraBuscar.getIdA()));
    }

    private void cargarEstudios() {
        TableConceptos generadorTabla = new TableConceptos();
        generadorTabla.cargarTabla(vista.tableEstudios, modeloConceptos.encontrarTodosConceptos());
    }

    private void cargarEstudios(String text) {
        TableConceptos generadorTabla = new TableConceptos();
        generadorTabla.cargarTabla(vista.tableEstudios, modeloConceptos.encontrarConceptoLikeNombre(text));
    }

    private void cargarAreas() {
        try {
            JComboBox combo = new JComboBox();
            combo.removeAllItems();
            combo.addItem("SELECCIONE UNA OPCIÓN");
            for (Areas areasFor : modeloAreas.listar()) {
                combo.addItem(areasFor.getNombreA());
            }
            vista.comboArea.setModel(combo.getModel());
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
    private void encontrarAreaBusqueda() {
        try {
            areaBusqueda = modeloAreas.encontrarPorNombre(vista.comboArea.getSelectedItem().toString());
            System.out.println(areaBusqueda.getIdA() + " " + areaBusqueda.getNombreA());
        } catch (Exception e) {
            System.out.println("No pude encontrar el área para búsqueda");
        }
    }

}
