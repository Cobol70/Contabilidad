/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.ConceptoPaquete;
import clientews.servicio.ConceptosInstitucion;
import clientews.servicio.Paquete;
import java.util.List;


/**
 *
 * @author alanm
 */
public interface PaqueteDao {
    
    public List<Paquete> listarPaquetes();

    public Paquete encontrarPaquetePorId(Long idPaquete);

    public void registrarPaquete(Paquete paquete);

    public void modificarPaquete(Paquete paquete);

    public void eliminarPaquete(Paquete paquete);

    public void registrarConceptoPaquete(ConceptoPaquete conceptoPaquete);

    public void eliminarConceptoPaquete(ConceptoPaquete conceptoPaquete);

    public List<ConceptosInstitucion> obtenerConceptosDePaquete(Long idPaquete);

        public Paquete obtenerPaquetePorNombre(String nombre);

        public List<Paquete> obtenerPaquetesLikeNombre(String nombre);
    
}
