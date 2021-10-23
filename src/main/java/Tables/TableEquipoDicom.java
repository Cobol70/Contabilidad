/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import Utilidades.DateUtil;
import clientews.servicio.Areas;
import clientews.servicio.EquipoDicom;
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
public class TableEquipoDicom {

    public void cargarTabla(JTable tabla, List<EquipoDicom> list) {

        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Nombre");
        dt.addColumn("Modalidad");
        dt.addColumn("Área");
        dt.addColumn("Id");
        
       EquipoDicom equipo = new EquipoDicom();

        for (int i = 0; i < list.size(); i++) {
            Object fila[] = new Object[4];
            equipo = list.get(i);
            fila[0] = equipo.getNombre();
            fila[1] = equipo.getModalidad();
            fila[2] = equipo.getIdArea().getNombreA();
            fila[3] = equipo.getIdEquipo();
            
            dt.addRow(fila);
        }
        tabla.setModel(dt);
        tabla.setRowHeight(60);
        TableColumnModel columnModel = tabla.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(250);
        columnModel.getColumn(1).setPreferredWidth(20);
        columnModel.getColumn(2).setPreferredWidth(120);
        columnModel.getColumn(3).setPreferredWidth(1);

    }

    
}
