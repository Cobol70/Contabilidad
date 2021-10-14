/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.ConceptosInstitucion;
import clientews.servicio.ConceptosInstitucionServiceImplService;
import clientews.servicio.ConceptosInstitucionServiceWs;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author alanm
 */
public class ConceptosInstitucionDaoImpl implements ConceptosInstitucionDao{

    private ConceptosInstitucionServiceWs servicio = null;

    public ConceptosInstitucionDaoImpl() {
         if (servicio == null) {
            servicio = new ConceptosInstitucionServiceImplService().getConceptosInstitucionServiceImplPort();
            ((BindingProvider) servicio).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, LoginData.user);
            ((BindingProvider) servicio).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, LoginData.password);
        }
    }
    
    
    
    @Override
    public void registrarConceptosInstitucion(ConceptosInstitucion conceptoInstitucion) {
        servicio.registrarConceptosInstitucion(conceptoInstitucion);
    }

    @Override
    public void actualizarConceptosInstitucion(ConceptosInstitucion conceptoInstitucion) {
        servicio.actualizarConceptosInstitucion(conceptoInstitucion);
    }
    
}