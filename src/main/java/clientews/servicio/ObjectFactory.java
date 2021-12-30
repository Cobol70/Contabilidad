
package clientews.servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientews.servicio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Medico_QNAME = new QName("http://servicio.sga.gm.com.mx/", "medico");
    private final static QName _Conceptos_QNAME = new QName("http://servicio.sga.gm.com.mx/", "conceptos");
    private final static QName _RegistrarAntecedenteConcepto_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarAntecedenteConcepto");
    private final static QName _EncontrarAntecedentesPorId_QNAME = new QName("http://servicio.sga.gm.com.mx/", "encontrarAntecedentesPorId");
    private final static QName _CatalogoFormaPago_QNAME = new QName("http://servicio.sga.gm.com.mx/", "catalogoFormaPago");
    private final static QName _ActualizarAntecedentes_QNAME = new QName("http://servicio.sga.gm.com.mx/", "actualizarAntecedentes");
    private final static QName _ActualizarAntecedentesResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "actualizarAntecedentesResponse");
    private final static QName _RegistrarAntecedentesConcepto_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarAntecedentesConcepto");
    private final static QName _EncontrarAntecedentePorNombre_QNAME = new QName("http://servicio.sga.gm.com.mx/", "encontrarAntecedentePorNombre");
    private final static QName _EncontrarAntecedentesPorConcepto_QNAME = new QName("http://servicio.sga.gm.com.mx/", "encontrarAntecedentesPorConcepto");
    private final static QName _EliminarTodosAntecedentesConceptoResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "eliminarTodosAntecedentesConceptoResponse");
    private final static QName _RegistrarAntecedentesEstudio_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarAntecedentesEstudio");
    private final static QName _EncontrarAntecedentesPorEstudioResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "encontrarAntecedentesPorEstudioResponse");
    private final static QName _ListarAntecedentes_QNAME = new QName("http://servicio.sga.gm.com.mx/", "listarAntecedentes");
    private final static QName _RegistrarAntecedentesResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarAntecedentesResponse");
    private final static QName _EliminarTodosAntecedentesConcepto_QNAME = new QName("http://servicio.sga.gm.com.mx/", "eliminarTodosAntecedentesConcepto");
    private final static QName _Firma_QNAME = new QName("http://servicio.sga.gm.com.mx/", "firma");
    private final static QName _Tecnico_QNAME = new QName("http://servicio.sga.gm.com.mx/", "tecnico");
    private final static QName _EliminarAntecedentesConceptoResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "eliminarAntecedentesConceptoResponse");
    private final static QName _ListarAntecedentesResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "listarAntecedentesResponse");
    private final static QName _EncontrarAntecedentesPorConceptoResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "encontrarAntecedentesPorConceptoResponse");
    private final static QName _EncontrarAntecedentePorNombreResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "encontrarAntecedentePorNombreResponse");
    private final static QName _RegistrarAntecedentes_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarAntecedentes");
    private final static QName _AntecedenteEstudio_QNAME = new QName("http://servicio.sga.gm.com.mx/", "antecedenteEstudio");
    private final static QName _RegistrarAntecedentesConceptoResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarAntecedentesConceptoResponse");
    private final static QName _EncontrarAntecedentesPorAreaResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "encontrarAntecedentesPorAreaResponse");
    private final static QName _OrdenVenta_QNAME = new QName("http://servicio.sga.gm.com.mx/", "ordenVenta");
    private final static QName _Antecedentes_QNAME = new QName("http://servicio.sga.gm.com.mx/", "antecedentes");
    private final static QName _Pacientes_QNAME = new QName("http://servicio.sga.gm.com.mx/", "pacientes");
    private final static QName _EncontrarAntecedentesPorIdResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "encontrarAntecedentesPorIdResponse");
    private final static QName _EquipoDicom_QNAME = new QName("http://servicio.sga.gm.com.mx/", "equipoDicom");
    private final static QName _RegistrarAntecedenteEstudio_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarAntecedenteEstudio");
    private final static QName _RegistrarAntecedenteConceptoResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarAntecedenteConceptoResponse");
    private final static QName _VentaConceptos_QNAME = new QName("http://servicio.sga.gm.com.mx/", "ventaConceptos");
    private final static QName _EliminarAntecedentesConcepto_QNAME = new QName("http://servicio.sga.gm.com.mx/", "eliminarAntecedentesConcepto");
    private final static QName _Instrucciones_QNAME = new QName("http://servicio.sga.gm.com.mx/", "instrucciones");
    private final static QName _RegistrarAntecedentesEstudioResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarAntecedentesEstudioResponse");
    private final static QName _EncontrarAntecedentesPorArea_QNAME = new QName("http://servicio.sga.gm.com.mx/", "encontrarAntecedentesPorArea");
    private final static QName _RegistrarAntecedenteEstudioResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarAntecedenteEstudioResponse");
    private final static QName _Areas_QNAME = new QName("http://servicio.sga.gm.com.mx/", "areas");
    private final static QName _EncontrarAntecedentesPorEstudio_QNAME = new QName("http://servicio.sga.gm.com.mx/", "encontrarAntecedentesPorEstudio");
    private final static QName _Institucion_QNAME = new QName("http://servicio.sga.gm.com.mx/", "institucion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientews.servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EliminarAntecedentesConcepto }
     * 
     */
    public EliminarAntecedentesConcepto createEliminarAntecedentesConcepto() {
        return new EliminarAntecedentesConcepto();
    }

    /**
     * Create an instance of {@link Instrucciones }
     * 
     */
    public Instrucciones createInstrucciones() {
        return new Instrucciones();
    }

    /**
     * Create an instance of {@link RegistrarAntecedentesEstudioResponse }
     * 
     */
    public RegistrarAntecedentesEstudioResponse createRegistrarAntecedentesEstudioResponse() {
        return new RegistrarAntecedentesEstudioResponse();
    }

    /**
     * Create an instance of {@link VentaConceptos }
     * 
     */
    public VentaConceptos createVentaConceptos() {
        return new VentaConceptos();
    }

    /**
     * Create an instance of {@link RegistrarAntecedenteConceptoResponse }
     * 
     */
    public RegistrarAntecedenteConceptoResponse createRegistrarAntecedenteConceptoResponse() {
        return new RegistrarAntecedenteConceptoResponse();
    }

    /**
     * Create an instance of {@link RegistrarAntecedenteEstudio }
     * 
     */
    public RegistrarAntecedenteEstudio createRegistrarAntecedenteEstudio() {
        return new RegistrarAntecedenteEstudio();
    }

    /**
     * Create an instance of {@link EquipoDicom }
     * 
     */
    public EquipoDicom createEquipoDicom() {
        return new EquipoDicom();
    }

    /**
     * Create an instance of {@link EncontrarAntecedentesPorEstudio }
     * 
     */
    public EncontrarAntecedentesPorEstudio createEncontrarAntecedentesPorEstudio() {
        return new EncontrarAntecedentesPorEstudio();
    }

    /**
     * Create an instance of {@link Institucion }
     * 
     */
    public Institucion createInstitucion() {
        return new Institucion();
    }

    /**
     * Create an instance of {@link Areas }
     * 
     */
    public Areas createAreas() {
        return new Areas();
    }

    /**
     * Create an instance of {@link RegistrarAntecedenteEstudioResponse }
     * 
     */
    public RegistrarAntecedenteEstudioResponse createRegistrarAntecedenteEstudioResponse() {
        return new RegistrarAntecedenteEstudioResponse();
    }

    /**
     * Create an instance of {@link EncontrarAntecedentesPorArea }
     * 
     */
    public EncontrarAntecedentesPorArea createEncontrarAntecedentesPorArea() {
        return new EncontrarAntecedentesPorArea();
    }

    /**
     * Create an instance of {@link AntecedenteEstudio }
     * 
     */
    public AntecedenteEstudio createAntecedenteEstudio() {
        return new AntecedenteEstudio();
    }

    /**
     * Create an instance of {@link RegistrarAntecedentesConceptoResponse }
     * 
     */
    public RegistrarAntecedentesConceptoResponse createRegistrarAntecedentesConceptoResponse() {
        return new RegistrarAntecedentesConceptoResponse();
    }

    /**
     * Create an instance of {@link RegistrarAntecedentes }
     * 
     */
    public RegistrarAntecedentes createRegistrarAntecedentes() {
        return new RegistrarAntecedentes();
    }

    /**
     * Create an instance of {@link EncontrarAntecedentePorNombreResponse }
     * 
     */
    public EncontrarAntecedentePorNombreResponse createEncontrarAntecedentePorNombreResponse() {
        return new EncontrarAntecedentePorNombreResponse();
    }

    /**
     * Create an instance of {@link EncontrarAntecedentesPorConceptoResponse }
     * 
     */
    public EncontrarAntecedentesPorConceptoResponse createEncontrarAntecedentesPorConceptoResponse() {
        return new EncontrarAntecedentesPorConceptoResponse();
    }

    /**
     * Create an instance of {@link EncontrarAntecedentesPorIdResponse }
     * 
     */
    public EncontrarAntecedentesPorIdResponse createEncontrarAntecedentesPorIdResponse() {
        return new EncontrarAntecedentesPorIdResponse();
    }

    /**
     * Create an instance of {@link Antecedentes }
     * 
     */
    public Antecedentes createAntecedentes() {
        return new Antecedentes();
    }

    /**
     * Create an instance of {@link Pacientes }
     * 
     */
    public Pacientes createPacientes() {
        return new Pacientes();
    }

    /**
     * Create an instance of {@link EncontrarAntecedentesPorAreaResponse }
     * 
     */
    public EncontrarAntecedentesPorAreaResponse createEncontrarAntecedentesPorAreaResponse() {
        return new EncontrarAntecedentesPorAreaResponse();
    }

    /**
     * Create an instance of {@link OrdenVenta }
     * 
     */
    public OrdenVenta createOrdenVenta() {
        return new OrdenVenta();
    }

    /**
     * Create an instance of {@link ListarAntecedentes }
     * 
     */
    public ListarAntecedentes createListarAntecedentes() {
        return new ListarAntecedentes();
    }

    /**
     * Create an instance of {@link EncontrarAntecedentesPorEstudioResponse }
     * 
     */
    public EncontrarAntecedentesPorEstudioResponse createEncontrarAntecedentesPorEstudioResponse() {
        return new EncontrarAntecedentesPorEstudioResponse();
    }

    /**
     * Create an instance of {@link RegistrarAntecedentesEstudio }
     * 
     */
    public RegistrarAntecedentesEstudio createRegistrarAntecedentesEstudio() {
        return new RegistrarAntecedentesEstudio();
    }

    /**
     * Create an instance of {@link EliminarTodosAntecedentesConceptoResponse }
     * 
     */
    public EliminarTodosAntecedentesConceptoResponse createEliminarTodosAntecedentesConceptoResponse() {
        return new EliminarTodosAntecedentesConceptoResponse();
    }

    /**
     * Create an instance of {@link ListarAntecedentesResponse }
     * 
     */
    public ListarAntecedentesResponse createListarAntecedentesResponse() {
        return new ListarAntecedentesResponse();
    }

    /**
     * Create an instance of {@link EliminarAntecedentesConceptoResponse }
     * 
     */
    public EliminarAntecedentesConceptoResponse createEliminarAntecedentesConceptoResponse() {
        return new EliminarAntecedentesConceptoResponse();
    }

    /**
     * Create an instance of {@link Tecnico }
     * 
     */
    public Tecnico createTecnico() {
        return new Tecnico();
    }

    /**
     * Create an instance of {@link Firma }
     * 
     */
    public Firma createFirma() {
        return new Firma();
    }

    /**
     * Create an instance of {@link EliminarTodosAntecedentesConcepto }
     * 
     */
    public EliminarTodosAntecedentesConcepto createEliminarTodosAntecedentesConcepto() {
        return new EliminarTodosAntecedentesConcepto();
    }

    /**
     * Create an instance of {@link RegistrarAntecedentesResponse }
     * 
     */
    public RegistrarAntecedentesResponse createRegistrarAntecedentesResponse() {
        return new RegistrarAntecedentesResponse();
    }

    /**
     * Create an instance of {@link ActualizarAntecedentes }
     * 
     */
    public ActualizarAntecedentes createActualizarAntecedentes() {
        return new ActualizarAntecedentes();
    }

    /**
     * Create an instance of {@link CatalogoFormaPago }
     * 
     */
    public CatalogoFormaPago createCatalogoFormaPago() {
        return new CatalogoFormaPago();
    }

    /**
     * Create an instance of {@link EncontrarAntecedentesPorId }
     * 
     */
    public EncontrarAntecedentesPorId createEncontrarAntecedentesPorId() {
        return new EncontrarAntecedentesPorId();
    }

    /**
     * Create an instance of {@link RegistrarAntecedenteConcepto }
     * 
     */
    public RegistrarAntecedenteConcepto createRegistrarAntecedenteConcepto() {
        return new RegistrarAntecedenteConcepto();
    }

    /**
     * Create an instance of {@link Conceptos }
     * 
     */
    public Conceptos createConceptos() {
        return new Conceptos();
    }

    /**
     * Create an instance of {@link Medico }
     * 
     */
    public Medico createMedico() {
        return new Medico();
    }

    /**
     * Create an instance of {@link EncontrarAntecedentePorNombre }
     * 
     */
    public EncontrarAntecedentePorNombre createEncontrarAntecedentePorNombre() {
        return new EncontrarAntecedentePorNombre();
    }

    /**
     * Create an instance of {@link EncontrarAntecedentesPorConcepto }
     * 
     */
    public EncontrarAntecedentesPorConcepto createEncontrarAntecedentesPorConcepto() {
        return new EncontrarAntecedentesPorConcepto();
    }

    /**
     * Create an instance of {@link RegistrarAntecedentesConcepto }
     * 
     */
    public RegistrarAntecedentesConcepto createRegistrarAntecedentesConcepto() {
        return new RegistrarAntecedentesConcepto();
    }

    /**
     * Create an instance of {@link ActualizarAntecedentesResponse }
     * 
     */
    public ActualizarAntecedentesResponse createActualizarAntecedentesResponse() {
        return new ActualizarAntecedentesResponse();
    }

    /**
     * Create an instance of {@link AntecedenteConceptoIds }
     * 
     */
    public AntecedenteConceptoIds createAntecedenteConceptoIds() {
        return new AntecedenteConceptoIds();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Medico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "medico")
    public JAXBElement<Medico> createMedico(Medico value) {
        return new JAXBElement<Medico>(_Medico_QNAME, Medico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Conceptos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "conceptos")
    public JAXBElement<Conceptos> createConceptos(Conceptos value) {
        return new JAXBElement<Conceptos>(_Conceptos_QNAME, Conceptos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarAntecedenteConcepto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarAntecedenteConcepto")
    public JAXBElement<RegistrarAntecedenteConcepto> createRegistrarAntecedenteConcepto(RegistrarAntecedenteConcepto value) {
        return new JAXBElement<RegistrarAntecedenteConcepto>(_RegistrarAntecedenteConcepto_QNAME, RegistrarAntecedenteConcepto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarAntecedentesPorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "encontrarAntecedentesPorId")
    public JAXBElement<EncontrarAntecedentesPorId> createEncontrarAntecedentesPorId(EncontrarAntecedentesPorId value) {
        return new JAXBElement<EncontrarAntecedentesPorId>(_EncontrarAntecedentesPorId_QNAME, EncontrarAntecedentesPorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogoFormaPago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "catalogoFormaPago")
    public JAXBElement<CatalogoFormaPago> createCatalogoFormaPago(CatalogoFormaPago value) {
        return new JAXBElement<CatalogoFormaPago>(_CatalogoFormaPago_QNAME, CatalogoFormaPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarAntecedentes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "actualizarAntecedentes")
    public JAXBElement<ActualizarAntecedentes> createActualizarAntecedentes(ActualizarAntecedentes value) {
        return new JAXBElement<ActualizarAntecedentes>(_ActualizarAntecedentes_QNAME, ActualizarAntecedentes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarAntecedentesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "actualizarAntecedentesResponse")
    public JAXBElement<ActualizarAntecedentesResponse> createActualizarAntecedentesResponse(ActualizarAntecedentesResponse value) {
        return new JAXBElement<ActualizarAntecedentesResponse>(_ActualizarAntecedentesResponse_QNAME, ActualizarAntecedentesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarAntecedentesConcepto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarAntecedentesConcepto")
    public JAXBElement<RegistrarAntecedentesConcepto> createRegistrarAntecedentesConcepto(RegistrarAntecedentesConcepto value) {
        return new JAXBElement<RegistrarAntecedentesConcepto>(_RegistrarAntecedentesConcepto_QNAME, RegistrarAntecedentesConcepto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarAntecedentePorNombre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "encontrarAntecedentePorNombre")
    public JAXBElement<EncontrarAntecedentePorNombre> createEncontrarAntecedentePorNombre(EncontrarAntecedentePorNombre value) {
        return new JAXBElement<EncontrarAntecedentePorNombre>(_EncontrarAntecedentePorNombre_QNAME, EncontrarAntecedentePorNombre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarAntecedentesPorConcepto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "encontrarAntecedentesPorConcepto")
    public JAXBElement<EncontrarAntecedentesPorConcepto> createEncontrarAntecedentesPorConcepto(EncontrarAntecedentesPorConcepto value) {
        return new JAXBElement<EncontrarAntecedentesPorConcepto>(_EncontrarAntecedentesPorConcepto_QNAME, EncontrarAntecedentesPorConcepto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTodosAntecedentesConceptoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "eliminarTodosAntecedentesConceptoResponse")
    public JAXBElement<EliminarTodosAntecedentesConceptoResponse> createEliminarTodosAntecedentesConceptoResponse(EliminarTodosAntecedentesConceptoResponse value) {
        return new JAXBElement<EliminarTodosAntecedentesConceptoResponse>(_EliminarTodosAntecedentesConceptoResponse_QNAME, EliminarTodosAntecedentesConceptoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarAntecedentesEstudio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarAntecedentesEstudio")
    public JAXBElement<RegistrarAntecedentesEstudio> createRegistrarAntecedentesEstudio(RegistrarAntecedentesEstudio value) {
        return new JAXBElement<RegistrarAntecedentesEstudio>(_RegistrarAntecedentesEstudio_QNAME, RegistrarAntecedentesEstudio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarAntecedentesPorEstudioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "encontrarAntecedentesPorEstudioResponse")
    public JAXBElement<EncontrarAntecedentesPorEstudioResponse> createEncontrarAntecedentesPorEstudioResponse(EncontrarAntecedentesPorEstudioResponse value) {
        return new JAXBElement<EncontrarAntecedentesPorEstudioResponse>(_EncontrarAntecedentesPorEstudioResponse_QNAME, EncontrarAntecedentesPorEstudioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAntecedentes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "listarAntecedentes")
    public JAXBElement<ListarAntecedentes> createListarAntecedentes(ListarAntecedentes value) {
        return new JAXBElement<ListarAntecedentes>(_ListarAntecedentes_QNAME, ListarAntecedentes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarAntecedentesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarAntecedentesResponse")
    public JAXBElement<RegistrarAntecedentesResponse> createRegistrarAntecedentesResponse(RegistrarAntecedentesResponse value) {
        return new JAXBElement<RegistrarAntecedentesResponse>(_RegistrarAntecedentesResponse_QNAME, RegistrarAntecedentesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTodosAntecedentesConcepto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "eliminarTodosAntecedentesConcepto")
    public JAXBElement<EliminarTodosAntecedentesConcepto> createEliminarTodosAntecedentesConcepto(EliminarTodosAntecedentesConcepto value) {
        return new JAXBElement<EliminarTodosAntecedentesConcepto>(_EliminarTodosAntecedentesConcepto_QNAME, EliminarTodosAntecedentesConcepto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Firma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "firma")
    public JAXBElement<Firma> createFirma(Firma value) {
        return new JAXBElement<Firma>(_Firma_QNAME, Firma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tecnico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "tecnico")
    public JAXBElement<Tecnico> createTecnico(Tecnico value) {
        return new JAXBElement<Tecnico>(_Tecnico_QNAME, Tecnico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarAntecedentesConceptoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "eliminarAntecedentesConceptoResponse")
    public JAXBElement<EliminarAntecedentesConceptoResponse> createEliminarAntecedentesConceptoResponse(EliminarAntecedentesConceptoResponse value) {
        return new JAXBElement<EliminarAntecedentesConceptoResponse>(_EliminarAntecedentesConceptoResponse_QNAME, EliminarAntecedentesConceptoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAntecedentesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "listarAntecedentesResponse")
    public JAXBElement<ListarAntecedentesResponse> createListarAntecedentesResponse(ListarAntecedentesResponse value) {
        return new JAXBElement<ListarAntecedentesResponse>(_ListarAntecedentesResponse_QNAME, ListarAntecedentesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarAntecedentesPorConceptoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "encontrarAntecedentesPorConceptoResponse")
    public JAXBElement<EncontrarAntecedentesPorConceptoResponse> createEncontrarAntecedentesPorConceptoResponse(EncontrarAntecedentesPorConceptoResponse value) {
        return new JAXBElement<EncontrarAntecedentesPorConceptoResponse>(_EncontrarAntecedentesPorConceptoResponse_QNAME, EncontrarAntecedentesPorConceptoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarAntecedentePorNombreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "encontrarAntecedentePorNombreResponse")
    public JAXBElement<EncontrarAntecedentePorNombreResponse> createEncontrarAntecedentePorNombreResponse(EncontrarAntecedentePorNombreResponse value) {
        return new JAXBElement<EncontrarAntecedentePorNombreResponse>(_EncontrarAntecedentePorNombreResponse_QNAME, EncontrarAntecedentePorNombreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarAntecedentes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarAntecedentes")
    public JAXBElement<RegistrarAntecedentes> createRegistrarAntecedentes(RegistrarAntecedentes value) {
        return new JAXBElement<RegistrarAntecedentes>(_RegistrarAntecedentes_QNAME, RegistrarAntecedentes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AntecedenteEstudio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "antecedenteEstudio")
    public JAXBElement<AntecedenteEstudio> createAntecedenteEstudio(AntecedenteEstudio value) {
        return new JAXBElement<AntecedenteEstudio>(_AntecedenteEstudio_QNAME, AntecedenteEstudio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarAntecedentesConceptoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarAntecedentesConceptoResponse")
    public JAXBElement<RegistrarAntecedentesConceptoResponse> createRegistrarAntecedentesConceptoResponse(RegistrarAntecedentesConceptoResponse value) {
        return new JAXBElement<RegistrarAntecedentesConceptoResponse>(_RegistrarAntecedentesConceptoResponse_QNAME, RegistrarAntecedentesConceptoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarAntecedentesPorAreaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "encontrarAntecedentesPorAreaResponse")
    public JAXBElement<EncontrarAntecedentesPorAreaResponse> createEncontrarAntecedentesPorAreaResponse(EncontrarAntecedentesPorAreaResponse value) {
        return new JAXBElement<EncontrarAntecedentesPorAreaResponse>(_EncontrarAntecedentesPorAreaResponse_QNAME, EncontrarAntecedentesPorAreaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdenVenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "ordenVenta")
    public JAXBElement<OrdenVenta> createOrdenVenta(OrdenVenta value) {
        return new JAXBElement<OrdenVenta>(_OrdenVenta_QNAME, OrdenVenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Antecedentes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "antecedentes")
    public JAXBElement<Antecedentes> createAntecedentes(Antecedentes value) {
        return new JAXBElement<Antecedentes>(_Antecedentes_QNAME, Antecedentes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pacientes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "pacientes")
    public JAXBElement<Pacientes> createPacientes(Pacientes value) {
        return new JAXBElement<Pacientes>(_Pacientes_QNAME, Pacientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarAntecedentesPorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "encontrarAntecedentesPorIdResponse")
    public JAXBElement<EncontrarAntecedentesPorIdResponse> createEncontrarAntecedentesPorIdResponse(EncontrarAntecedentesPorIdResponse value) {
        return new JAXBElement<EncontrarAntecedentesPorIdResponse>(_EncontrarAntecedentesPorIdResponse_QNAME, EncontrarAntecedentesPorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipoDicom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "equipoDicom")
    public JAXBElement<EquipoDicom> createEquipoDicom(EquipoDicom value) {
        return new JAXBElement<EquipoDicom>(_EquipoDicom_QNAME, EquipoDicom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarAntecedenteEstudio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarAntecedenteEstudio")
    public JAXBElement<RegistrarAntecedenteEstudio> createRegistrarAntecedenteEstudio(RegistrarAntecedenteEstudio value) {
        return new JAXBElement<RegistrarAntecedenteEstudio>(_RegistrarAntecedenteEstudio_QNAME, RegistrarAntecedenteEstudio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarAntecedenteConceptoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarAntecedenteConceptoResponse")
    public JAXBElement<RegistrarAntecedenteConceptoResponse> createRegistrarAntecedenteConceptoResponse(RegistrarAntecedenteConceptoResponse value) {
        return new JAXBElement<RegistrarAntecedenteConceptoResponse>(_RegistrarAntecedenteConceptoResponse_QNAME, RegistrarAntecedenteConceptoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VentaConceptos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "ventaConceptos")
    public JAXBElement<VentaConceptos> createVentaConceptos(VentaConceptos value) {
        return new JAXBElement<VentaConceptos>(_VentaConceptos_QNAME, VentaConceptos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarAntecedentesConcepto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "eliminarAntecedentesConcepto")
    public JAXBElement<EliminarAntecedentesConcepto> createEliminarAntecedentesConcepto(EliminarAntecedentesConcepto value) {
        return new JAXBElement<EliminarAntecedentesConcepto>(_EliminarAntecedentesConcepto_QNAME, EliminarAntecedentesConcepto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Instrucciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "instrucciones")
    public JAXBElement<Instrucciones> createInstrucciones(Instrucciones value) {
        return new JAXBElement<Instrucciones>(_Instrucciones_QNAME, Instrucciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarAntecedentesEstudioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarAntecedentesEstudioResponse")
    public JAXBElement<RegistrarAntecedentesEstudioResponse> createRegistrarAntecedentesEstudioResponse(RegistrarAntecedentesEstudioResponse value) {
        return new JAXBElement<RegistrarAntecedentesEstudioResponse>(_RegistrarAntecedentesEstudioResponse_QNAME, RegistrarAntecedentesEstudioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarAntecedentesPorArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "encontrarAntecedentesPorArea")
    public JAXBElement<EncontrarAntecedentesPorArea> createEncontrarAntecedentesPorArea(EncontrarAntecedentesPorArea value) {
        return new JAXBElement<EncontrarAntecedentesPorArea>(_EncontrarAntecedentesPorArea_QNAME, EncontrarAntecedentesPorArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarAntecedenteEstudioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarAntecedenteEstudioResponse")
    public JAXBElement<RegistrarAntecedenteEstudioResponse> createRegistrarAntecedenteEstudioResponse(RegistrarAntecedenteEstudioResponse value) {
        return new JAXBElement<RegistrarAntecedenteEstudioResponse>(_RegistrarAntecedenteEstudioResponse_QNAME, RegistrarAntecedenteEstudioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Areas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "areas")
    public JAXBElement<Areas> createAreas(Areas value) {
        return new JAXBElement<Areas>(_Areas_QNAME, Areas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarAntecedentesPorEstudio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "encontrarAntecedentesPorEstudio")
    public JAXBElement<EncontrarAntecedentesPorEstudio> createEncontrarAntecedentesPorEstudio(EncontrarAntecedentesPorEstudio value) {
        return new JAXBElement<EncontrarAntecedentesPorEstudio>(_EncontrarAntecedentesPorEstudio_QNAME, EncontrarAntecedentesPorEstudio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Institucion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "institucion")
    public JAXBElement<Institucion> createInstitucion(Institucion value) {
        return new JAXBElement<Institucion>(_Institucion_QNAME, Institucion.class, null, value);
    }

}
