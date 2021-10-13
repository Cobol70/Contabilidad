/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import clientews.servicio.Consentimiento;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author alanm
 */
public class TableConsentimientos {

    public void cargarTabla(JTable tabla, List<Consentimiento> list) {

        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Nombre");
        dt.addColumn("Id");

        Consentimiento consentimiento = new Consentimiento();

        for (int i = 0; i < list.size(); i++) {
            Object fila[] = new Object[2];
            consentimiento = list.get(i);
            fila[0] = consentimiento.getNombre();
            fila[1] = consentimiento.getId();

            dt.addRow(fila);
        }
        tabla.setModel(dt);
        tabla.setRowHeight(60);
        TableColumnModel columnModel = tabla.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(250);
        columnModel.getColumn(1).setPreferredWidth(1);
    }
    
    public void cargarTablaVacia(JTable tabla) {

        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Nombre");
        dt.addColumn("Id");

        tabla.setModel(dt);
        tabla.setRowHeight(60);
        TableColumnModel columnModel = tabla.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(250);
        columnModel.getColumn(1).setPreferredWidth(1);
    }
}
