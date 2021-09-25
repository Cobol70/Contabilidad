/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import DAO.LoginData;
import Utilidades.DateUtil;
import Utilidades.UrlUtil;
import Vistas.Cortes;
import Vistas.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author alanm
 */
public class CortesController implements ActionListener {

    private Cortes vista;
    private String fecha;

    public CortesController(Cortes vista) {
        this.vista = vista;

        this.vista.btnRegresar.addActionListener(this);
        this.vista.btnConsultar.addActionListener(this);
    }

    public void iniciar() {
        vista.setTitle("Cortes");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        cargarTurnos();
    }

    private void cargarTurnos() {
        try {
            JComboBox combo = new JComboBox();
            combo.removeAllItems();
            combo.addItem("SELECCIONE UNA OPCIÓN");
            combo.addItem("MATUTINO");
            combo.addItem("VESPERTINO");
            vista.comboTurnos.setModel(combo.getModel());
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnConsultar) {
            if (vista.dateFecha.getDate() != null && vista.comboTurnos.getSelectedIndex() != 0) {
                fecha = DateUtil.dateToString(vista.dateFecha.getDate().getTime());
                UrlUtil.goToURL(LoginData.serverApiAddress + "/ventaConceptos/generatePdf/" + fecha + "/turno/" + vista.comboTurnos.getSelectedItem().toString());
            }
        }
        else if(e.getSource() == vista.btnRegresar){
            vista.dispose();
            Menu vista = new Menu();
            MenuController menu = new MenuController(vista);
            menu.iniciar();
        }
    }

}
