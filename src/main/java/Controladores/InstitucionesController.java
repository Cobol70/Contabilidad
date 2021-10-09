/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import DAO.InstitucionDao;
import DAO.InstitucionDaoImp;
import Tables.TableInstituciones;
import Vistas.Instituciones;
import Vistas.Menu;
import clientews.servicio.Institucion;
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
public class InstitucionesController implements ActionListener, MouseListener, KeyListener {

    private Instituciones vista;
    private Institucion institucionSeleccionada;
    private InstitucionDao modeloInstituciones;

    public InstitucionesController(Instituciones vista) {
        this.vista = vista;

        this.vista.btnRegresar.addActionListener(this);
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);

        this.vista.txtNombre.addKeyListener(this);
        this.vista.txtBuscar.addKeyListener(this);

        this.vista.tableInstituciones.addMouseListener(this);
    }

    public void iniciar() {
        vista.setTitle("Instituciones");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);

        modeloInstituciones = new InstitucionDaoImp();
        cargarInstituciones();
        habilitarBotonEditar(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnGuardar) {
            if (datosValidos() && deseaGuardar() == 0) {
                registrar();
                habilitarBotonEditar(false);
                limpiar();
                cargarInstituciones();
            }
        } else if (e.getSource() == vista.btnModificar) {
            if (vista.tableInstituciones.getSelectedRow() != -1) {
                if (datosValidos() && deseaActualizar() == 0) {
                    tomarNuevosDatos();
                    actualizar();
                    habilitarBotonEditar(false);
                    limpiar();
                    cargarInstituciones();
                }
            }
        } else if (e.getSource() == vista.btnRegresar) {
            abrirMenu();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vista.tableInstituciones) {
            if (vista.tableInstituciones.getSelectedRow() != -1) {
                buscarInstitucionSeleccionada();
                cargarCamposInstitucion();
                habilitarBotonEditar(true);
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
        if (e.getSource() == vista.txtNombre) {
            vista.txtNombre.setText(vista.txtNombre.getText().toUpperCase());
        } else if (e.getSource() == vista.txtBuscar) {
            if (!vista.txtBuscar.getText().equals("")) {
                cargarInstituciones(vista.txtBuscar.getText());
            } else {
                cargarInstituciones();
            }
        }
    }

    private void cargarInstituciones(String text) {
        TableInstituciones cargadorTabla = new TableInstituciones();
        cargadorTabla.cargarTabla(vista.tableInstituciones, modeloInstituciones.encontrarInstitucionesLikeNombre(text));
    }

    private void cargarInstituciones() {
        TableInstituciones cargadorTabla = new TableInstituciones();
        cargadorTabla.cargarTabla(vista.tableInstituciones, modeloInstituciones.listar());
    }

    private void buscarInstitucionSeleccionada() {
        try {
            Institucion temporal = new Institucion();
            int filaSeleccionada = vista.tableInstituciones.getSelectedRow();
            temporal.setIdInstitucion(Long.parseLong(vista.tableInstituciones.getValueAt(filaSeleccionada, 2).toString()));
            System.out.println("id de tabla = " + temporal.getIdInstitucion());
            institucionSeleccionada = modeloInstituciones.encontrarPorId(temporal);
            System.out.println("Institucion encontrada = " + institucionSeleccionada.getNombreInstitucion() + " : " + institucionSeleccionada.getIdInstitucion());
        } catch (Exception e) {
            System.out.println("No pude encontrar la institución");
        }
    }

    private void abrirMenu() {
        vista.dispose();
        MenuController menu = new MenuController(new Menu());
        menu.iniciar();
    }

    private void cargarCamposInstitucion() {
        vista.txtNombre.setText(institucionSeleccionada.getNombreInstitucion());
        vista.txtLimiteDiario.setText(institucionSeleccionada.getLimite() + "");
    }

    private void habilitarBotonEditar(boolean b) {
        this.vista.btnModificar.setEnabled(b);
    }

    private boolean datosValidos() {
        if (vista.txtNombre.equals("")) {
            return false;
        }
        if (!esEntero(vista.txtLimiteDiario.getText())) {
            return false;
        }
        return true;
    }

    private int deseaGuardar() {
        int dialog = JOptionPane.YES_NO_OPTION;
        return (JOptionPane.showConfirmDialog(null, "¿Seguro que desea registrar la institución? ", "Registrar", dialog));
    }

    private boolean esEntero(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private void registrar() {
        try {
            Institucion temporal = new Institucion();
            temporal.setNombreInstitucion(vista.txtNombre.getText());
            temporal.setLimite(Integer.parseInt(vista.txtLimiteDiario.getText()));
            modeloInstituciones.registrarInstitucion(temporal);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar la institución");
        }
    }

    private void limpiar() {
        vista.txtNombre.setText("");
        vista.txtLimiteDiario.setText("");
        vista.txtBuscar.setText("");
    }

    private int deseaActualizar() {
        int dialog = JOptionPane.YES_NO_OPTION;
        return (JOptionPane.showConfirmDialog(null, "¿Seguro que desea modificar la institución? ", "Modificar", dialog));
    }

    private void actualizar() {
        try {
            modeloInstituciones.actualizarInstitucion(institucionSeleccionada);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar la institución");
        }
    }

    private void tomarNuevosDatos() {
        institucionSeleccionada.setNombreInstitucion(vista.txtNombre.getText());
        institucionSeleccionada.setLimite(Integer.parseInt(vista.txtLimiteDiario.getText()));
    }

}
