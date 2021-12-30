/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.AntecedenteConceptoIds;
import clientews.servicio.AntecedenteEstudio;
import clientews.servicio.Antecedentes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alanm
 */
public interface AntecedentesDao {

    public void registrarAntecedentes(Antecedentes antecedentes);

    public void actualizarAntecedentes(Antecedentes antecedentes);

    public List<Antecedentes> listarAntecedentes();

    public Antecedentes encontrarAntecedentesPorId(Long id);

    public List<Antecedentes> encontrarAntecedentesPorArea(Integer idArea);

    public List<Antecedentes> encontrarAntecedentesPorEstudio(Long idEstudio);

    public void registrarAntecedenteConcepto(Long idAntecedente, Long idConcepto);

    public void eliminarAntecedenteConcepto(Long idAntecedente, Long idConcepto);

    public void registrarAntecedenteEstudio(AntecedenteEstudio antecedenteEstudio);

    public void registrarAntecedentesEstudio(List<AntecedenteEstudio> antecedenteEstudio);

    public Antecedentes encontrarAntecedentePorNombre(String nombre);

    public List<Antecedentes> encontrarAntecedentesPorConcepto(Long idConcepto);

    public void registrarAntecedentesConcepto(List<AntecedenteConceptoIds> antecedentesConcepto);
     public void eliminarTodosAntecedentesConcepto(Long idConcepto);

}
