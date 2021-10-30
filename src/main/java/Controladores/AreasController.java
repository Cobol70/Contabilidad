/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import DAO.AreasDao;
import DAO.AreasDaoImpl;
import Tables.TableAreas;
import Utilidades.AleatoriosUtil;
import Utilidades.BarUtil;
import Vistas.AreasVista;
import Vistas.Menu;
import clientews.servicio.Areas;
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
public class AreasController implements ActionListener, MouseListener, KeyListener {

    private AreasVista vista;
    private Areas areaSeleccionada = new Areas();
    private AreasDao modeloAreas;

    public AreasController(AreasVista vista) {

        this.vista = vista;

        modeloAreas = new AreasDaoImpl();

        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
        this.vista.btnRegresar.addActionListener(this);

        this.vista.txtNombre.addKeyListener(this);
        this.vista.txtBuscar.addKeyListener(this);

        this.vista.tableAreas.addMouseListener(this);
        
        this.vista.btnCerrar.addActionListener(this);
        this.vista.btnMin.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnRegresar) {
            abrirMenu();
        } else if (e.getSource() == vista.btnGuardar) {
            if (datosValidosGuardar()) {
                guardar();
                limpiar();
                cargarAreas();
            }
        } else if (e.getSource() == vista.btnModificar) {
            if (datosValidosModificar() && deseaModificar() == 0) {
                tomarNuevosValores();
                modificar();
                limpiar();
                cargarAreas();
            }
        }
        else if (e.getSource() == vista.btnMin) {
            BarUtil.minimizar(vista);
        } else if (e.getSource() == vista.btnCerrar) {
            BarUtil.cerrar(vista);
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vista.tableAreas) {
            if (vista.tableAreas.getSelectedRow() != -1) {
                areaSeleccionada = buscarAreaPorId(Integer.parseInt(vista.tableAreas.getValueAt(vista.tableAreas.getSelectedRow(), 0) + ""));
                rellenarCampos();
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
            if (!vista.txtBuscar.getText().equals("")) {
                cargarAreasLikeNombre(vista.txtBuscar.getText());
            }
        } else if (e.getSource() == vista.txtNombre) {

        }
    }

    public void iniciar() {
        vista.setTitle("Áreas");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);

