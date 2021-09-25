
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

    private final static QName _RegistrarEnWorklist_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarEnWorklist");
    private final static QName _RegistrarEnWorklistPorOrdenVentaResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarEnWorklistPorOrdenVentaResponse");
    private final static QName _RegistrarEnWorklistResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarEnWorklistResponse");
    private final static QName _RegistrarEnWorklistPorOrdenVenta_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarEnWorklistPorOrdenVenta");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientews.servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistrarEnWorklistResponse }
     * 
     */
    public RegistrarEnWorklistResponse createRegistrarEnWorklistResponse() {
        return new RegistrarEnWorklistResponse();
    }

    /**
     * Create an instance of {@link RegistrarEnWorklistPorOrdenVentaResponse }
     * 
     */
    public RegistrarEnWorklistPorOrdenVentaResponse createRegistrarEnWorklistPorOrdenVentaResponse() {
        return new RegistrarEnWorklistPorOrdenVentaResponse();
    }

    /**
     * Create an instance of {@link RegistrarEnWorklist }
     * 
     */
    public RegistrarEnWorklist createRegistrarEnWorklist() {
        return new RegistrarEnWorklist();
    }

    /**
     * Create an instance of {@link RegistrarEnWorklistPorOrdenVenta }
     * 
     */
    public RegistrarEnWorklistPorOrdenVenta createRegistrarEnWorklistPorOrdenVenta() {
        return new RegistrarEnWorklistPorOrdenVenta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarEnWorklist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarEnWorklist")
    public JAXBElement<RegistrarEnWorklist> createRegistrarEnWorklist(RegistrarEnWorklist value) {
        return new JAXBElement<RegistrarEnWorklist>(_RegistrarEnWorklist_QNAME, RegistrarEnWorklist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarEnWorklistPorOrdenVentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarEnWorklistPorOrdenVentaResponse")
    public JAXBElement<RegistrarEnWorklistPorOrdenVentaResponse> createRegistrarEnWorklistPorOrdenVentaResponse(RegistrarEnWorklistPorOrdenVentaResponse value) {
        return new JAXBElement<RegistrarEnWorklistPorOrdenVentaResponse>(_RegistrarEnWorklistPorOrdenVentaResponse_QNAME, RegistrarEnWorklistPorOrdenVentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarEnWorklistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarEnWorklistResponse")
    public JAXBElement<RegistrarEnWorklistResponse> createRegistrarEnWorklistResponse(RegistrarEnWorklistResponse value) {
        return new JAXBElement<RegistrarEnWorklistResponse>(_RegistrarEnWorklistResponse_QNAME, RegistrarEnWorklistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarEnWorklistPorOrdenVenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarEnWorklistPorOrdenVenta")
    public JAXBElement<RegistrarEnWorklistPorOrdenVenta> createRegistrarEnWorklistPorOrdenVenta(RegistrarEnWorklistPorOrdenVenta value) {
        return new JAXBElement<RegistrarEnWorklistPorOrdenVenta>(_RegistrarEnWorklistPorOrdenVenta_QNAME, RegistrarEnWorklistPorOrdenVenta.class, null, value);
    }

}
