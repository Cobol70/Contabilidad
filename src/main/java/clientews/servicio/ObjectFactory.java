
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

    private final static QName _ConceptoPaquete_QNAME = new QName("http://servicio.sga.gm.com.mx/", "conceptoPaquete");
    private final static QName _Conceptos_QNAME = new QName("http://servicio.sga.gm.com.mx/", "conceptos");
    private final static QName _ObtenerConceptosDePaqueteResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "obtenerConceptosDePaqueteResponse");
    private final static QName _ConceptosInstitucion_QNAME = new QName("http://servicio.sga.gm.com.mx/", "conceptosInstitucion");
    private final static QName _EliminarConceptoPaquete_QNAME = new QName("http://servicio.sga.gm.com.mx/", "eliminarConceptoPaquete");
    private final static QName _EliminarPaquete_QNAME = new QName("http://servicio.sga.gm.com.mx/", "eliminarPaquete");
    private final static QName _ListarPaquetes_QNAME = new QName("http://servicio.sga.gm.com.mx/", "listarPaquetes");
    private final static QName _ListarPaquetesResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "listarPaquetesResponse");
    private final static QName _ObtenerPaquetePorNombre_QNAME = new QName("http://servicio.sga.gm.com.mx/", "obtenerPaquetePorNombre");
    private final static QName _RegistrarConceptoPaqueteResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarConceptoPaqueteResponse");
    private final static QName _RegistrarPaqueteResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarPaqueteResponse");
    private final static QName _EncontrarPaquetePorIdResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "encontrarPaquetePorIdResponse");
    private final static QName _ModificarPaquete_QNAME = new QName("http://servicio.sga.gm.com.mx/", "modificarPaquete");
    private final static QName _ObtenerConceptosDePaquete_QNAME = new QName("http://servicio.sga.gm.com.mx/", "obtenerConceptosDePaquete");
    private final static QName _RegistrarConceptoPaquete_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarConceptoPaquete");
    private final static QName _EliminarPaqueteResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "eliminarPaqueteResponse");
    private final static QName _EncontrarPaquetePorId_QNAME = new QName("http://servicio.sga.gm.com.mx/", "encontrarPaquetePorId");
    private final static QName _Instrucciones_QNAME = new QName("http://servicio.sga.gm.com.mx/", "instrucciones");
    private final static QName _Paquete_QNAME = new QName("http://servicio.sga.gm.com.mx/", "paquete");
    private final static QName _ObtenerPaquetesLikeNombre_QNAME = new QName("http://servicio.sga.gm.com.mx/", "obtenerPaquetesLikeNombre");
    private final static QName _ObtenerPaquetesLikeNombreResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "obtenerPaquetesLikeNombreResponse");
    private final static QName _ObtenerPaquetePorNombreResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "obtenerPaquetePorNombreResponse");
    private final static QName _Areas_QNAME = new QName("http://servicio.sga.gm.com.mx/", "areas");
    private final static QName _ModificarPaqueteResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "modificarPaqueteResponse");
    private final static QName _RegistrarPaquete_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarPaquete");
    private final static QName _EliminarConceptoPaqueteResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "eliminarConceptoPaqueteResponse");
    private final static QName _Institucion_QNAME = new QName("http://servicio.sga.gm.com.mx/", "institucion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientews.servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Instrucciones }
     * 
     */
    public Instrucciones createInstrucciones() {
        return new Instrucciones();
    }

    /**
     * Create an instance of {@link EncontrarPaquetePorId }
     * 
     */
    public EncontrarPaquetePorId createEncontrarPaquetePorId() {
        return new EncontrarPaquetePorId();
    }

    /**
     * Create an instance of {@link EliminarConceptoPaqueteResponse }
     * 
     */
    public EliminarConceptoPaqueteResponse createEliminarConceptoPaqueteResponse() {
        return new EliminarConceptoPaqueteResponse();
    }

    /**
     * Create an instance of {@link Institucion }
     * 
     */
    public Institucion createInstitucion() {
        return new Institucion();
    }

    /**
     * Create an instance of {@link RegistrarPaquete }
     * 
     */
    public RegistrarPaquete createRegistrarPaquete() {
        return new RegistrarPaquete();
    }

    /**
     * Create an instance of {@link Areas }
     * 
     */
    public Areas createAreas() {
        return new Areas();
    }

    /**
     * Create an instance of {@link ModificarPaqueteResponse }
     * 
     */
    public ModificarPaqueteResponse createModificarPaqueteResponse() {
        return new ModificarPaqueteResponse();
    }

    /**
     * Create an instance of {@link ObtenerPaquetePorNombreResponse }
     * 
     */
    public ObtenerPaquetePorNombreResponse createObtenerPaquetePorNombreResponse() {
        return new ObtenerPaquetePorNombreResponse();
    }

    /**
     * Create an instance of {@link ObtenerPaquetesLikeNombre }
     * 
     */
    public ObtenerPaquetesLikeNombre createObtenerPaquetesLikeNombre() {
        return new ObtenerPaquetesLikeNombre();
    }

    /**
     * Create an instance of {@link ObtenerPaquetesLikeNombreResponse }
     * 
     */
    public ObtenerPaquetesLikeNombreResponse createObtenerPaquetesLikeNombreResponse() {
        return new ObtenerPaquetesLikeNombreResponse();
    }

    /**
     * Create an instance of {@link Paquete }
     * 
     */
    public Paquete createPaquete() {
        return new Paquete();
    }

    /**
     * Create an instance of {@link ObtenerConceptosDePaquete }
     * 
     */
    public ObtenerConceptosDePaquete createObtenerConceptosDePaquete() {
        return new ObtenerConceptosDePaquete();
    }

    /**
     * Create an instance of {@link RegistrarConceptoPaquete }
     * 
     */
    public RegistrarConceptoPaquete createRegistrarConceptoPaquete() {
        return new RegistrarConceptoPaquete();
    }

    /**
     * Create an instance of {@link EliminarPaqueteResponse }
     * 
     */
    public EliminarPaqueteResponse createEliminarPaqueteResponse() {
        return new EliminarPaqueteResponse();
    }

    /**
     * Create an instance of {@link ModificarPaquete }
     * 
     */
    public ModificarPaquete createModificarPaquete() {
        return new ModificarPaquete();
    }

    /**
     * Create an instance of {@link EncontrarPaquetePorIdResponse }
     * 
     */
    public EncontrarPaquetePorIdResponse createEncontrarPaquetePorIdResponse() {
        return new EncontrarPaquetePorIdResponse();
    }

    /**
     * Create an instance of {@link RegistrarPaqueteResponse }
     * 
     */
    public RegistrarPaqueteResponse createRegistrarPaqueteResponse() {
        return new RegistrarPaqueteResponse();
    }

    /**
     * Create an instance of {@link ConceptosInstitucion }
     * 
     */
    public ConceptosInstitucion createConceptosInstitucion() {
        return new ConceptosInstitucion();
    }

    /**
     * Create an instance of {@link ConceptoPaquete }
     * 
     */
    public ConceptoPaquete createConceptoPaquete() {
        return new ConceptoPaquete();
    }

    /**
     * Create an instance of {@link Conceptos }
     * 
     */
    public Conceptos createConceptos() {
        return new Conceptos();
    }

    /**
     * Create an instance of {@link ObtenerConceptosDePaqueteResponse }
     * 
     */
    public ObtenerConceptosDePaqueteResponse createObtenerConceptosDePaqueteResponse() {
        return new ObtenerConceptosDePaqueteResponse();
    }

    /**
     * Create an instance of {@link ObtenerPaquetePorNombre }
     * 
     */
    public ObtenerPaquetePorNombre createObtenerPaquetePorNombre() {
        return new ObtenerPaquetePorNombre();
    }

    /**
     * Create an instance of {@link RegistrarConceptoPaqueteResponse }
     * 
     */
    public RegistrarConceptoPaqueteResponse createRegistrarConceptoPaqueteResponse() {
        return new RegistrarConceptoPaqueteResponse();
    }

    /**
     * Create an instance of {@link ListarPaquetes }
     * 
     */
    public ListarPaquetes createListarPaquetes() {
        return new ListarPaquetes();
    }

    /**
     * Create an instance of {@link ListarPaquetesResponse }
     * 
     */
    public ListarPaquetesResponse createListarPaquetesResponse() {
        return new ListarPaquetesResponse();
    }

    /**
     * Create an instance of {@link EliminarConceptoPaquete }
     * 
     */
    public EliminarConceptoPaquete createEliminarConceptoPaquete() {
        return new EliminarConceptoPaquete();
    }

    /**
     * Create an instance of {@link EliminarPaquete }
     * 
     */
    public EliminarPaquete createEliminarPaquete() {
        return new EliminarPaquete();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConceptoPaquete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "conceptoPaquete")
    public JAXBElement<ConceptoPaquete> createConceptoPaquete(ConceptoPaquete value) {
        return new JAXBElement<ConceptoPaquete>(_ConceptoPaquete_QNAME, ConceptoPaquete.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerConceptosDePaqueteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "obtenerConceptosDePaqueteResponse")
    public JAXBElement<ObtenerConceptosDePaqueteResponse> createObtenerConceptosDePaqueteResponse(ObtenerConceptosDePaqueteResponse value) {
        return new JAXBElement<ObtenerConceptosDePaqueteResponse>(_ObtenerConceptosDePaqueteResponse_QNAME, ObtenerConceptosDePaqueteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConceptosInstitucion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "conceptosInstitucion")
    public JAXBElement<ConceptosInstitucion> createConceptosInstitucion(ConceptosInstitucion value) {
        return new JAXBElement<ConceptosInstitucion>(_ConceptosInstitucion_QNAME, ConceptosInstitucion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarConceptoPaquete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "eliminarConceptoPaquete")
    public JAXBElement<EliminarConceptoPaquete> createEliminarConceptoPaquete(EliminarConceptoPaquete value) {
        return new JAXBElement<EliminarConceptoPaquete>(_EliminarConceptoPaquete_QNAME, EliminarConceptoPaquete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarPaquete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "eliminarPaquete")
    public JAXBElement<EliminarPaquete> createEliminarPaquete(EliminarPaquete value) {
        return new JAXBElement<EliminarPaquete>(_EliminarPaquete_QNAME, EliminarPaquete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPaquetes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "listarPaquetes")
    public JAXBElement<ListarPaquetes> createListarPaquetes(ListarPaquetes value) {
        return new JAXBElement<ListarPaquetes>(_ListarPaquetes_QNAME, ListarPaquetes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPaquetesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "listarPaquetesResponse")
    public JAXBElement<ListarPaquetesResponse> createListarPaquetesResponse(ListarPaquetesResponse value) {
        return new JAXBElement<ListarPaquetesResponse>(_ListarPaquetesResponse_QNAME, ListarPaquetesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerPaquetePorNombre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "obtenerPaquetePorNombre")
    public JAXBElement<ObtenerPaquetePorNombre> createObtenerPaquetePorNombre(ObtenerPaquetePorNombre value) {
        return new JAXBElement<ObtenerPaquetePorNombre>(_ObtenerPaquetePorNombre_QNAME, ObtenerPaquetePorNombre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarConceptoPaqueteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarConceptoPaqueteResponse")
    public JAXBElement<RegistrarConceptoPaqueteResponse> createRegistrarConceptoPaqueteResponse(RegistrarConceptoPaqueteResponse value) {
        return new JAXBElement<RegistrarConceptoPaqueteResponse>(_RegistrarConceptoPaqueteResponse_QNAME, RegistrarConceptoPaqueteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarPaqueteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarPaqueteResponse")
    public JAXBElement<RegistrarPaqueteResponse> createRegistrarPaqueteResponse(RegistrarPaqueteResponse value) {
        return new JAXBElement<RegistrarPaqueteResponse>(_RegistrarPaqueteResponse_QNAME, RegistrarPaqueteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarPaquetePorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "encontrarPaquetePorIdResponse")
    public JAXBElement<EncontrarPaquetePorIdResponse> createEncontrarPaquetePorIdResponse(EncontrarPaquetePorIdResponse value) {
        return new JAXBElement<EncontrarPaquetePorIdResponse>(_EncontrarPaquetePorIdResponse_QNAME, EncontrarPaquetePorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarPaquete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "modificarPaquete")
    public JAXBElement<ModificarPaquete> createModificarPaquete(ModificarPaquete value) {
        return new JAXBElement<ModificarPaquete>(_ModificarPaquete_QNAME, ModificarPaquete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerConceptosDePaquete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "obtenerConceptosDePaquete")
    public JAXBElement<ObtenerConceptosDePaquete> createObtenerConceptosDePaquete(ObtenerConceptosDePaquete value) {
        return new JAXBElement<ObtenerConceptosDePaquete>(_ObtenerConceptosDePaquete_QNAME, ObtenerConceptosDePaquete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarConceptoPaquete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarConceptoPaquete")
    public JAXBElement<RegistrarConceptoPaquete> createRegistrarConceptoPaquete(RegistrarConceptoPaquete value) {
        return new JAXBElement<RegistrarConceptoPaquete>(_RegistrarConceptoPaquete_QNAME, RegistrarConceptoPaquete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarPaqueteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "eliminarPaqueteResponse")
    public JAXBElement<EliminarPaqueteResponse> createEliminarPaqueteResponse(EliminarPaqueteResponse value) {
        return new JAXBElement<EliminarPaqueteResponse>(_EliminarPaqueteResponse_QNAME, EliminarPaqueteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarPaquetePorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "encontrarPaquetePorId")
    public JAXBElement<EncontrarPaquetePorId> createEncontrarPaquetePorId(EncontrarPaquetePorId value) {
        return new JAXBElement<EncontrarPaquetePorId>(_EncontrarPaquetePorId_QNAME, EncontrarPaquetePorId.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Paquete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "paquete")
    public JAXBElement<Paquete> createPaquete(Paquete value) {
        return new JAXBElement<Paquete>(_Paquete_QNAME, Paquete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerPaquetesLikeNombre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "obtenerPaquetesLikeNombre")
    public JAXBElement<ObtenerPaquetesLikeNombre> createObtenerPaquetesLikeNombre(ObtenerPaquetesLikeNombre value) {
        return new JAXBElement<ObtenerPaquetesLikeNombre>(_ObtenerPaquetesLikeNombre_QNAME, ObtenerPaquetesLikeNombre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerPaquetesLikeNombreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "obtenerPaquetesLikeNombreResponse")
    public JAXBElement<ObtenerPaquetesLikeNombreResponse> createObtenerPaquetesLikeNombreResponse(ObtenerPaquetesLikeNombreResponse value) {
        return new JAXBElement<ObtenerPaquetesLikeNombreResponse>(_ObtenerPaquetesLikeNombreResponse_QNAME, ObtenerPaquetesLikeNombreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerPaquetePorNombreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "obtenerPaquetePorNombreResponse")
    public JAXBElement<ObtenerPaquetePorNombreResponse> createObtenerPaquetePorNombreResponse(ObtenerPaquetePorNombreResponse value) {
        return new JAXBElement<ObtenerPaquetePorNombreResponse>(_ObtenerPaquetePorNombreResponse_QNAME, ObtenerPaquetePorNombreResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarPaqueteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "modificarPaqueteResponse")
    public JAXBElement<ModificarPaqueteResponse> createModificarPaqueteResponse(ModificarPaqueteResponse value) {
        return new JAXBElement<ModificarPaqueteResponse>(_ModificarPaqueteResponse_QNAME, ModificarPaqueteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarPaquete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarPaquete")
    public JAXBElement<RegistrarPaquete> createRegistrarPaquete(RegistrarPaquete value) {
        return new JAXBElement<RegistrarPaquete>(_RegistrarPaquete_QNAME, RegistrarPaquete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarConceptoPaqueteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "eliminarConceptoPaqueteResponse")
    public JAXBElement<EliminarConceptoPaqueteResponse> createEliminarConceptoPaqueteResponse(EliminarConceptoPaqueteResponse value) {
        return new JAXBElement<EliminarConceptoPaqueteResponse>(_EliminarConceptoPaqueteResponse_QNAME, EliminarConceptoPaqueteResponse.class, null, value);
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
