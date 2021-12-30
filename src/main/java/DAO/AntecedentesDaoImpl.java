/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clientews.servicio.AntecedenteConceptoIds;
import clientews.servicio.AntecedenteEstudio;
import clientews.servicio.Antecedentes;
import clientews.servicio.AntecedentesServiceImplService;
import clientews.servicio.AntecedentesServiceWs;
import java.util.ArrayList;
import java.util.List;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author alanm
 */
public class AntecedentesDaoImpl implements AntecedentesDao {

    private AntecedentesServiceWs service = null;

    public AntecedentesDaoImpl() {
        if (service == null) {
            service = new AntecedentesServiceImplService().getAntecedentesServiceImplPort();
            ((BindingProvider) service).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, LoginData.user);
            ((BindingProvider) service).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, LoginData.password);
        }
    }

    @Override
    public void registrarAntecedentes(Antecedentes antecedentes) {
        service.registrarAntecedentes(antecedentes);
    }

    @Override
    public void actualizarAntecedentes(Antecedentes antecedentes) {
        service.actualizarAntecedentes(antecedentes);
    }

    @Override
    public List<Antecedentes> listarAntecedentes() {
        return service.listarAntecedentes();
    }

    @Override
    public Antecedentes encontrarAntecedentesPorId(Long id) {
        return service.encontrarAntecedentesPorId(id);
    }

    @Override
    public List<Antecedentes> encontrarAntecedentesPorArea(Integer idArea) {
        return service.encontrarAntecedentesPorArea(idArea);
    }

    @Override
    public List<Antecedentes> encontrarAntecedentesPorEstudio(Long idEstudio) {
        return service.encontrarAntecedentesPorEstudio(idEstudio);
    }


    @Override
    public void registrarAntecedenteEstudio(AntecedenteEstudio antecedenteEstudio) {
        service.registrarAntecedenteEstudio(antecedenteEstudio);
    }

    @Override
    public void registrarAntecedentesEstudio(List<AntecedenteEstudio> antecedenteEstudio) {
        service.registrarAntecedentesEstudio(antecedenteEstudio);
    }

    @Override
    public Antecedentes encontrarAntecedentePorNombre(String nombre) {
        return service.encontrarAntecedentePorNombre(nombre);
    }

    @Override
    public List<Antecedentes> encontrarAntecedentesPorConcepto(Long idConcepto) {
        return service.encontrarAntecedentesPorConcepto(idConcepto);
    }

    @Override
    public void registrarAntecedenteConcepto(Long idAntecedente, Long idConcepto) {
        service.registrarAntecedenteConcepto(idConcepto, idConcepto);
    }

    @Override
    public void eliminarAntecedenteConcepto(Long idAntecedente, Long idConcepto) {
        service.eliminarAntecedentesConcepto(idConcepto, idConcepto);
    }

    @Override
    public void registrarAntecedentesConcepto(List<AntecedenteConceptoIds> antecedentesConcepto) {
        service.registrarAntecedentesConcepto(antecedentesConcepto);
    }

    @Override
    public void eliminarTodosAntecedentesConcepto(Long idConcepto) {
        service.eliminarTodosAntecedentesConcepto(idConcepto);
    }



}
