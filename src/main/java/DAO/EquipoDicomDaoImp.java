/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.Areas;
import clientews.servicio.EquipoDicom;
import clientews.servicio.EquipoDicomServiceImplService;
import clientews.servicio.EquipoDicomServiceWs;
import java.util.List;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author alanm
 */
public class EquipoDicomDaoImp implements EquipoDicomDao{

    private EquipoDicomServiceWs servicio = null;

    public EquipoDicomDaoImp() {
        if (servicio == null) {
            servicio = new EquipoDicomServiceImplService().getEquipoDicomServiceImplPort();
            ((BindingProvider) servicio).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, LoginData.user);
            ((BindingProvider) servicio).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, LoginData.password);
        }
    }
   
    
    @Override
    public EquipoDicom encontrarEquipoDicomPorId(EquipoDicom equipo) {
        return servicio.encontrarEquipoDicomPorId(equipo);
    }

    @Override
    public List<EquipoDicom> encontrarEquipoDicomPorArea(Areas area) {
        return servicio.encontrarEquipoDicomPorArea(area);
    }

    @Override
    public List<EquipoDicom> encontrarEquipoDicomPorModalidad(String modalidad) {
        return servicio.encontrarEquipoDicomPorModalidad(modalidad);
    }

    @Override
    public List<EquipoDicom> encontrarEquipoDicomPorIdArea(Integer idArea) {
        return servicio.encontrarEquipoDicomPorIdArea(idArea);
    }

    @Override
    public EquipoDicom encontrarEquipoDicomPorNombre(String nombre) {
        return servicio.encontrarEquipoDicomPorNombre(nombre);
    }
    
}
