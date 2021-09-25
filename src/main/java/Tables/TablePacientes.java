/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import clientews.servicio.Pacientes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author alanm
 */
public class TablePacientes {
    
    public void cargarTabla(JTable tabla, List<Pacientes> list) {

        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Nombre");
        dt.addColumn("Fecha de nacimiento");
        dt.addColumn("Curp");
        dt.addColumn("Email");
        dt.addColumn("Teléfono");

        Pacientes paciente = new Pacientes();

        for (int i = 0; i < list.size(); i++) {
            Object fila[] = new Object[5];
            paciente = list.get(i);
            fila[0] = paciente.getNombreP() + " " + paciente.getApaternoP() + " " + paciente.getAmaternoP();
            fila[1] = paciente.getFNacp();
            fila[2] = paciente.getCurpP();
            fila[3] = paciente.getEmailP();
            fila[4] = paciente.getTCelularp();
            dt.addRow(fila);
        }
        tabla.setModel(dt);
        tabla.setRowHeight(60);
        TableColumnModel columnModel = tabla.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(190);
        columnModel.getColumn(1).setPreferredWidth(70);
        columnModel.getColumn(2).setPreferredWidth(130);
        columnModel.getColumn(3).setPreferredWidth(150);
        columnModel.getColumn(4).setPreferredWidth(80);
    }
    
    public void cargarTablaVacia(JTable tabla) {

        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Nombre");
        dt.addColumn("Fecha de nacimiento");
        dt.addColumn("Curp");
        dt.addColumn("Email");
        dt.addColumn("Teléfono");

        Pacientes paciente = new Pacientes();

            Object fila[] = new Object[5];
            fila[0] = "";
            fila[1] = "";
            fila[2] = "";
            fila[3] = "";
            fila[4] = "";
            dt.addRow(fila);
      
        tabla.setModel(dt);
        tabla.setRowHeight(60);
        TableColumnModel columnModel = tabla.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(10);
        columnModel.getColumn(1).setPreferredWidth(190);
        columnModel.getColumn(2).setPreferredWidth(70);
        columnModel.getColumn(3).setPreferredWidth(140);
        columnModel.getColumn(4).setPreferredWidth(50);
    }
    
}
