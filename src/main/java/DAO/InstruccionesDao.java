/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.Instrucciones;
import java.util.List;

/**
 *
 * @author alanm
 */
public interface InstruccionesDao {
    
    public List<Instrucciones> obtenerTodasInstrucciones();
    public void registrarInstrucciones(Instrucciones instrucciones);
        public Instrucciones encontrarInstruccionesPorNombre(String nombre);

}
