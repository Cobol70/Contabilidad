/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.DatosFacturacion;
import clientews.servicio.DatosFacturacionServiceImplService;
import clientews.servicio.DatosFacturacionServiceWs;
import java.util.List;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author alanm
 */
public class DatosFacturacionDaoImpl implements DatosFacturacionDao{

    private DatosFacturacionServiceWs servicio = null;

    public DatosFacturacionDaoImpl() {
        if(servicio == null){
            servicio = new DatosFacturacionServiceImplService().getDatosFacturacionServiceImplPort();
            ((BindingProvider) servicio).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, LoginData.user);
            ((BindingProvider) servicio).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, LoginData.password);
        }
    }
    
    @Override
    public void registrarDatosFacturacion(DatosFacturacion datosFacturacion) {
        servicio.registrarDatosFacturacion(datosFacturacion);
    }

    @Override
    public void modificarDatosFacturacion(DatosFacturacion datosFacturacion) {
        servicio.modificarDatosFacturacion(datosFacturacion);
    }

    @Override
    public List<DatosFacturacion> obtenerDatosFacturacionPorIdOrdenVenta(Long idOrdenVenta) {
        return servicio.obtenerDatosFacturacionPorIdOrdenVenta(idOrdenVenta);
    }

    @Override
    public DatosFacturacion obtenerDatosFacturacionPorPagoOrdenVenta(Long idPagoOrdenVenta) {
        return servicio.obtenerDatosFacturacionPorPagoOrdenVenta(idPagoOrdenVenta);
    }

    @Override
    public DatosFacturacion obtenerDatosFacturacionPorId(Long idDatosFacturacion) {
        return servicio.obtenerDatosFacturacionPorId(idDatosFacturacion);
    }
    
}
