/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import Utilidades.DateUtil;
import clientews.servicio.OrdenVenta;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author alanm
 */
public class TableOrdenesVenta {
    
    public void cargarTabla(JTable tabla, List<OrdenVenta> list) {

        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Id");
        dt.addColumn("Total");
        dt.addColumn("Paciente");
        dt.addColumn("Fecha de venta");
        dt.addColumn("idPaciente");
       
        OrdenVenta ordenVenta = new OrdenVenta();

        for (int i = 0; i < list.size(); i++) {
            Object fila[] = new Object[5];
            ordenVenta = list.get(i);
            fila[0] = ordenVenta.getIdOv();
            fila[1] = ordenVenta.getTotalEi();
            fila[2] = ordenVenta.getIdPacienteOv().getNombreCompletoP();
            fila[3] = DateUtil.stringLegibleDate(ordenVenta.getFechaVentaOv());
            fila[4] = ordenVenta.getIdPacienteOv().getIdP();
            
            dt.addRow(fila);
        }
        tabla.setModel(dt);
        tabla.setRowHeight(60);
        TableColumnModel columnModel = tabla.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(10);
        columnModel.getColumn(1).setPreferredWidth(120);
        columnModel.getColumn(2).setPreferredWidth(250);
        columnModel.getColumn(3).setPreferredWidth(100);
                columnModel.getColumn(4).setPreferredWidth(1);


    }
    
}
