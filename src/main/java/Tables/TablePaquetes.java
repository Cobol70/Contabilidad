/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import Utilidades.DateUtil;
import clientews.servicio.Areas;
import clientews.servicio.Pacientes;
import clientews.servicio.VentaConceptos;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author alanm
 */
public class TablePaquetes {

    public void cargarTabla(JTable tabla, List<Areas> list) {

        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Área");
        dt.addColumn("Hora inicio");
        dt.addColumn("Hora fin");
        dt.addColumn("Duración");

       Areas area = new Areas();

        for (int i = 0; i < list.size(); i++) {
            Object fila[] = new Object[5];
            area = list.get(i);
            fila[0] = area.getIdA();
            fila[1] = area.getNombreA();
            fila[2] = area.getHoraInicio();
            fila[3] = area.getHoraFin();
            fila[4] = area.getDuracionMinutos();
            
            dt.addRow(fila);
        }
        tabla.setModel(dt);
        tabla.setRowHeight(60);
        TableColumnModel columnModel = tabla.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(30);
        columnModel.getColumn(1).setPreferredWidth(250);
        columnModel.getColumn(2).setPreferredWidth(80);
        columnModel.getColumn(3).setPreferredWidth(80);
        columnModel.getColumn(4).setPreferredWidth(50);

    }

    
}
