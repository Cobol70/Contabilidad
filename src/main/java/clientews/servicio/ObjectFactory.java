
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

    private final static QName _EncontrarInstruccionesPorNombreResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "encontrarInstruccionesPorNombreResponse");
    private final static QName _ObtenerTodasInstrucciones_QNAME = new QName("http://servicio.sga.gm.com.mx/", "obtenerTodasInstrucciones");
    private final static QName _EncontrarInstruccionesPorNombre_QNAME = new QName("http://servicio.sga.gm.com.mx/", "encontrarInstruccionesPorNombre");
    private final static QName _Instrucciones_QNAME = new QName("http://servicio.sga.gm.com.mx/", "instrucciones");
    private final static QName _ObtenerTodasInstruccionesResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "obtenerTodasInstruccionesResponse");
    private final static QName _RegistrarInstrucciones_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarInstrucciones");
    private final static QName _RegistrarInstruccionesResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarInstruccionesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientews.servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EncontrarInstruccionesPorNombre }
     * 
     */
    public EncontrarInstruccionesPorNombre createEncontrarInstruccionesPorNombre() {
        return new EncontrarInstruccionesPorNombre();
    }

    /**
     * Create an instance of {@link Instrucciones }
     * 
     */
    public Instrucciones createInstrucciones() {
        return new Instrucciones();
    }

    /**
     * Create an instance of {@link ObtenerTodasInstruccionesResponse }
     * 
     */
    public ObtenerTodasInstruccionesResponse createObtenerTodasInstruccionesResponse() {
        return new ObtenerTodasInstruccionesResponse();
    }

    /**
     * Create an instance of {@link EncontrarInstruccionesPorNombreResponse }
     * 
     */
    public EncontrarInstruccionesPorNombreResponse createEncontrarInstruccionesPorNombreResponse() {
        return new EncontrarInstruccionesPorNombreResponse();
    }

    /**
     * Create an instance of {@link ObtenerTodasInstrucciones }
     * 
     */
    public ObtenerTodasInstrucciones createObtenerTodasInstrucciones() {
        return new ObtenerTodasInstrucciones();
    }

    /**
     * Create an instance of {@link RegistrarInstruccionesResponse }
     * 
     */
    public RegistrarInstruccionesResponse createRegistrarInstruccionesResponse() {
        return new RegistrarInstruccionesResponse();
    }

    /**
     * Create an instance of {@link RegistrarInstrucciones }
     * 
     */
    public RegistrarInstrucciones createRegistrarInstrucciones() {
        return new RegistrarInstrucciones();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarInstruccionesPorNombreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "encontrarInstruccionesPorNombreResponse")
    public JAXBElement<EncontrarInstruccionesPorNombreResponse> createEncontrarInstruccionesPorNombreResponse(EncontrarInstruccionesPorNombreResponse value) {
        return new JAXBElement<EncontrarInstruccionesPorNombreResponse>(_EncontrarInstruccionesPorNombreResponse_QNAME, EncontrarInstruccionesPorNombreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodasInstrucciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "obtenerTodasInstrucciones")
    public JAXBElement<ObtenerTodasInstrucciones> createObtenerTodasInstrucciones(ObtenerTodasInstrucciones value) {
        return new JAXBElement<ObtenerTodasInstrucciones>(_ObtenerTodasInstrucciones_QNAME, ObtenerTodasInstrucciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarInstruccionesPorNombre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "encontrarInstruccionesPorNombre")
    public JAXBElement<EncontrarInstruccionesPorNombre> createEncontrarInstruccionesPorNombre(EncontrarInstruccionesPorNombre value) {
        return new JAXBElement<EncontrarInstruccionesPorNombre>(_EncontrarInstruccionesPorNombre_QNAME, EncontrarInstruccionesPorNombre.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodasInstruccionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "obtenerTodasInstruccionesResponse")
    public JAXBElement<ObtenerTodasInstruccionesResponse> createObtenerTodasInstruccionesResponse(ObtenerTodasInstruccionesResponse value) {
        return new JAXBElement<ObtenerTodasInstruccionesResponse>(_ObtenerTodasInstruccionesResponse_QNAME, ObtenerTodasInstruccionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarInstrucciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarInstrucciones")
    public JAXBElement<RegistrarInstrucciones> createRegistrarInstrucciones(RegistrarInstrucciones value) {
        return new JAXBElement<RegistrarInstrucciones>(_RegistrarInstrucciones_QNAME, RegistrarInstrucciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarInstruccionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarInstruccionesResponse")
    public JAXBElement<RegistrarInstruccionesResponse> createRegistrarInstruccionesResponse(RegistrarInstruccionesResponse value) {
        return new JAXBElement<RegistrarInstruccionesResponse>(_RegistrarInstruccionesResponse_QNAME, RegistrarInstruccionesResponse.class, null, value);
    }

}
