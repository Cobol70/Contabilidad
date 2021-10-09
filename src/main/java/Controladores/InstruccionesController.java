/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import DAO.InstruccionesDao;
import DAO.InstruccionesDaoImpl;
import Vistas.NuevasInstrucciones;
import clientews.servicio.Instrucciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/**
 *
 * @author alanm
 */
public class InstruccionesController implements ActionListener, KeyListener {
    
    private NuevasInstrucciones vista;
    private EstudiosController estudiosController;
    private InstruccionesDao modeloInstrucciones;
    
    public InstruccionesController(NuevasInstrucciones vista, EstudiosController estudiosController) {
        this.vista = vista;
        this.estudiosController = estudiosController;
        
        this.vista.btnRegresar.addActionListener(this);
        this.vista.btnCancelar.addActionListener(this);
        this.vista.btnGuardar.addActionListener(this);
        
        this.vista.txtNombre.addKeyListener(this);
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
        }
    }
    
    public void iniciar() {
        vista.setTitle("Registrar instrucciones");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
        modeloInstrucciones = new InstruccionesDaoImpl();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnGuardar) {
            if (datosValidos() && deseaGuardar() == 0) {
                guardar();
                recargarInstruccionesEnEstudios();
                cerrar();
            }
        } else if (e.getSource() == vista.btnCancelar || e.getSource() == vista.btnRegresar) {
            cerrar();
        }
    }
    
    private void cerrar() {
        vista.dispose();
    }
    
    private void recargarInstruccionesEnEstudios() {
        estudiosController.cargarInstrucciones();
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
        return (JOptionPane.showConfirmDialog(null, "¿Seguro que desea registrar las instrucciones? ", "Confirmar", dialog));
    }
    
    private void guardar() {
        Instrucciones instrucciones = new Instrucciones();
        instrucciones.setNombre(vista.txtNombre.getText());
        instrucciones.setTexto(vista.txtTexto.getText());
        modeloInstrucciones.registrarInstrucciones(instrucciones);
        JOptionPane.showMessageDialog(null, "Las instrucciones se han creado satisfactoriamente");
    }
    
}
