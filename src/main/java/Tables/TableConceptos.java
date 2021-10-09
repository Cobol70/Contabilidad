/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import clientews.servicio.Conceptos;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author alanm
 */
public class TableConceptos {

    public void cargarTabla(JTable tabla, List<Conceptos> list) {

        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Área");
        dt.addColumn("Estudio");
        dt.addColumn("Id");

        Conceptos conceptos = new Conceptos();

        for (int i = 0; i < list.size(); i++) {
            Object fila[] = new Object[8];
            conceptos = list.get(i);
            fila[0] = conceptos.getIdAreaTo().getNombreA();
            fila[1] = conceptos.getConceptoTo();
            fila[2] = conceptos.getIdTo();
            dt.addRow(fila);
        }
        tabla.setModel(dt);
        tabla.setRowHeight(40);
        TableColumnModel columnModel = tabla.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(150);
        columnModel.getColumn(1).setPreferredWidth(300);
        columnModel.getColumn(2).setPreferredWidth(10);

    }

    public void cargarTablaVacia(JTable tabla) {

        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Área");
        dt.addColumn("Estudio");
        dt.addColumn("Id");

        tabla.setModel(dt);
        tabla.setRowHeight(40);
        TableColumnModel columnModel = tabla.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(150);
        columnModel.getColumn(1).setPreferredWidth(300);
        columnModel.getColumn(2).setPreferredWidth(10);

    }
}
