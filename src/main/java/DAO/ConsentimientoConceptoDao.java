/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.ConsentimientoConcepto;

/**
 *
 * @author alanm
 */
public interface ConsentimientoConceptoDao {

    public void eliminarConsentimientoConcepto(ConsentimientoConcepto consentimientoConcepto);

    public void registrarConsentimientoConcepto(Long idConsentimiento, Long idConcepto);

}