        cargarHoras(vista.comboHoraFin);
        cargarHoras(vista.comboHoraInicio);
        cargarAreas();
    }

    private void abrirMenu() {
        vista.dispose();
        MenuController menu = new MenuController(new Menu());
        menu.iniciar();
    }

    private void guardar() {
        if (deseaGuardar() == 0) {
            Areas nueva = new Areas();
            nueva.setDepartamentoA(2);
            nueva.setDuracionMinutos(Integer.parseInt(vista.txtDuracion.getText()));
            nueva.setNombreA(vista.txtNombre.getText());
            nueva.setClaveA(generarClave());
            nueva.setHoraInicio(vista.comboHoraInicio.getSelectedItem().toString());
            nueva.setHoraFin(vista.comboHoraFin.getSelectedItem().toString());

            //Falta método en el backend para registrar áreas
            modeloAreas.registrarArea(nueva);
        }
    }

    private void modificar() {
        modeloAreas.updateArea(areaSeleccionada);
        JOptionPane.showMessageDialog(null, "Se ha actualizado el área");
    }

    private boolean datosValidosGuardar() {
        if (vista.txtNombre.getText().equals("")) {
            return false;
        }
        if (vista.comboHoraFin.getSelectedIndex() == 0) {
            return false;
        }
        if (vista.comboHoraInicio.getSelectedIndex() == 0) {
            return false;
        }
        if (vista.txtDuracion.getText().equals("")) {
            return false;
        }
        if (!esEntero(vista.txtDuracion.getText())) {
            return false;
        }
        return true;
    }

    private boolean datosValidosModificar() {
        if (vista.tableAreas.getSelectedRow() == -1) {
            return false;
        }
        if (vista.txtNombre.getText().equals("")) {
            return false;
        }
        if (vista.comboHoraFin.getSelectedIndex() == 0) {
            return false;
        }
        if (vista.comboHoraInicio.getSelectedIndex() == 0) {
            return false;
        }
        if (vista.txtDuracion.getText().equals("")) {
            return false;
        }
        if (!esEntero(vista.txtDuracion.getText())) {
            return false;
        }
        return true;
    }

    private boolean esEntero(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private Areas buscarAreaPorId(int id) {
        return modeloAreas.encontrarPorId(id);
    }

    private void rellenarCampos() {
        vista.txtNombre.setText(areaSeleccionada.getNombreA());
        vista.txtDuracion.setText(areaSeleccionada.getDuracionMinutos() + "");
        //Combos

        vista.comboHoraFin.setSelectedItem(areaSeleccionada.getHoraFin().substring(0, 5));
        if (vista.comboHoraFin.getSelectedItem().equals(areaSeleccionada.getHoraFin().substring(0, 5))) {
            System.out.println("hora fin seleccionada");
        } else {
            JOptionPane.showMessageDialog(null, "No encontré la hora de fin en mi lista, disculpa, hazlo manual");
            vista.comboHoraFin.setSelectedIndex(0);
        }

        vista.comboHoraInicio.setSelectedItem(areaSeleccionada.getHoraInicio().substring(0, 5));
        if (vista.comboHoraInicio.getSelectedItem().equals(areaSeleccionada.getHoraInicio().substring(0, 5))) {
            System.out.println("hora de inicio seleccionada");
        } else {
            JOptionPane.showMessageDialog(null, "No encontré la hora de inicio en mi lista, disculpa, hazlo manual");
            vista.comboHoraInicio.setSelectedIndex(0);
        }
    }

    private int deseaGuardar() {
        int dialog = JOptionPane.YES_NO_OPTION;
        return (JOptionPane.showConfirmDialog(null, "¿Seguro que desea registrar el área? ", "Confirmar", dialog));
    }

    private String generarClave() {
        char primerCaracter, segundoCaracter;
        int numero;

        primerCaracter = AleatoriosUtil.letraAleatoria();
        segundoCaracter = AleatoriosUtil.letraAleatoria();
        numero = AleatoriosUtil.numeroAleatorio(0, 9);

        return (primerCaracter + "" + segundoCaracter + "" + numero);
    }

    private void limpiar() {
        vista.txtBuscar.setText("");
        vista.txtDuracion.setText("");
        vista.txtNombre.setText("");
        vista.comboHoraFin.setSelectedIndex(0);
        vista.comboHoraInicio.setSelectedIndex(0);
    }

    private void cargarAreasLikeNombre(String text) {
        TableAreas tabla = new TableAreas();
        tabla.cargarTabla(vista.tableAreas, modeloAreas.findAreasLikeNombre(text));
    }

    private void cargarHoras(JComboBox comboAAsignar) {
        try {
            JComboBox combo = new JComboBox();
            combo.removeAllItems();
            combo.addItem("SELECCIONE UNA OPCIÓN");
            String hora = "";
            for (int i = 7; i <= 23; i++) {
                for (int j = 0; j < 60; j += 5) {
                    if (i < 10) {
                        hora += "0";
                    }
                    hora += (i + ":");
                    if (j < 10) {
                        hora += "0";
                    }
                    hora += (j);
                    combo.addItem(hora);
                    hora = "";
                }
                hora = "";
            }
            comboAAsignar.setModel(combo.getModel());
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    private void cargarAreas() {
        TableAreas tabla = new TableAreas();
        tabla.cargarTabla(vista.tableAreas, modeloAreas.listar());
    }

    private int deseaModificar() {
        int dialog = JOptionPane.YES_NO_OPTION;
        return (JOptionPane.showConfirmDialog(null, "¿Seguro que desea actualizar el área? ", "Actualizar", dialog));
    }

    private void tomarNuevosValores() {
        areaSeleccionada.setDuracionMinutos(Integer.parseInt(vista.txtDuracion.getText()));
        areaSeleccionada.setHoraInicio(vista.comboHoraInicio.getSelectedItem().toString());
        areaSeleccionada.setHoraFin(vista.comboHoraFin.getSelectedItem().toString());
        areaSeleccionada.setNombreA(vista.txtNombre.getText());
    }

}
