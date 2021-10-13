
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

    private final static QName _Conceptos_QNAME = new QName("http://servicio.sga.gm.com.mx/", "conceptos");
    private final static QName _ConsentimientoConcepto_QNAME = new QName("http://servicio.sga.gm.com.mx/", "consentimientoConcepto");
    private final static QName _EliminarConsentimientoConcepto_QNAME = new QName("http://servicio.sga.gm.com.mx/", "eliminarConsentimientoConcepto");
    private final static QName _Instrucciones_QNAME = new QName("http://servicio.sga.gm.com.mx/", "instrucciones");
    private final static QName _EliminarConsentimientoConceptoResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "eliminarConsentimientoConceptoResponse");
    private final static QName _Areas_QNAME = new QName("http://servicio.sga.gm.com.mx/", "areas");
    private final static QName _Consentimiento_QNAME = new QName("http://servicio.sga.gm.com.mx/", "consentimiento");
    private final static QName _RegistrarConsentimientoConcepto_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarConsentimientoConcepto");
    private final static QName _RegistrarConsentimientoConceptoResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarConsentimientoConceptoResponse");

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
     * Create an instance of {@link ConsentimientoConcepto }
     * 
     */
    public ConsentimientoConcepto createConsentimientoConcepto() {
        return new ConsentimientoConcepto();
    }

    /**
     * Create an instance of {@link EliminarConsentimientoConcepto }
     * 
     */
    public EliminarConsentimientoConcepto createEliminarConsentimientoConcepto() {
        return new EliminarConsentimientoConcepto();
    }

    /**
     * Create an instance of {@link Conceptos }
     * 
     */
    public Conceptos createConceptos() {
        return new Conceptos();
    }

    /**
     * Create an instance of {@link RegistrarConsentimientoConcepto }
     * 
     */
    public RegistrarConsentimientoConcepto createRegistrarConsentimientoConcepto() {
        return new RegistrarConsentimientoConcepto();
    }

    /**
     * Create an instance of {@link RegistrarConsentimientoConceptoResponse }
     * 
     */
    public RegistrarConsentimientoConceptoResponse createRegistrarConsentimientoConceptoResponse() {
        return new RegistrarConsentimientoConceptoResponse();
    }

    /**
     * Create an instance of {@link Areas }
     * 
     */
    public Areas createAreas() {
        return new Areas();
    }

    /**
     * Create an instance of {@link Consentimiento }
     * 
     */
    public Consentimiento createConsentimiento() {
        return new Consentimiento();
    }

    /**
     * Create an instance of {@link EliminarConsentimientoConceptoResponse }
     * 
     */
    public EliminarConsentimientoConceptoResponse createEliminarConsentimientoConceptoResponse() {
        return new EliminarConsentimientoConceptoResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsentimientoConcepto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "consentimientoConcepto")
    public JAXBElement<ConsentimientoConcepto> createConsentimientoConcepto(ConsentimientoConcepto value) {
        return new JAXBElement<ConsentimientoConcepto>(_ConsentimientoConcepto_QNAME, ConsentimientoConcepto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarConsentimientoConcepto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "eliminarConsentimientoConcepto")
    public JAXBElement<EliminarConsentimientoConcepto> createEliminarConsentimientoConcepto(EliminarConsentimientoConcepto value) {
        return new JAXBElement<EliminarConsentimientoConcepto>(_EliminarConsentimientoConcepto_QNAME, EliminarConsentimientoConcepto.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarConsentimientoConceptoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "eliminarConsentimientoConceptoResponse")
    public JAXBElement<EliminarConsentimientoConceptoResponse> createEliminarConsentimientoConceptoResponse(EliminarConsentimientoConceptoResponse value) {
        return new JAXBElement<EliminarConsentimientoConceptoResponse>(_EliminarConsentimientoConceptoResponse_QNAME, EliminarConsentimientoConceptoResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Consentimiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "consentimiento")
    public JAXBElement<Consentimiento> createConsentimiento(Consentimiento value) {
        return new JAXBElement<Consentimiento>(_Consentimiento_QNAME, Consentimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarConsentimientoConcepto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarConsentimientoConcepto")
    public JAXBElement<RegistrarConsentimientoConcepto> createRegistrarConsentimientoConcepto(RegistrarConsentimientoConcepto value) {
        return new JAXBElement<RegistrarConsentimientoConcepto>(_RegistrarConsentimientoConcepto_QNAME, RegistrarConsentimientoConcepto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarConsentimientoConceptoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarConsentimientoConceptoResponse")
    public JAXBElement<RegistrarConsentimientoConceptoResponse> createRegistrarConsentimientoConceptoResponse(RegistrarConsentimientoConceptoResponse value) {
        return new JAXBElement<RegistrarConsentimientoConceptoResponse>(_RegistrarConsentimientoConceptoResponse_QNAME, RegistrarConsentimientoConceptoResponse.class, null, value);
    }

}
