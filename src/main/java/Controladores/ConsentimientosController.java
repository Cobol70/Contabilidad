/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import DAO.AreasDao;
import DAO.AreasDaoImpl;
import DAO.ConceptosDao;
import DAO.ConceptosDaoImp;
import DAO.ConsentimientoConceptoDao;
import DAO.ConsentimientoConceptoDaoImpl;
import DAO.ConsentimientoDao;
import DAO.ConsentimientoDaoImpl;
import Tables.TableConceptos;
import Tables.TableConsentimientos;
import Vistas.Consentimientos;
import Vistas.Menu;
import Vistas.NuevoConsentimiento;
import clientews.servicio.Areas;
import clientews.servicio.Conceptos;
import clientews.servicio.Consentimiento;
import clientews.servicio.ConsentimientoConcepto;
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
public class ConsentimientosController implements ActionListener, KeyListener, MouseListener {

    private Consentimientos vista;
    private ConceptosDao modeloConceptos;
    private Areas areaBusqueda;
    private AreasDao modeloAreas;
    private Conceptos estudio;
    private ConsentimientoDao modeloConsentimientos;
    private Consentimiento consentimiento;
    private ConsentimientoConceptoDao modeloConsentimientoConcepto;

    public ConsentimientosController(Consentimientos vista) {
        this.vista = vista;

        //Action listener a botones
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnNuevoConsentimiento.addActionListener(this);
        this.vista.btnVerConsentimiento.addActionListener(this);

        //Action listener a comboBox
        this.vista.comboAreaBusqueda.addActionListener(this);
        this.vista.comboConsentimiento.addActionListener(this);

        //Mouse listener a tablas e ícono de regreso
        this.vista.tableConsentimientos.addMouseListener(this);
        this.vista.tableEstudios.addMouseListener(this);
        this.vista.lblIcono.addMouseListener(this);

        //KeyListener a textos
        this.vista.txtBuscar.addKeyListener(this);

    }

    public void iniciar() {
        vista.txtEstudio.setEditable(false);
        vista.setTitle("Consentimientos");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);

        modeloConceptos = new ConceptosDaoImp();
        modeloAreas = new AreasDaoImpl();
        modeloConsentimientos = new ConsentimientoDaoImpl();
        modeloConsentimientoConcepto = new ConsentimientoConceptoDaoImpl();

