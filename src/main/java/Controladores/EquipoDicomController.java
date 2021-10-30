/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import DAO.AreasDao;
import DAO.AreasDaoImpl;
import DAO.EquipoDicomDao;
import DAO.EquipoDicomDaoImp;
import Tables.TableEquipoDicom;
import Utilidades.BarUtil;
import Vistas.EquipoDicomVista;
import Vistas.Menu;
import clientews.servicio.Areas;
import clientews.servicio.EquipoDicom;
import java.awt.Frame;
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
public class EquipoDicomController implements ActionListener, MouseListener, KeyListener {

    private EquipoDicomVista vista;
    private EquipoDicom equipoSeleccionado;
    private Areas areaSeleccionada;
    private EquipoDicomDao modeloEquipoDicom;
    private AreasDao modeloAreas;

    public EquipoDicomController(EquipoDicomVista vista) {
        this.vista = vista;

        this.vista.btnCerrar.addActionListener(this);
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnMin.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
        this.vista.btnRegresar.addActionListener(this);
        this.vista.btnMin.addActionListener(this);
        this.vista.btnCerrar.addActionListener(this);

        this.vista.comboArea.addActionListener(this);

        this.vista.txtNombre.addKeyListener(this);
        this.vista.txtModalidad.addKeyListener(this);
        this.vista.txtBuscar.addKeyListener(this);

        this.vista.tableEquipos.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnCerrar) {
            if (deseaCerrar()) {
                cerrar();
            }
        } else if (e.getSource() == vista.btnGuardar) {
            if (datosValidos() && deseaGuardar()) {
                try {
                    EquipoDicom nuevo = obtenerDatosGuardar();
                    guardar(nuevo);
                    JOptionPane.showMessageDialog(null, "El equipo se ha registrado exitosamente");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar el equipo");
                    ex.printStackTrace(System.out);
                }
                limpiar();
                cargarTabla();
            }
        } else if (e.getSource() == vista.btnMin) {
            vista.setExtendedState(Frame.ICONIFIED);
        } else if (e.getSource() == vista.btnModificar) {
            if (datosValidosModificar() && deseaModificar()) {
                try {
                    obtenerDatosModificar();
                    modificar();
                    JOptionPane.showMessageDialog(null, "El equipo se ha modificado exitosamente");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al modificar el equipo");
                    ex.printStackTrace(System.out);
                }
                limpiar();
                cargarTabla();
            }
        } else if (e.getSource() == vista.btnRegresar) {
            abrirMenu();
        } else if (e.getSource() == vista.comboArea) {
            if (vista.comboArea.getSelectedIndex() != 0) {
                try {
                    areaSeleccionada = encontrarAreaPorNombre(vista.comboArea.getSelectedItem().toString());
                    System.out.println(areaSeleccionada.getIdA() + " " + areaSeleccionada.getNombreA());
                } catch (Exception ex) {
                    System.out.println("No encontré el área");
                    ex.printStackTrace(System.out);
                }
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
        if (e.getSource() == vista.tableEquipos) {
            if (vista.tableEquipos.getSelectedRow() != -1) {
                int fila = vista.tableEquipos.getSelectedRow();
                Long id = Long.parseLong(vista.tableEquipos.getValueAt(fila, 3).toString()); //La posición es la tres
                equipoSeleccionado = buscarEquipoPorId(id);
                cargarCampos();
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
            vista.txtNombre.setText(aMayusculas(vista.txtNombre.getText()));
        } else if (e.getSource() == vista.txtModalidad) {
            vista.txtModalidad.setText(aMayusculas(vista.txtModalidad.getText()));
        } else if (e.getSource() == vista.txtBuscar) {
            if (!vista.txtBuscar.getText().equals("")) {
                buscarLikeNombre(vista.txtBuscar.getText());
            }
            else{
                cargarTabla();
            }
        }
    }

    public void iniciar() {
        vista.setTitle("Equipos dicom");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);

        modeloEquipoDicom = new EquipoDicomDaoImp();
        modeloAreas = new AreasDaoImpl();
        cargarTabla();
        cargarAreas();
    }

    private void cerrar() {
        System.exit(0);
    }

    private boolean deseaCerrar() {
        return true;
    }

    private String aMayusculas(String text) {
        return text.toUpperCase();
    }

    private void cargarTabla() {
        TableEquipoDicom creador = new TableEquipoDicom();
        creador.cargarTabla(vista.tableEquipos, modeloEquipoDicom.listarEquiposDicom());
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

    private boolean datosValidos() {
        if (vista.txtNombre.getText().equals("")) {
            return false;
        }
        if (vista.comboArea.getSelectedIndex() == 0) {
            return false;
        }
        if (vista.txtNombre.getText().equals("")) {
            return false;
        }
        if (vista.txtAe.getText().equals("")) {
            return false;
        }
        return true;
    }

    private boolean deseaGuardar() {
        int dialog = JOptionPane.YES_NO_OPTION;
        return (JOptionPane.showConfirmDialog(null, "¿Seguro que desea registrar el equipo? ", "Confirmar", dialog)) == 0;
    }

    private EquipoDicom obtenerDatosGuardar() {
        EquipoDicom temporal = new EquipoDicom();
        temporal.setAeTitle(vista.txtAe.getText());
        temporal.setIdArea(areaSeleccionada);
        temporal.setModalidad(vista.txtModalidad.getText());
        temporal.setNombre(vista.txtNombre.getText());
        return temporal;
    }

    private void guardar(EquipoDicom nuevo) {
        modeloEquipoDicom.guardar(nuevo);
    }

    private void abrirMenu() {
        vista.dispose();
        MenuController menu = new MenuController(new Menu());
        menu.iniciar();
    }

    private void limpiar() {
        vista.txtAe.setText("");
        vista.txtBuscar.setText("");
        vista.txtModalidad.setText("");
        vista.txtNombre.setText("");
        vista.comboArea.setSelectedIndex(0);
    }

    private Areas encontrarAreaPorNombre(String nombre) {
        return modeloAreas.encontrarPorNombre(nombre);
    }

    private void cargarCampos() {
        vista.txtAe.setText(equipoSeleccionado.getAeTitle());
        vista.txtModalidad.setText(equipoSeleccionado.getModalidad());
        vista.txtNombre.setText(equipoSeleccionado.getNombre());
        vista.comboArea.setSelectedItem(equipoSeleccionado.getIdArea().getNombreA());
    }

    private EquipoDicom buscarEquipoPorId(Long id) {
        EquipoDicom temp = new EquipoDicom();
        temp.setIdEquipo(id);
        return modeloEquipoDicom.encontrarEquipoDicomPorId(temp);
    }

    private boolean datosValidosModificar() {
        return datosValidos() && vista.tableEquipos.getSelectedRow() != -1;
    }

    private boolean deseaModificar() {
        int dialog = JOptionPane.YES_NO_OPTION;
        return (JOptionPane.showConfirmDialog(null, "¿Seguro que desea modificar el equipo? ", "Confirmar", dialog)) == 0;
    }

    private void obtenerDatosModificar() {
        equipoSeleccionado.setAeTitle(vista.txtAe.getText());
        equipoSeleccionado.setIdArea(areaSeleccionada);
        equipoSeleccionado.setModalidad(vista.txtModalidad.getText());
        equipoSeleccionado.setNombre(vista.txtNombre.getText());
    }

    private void modificar() {
        modeloEquipoDicom.actualizar(equipoSeleccionado);
    }

    private void buscarLikeNombre(String text) {
        TableEquipoDicom creador = new TableEquipoDicom();
        creador.cargarTabla(vista.tableEquipos, modeloEquipoDicom.encontrarEquipoDicomLikeNombre(text));
    }

}
