/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import DAO.ConceptosDao;
import DAO.ConceptosInstitucionDao;
import DAO.ConceptosDaoImp;
import DAO.ConceptosInstitucionDaoImpl;
import DAO.InstitucionDao;
import DAO.InstitucionDaoImp;
import Tables.TableConceptos;
import Tables.TableInstituciones;
import Vistas.EstudiosInstituciones;
import Vistas.Menu;
import clientews.servicio.Conceptos;
import clientews.servicio.Institucion;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
    
    public EstudiosInstitucionesController(EstudiosInstituciones vista) {
        this.vista = vista;

        this.vista.btnCerrar.addActionListener(this);
        this.vista.btnMin.addActionListener(this);
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
        this.vista.btnRegresar.addActionListener(this);

        this.vista.txtBuscarEstudio.addKeyListener(this);
        this.vista.txtBuscarInstitucion.addKeyListener(this);

        this.vista.tableEstudios.addMouseListener(this);
        this.vista.tableInstituciones.addMouseListener(this);
    }

    public void iniciar() {
        vista.setTitle("Vincular");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);

        modeloConceptos = new ConceptosDaoImp();
        modeloInstituciones = new InstitucionDaoImp();
        modeloConceptosInstituciones = new ConceptosInstitucionDaoImpl();

        vista.txtEstudio.setEditable(false);
        vista.txtInstitucion.setEditable(false);

        cargarTablaConceptosVacia();
        cargarTablaInstitucionesVacia();
        cargarTablaInstitucionesConceptosVacia();
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
            if (!vista.txtBuscarEstudio.getText().equals("")) {
                cargarTablaConceptosLikeNombre(vista.txtBuscarEstudio.getText());
            } else {
                cargarTablaConceptosVacia();
            }
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
        }else if(e.getSource() == vista.tableEstudios){
            if(vista.tableEstudios.getSelectedRow() != -1){
                int fila = vista.tableEstudios.getSelectedRow();
                Long id = Long.parseLong(vista.tableEstudios.getValueAt(fila, 2).toString());
                
                estudioSeleccionado = buscarEstudioPorId(id);
                
                //LLevar al text
                vista.txtEstudio.setText(estudioSeleccionado.getConceptoTo());
                
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void guardar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
}
