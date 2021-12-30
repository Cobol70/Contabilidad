/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import DAO.AntecedentesDao;
import DAO.AntecedentesDaoImpl;
import Utilidades.BarUtil;
import Vistas.NuevoAntecedente;
import clientews.servicio.Antecedentes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/**
 *
 * @author alanm
 */

public class NuevoAntecedenteController implements ActionListener, KeyListener{

    private EstudiosController controladorEstudios;
    private NuevoAntecedente vista;
    private AntecedentesDao modeloAntecedentes;

    public NuevoAntecedenteController(NuevoAntecedente vista, EstudiosController controladorEstudios) {

        this.controladorEstudios = controladorEstudios;
        this.vista = vista;

        this.vista.btnCancelar.addActionListener(this);
        this.vista.btnCerrar.addActionListener(this);
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnMinimizar.addActionListener(this);
        this.vista.txtNombre.addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnCancelar) {
            vista.txtNombre.setText("");
        } else if (e.getSource() == vista.btnGuardar && datosValidos()) {
            try {
                guardar();
                actualizarAntecedentesEnEstudios();
                cerrar();
            } catch (Exception ex) {
                ex.printStackTrace(System.out);
                JOptionPane.showMessageDialog(null, "Ocurrió un error al crear el antecedente");
            }
        } else if (e.getSource() == vista.btnMinimizar) {
            BarUtil.minimizar(vista);
        } else if (e.getSource() == vista.btnCerrar) {
            cerrar();
        }
    }

    public void iniciar() {
        vista.setTitle("");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);

        modeloAntecedentes = new AntecedentesDaoImpl();
    }

    private void cerrar() {
        vista.dispose();
    }

    private boolean datosValidos() {
        if (vista.txtNombre.getText().equals("")) {
            return false;
        }
        return true;
    }

    private void actualizarAntecedentesEnEstudios() {
        controladorEstudios.cargarAntecedentes();
    }

    private void guardar() {
        Antecedentes antecedente = new Antecedentes();
        antecedente.setNombre(vista.txtNombre.getText());
        modeloAntecedentes.registrarAntecedentes(antecedente);
        JOptionPane.showMessageDialog(null, "El antecedente se ha registrado con éxito");
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getSource() == vista.txtNombre){
            vista.txtNombre.setText(vista.txtNombre.getText().toUpperCase());
        }
    }

}
