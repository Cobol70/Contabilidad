/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.Consentimiento;
import java.util.List;

/**
 *
 * @author alanm
 */
public interface ConsentimientoDao {

    public List<Consentimiento> obtenerConsentimientos();

    public List<Consentimiento> obtenerPorIdConcepto(Long idConcepto);

    public void registrarConsentimiento(Consentimiento consentimiento);

    public void eliminarConsentimiento(Consentimiento consentimiento);

    public void modificarConsentimiento(Consentimiento consentimieno);

    public Consentimiento obtenerConsentimientoPorId(Long id);
    
    public Consentimiento obtenerConsentimientoPorNombre(String nombre);

}