        cargarAreas();
        cargarConsentimientos();
        cargarConsentimientosVacios();
        //cargarEstudios();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.comboAreaBusqueda) {
            if (vista.comboAreaBusqueda.getSelectedIndex() != 0) {
                encontrarAreaBusqueda();
            }
            realizarBusqueda();
        } else if (e.getSource() == vista.comboConsentimiento) {
            if (vista.comboConsentimiento.getSelectedIndex() != 0) {
                consentimiento = buscarConsentimientoPorNombre(vista.comboConsentimiento.getSelectedItem().toString());
            }
        } else if (e.getSource() == vista.btnGuardar) {
            if (vista.tableEstudios.getSelectedRow() != -1 && vista.comboConsentimiento.getSelectedIndex() != 0) { //Ya hay un estudio seleccionado y un consentimiento para agregar
                if (deseaAgregar() == 0) {
                    try {
                        ConsentimientoConcepto temporal = new ConsentimientoConcepto();
                        temporal.setIdConcepto(estudio);
                        temporal.setIdConsentimiento(consentimiento);
                        modeloConsentimientoConcepto.registrarConsentimientoConcepto(temporal);
                        JOptionPane.showMessageDialog(null, "Se ha agregado el consentimiento");
                        cargarTablaConsentimientos();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Error al agregar consentimiento");
                    }
                }
            }
        } else if (e.getSource() == vista.btnEliminar) {
            if (vista.tableEstudios.getSelectedRow() != -1 && vista.comboConsentimiento.getSelectedIndex() != 0) { //Ya hay un estudio seleccionado y un consentimiento para agregar
                if (deseaEliminar() == 0) {
                    try {
                        ConsentimientoConcepto temporal = new ConsentimientoConcepto();
                        temporal.setIdConcepto(estudio);
                        temporal.setIdConsentimiento(consentimiento);
                        //La eliminación tiene que ser con esos dos parámetros, no por id
                        modeloConsentimientoConcepto.eliminarConsentimientoConcepto(temporal);
                        JOptionPane.showMessageDialog(null, "Se ha quitado el consentimiento");
                        cargarTablaConsentimientos();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Error al quitar consentimsiento");
                    }
                }
            }
        } else if (e.getSource() == vista.btnVerConsentimiento) {
            if (vista.comboConsentimiento.getSelectedIndex() != 0) {
                JOptionPane.showMessageDialog(null, consentimiento.getTexto());
            }
        } else if (e.getSource() == vista.btnNuevoConsentimiento) {
            abrirNuevoConsentimiento();
        }
    }

    @Override
    public void keyTyped(KeyEvent e
    ) {
    }

    @Override
    public void keyPressed(KeyEvent e
    ) {
    }

    @Override
    public void keyReleased(KeyEvent e
    ) {
        if (e.getSource() == vista.txtBuscar) {
            realizarBusqueda();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e
    ) {
        if (e.getSource() == vista.lblIcono) {
            abrirMenu();
        } else if (e.getSource() == vista.tableEstudios) {
            if (vista.tableEstudios.getSelectedRow() != -1) {
                //Se va a realizar la búsqueda del estudio en el backend
                int fila = vista.tableEstudios.getSelectedRow(); //Se obtiene la fila seleccionada
                Long id = Long.parseLong(vista.tableEstudios.getValueAt(fila, 2).toString()); //Se obtiene el id del estudio de la tabla

                estudio = new Conceptos();
                estudio.setIdTo(id);
                estudio = modeloConceptos.encontrarConceptoPorId(estudio);

                //Cargar texto del estudio
                vista.txtEstudio.setText(estudio.getConceptoTo());

                
                cargarTablaConsentimientos();
            }
        } else if (e.getSource() == vista.tableConsentimientos) {
            if (vista.tableConsentimientos.getSelectedRow() != -1) {
                int fila = vista.tableConsentimientos.getSelectedRow();
                Long id = Long.parseLong(vista.tableConsentimientos.getValueAt(fila, 1).toString());
                consentimiento = buscarConsentimiento(id);
                
                vista.comboConsentimiento.setSelectedItem(consentimiento.getNombre());
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e
    ) {
    }

    @Override
    public void mouseReleased(MouseEvent e
    ) {
    }

    @Override
    public void mouseEntered(MouseEvent e
    ) {
    }

    @Override
    public void mouseExited(MouseEvent e
    ) {
    }

    private void cargarAreas() {
        try {
            JComboBox combo = new JComboBox();
            combo.removeAllItems();
            combo.addItem("SELECCIONE UNA OPCIÓN");
            for (Areas areasFor : modeloAreas.listar()) {
                combo.addItem(areasFor.getNombreA());
            }
            vista.comboAreaBusqueda.setModel(combo.getModel());
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    private void realizarBusqueda() {
        if (!vista.txtBuscar.getText().equals("") && vista.comboAreaBusqueda.getSelectedIndex() != 0) { //Buscar por los dos parámetros
            cargarEstudios(vista.txtBuscar.getText(), areaBusqueda);
            System.out.println("Buscando por dos parámetros");
        } else if (!vista.txtBuscar.getText().equals("")) { //Buscar solo por nombre
            cargarEstudios(vista.txtBuscar.getText());
            System.out.println("Buscando por nombre");
        } else if (vista.comboAreaBusqueda.getSelectedIndex() != 0) { //Buscar por area
            cargarEstudios(areaBusqueda);
            System.out.println("Buscando por área");
        } else {
            cargarEstudios(); //cargar todo
            System.out.println("Cargando todo");
        }
    }

    private void encontrarAreaBusqueda() {
        try {
            areaBusqueda = modeloAreas.encontrarPorNombre(vista.comboAreaBusqueda.getSelectedItem().toString());
            System.out.println(areaBusqueda.getIdA() + " " + areaBusqueda.getNombreA());
        } catch (Exception e) {
            System.out.println("No pude encontrar el área para búsqueda");
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

    private void abrirMenu() {
        vista.dispose();
        MenuController menu = new MenuController(new Menu());
        menu.iniciar();
    }

    //Carga todos los consentimientos
    public void cargarConsentimientos() {
        try {
            JComboBox combo = new JComboBox();
            combo.removeAllItems();
            combo.addItem("SELECCIONE UNA OPCIÓN");
            for (Consentimiento consentimientoFor : modeloConsentimientos.obtenerConsentimientos()) {
                combo.addItem(consentimientoFor.getNombre());
            }
            vista.comboConsentimiento.setModel(combo.getModel());
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    //Carga la tabla consentimientos dependiendo el estudio seleccionado
    private void cargarTablaConsentimientos() {
        TableConsentimientos constructorTabla = new TableConsentimientos();
        constructorTabla.cargarTabla(vista.tableConsentimientos, modeloConsentimientos.obtenerPorIdConcepto(estudio.getIdTo()));
    }

    private Consentimiento buscarConsentimiento(Long id) {
        return modeloConsentimientos.obtenerConsentimientoPorId(id);
    }

    private void cargarConsentimientosVacios() {
        TableConsentimientos constructorTabla = new TableConsentimientos();
        constructorTabla.cargarTablaVacia(vista.tableConsentimientos);
    }

    private int deseaAgregar() {
        int dialog = JOptionPane.YES_NO_OPTION;
        return (JOptionPane.showConfirmDialog(null, "¿Seguro que desea agregar el consentimiento? ", "Agregar", dialog));
    }

    private int deseaEliminar() {
        int dialog = JOptionPane.YES_NO_OPTION;
        return (JOptionPane.showConfirmDialog(null, "¿Seguro que desea quitar el consentimiento? ", "Quitar", dialog));
    }

    private void abrirNuevoConsentimiento() {
        NuevoConsentimientoController nuevoConsentimientoController = new NuevoConsentimientoController(new NuevoConsentimiento(), this);
        nuevoConsentimientoController.iniciar();
    }

    private Consentimiento buscarConsentimientoPorNombre(String text) {
        return modeloConsentimientos.obtenerConsentimientoPorNombre(text);
    }
}
