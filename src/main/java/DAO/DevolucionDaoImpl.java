/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.Devolucion;
import clientews.servicio.DevolucionServiceImplService;
import clientews.servicio.DevolucionServiceWs;
import java.util.List;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author alanm
 */
public class DevolucionDaoImpl implements DevolucionDao {

    private DevolucionServiceWs servicio = null;

    public DevolucionDaoImpl() {
        if (servicio == null) {
            servicio = new DevolucionServiceImplService().getDevolucionServiceImplPort();
            ((BindingProvider) servicio).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, LoginData.user);
            ((BindingProvider) servicio).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, LoginData.password);
        }
    }

    @Override
    public void registrarDevolucion(Devolucion devolucion) {
        servicio.registrarDevolucion(devolucion);
    }

    @Override
    public List<Devolucion> buscarDevolucionesPorFecha(String fecha) {
        return servicio.buscarDevolucionesPorFecha(fecha);
    }

    @Override
    public Devolucion encontrarDevolucionPorId(Long id) {
        return servicio.encontrarDevolucionPorId(id);
    }

    @Override
    public List<Devolucion> obtenerDevolucionesPorIdOrdenVenta(Long idOrden) {
        return servicio.obtenerDevolucionesPorIdOrdenVenta(idOrden);
    }

    @Override
    public Devolucion obtenerDevolucionPorIdPagoOrdenVenta(Long id) {
        return servicio.obtenerDevolucionPorIdPagoOrdenVenta(id);
    }

}
