/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.Instrucciones;
import clientews.servicio.InstruccionesServiceImplService;
import clientews.servicio.InstruccionesServiceWs;
import java.util.List;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author alanm
 */
public class InstruccionesDaoImpl implements InstruccionesDao {

     private InstruccionesServiceWs servicio = null;

    public InstruccionesDaoImpl() {
        if (servicio == null) {
            servicio = new InstruccionesServiceImplService().getInstruccionesServiceImplPort();
            ((BindingProvider) servicio).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, LoginData.user);
            ((BindingProvider) servicio).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, LoginData.password);
        }
    }
    
    @Override
    public List<Instrucciones> obtenerTodasInstrucciones() {
        return servicio.obtenerTodasInstrucciones();
    }

    @Override
    public void registrarInstrucciones(Instrucciones instrucciones) {
        servicio.registrarInstrucciones(instrucciones);
    }

    @Override
    public Instrucciones encontrarInstruccionesPorNombre(String nombre) {
        return servicio.encontrarInstruccionesPorNombre(nombre);
    }
    
}
