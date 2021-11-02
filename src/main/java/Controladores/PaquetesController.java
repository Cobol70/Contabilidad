/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Utilidades.BarUtil;
import Vistas.Menu;
import Vistas.Paquetes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author alanm
 */
public class PaquetesController implements ActionListener, MouseListener, KeyListener {

    private Paquetes vista;

    public PaquetesController(Paquetes vista) {
        this.vista = vista;
        
        this.vista.btnAgregar.addActionListener(this);
        this.vista.btnQuitar.addActionListener(this);
        this.vista.btnCerrar.addActionListener(this);
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnMinimizar.addActionListener(this);
        this.vista.btnCerrar.addActionListener(this);
        this.vista.comboAreaBusqueda.addActionListener(this);
        
        this.vista.txtBuscarPaquete.addKeyListener(this);
        this.vista.txtBuscarEstudio.addKeyListener(this);
        this.vista.txtNombre.addKeyListener(this);
    }
    
    public void iniciar(){
        vista.setTitle("Paquetes");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
        cargarPaquetes();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.btnMinimizar){
            BarUtil.minimizar(vista);
        }
        else if(e.getSource() == vista.btnCerrar){
            BarUtil.cerrar(vista);
        }
        else if(e.getSource() == vista.btnRegresar){
            abrirMenu();
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
    }

    private void abrirMenu() {
        vista.dispose();
        MenuController menu = new MenuController(new Menu());
        menu.iniciar();
    }
    
    private void cargarPaquetes(){
        
    }
    
}
