
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

    private final static QName _ModificarDatosFacturacion_QNAME = new QName("http://servicio.sga.gm.com.mx/", "modificarDatosFacturacion");
    private final static QName _CatalogoFormaPago_QNAME = new QName("http://servicio.sga.gm.com.mx/", "catalogoFormaPago");
    private final static QName _RegistrarDatosFacturacionResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarDatosFacturacionResponse");
    private final static QName _ObtenerDatosFacturacionPorIdOrdenVenta_QNAME = new QName("http://servicio.sga.gm.com.mx/", "obtenerDatosFacturacionPorIdOrdenVenta");
    private final static QName _ObtenerDatosFacturacionPorIdOrdenVentaResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "obtenerDatosFacturacionPorIdOrdenVentaResponse");
    private final static QName _DatosFacturacion_QNAME = new QName("http://servicio.sga.gm.com.mx/", "datosFacturacion");
    private final static QName _OrdenVenta_QNAME = new QName("http://servicio.sga.gm.com.mx/", "ordenVenta");
    private final static QName _Pacientes_QNAME = new QName("http://servicio.sga.gm.com.mx/", "pacientes");
    private final static QName _ObtenerDatosFacturacionPorPagoOrdenVenta_QNAME = new QName("http://servicio.sga.gm.com.mx/", "obtenerDatosFacturacionPorPagoOrdenVenta");
    private final static QName _Cfdi_QNAME = new QName("http://servicio.sga.gm.com.mx/", "cfdi");
    private final static QName _ObtenerDatosFacturacionPorIdResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "obtenerDatosFacturacionPorIdResponse");
    private final static QName _ObtenerDatosFacturacionPorId_QNAME = new QName("http://servicio.sga.gm.com.mx/", "obtenerDatosFacturacionPorId");
    private final static QName _ModificarDatosFacturacionResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "modificarDatosFacturacionResponse");
    private final static QName _PagoOrdenVenta_QNAME = new QName("http://servicio.sga.gm.com.mx/", "pagoOrdenVenta");
    private final static QName _Firma_QNAME = new QName("http://servicio.sga.gm.com.mx/", "firma");
    private final static QName _ObtenerDatosFacturacionPorPagoOrdenVentaResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "obtenerDatosFacturacionPorPagoOrdenVentaResponse");
    private final static QName _RegistrarDatosFacturacion_QNAME = new QName("http://servicio.sga.gm.com.mx/", "registrarDatosFacturacion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientews.servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModificarDatosFacturacionResponse }
     * 
     */
    public ModificarDatosFacturacionResponse createModificarDatosFacturacionResponse() {
        return new ModificarDatosFacturacionResponse();
    }

    /**
     * Create an instance of {@link PagoOrdenVenta }
     * 
     */
    public PagoOrdenVenta createPagoOrdenVenta() {
        return new PagoOrdenVenta();
    }

    /**
     * Create an instance of {@link ObtenerDatosFacturacionPorId }
     * 
     */
    public ObtenerDatosFacturacionPorId createObtenerDatosFacturacionPorId() {
        return new ObtenerDatosFacturacionPorId();
    }

    /**
     * Create an instance of {@link Cfdi }
     * 
     */
    public Cfdi createCfdi() {
        return new Cfdi();
    }

    /**
     * Create an instance of {@link ObtenerDatosFacturacionPorIdResponse }
     * 
     */
    public ObtenerDatosFacturacionPorIdResponse createObtenerDatosFacturacionPorIdResponse() {
        return new ObtenerDatosFacturacionPorIdResponse();
    }

    /**
     * Create an instance of {@link ObtenerDatosFacturacionPorPagoOrdenVenta }
     * 
     */
    public ObtenerDatosFacturacionPorPagoOrdenVenta createObtenerDatosFacturacionPorPagoOrdenVenta() {
        return new ObtenerDatosFacturacionPorPagoOrdenVenta();
    }

    /**
     * Create an instance of {@link RegistrarDatosFacturacion }
     * 
     */
    public RegistrarDatosFacturacion createRegistrarDatosFacturacion() {
        return new RegistrarDatosFacturacion();
    }

    /**
     * Create an instance of {@link ObtenerDatosFacturacionPorPagoOrdenVentaResponse }
     * 
     */
    public ObtenerDatosFacturacionPorPagoOrdenVentaResponse createObtenerDatosFacturacionPorPagoOrdenVentaResponse() {
        return new ObtenerDatosFacturacionPorPagoOrdenVentaResponse();
    }

    /**
     * Create an instance of {@link Firma }
     * 
     */
    public Firma createFirma() {
        return new Firma();
    }

    /**
     * Create an instance of {@link ObtenerDatosFacturacionPorIdOrdenVenta }
     * 
     */
    public ObtenerDatosFacturacionPorIdOrdenVenta createObtenerDatosFacturacionPorIdOrdenVenta() {
        return new ObtenerDatosFacturacionPorIdOrdenVenta();
    }

    /**
     * Create an instance of {@link ObtenerDatosFacturacionPorIdOrdenVentaResponse }
     * 
     */
    public ObtenerDatosFacturacionPorIdOrdenVentaResponse createObtenerDatosFacturacionPorIdOrdenVentaResponse() {
        return new ObtenerDatosFacturacionPorIdOrdenVentaResponse();
    }

    /**
     * Create an instance of {@link CatalogoFormaPago }
     * 
     */
    public CatalogoFormaPago createCatalogoFormaPago() {
        return new CatalogoFormaPago();
    }

    /**
     * Create an instance of {@link RegistrarDatosFacturacionResponse }
     * 
     */
    public RegistrarDatosFacturacionResponse createRegistrarDatosFacturacionResponse() {
        return new RegistrarDatosFacturacionResponse();
    }

    /**
     * Create an instance of {@link ModificarDatosFacturacion }
     * 
     */
    public ModificarDatosFacturacion createModificarDatosFacturacion() {
        return new ModificarDatosFacturacion();
    }

    /**
     * Create an instance of {@link Pacientes }
     * 
     */
    public Pacientes createPacientes() {
        return new Pacientes();
    }

    /**
     * Create an instance of {@link OrdenVenta }
     * 
     */
    public OrdenVenta createOrdenVenta() {
        return new OrdenVenta();
    }

    /**
     * Create an instance of {@link DatosFacturacion }
     * 
     */
    public DatosFacturacion createDatosFacturacion() {
        return new DatosFacturacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarDatosFacturacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "modificarDatosFacturacion")
    public JAXBElement<ModificarDatosFacturacion> createModificarDatosFacturacion(ModificarDatosFacturacion value) {
        return new JAXBElement<ModificarDatosFacturacion>(_ModificarDatosFacturacion_QNAME, ModificarDatosFacturacion.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarDatosFacturacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarDatosFacturacionResponse")
    public JAXBElement<RegistrarDatosFacturacionResponse> createRegistrarDatosFacturacionResponse(RegistrarDatosFacturacionResponse value) {
        return new JAXBElement<RegistrarDatosFacturacionResponse>(_RegistrarDatosFacturacionResponse_QNAME, RegistrarDatosFacturacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDatosFacturacionPorIdOrdenVenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "obtenerDatosFacturacionPorIdOrdenVenta")
    public JAXBElement<ObtenerDatosFacturacionPorIdOrdenVenta> createObtenerDatosFacturacionPorIdOrdenVenta(ObtenerDatosFacturacionPorIdOrdenVenta value) {
        return new JAXBElement<ObtenerDatosFacturacionPorIdOrdenVenta>(_ObtenerDatosFacturacionPorIdOrdenVenta_QNAME, ObtenerDatosFacturacionPorIdOrdenVenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDatosFacturacionPorIdOrdenVentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "obtenerDatosFacturacionPorIdOrdenVentaResponse")
    public JAXBElement<ObtenerDatosFacturacionPorIdOrdenVentaResponse> createObtenerDatosFacturacionPorIdOrdenVentaResponse(ObtenerDatosFacturacionPorIdOrdenVentaResponse value) {
        return new JAXBElement<ObtenerDatosFacturacionPorIdOrdenVentaResponse>(_ObtenerDatosFacturacionPorIdOrdenVentaResponse_QNAME, ObtenerDatosFacturacionPorIdOrdenVentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosFacturacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "datosFacturacion")
    public JAXBElement<DatosFacturacion> createDatosFacturacion(DatosFacturacion value) {
        return new JAXBElement<DatosFacturacion>(_DatosFacturacion_QNAME, DatosFacturacion.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Pacientes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "pacientes")
    public JAXBElement<Pacientes> createPacientes(Pacientes value) {
        return new JAXBElement<Pacientes>(_Pacientes_QNAME, Pacientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDatosFacturacionPorPagoOrdenVenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "obtenerDatosFacturacionPorPagoOrdenVenta")
    public JAXBElement<ObtenerDatosFacturacionPorPagoOrdenVenta> createObtenerDatosFacturacionPorPagoOrdenVenta(ObtenerDatosFacturacionPorPagoOrdenVenta value) {
        return new JAXBElement<ObtenerDatosFacturacionPorPagoOrdenVenta>(_ObtenerDatosFacturacionPorPagoOrdenVenta_QNAME, ObtenerDatosFacturacionPorPagoOrdenVenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cfdi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "cfdi")
    public JAXBElement<Cfdi> createCfdi(Cfdi value) {
        return new JAXBElement<Cfdi>(_Cfdi_QNAME, Cfdi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDatosFacturacionPorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "obtenerDatosFacturacionPorIdResponse")
    public JAXBElement<ObtenerDatosFacturacionPorIdResponse> createObtenerDatosFacturacionPorIdResponse(ObtenerDatosFacturacionPorIdResponse value) {
        return new JAXBElement<ObtenerDatosFacturacionPorIdResponse>(_ObtenerDatosFacturacionPorIdResponse_QNAME, ObtenerDatosFacturacionPorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDatosFacturacionPorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "obtenerDatosFacturacionPorId")
    public JAXBElement<ObtenerDatosFacturacionPorId> createObtenerDatosFacturacionPorId(ObtenerDatosFacturacionPorId value) {
        return new JAXBElement<ObtenerDatosFacturacionPorId>(_ObtenerDatosFacturacionPorId_QNAME, ObtenerDatosFacturacionPorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarDatosFacturacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "modificarDatosFacturacionResponse")
    public JAXBElement<ModificarDatosFacturacionResponse> createModificarDatosFacturacionResponse(ModificarDatosFacturacionResponse value) {
        return new JAXBElement<ModificarDatosFacturacionResponse>(_ModificarDatosFacturacionResponse_QNAME, ModificarDatosFacturacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagoOrdenVenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "pagoOrdenVenta")
    public JAXBElement<PagoOrdenVenta> createPagoOrdenVenta(PagoOrdenVenta value) {
        return new JAXBElement<PagoOrdenVenta>(_PagoOrdenVenta_QNAME, PagoOrdenVenta.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDatosFacturacionPorPagoOrdenVentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "obtenerDatosFacturacionPorPagoOrdenVentaResponse")
    public JAXBElement<ObtenerDatosFacturacionPorPagoOrdenVentaResponse> createObtenerDatosFacturacionPorPagoOrdenVentaResponse(ObtenerDatosFacturacionPorPagoOrdenVentaResponse value) {
        return new JAXBElement<ObtenerDatosFacturacionPorPagoOrdenVentaResponse>(_ObtenerDatosFacturacionPorPagoOrdenVentaResponse_QNAME, ObtenerDatosFacturacionPorPagoOrdenVentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarDatosFacturacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "registrarDatosFacturacion")
    public JAXBElement<RegistrarDatosFacturacion> createRegistrarDatosFacturacion(RegistrarDatosFacturacion value) {
        return new JAXBElement<RegistrarDatosFacturacion>(_RegistrarDatosFacturacion_QNAME, RegistrarDatosFacturacion.class, null, value);
    }

}
