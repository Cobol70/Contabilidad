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
import DAO.InstruccionesDao;
import DAO.InstruccionesDaoImpl;
import Tables.TableConceptos;
import Vistas.Estudios;
import Vistas.Menu;
import Vistas.NuevasInstrucciones;
import clientews.servicio.Areas;
import clientews.servicio.Conceptos;
import clientews.servicio.Instrucciones;
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
public class EstudiosController implements ActionListener, MouseListener, KeyListener {

    private Instrucciones instruccionesSeleccionadas;
    private Areas areaSeleccionada;
    private Areas areaBusqueda;
    private Conceptos estudio;
    private Estudios vista;
    private ConceptosDao modeloConceptos;
    private AreasDao modeloAreas;
    private InstruccionesDao modeloInstrucciones;

    public EstudiosController(Estudios vista) {
        this.vista = vista;

        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnNuevasInstrucciones.addActionListener(this);
        this.vista.btnRegresar.addActionListener(this);
        this.vista.btnVer.addActionListener(this);
        this.vista.comboInstrucciones.addActionListener(this);
        this.vista.comboArea.addActionListener(this);
        this.vista.comboAreaBusqueda.addActionListener(this);

        this.vista.txtBuscar.addKeyListener(this);
        this.vista.txtNombre.addKeyListener(this);

        this.vista.tableEstudios.addMouseListener(this);

    }

    public void iniciar() {
        vista.setTitle("Estudios");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);

        modeloConceptos = new ConceptosDaoImp();
        modeloAreas = new AreasDaoImpl();
        modeloInstrucciones = new InstruccionesDaoImpl();

        cargarAreas();
        cargarAreasBusqueda();
        cargarInstrucciones();
        cargarEstudios();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnGuardar) {
            if (datosValidos() && deseaGuardar() == 0) {
                generarEstudio();
                guardar();
                limpiar();
                cargarEstudios();
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
        }
        else if(e.getSource() == vista.btnVer){
            if(vista.comboInstrucciones.getSelectedIndex()!=0){
                JOptionPane.showMessageDialog(null, instruccionesSeleccionadas.getTexto());
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
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
    
}
