/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.Areas;
import clientews.servicio.AreasServiceImplService;
import clientews.servicio.AreasServiceWs;
import clientews.servicio.Institucion;
import java.util.List;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author alanm
 */
public class AreasDaoImpl implements AreasDao {

    private AreasServiceWs areasService = null;

    public AreasDaoImpl() {
        if (areasService == null) {
            areasService = new AreasServiceImplService().getAreasServiceImplPort();
            ((BindingProvider) areasService).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, LoginData.user);
            ((BindingProvider) areasService).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, LoginData.password);
        }
    }

    @Override
    public Areas encontrarPorId(Integer id) {
        Areas area = new Areas();
        area.setIdA(id);
        return areasService.listarPorId(area);
    }

    @Override
    public List<Areas> listar() {
       return areasService.listarTodasAreas();
    }

    @Override
    public Areas encontrarPorNombre(String nombre) {
        return areasService.obtenerAreaPorNombre(nombre);
    }

    @Override
    public List<Areas> encontrarPorInstitucion(Institucion institucion) {
        return areasService.obtenerAreasPorInstitucion(institucion.getIdInstitucion());
    }

    @Override
    public List<Areas> findAreasLikeNombre(String nombre) {
        return areasService.findAreasLikeNombre(nombre);
    }

    @Override
    public void updateArea(Areas area) {
         areasService.updateArea(area);
    }

    @Override
    public void registrarArea(Areas area) {
        areasService.registrarArea(area);
    }

}
