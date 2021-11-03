/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import clientews.servicio.Paquete;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author alanm
 */
public class TablePaquetes {

    public void cargarTabla(JTable tabla, List<Paquete> list) {

        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Nombre");
        dt.addColumn("Fecha inicio");
        dt.addColumn("Fecha fin");
        dt.addColumn("Precio");
        dt.addColumn("Id");

       Paquete paquete = new Paquete();

        for (int i = 0; i < list.size(); i++) {
            Object fila[] = new Object[5];
            paquete = list.get(i);
            fila[0] = paquete.getIdConcepto().getConceptoTo();
            fila[1] = paquete.getFechaInicio();
            fila[2] = paquete.getFechaFin();
            fila[3] = paquete.getPrecio();
            fila[4] = paquete.getId();
            
            dt.addRow(fila);
        }
        tabla.setModel(dt);
        tabla.setRowHeight(60);
        TableColumnModel columnModel = tabla.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(200);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(70);
        columnModel.getColumn(4).setPreferredWidth(1);

    }

    
}
