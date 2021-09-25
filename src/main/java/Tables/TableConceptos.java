/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import Utilidades.DateUtil;
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
public class TableConceptos {

    public void cargarTabla(JTable tabla, List<VentaConceptos> list) {

        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Id");
        dt.addColumn("Estudio");
        dt.addColumn("Hora");
        dt.addColumn("Paciente");
        dt.addColumn("Telefono");
        dt.addColumn("Correo");
        dt.addColumn("idPaciente");
        dt.addColumn("idConcepto");

        VentaConceptos venta = new VentaConceptos();

        for (int i = 0; i < list.size(); i++) {
            Object fila[] = new Object[8];
            venta = list.get(i);
            fila[0] = venta.getIdVc();
            fila[1] = venta.getIdConceptoEs().getConceptoTo();
            fila[2] = venta.getHoraAsignado();
            fila[3] = venta.getIdPacienteVc().getNombreP() + " " + venta.getIdPacienteVc().getApaternoP() + " " + venta.getIdPacienteVc().getAmaternoP();
            fila[4] = venta.getIdPacienteVc().getTCelularp();
            fila[5] = venta.getIdPacienteVc().getEmailP();
            fila[6] = venta.getIdPacienteVc().getIdP();
            fila[7] = venta.getIdConceptoEs().getIdTo();
            dt.addRow(fila);
        }
        tabla.setModel(dt);
        tabla.setRowHeight(60);
        TableColumnModel columnModel = tabla.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(30);
        columnModel.getColumn(1).setPreferredWidth(250);
        columnModel.getColumn(2).setPreferredWidth(80);
        columnModel.getColumn(3).setPreferredWidth(250);
        columnModel.getColumn(4).setPreferredWidth(100);
        columnModel.getColumn(5).setPreferredWidth(250);
        columnModel.getColumn(6).setPreferredWidth(1);

        columnModel.getColumn(7).setPreferredWidth(1);

    }

    public void cargarTablaEnPagos(JTable tabla, List<VentaConceptos> list) {

        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Id");
        dt.addColumn("Estudio");
        dt.addColumn("Fecha");
        dt.addColumn("Hora");

        VentaConceptos venta = new VentaConceptos();

        for (int i = 0; i < list.size(); i++) {
            Object fila[] = new Object[4];
            venta = list.get(i);
            fila[0] = venta.getIdVc();
            fila[1] = venta.getIdConceptoEs().getConceptoTo();
            try {
                fila[2] = DateUtil.stringLegibleDate(venta.getFechaAsignado());
            } catch (Exception e) {
                                fila[2] = venta.getFechaAsignado();
                                
            }
            fila[3] = venta.getHoraAsignado();
            dt.addRow(fila);
        }
        tabla.setModel(dt);
        tabla.setRowHeight(60);
        TableColumnModel columnModel = tabla.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(30);
        columnModel.getColumn(1).setPreferredWidth(250);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(80);
    }

    public void cargarTablaVacia(JTable tabla) {

        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Id");
        dt.addColumn("Estudio");
        dt.addColumn("Hora");
        dt.addColumn("Paciente");
        dt.addColumn("Telefono");
        dt.addColumn("Correo");
        dt.addColumn("idPaciente");
        dt.addColumn("idConcepto");

        tabla.setModel(dt);
        tabla.setRowHeight(60);
        TableColumnModel columnModel = tabla.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(30);
        columnModel.getColumn(1).setPreferredWidth(250);
        columnModel.getColumn(2).setPreferredWidth(80);
        columnModel.getColumn(3).setPreferredWidth(250);
        columnModel.getColumn(4).setPreferredWidth(100);
        columnModel.getColumn(5).setPreferredWidth(250);
        columnModel.getColumn(6).setPreferredWidth(1);

        columnModel.getColumn(7).setPreferredWidth(1);

    }
}
