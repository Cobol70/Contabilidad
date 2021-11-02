/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.ConceptoPaquete;
import clientews.servicio.Conceptos;
import clientews.servicio.Paquete;
import clientews.servicio.PaquetesServiceImplService;
import clientews.servicio.PaquetesServiceWs;
import java.util.List;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author alanm
 */
public class PaqueteDaoImpl implements PaqueteDao{
    
    private PaquetesServiceWs servicio = null;

    public PaqueteDaoImpl() {
         if (servicio == null) {
            servicio = new PaquetesServiceImplService().getPaquetesServiceImplPort();
            ((BindingProvider) servicio).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, LoginData.user);
            ((BindingProvider) servicio).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, LoginData.password);
        }
    }

    @Override
    public List<Paquete> listarPaquetes() {
        return servicio.listarPaquetes();
    }

    @Override
    public Paquete encontrarPaquetePorId(Long idPaquete) {
        return servicio.encontrarPaquetePorId(idPaquete);
    }

    @Override
    public void registrarPaquete(Paquete paquete) {
        servicio.registrarPaquete(paquete);
    }

    @Override
    public void modificarPaquete(Paquete paquete) {
        servicio.modificarPaquete(paquete);
    }

    @Override
    public void eliminarPaquete(Paquete paquete) {
        servicio.eliminarPaquete(paquete);
    }

    @Override
    public void registrarConceptoPaquete(ConceptoPaquete conceptoPaquete) {
        servicio.registrarConceptoPaquete(conceptoPaquete);
    }

    @Override
    public void eliminarConceptoPaquete(ConceptoPaquete conceptoPaquete) {
        servicio.eliminarConceptoPaquete(conceptoPaquete);
    }

    @Override
    public List<Conceptos> obtenerConceptosDePaquete(Long idPaquete) {
        return servicio.obtenerConceptosDePaquete(idPaquete);
    }
    
    
    
}
