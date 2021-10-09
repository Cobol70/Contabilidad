/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.Institucion;
import clientews.servicio.InstitucionServiceImplService;
import clientews.servicio.InstitucionServiceWs;
import java.util.List;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author alanm
 */
public class InstitucionDaoImp implements InstitucionDao {

    private InstitucionServiceWs servicio = null;

    public InstitucionDaoImp() {
        if (servicio == null) {
            servicio = new InstitucionServiceImplService().getInstitucionServiceImplPort();
            ((BindingProvider) servicio).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, LoginData.user);
            ((BindingProvider) servicio).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, LoginData.password);
        }
    }

    @Override
    public List<Institucion> listar() {
        return servicio.listarTodasInstituciones();
    }

    @Override
    public Institucion encontrarPorId(Institucion institucion) {
        return servicio.encontrarInstitucionPorId(institucion);
    }

    @Override
    public Institucion encontrarPorNombre(Institucion institucion) {
        Institucion encontrada = servicio.encontrarInstitucionPorNombre(institucion);
        System.out.println(encontrada.getIdInstitucion() + " " + encontrada.getNombreInstitucion());
        return encontrada;
    }

    @Override
    public Institucion findInstitucionByIdOrdenVenta(Long idOrdenVenta) {
        return servicio.findInstitucionByIdOrdenVenta(idOrdenVenta);
    }

    @Override
    public boolean aunEsPosibleAgendarEnInstitucion(Long idInstitucion, String fecha) {
        return servicio.aunEsPosibleAgendarEnInstitucion(idInstitucion, fecha);
    }

    @Override
    public Integer obtenerLimiteInstitucion(Long idInstitucion) {
        return servicio.obtenerLimiteInstitucion(idInstitucion);
    }

    @Override
    public Long obtenerCantidadDeEstudiosHechosEnInstitucionFecha(Long idInstitucion, String fecha) {
        return servicio.obtenerCantidadDeEstudiosHechosEnInstitucionFecha(idInstitucion, fecha);
    }

    @Override
    public List<Institucion> encontrarInstitucionesLikeNombre(String nombre) {
        return servicio.encontrarInstitucionesLikeNombre(nombre);
    }

    @Override
    public void registrarInstitucion(Institucion institucion) {
        servicio.registrarInstitucion(institucion);
    }

    @Override
    public void actualizarInstitucion(Institucion institucion) {
        servicio.actualizarInstitucion(institucion);
    }

}
