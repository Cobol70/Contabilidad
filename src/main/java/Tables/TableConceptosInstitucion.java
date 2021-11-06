/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import clientews.servicio.Conceptos;
import clientews.servicio.ConceptosInstitucion;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author alanm
 */
public class TableConceptosInstitucion {

    public void cargarTabla(JTable tabla, List<ConceptosInstitucion> list) {

        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Área");
        dt.addColumn("Estudio");
        dt.addColumn("Precio");
        dt.addColumn("Id");

        ConceptosInstitucion conceptos = new ConceptosInstitucion();

        for (int i = 0; i < list.size(); i++) {
            Object fila[] = new Object[4];
            conceptos = list.get(i);
            fila[0] = conceptos.getIdConcepto().getIdAreaTo().getNombreA();
            fila[1] = conceptos.getIdConcepto().getConceptoTo();
            fila[2] = conceptos.getPrecioPublico();
            fila[3] = conceptos.getIdConcepto().getIdTo();
            dt.addRow(fila);
        }
        tabla.setModel(dt);
        tabla.setRowHeight(40);
        TableColumnModel columnModel = tabla.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(150);
        columnModel.getColumn(1).setPreferredWidth(300);
        columnModel.getColumn(2).setPreferredWidth(50);
        columnModel.getColumn(3).setPreferredWidth(10);

    }

    public void cargarTablaVacia(JTable tabla) {

        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Área");
        dt.addColumn("Estudio");
        dt.addColumn("Precio");
        dt.addColumn("Id");

        tabla.setModel(dt);
        tabla.setRowHeight(40);
        TableColumnModel columnModel = tabla.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(150);
        columnModel.getColumn(1).setPreferredWidth(300);
        columnModel.getColumn(2).setPreferredWidth(50);
        columnModel.getColumn(3).setPreferredWidth(10);

    }
}
