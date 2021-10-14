/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.ConsentimientoConcepto;
import clientews.servicio.ConsentimientoConceptoServiceImplService;
import clientews.servicio.ConsentimientoConceptoServiceWs;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author alanm
 */
public class ConsentimientoConceptoDaoImpl implements ConsentimientoConceptoDao {

    private ConsentimientoConceptoServiceWs servicio = null;

    public ConsentimientoConceptoDaoImpl() {
        if (servicio == null) {
            servicio = new ConsentimientoConceptoServiceImplService().getConsentimientoConceptoServiceImplPort();
            ((BindingProvider) servicio).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, LoginData.user);
            ((BindingProvider) servicio).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, LoginData.password);
        }
    }

    @Override
    public void eliminarConsentimientoConcepto(ConsentimientoConcepto consentimientoConcepto) {
        servicio.eliminarConsentimientoConcepto(consentimientoConcepto);
    }

    @Override
    public void registrarConsentimientoConcepto(Long idConsentimiento, Long idConcepto) {
        servicio.registrarConsentimientoConcepto(idConsentimiento, idConcepto);
    }


}
