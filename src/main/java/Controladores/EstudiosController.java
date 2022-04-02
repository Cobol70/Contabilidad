/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import DAO.AntecedentesDao;
import DAO.AntecedentesDaoImpl;
import DAO.AreasDao;
import DAO.AreasDaoImpl;
import DAO.ConceptosDao;
import DAO.ConceptosDaoImp;
import DAO.InstruccionesDao;
import DAO.InstruccionesDaoImpl;
import Tables.TableConceptos;
import Utilidades.BarUtil;
import Vistas.Estudios;
import Vistas.Menu;
import Vistas.NuevasInstrucciones;
import Vistas.NuevoAntecedente;
import clientews.servicio.AntecedenteConceptoIds;
import clientews.servicio.Antecedentes;
import clientews.servicio.Areas;
import clientews.servicio.Conceptos;
import clientews.servicio.Instrucciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author alanm
 */
public class EstudiosController implements ActionListener, MouseListener, KeyListener {

    private Instrucciones instruccionesSeleccionadas;
    private Areas areaSeleccionada;
    private Areas areaBusqueda;
    private Conceptos estudio;
    private Estudios vista;
    private ConceptosDao modeloConceptos;
    private AreasDao modeloAreas;
    private InstruccionesDao modeloInstrucciones;
    private Conceptos estudioSeleccionado;
    private AntecedentesDao modeloAntecedentes;

    public EstudiosController(Estudios vista) {
        this.vista = vista;

        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnNuevasInstrucciones.addActionListener(this);
        this.vista.btnRegresar.addActionListener(this);
        this.vista.btnVer.addActionListener(this);
        this.vista.comboInstrucciones.addActionListener(this);
        this.vista.comboArea.addActionListener(this);
        this.vista.comboAreaBusqueda.addActionListener(this);
        this.vista.btnCerrar.addActionListener(this);
        this.vista.btnMinimizar.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
        this.vista.checkRequiereAntecedentes.addActionListener(this);
        this.vista.comboAntecedentes.addActionListener(this);

        this.vista.btnNuevoAntecedente.addActionListener(this);
        this.vista.btnQuitarAntecedente.addActionListener(this);

        this.vista.txtBuscar.addKeyListener(this);
        this.vista.txtNombre.addKeyListener(this);

        this.vista.btnGuardar.addKeyListener(this);
        this.vista.tableEstudios.addMouseListener(this);

    }

    public void iniciar() {
        vista.setTitle("Estudios");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);

        modeloConceptos = new ConceptosDaoImp();
        modeloAreas = new AreasDaoImpl();
        modeloInstrucciones = new InstruccionesDaoImpl();
        modeloAntecedentes = new AntecedentesDaoImpl();

        cargarAreas();
        cargarAreasBusqueda();
        cargarInstrucciones();
        cargarEstudios();
        cargarAntecedentes();

