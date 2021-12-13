/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.Cfdi;
import java.util.List;

/**
 *
 * @author alanm
 */
public interface CfdiDao {
    
    public Cfdi obtenerCfdiPorClave(String clave);
    public List<Cfdi> listarCfdis();
    public void registrarCfdi(Cfdi cfdi);
    public void modificarCfdi(Cfdi cfdi);
}
