/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.Institucion;
import java.util.List;

/**
 *
 * @author alanm
 */
public interface InstitucionDao {

    public List<Institucion> listar();

    public Institucion encontrarPorId(Institucion institucion);

    public Institucion encontrarPorNombre(Institucion institucion);

    public Institucion findInstitucionByIdOrdenVenta(Long idOrdenVenta);

    public boolean aunEsPosibleAgendarEnInstitucion(Long idInstitucion, String fecha);

    public Integer obtenerLimiteInstitucion(Long idInstitucion);

    public Long obtenerCantidadDeEstudiosHechosEnInstitucionFecha(Long idInstitucion, String fecha);

    public List<Institucion> encontrarInstitucionesLikeNombre(String nombre);
    
    public void registrarInstitucion(Institucion institucion);

    public void actualizarInstitucion(Institucion institucion);

}
