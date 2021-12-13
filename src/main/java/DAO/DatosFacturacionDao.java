/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.DatosFacturacion;
import java.util.List;

/**
 *
 * @author alanm
 */
public interface DatosFacturacionDao {
    
    public void registrarDatosFacturacion(DatosFacturacion datosFacturacion);
    
    public void modificarDatosFacturacion(DatosFacturacion datosFacturacion);
    
    public List<DatosFacturacion> obtenerDatosFacturacionPorIdOrdenVenta(Long idOrdenVenta);
    
    public DatosFacturacion obtenerDatosFacturacionPorPagoOrdenVenta(Long idPagoOrdenVenta);
    
    public DatosFacturacion obtenerDatosFacturacionPorId(Long idDatosFacturacion);
    
}
