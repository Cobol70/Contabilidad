/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.Conceptos;
import java.util.List;

/**
 *
 * @author alanm
 */
public interface ConceptosDao {

    public Conceptos encontrarConceptoPorId(Conceptos conceptos);

    public List<Conceptos> encontrarConceptosPorIdVentaConceptos(Long idVentaConceptos);

    public List<Conceptos> encontrarConceptosPorIdArea(Integer idArea);

    public List<Conceptos> encontrarConceptosPorAreaInstitucion(Long idInstitucion, Integer idArea);

    public Conceptos encontrarConceptoPorNombre(String nombre);

    public List<Conceptos> encontrarTodosConceptos();

    public void registrarConcepto(Conceptos concepto);

    public List<Conceptos> encontrarConceptoLikeNombre(String nombre);

    public List<Conceptos> encontrarConceptosPorAreaYNombre(Integer idArea, String name);
    
    public List<Conceptos> encontrarConceptosPorIdInstitucion(Long idInstitucion);
                public void actualizarConcepto(Conceptos concepto);

}
