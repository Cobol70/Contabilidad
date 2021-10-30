/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import DAO.ConsentimientoDao;
import DAO.ConsentimientoDaoImpl;
import Utilidades.BarUtil;
import Vistas.NuevoConsentimiento;
import clientews.servicio.Consentimiento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/**
 *
 * @author alanm
 */
public class NuevoConsentimientoController implements ActionListener, KeyListener {

    private ConsentimientoDao modeloConsentimientos;
    private NuevoConsentimiento vista;
    private ConsentimientosController controlador;

    public NuevoConsentimientoController(NuevoConsentimiento vista, ConsentimientosController controlador) {
        this.vista = vista;
        this.controlador = controlador;

        this.vista.btnRegresar.addActionListener(this);
        this.vista.btnCancelar.addActionListener(this);
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnMinimizar.addActionListener(this);
        this.vista.btnCerrar.addActionListener(this);

        this.vista.txtNombre.addKeyListener(this);
    }

    public void iniciar() {
        vista.setTitle("Nuevo consentimiento");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);

        modeloConsentimientos = new ConsentimientoDaoImpl();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnGuardar) {
            if (datosValidos() && deseaGuardar() == 0) {
                try {
                    guardar();
                    recargarConsentimientosEnEstudios();
                    cerrar();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al crear consentimiento");
                    ex.printStackTrace(System.out);
                }
            }
        } else if (e.getSource() == vista.btnCancelar || e.getSource() == vista.btnRegresar) {
            cerrar();
        }
        else if (e.getSource() == vista.btnMinimizar) {
            BarUtil.minimizar(vista);
        } else if (e.getSource() == vista.btnCerrar) {
            BarUtil.cerrar(vista);
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
    }

    private boolean datosValidos() {
        if (vista.txtNombre.getText().equals("")) {
            return false;
        }
        if (vista.txtTexto.getText().equals("")) {
            return false;
        }
        return true;
    }

    private int deseaGuardar() {
        int dialog = JOptionPane.YES_NO_OPTION;
        return (JOptionPane.showConfirmDialog(null, "¿Seguro que desea registrar el consentimiento? ", "Confirmar", dialog));
    }

    private void cerrar() {
        vista.dispose();
    }

    private void guardar() {
        Consentimiento consentimiento = new Consentimiento();
        consentimiento.setNombre(vista.txtNombre.getText());
        consentimiento.setTexto(vista.txtTexto.getText());
        modeloConsentimientos.registrarConsentimiento(consentimiento);
        JOptionPane.showMessageDialog(null, "El consentimiento se ha creado satisfactoriamente");
    }

    private void recargarConsentimientosEnEstudios() {
        controlador.cargarConsentimientos();
    }
}
