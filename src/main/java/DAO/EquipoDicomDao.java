/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.Areas;
import clientews.servicio.EquipoDicom;
import java.util.List;

/**
 *
 * @author alanm
 */
public interface EquipoDicomDao {

    public EquipoDicom encontrarEquipoDicomPorId(EquipoDicom equipo);

    public List<EquipoDicom> encontrarEquipoDicomPorArea(Areas area);

    public List<EquipoDicom> encontrarEquipoDicomPorModalidad(String modalidad);

    public List<EquipoDicom> encontrarEquipoDicomPorIdArea(Integer idArea);
    
    public EquipoDicom encontrarEquipoDicomPorNombre(String nombre);
}
