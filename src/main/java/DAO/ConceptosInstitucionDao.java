/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.ConceptosInstitucion;

/**
 *
 * @author alanm
 */
public interface ConceptosInstitucionDao {
        public void registrarConceptosInstitucion(ConceptosInstitucion conceptoInstitucion);

    public void actualizarConceptosInstitucion(ConceptosInstitucion conceptoInstitucion);
}