        activarAntecedentes(false);
        cargarTablaAntecedentes();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnGuardar) {
            if (datosValidos() && deseaGuardar() == 0) {
                try {
                    generarEstudio();
                    guardar();
                    estudio = modeloConceptos.obtenerUltimoConceptoRegistrado();
                    System.out.println(estudio.getConceptoTo());
                    vincularAntecedentes(estudio.getIdTo());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "No se pudo crear el estudio");
                    ex.printStackTrace(System.out);
                } finally {
                    limpiar();
                    cargarEstudios();
                }

            }
        } else if (e.getSource() == vista.comboArea) {
            if (vista.comboArea.getSelectedIndex() != 0) {
                encontrarArea();
            }
        } else if (e.getSource() == vista.comboInstrucciones) {
            if (vista.comboInstrucciones.getSelectedIndex() != 0) {
                encontrarInstrucciones();
            }
        } else if (e.getSource() == vista.comboAreaBusqueda) {
            if (vista.comboAreaBusqueda.getSelectedIndex() != 0) {
                encontrarAreaBusqueda();
            }
            realizarBusqueda();
        } else if (e.getSource() == vista.btnRegresar) {
            abrirMenu();
        } else if (e.getSource() == vista.btnNuevasInstrucciones) {
            abrirNuevasInstrucciones();
        } else if (e.getSource() == vista.btnVer) {
            if (vista.comboInstrucciones.getSelectedIndex() != 0) {
                JOptionPane.showMessageDialog(null, instruccionesSeleccionadas.getTexto());
            }
        } else if (e.getSource() == vista.btnMinimizar) {
            BarUtil.minimizar(vista);
        } else if (e.getSource() == vista.btnCerrar) {
            BarUtil.cerrar(vista);
        } else if (e.getSource() == vista.btnModificar) {
            if (deseaModificar() && datosValidos() && vista.tableEstudios.getSelectedRow() != -1 && estudioSeleccionado != null) {
                try {
                    obtenerNuevosDatos();
                    eliminarRelacionAntecedentes();
                    vincularAntecedentes(estudioSeleccionado.getIdTo());
                    modificar();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el estudio");
                    ex.printStackTrace(System.out);
                } finally {
                    limpiar();
                    cargarEstudios();
                }
            }
        } else if (e.getSource() == vista.checkRequiereAntecedentes) {
            activarAntecedentes(vista.checkRequiereAntecedentes.isSelected());
        } else if (e.getSource() == vista.btnNuevoAntecedente) {
            abrirCrearNuevoAntecedente();
        } else if (e.getSource() == vista.comboAntecedentes) {
            if (vista.comboAntecedentes.getSelectedIndex() != 0) {
                Antecedentes antecedente = modeloAntecedentes.encontrarAntecedentePorNombre(vista.comboAntecedentes.getSelectedItem().toString());
                if (noEstaEnLaTabla(antecedente)) {
                    agregarAntecedenteATabla(antecedente);
                }
            }
        } else if (e.getSource() == vista.btnQuitarAntecedente) {
            if (vista.tableAntecedentes.getRowCount() != 0 && vista.tableAntecedentes.getSelectedRow() != -1) {

                //Simplemente hay que quitarlo de la tabla
                DefaultTableModel dt = (DefaultTableModel) vista.tableAntecedentes.getModel();
                dt.removeRow(vista.tableAntecedentes.getSelectedRow());
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vista.tableEstudios) {
            if (vista.tableEstudios.getSelectedRow() != -1) {
                int fila = vista.tableEstudios.getSelectedRow();
                Long id = Long.parseLong(vista.tableEstudios.getValueAt(fila, 2).toString());

                estudioSeleccionado = buscarEstudioPorId(id);

                //LLevar al text
                vista.txtNombre.setText(estudioSeleccionado.getConceptoTo());

                vista.comboArea.setSelectedItem(estudioSeleccionado.getIdAreaTo().getNombreA());

                vista.comboInstrucciones.setSelectedItem(estudioSeleccionado.getIdInstrucciones().getNombre());

                System.out.println(estudioSeleccionado.getDicom());
                if (estudioSeleccionado.getDicom() == Short.parseShort("0")) {
                    vista.checkDicom.setSelected(false);
                } else {
                    vista.checkDicom.setSelected(true);
                }

                cargarAntecedentes(estudioSeleccionado.getIdTo());
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

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == vista.txtBuscar) {
            realizarBusqueda();
        } else if (e.getSource() == vista.txtNombre) {
            vista.txtNombre.setText(vista.txtNombre.getText().toUpperCase());
        }else if(e.getSource() == vista.btnGuardar){
            if(e.getKeyCode() == KeyEvent.VK_ENTER){
                 if (datosValidos() && deseaGuardar() == 0) {
                try {
                    generarEstudio();
                    guardar();
                    estudio = modeloConceptos.obtenerUltimoConceptoRegistrado();
                    System.out.println(estudio.getConceptoTo());
                    vincularAntecedentes(estudio.getIdTo());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "No se pudo crear el estudio");
                    ex.printStackTrace(System.out);
                } finally {
                    limpiar();
                    cargarEstudios();
                }

            }
            }
        }
    }

    private boolean datosValidos() {
        if (vista.txtNombre.getText().equals("")) {
            return false;
        }
        if (vista.comboArea.getSelectedIndex() == 0) {
            return false;
        }
        if (vista.comboInstrucciones.getSelectedIndex() == 0) {
            return false;
        }
        return true;
    }

    private int deseaGuardar() {
        int dialog = JOptionPane.YES_NO_OPTION;
        return (JOptionPane.showConfirmDialog(null, "¿Seguro que desea registrar el estudio? ", "Confirmar", dialog));
    }

    private boolean deseaModificar() {
        int dialog = JOptionPane.YES_NO_OPTION;
        return (JOptionPane.showConfirmDialog(null, "¿Seguro que desea modificar el estudio? ", "Confirmar", dialog)) == 0;
    }

    private void generarEstudio() {
        estudio = new Conceptos();

        estudio.setAleatorioC("");
        estudio.setCategoriaTo(null); //En rispacs está en null
        estudio.setCodigoBarrasTo(null); //En rispacs está en null
        estudio.setConceptoTo(vista.txtNombre.getText());
        estudio.setCostoTo(0f); //Los costos los voy a manejar en concepto_institucion
        estudio.setDescripcionTo("1"); //Así está en rispacs
        estudio.setDiasEntregaTo(null); //En el rispacs está ene null

        if (vista.checkDicom.isSelected()) {
            estudio.setDicom(Short.parseShort("1"));
        } else {
            estudio.setDicom(Short.parseShort("0"));
        }

        estudio.setFechaTo(null);//Para qué la quiero 
        estudio.setFormato(null); //Si puedo lo pongo en null, es html

        System.out.println(areaSeleccionada.getIdA());
        estudio.setIdAreaTo(areaSeleccionada); //El área que se seleccionó

        estudio.setIdBeneficioTo(null);

        estudio.setIdCategoriaTo(null);
        estudio.setIdConvenioTo(1);

        estudio.setIdDepartamentoTo(Short.parseShort("2")); //Así está en el rispacs

        estudio.setIdGrupoTo(null);

        estudio.setIdInstrucciones(instruccionesSeleccionadas);

        estudio.setIdMarcaTo(null);
        estudio.setIdMedicamentoG(null);
        estudio.setIdModeloTo(null);
        estudio.setIdPresentacionTo(null);
        estudio.setIdTipoConceptoTo(Short.parseShort("4")); //Así está en el rispacs

        estudio.setIdTo(0l);

        estudio.setIdUmedidaTo(null);
        estudio.setLinkPlmTo(null);
        estudio.setNivelMedTo(null);

        //Dije que los precios los voy a controlar en otra tabla
        estudio.setPrecioM(0);
        estudio.setPrecioMu(0);
        estudio.setPrecioTo(0);
        estudio.setPrecioUrgenciaTo(0);

        estudio.setUsuarioTo(3); //Porque sí

        estudio.setRequiereSaberAntecedentes(vista.checkRequiereAntecedentes.isSelected());

    }

    private void guardar() {
        modeloConceptos.registrarConcepto(estudio);
        JOptionPane.showMessageDialog(null, "Estudio registrado");
    }

    private void limpiar() {
        vista.txtBuscar.setText("");
        vista.txtNombre.setText("");
        vista.comboArea.setSelectedIndex(0);
        vista.comboAreaBusqueda.setSelectedIndex(0);
        vista.comboInstrucciones.setSelectedIndex(0);
        vista.checkDicom.setSelected(false);
        vista.txtNombre.requestFocus();
    }

    private void encontrarArea() {
        try {
            areaSeleccionada = modeloAreas.encontrarPorNombre(vista.comboArea.getSelectedItem().toString());
            System.out.println(areaSeleccionada.getIdA() + " " + areaSeleccionada.getNombreA());
        } catch (Exception e) {
            System.out.println("No pude encontrar el área");
        }
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

    public void cargarInstrucciones() {
        try {
            JComboBox combo = new JComboBox();
            combo.removeAllItems();
            combo.addItem("SELECCIONE UNA OPCIÓN");
            for (Instrucciones instruccionesFor : modeloInstrucciones.obtenerTodasInstrucciones()) {
                combo.addItem(instruccionesFor.getNombre());
            }
            vista.comboInstrucciones.setModel(combo.getModel());
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    private void encontrarInstrucciones() {
        try {
            instruccionesSeleccionadas = modeloInstrucciones.encontrarInstruccionesPorNombre(vista.comboInstrucciones.getSelectedItem().toString());
        } catch (Exception e) {
            System.out.println("No pude encontrar las instrucciones");
        }
    }

    private void cargarEstudios() {
        TableConceptos generadorTabla = new TableConceptos();
        generadorTabla.cargarTabla(vista.tableEstudios, modeloConceptos.encontrarTodosConceptos());
    }

    private void cargarEstudios(String text) {
        TableConceptos generadorTabla = new TableConceptos();
        generadorTabla.cargarTabla(vista.tableEstudios, modeloConceptos.encontrarConceptoLikeNombre(text));
    }

    private void cargarAreasBusqueda() {
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

    private void encontrarAreaBusqueda() {
        try {
            areaBusqueda = modeloAreas.encontrarPorNombre(vista.comboAreaBusqueda.getSelectedItem().toString());
            System.out.println(areaBusqueda.getIdA() + " " + areaBusqueda.getNombreA());
        } catch (Exception e) {
            System.out.println("No pude encontrar el área para búsqueda");
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

    private void cargarEstudios(String text, Areas paraBuscar) {
        TableConceptos generadorTabla = new TableConceptos();
        generadorTabla.cargarTabla(vista.tableEstudios, modeloConceptos.encontrarConceptosPorAreaYNombre(paraBuscar.getIdA(), text));
    }

    private void cargarEstudios(Areas paraBuscar) {
        TableConceptos generadorTabla = new TableConceptos();
        generadorTabla.cargarTabla(vista.tableEstudios, modeloConceptos.encontrarConceptosPorIdArea(paraBuscar.getIdA()));
    }

    private void abrirMenu() {
        vista.dispose();
        MenuController menu = new MenuController(new Menu());
        menu.iniciar();
    }

    private void abrirNuevasInstrucciones() {
        InstruccionesController instruccionesController = new InstruccionesController(new NuevasInstrucciones(), this);
        instruccionesController.iniciar();
    }

    private Conceptos buscarEstudioPorId(Long id) {
        Conceptos temporal = new Conceptos();
        temporal.setIdTo(id);
        return modeloConceptos.encontrarConceptoPorId(temporal);
    }

    private void obtenerNuevosDatos() {

        if (vista.checkDicom.isSelected()) {
            estudioSeleccionado.setDicom(Short.parseShort("1"));
        } else {
            estudioSeleccionado.setDicom(Short.parseShort("0"));
        }

        System.out.println(areaSeleccionada.getIdA());
        estudioSeleccionado.setIdAreaTo(areaSeleccionada); //El área que se seleccionó

        estudioSeleccionado.setIdInstrucciones(instruccionesSeleccionadas);

        estudioSeleccionado.setConceptoTo(vista.txtNombre.getText());
        estudioSeleccionado.setRequiereSaberAntecedentes(vista.checkRequiereAntecedentes.isSelected());

    }

    private void modificar() {
        modeloConceptos.actualizarConcepto(estudioSeleccionado);
    }

    public void cargarAntecedentes() {
        try {
            JComboBox combo = new JComboBox();
            combo.removeAllItems();
            combo.addItem("SELECCIONE UNA OPCIÓN");
            for (Antecedentes antecedentesFor : modeloAntecedentes.listarAntecedentes()) {
                combo.addItem(antecedentesFor.getNombre());
            }
            vista.comboAntecedentes.setModel(combo.getModel());
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    private void activarAntecedentes(boolean b) {
        vista.comboAntecedentes.setEnabled(b);
        vista.btnNuevoAntecedente.setEnabled(b);
        vista.tableAntecedentes.setEnabled(b);
        vista.btnQuitarAntecedente.setEnabled(b);
    }

    private void abrirCrearNuevoAntecedente() {
        NuevoAntecedenteController controladorNuevoAntecedente = new NuevoAntecedenteController(new NuevoAntecedente(), this);
        controladorNuevoAntecedente.iniciar();
    }

    private boolean noEstaEnLaTabla(Antecedentes antecedente) {
        for (int i = 0; i < vista.tableAntecedentes.getRowCount(); i++) {
            int id = Integer.parseInt(vista.tableAntecedentes.getValueAt(i, 1).toString());
            if (id == antecedente.getId()) {
                return false;
            }
        }
        return true;
    }

    private void agregarAntecedenteATabla(Antecedentes antecedente) {
        DefaultTableModel dt = (DefaultTableModel) vista.tableAntecedentes.getModel();
        Object fila[] = new Object[2];
        fila[0] = antecedente.getNombre();
        fila[1] = antecedente.getId();
        dt.addRow(fila);
    }

    private void cargarTablaAntecedentes() {
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Nombre");
        dt.addColumn("Id");
        vista.tableAntecedentes.setModel(dt);
        vista.tableAntecedentes.setRowHeight(40);
        TableColumnModel columnModel = vista.tableAntecedentes.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(300);
        columnModel.getColumn(1).setPreferredWidth(1);
    }

    private void vincularAntecedentes(Long idConcepto) {
        if (vista.checkRequiereAntecedentes.isSelected()) {

            List antecedentes = new ArrayList<>();
            for (int i = 0; i < vista.tableAntecedentes.getRowCount(); i++) {
                AntecedenteConceptoIds temporal = new AntecedenteConceptoIds();
                Long idAntecedente = (Long.parseLong(vista.tableAntecedentes.getValueAt(i, 1).toString()));
                temporal.setIdAntecedente(idAntecedente);
                temporal.setIdConcepto(idConcepto);
                antecedentes.add(temporal);
            }
            antecedentes.forEach(a -> {
                System.out.println("a");
            });
            modeloAntecedentes.registrarAntecedentesConcepto(antecedentes);
        }
    }

    private void cargarAntecedentes(Long id) {
        limpiarTablaAntecedentes();
        vista.checkRequiereAntecedentes.setSelected(false);
        activarAntecedentes(false);
        DefaultTableModel dt = (DefaultTableModel) vista.tableAntecedentes.getModel();
        modeloAntecedentes.encontrarAntecedentesPorConcepto(id).forEach(antecedente -> {
            if (!vista.checkRequiereAntecedentes.isSelected() && estudioSeleccionado.isRequiereSaberAntecedentes()) {
                vista.checkRequiereAntecedentes.setSelected(true);
                activarAntecedentes(true);
            }
            Object fila[] = new Object[2];
            fila[0] = antecedente.getNombre();
            fila[1] = antecedente.getId();
            System.out.println(antecedente.getNombre());
            dt.addRow(fila);
        });
    }

    private void limpiarTablaAntecedentes() {
        DefaultTableModel dt = (DefaultTableModel) vista.tableAntecedentes.getModel();
        for (int i = dt.getRowCount() - 1; i >= 0; i--) {
            dt.removeRow(i);
        }
    }

    private void eliminarRelacionAntecedentes() {
        modeloAntecedentes.eliminarTodosAntecedentesConcepto(estudioSeleccionado.getIdTo());
    }

    

}
