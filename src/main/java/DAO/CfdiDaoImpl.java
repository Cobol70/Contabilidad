/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.Cfdi;
import clientews.servicio.CfdiServiceImplService;
import clientews.servicio.CfdiServiceWs;
import java.util.List;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author alanm
 */
public class CfdiDaoImpl implements CfdiDao {

    private CfdiServiceWs servicio = null;

    public CfdiDaoImpl() {
        if(servicio == null){
            servicio = new CfdiServiceImplService().getCfdiServiceImplPort();
            ((BindingProvider) servicio).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, LoginData.user);
            ((BindingProvider) servicio).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, LoginData.password);
        }
    }

    
    
    @Override
    public Cfdi obtenerCfdiPorClave(String clave) {
        return servicio.obtenerCfdiPorClave(clave);
    }

    @Override
    public List<Cfdi> listarCfdis() {
        return servicio.listarCfdis();
    }

    @Override
    public void registrarCfdi(Cfdi cfdi) {
        servicio.registrarCfdi(cfdi);
    }

    @Override
    public void modificarCfdi(Cfdi cfdi) {
        servicio.modificarCfdi(cfdi);
    }
    
}
