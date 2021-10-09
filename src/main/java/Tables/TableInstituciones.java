/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import clientews.servicio.Institucion;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author alanm
 */
public class TableInstituciones {
    
    public void cargarTabla(JTable tabla, List<Institucion> list) {

        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Nombre");
        dt.addColumn("Límite");
        dt.addColumn("Id");

        Institucion instituciones = new Institucion();

        for (int i = 0; i < list.size(); i++) {
            Object fila[] = new Object[8];
            instituciones = list.get(i);
            fila[0] = instituciones.getNombreInstitucion();
            fila[1] = instituciones.getLimite();
            fila[2] = instituciones.getIdInstitucion();
            dt.addRow(fila);
        }
        tabla.setModel(dt);
        tabla.setRowHeight(40);
        TableColumnModel columnModel = tabla.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(300);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(10);

    }

}
