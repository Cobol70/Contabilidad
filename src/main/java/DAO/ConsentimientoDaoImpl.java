/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.Consentimiento;
import clientews.servicio.ConsentimientoServiceImplService;
import clientews.servicio.ConsentimientoServiceWs;
import java.util.List;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author alanm
 */
public class ConsentimientoDaoImpl implements ConsentimientoDao {

    private ConsentimientoServiceWs servicio = null;

    public ConsentimientoDaoImpl() {
        if (servicio == null) {
            servicio = new ConsentimientoServiceImplService().getConsentimientoServiceImplPort();
            ((BindingProvider) servicio).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, LoginData.user);
            ((BindingProvider) servicio).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, LoginData.password);
        }
    }
    
    @Override
    public List<Consentimiento> obtenerConsentimientos() {
        return servicio.obtenerConsentimientos();
    }

    @Override
    public List<Consentimiento> obtenerPorIdConcepto(Long idConcepto) {
        return servicio.obtenerPorIdConcepto(idConcepto);
    }

    @Override
    public void registrarConsentimiento(Consentimiento consentimiento) {
        servicio.registrarConsentimiento(consentimiento);
    }

    @Override
    public void eliminarConsentimiento(Consentimiento consentimiento) {
        servicio.eliminarConsentimiento(consentimiento);
    }

    @Override
    public void modificarConsentimiento(Consentimiento consentimieno) {
        servicio.modificarConsentimiento(consentimieno);
    }

    @Override
    public Consentimiento obtenerConsentimientoPorId(Long id) {
        return servicio.obtenerConsentimientoPorId(id);
    }

    @Override
    public Consentimiento obtenerConsentimientoPorNombre(String nombre) {
        return servicio.obtenerConsentimientoPorNombre(nombre);
    }
    
}
