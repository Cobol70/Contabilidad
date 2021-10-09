/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;


import Vistas.AreasVista;
import Vistas.Cortes;
import Vistas.Estudios;
import Vistas.Instituciones;
import Vistas.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alanm
 */
public class MenuController implements ActionListener {

    private Menu vista;

    public static void main(String[] args) {
        Menu vista = new Menu();
        MenuController menu = new MenuController(vista);
        menu.iniciar();
    }
    
    public void iniciar() {
        vista.setTitle("Menú");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
    public MenuController(Menu vista) {
        this.vista = vista;
        this.vista.btnAreas.addActionListener(this);
        this.vista.btnInstituciones.addActionListener(this);
        this.vista.btnEstudios.addActionListener(this);
        this.vista.btnCortes.addActionListener(this);
        this.vista.btnEstudiosInstituciones.addActionListener(this);
        this.vista.btnUrgencias.addActionListener(this);
        this.vista.btnReagendar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vista.btnAreas) {
            abrirAreas();
        } else if (e.getSource() == this.vista.btnInstituciones) {
            abrirInstituciones();
        } else if (e.getSource() == this.vista.btnEstudios) {
            abrirEstudios();
        } else if(e.getSource() == this.vista.btnCortes){
            abrirCortes();
        }else if(e.getSource() == this.vista.btnEstudiosInstituciones){
            abrirMovimientosCortes();
        }else if(e.getSource() == this.vista.btnUrgencias){
            abrirUrgencias();
        }else if(e.getSource() == this.vista.btnReagendar){
            abrirReagendar();
        }
    }

    private void abrirAreas(){
        vista.dispose();
        AreasController controladorAreas = new AreasController(new AreasVista());
        controladorAreas.iniciar();
    }

    private void abrirInstituciones() {
        vista.dispose();
        InstitucionesController controladorInstituciones = new InstitucionesController(new Instituciones());
        controladorInstituciones.iniciar();
    }

    private void abrirEstudios() {
        vista.dispose();
        EstudiosController estudiosController = new EstudiosController(new Estudios());
        estudiosController.iniciar();
    }

    private void abrirCortes() {
        vista.dispose();
        CortesController controladorCortes = new CortesController(new Cortes());
        controladorCortes.iniciar();
    }

    private void abrirMovimientosCortes() {
       /* vista.dispose();
        MovimientosCorteController controladorMovimientos = new MovimientosCorteController(new MovimientosCorte());
        controladorMovimientos.iniciar();*/
    }

    private void abrirUrgencias() {
       /* vista.dispose();
        MenuUrgenciasController controladorUrgencias = new MenuUrgenciasController(new MenuUrgencias());
        controladorUrgencias.iniciar();*/
    }

    private void abrirReagendar() {
       /* vista.dispose();
        ReagendarController controladorReagendar = new ReagendarController(new Reagendar());
        controladorReagendar.iniciar();*/
    }

}
