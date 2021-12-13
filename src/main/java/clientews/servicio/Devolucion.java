
package clientews.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para devolucion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="devolucion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idFormaPago" type="{http://servicio.sga.gm.com.mx/}catalogoFormaPago" minOccurs="0"/>
 *         &lt;element name="idOrdenVenta" type="{http://servicio.sga.gm.com.mx/}ordenVenta" minOccurs="0"/>
 *         &lt;element name="idPagoOrdenVenta" type="{http://servicio.sga.gm.com.mx/}pagoOrdenVenta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "devolucion", propOrder = {
    "fecha",
    "id",
    "idFormaPago",
    "idOrdenVenta",
    "idPagoOrdenVenta"
})
public class Devolucion {

    protected String fecha;
    protected Long id;
    protected CatalogoFormaPago idFormaPago;
    protected OrdenVenta idOrdenVenta;
    protected PagoOrdenVenta idPagoOrdenVenta;

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad idFormaPago.
     * 
     * @return
     *     possible object is
     *     {@link CatalogoFormaPago }
     *     
     */
    public CatalogoFormaPago getIdFormaPago() {
        return idFormaPago;
    }

    /**
     * Define el valor de la propiedad idFormaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogoFormaPago }
     *     
     */
    public void setIdFormaPago(CatalogoFormaPago value) {
        this.idFormaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad idOrdenVenta.
     * 
     * @return
     *     possible object is
     *     {@link OrdenVenta }
     *     
     */
    public OrdenVenta getIdOrdenVenta() {
        return idOrdenVenta;
    }

    /**
     * Define el valor de la propiedad idOrdenVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdenVenta }
     *     
     */
    public void setIdOrdenVenta(OrdenVenta value) {
        this.idOrdenVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad idPagoOrdenVenta.
     * 
     * @return
     *     possible object is
     *     {@link PagoOrdenVenta }
     *     
     */
    public PagoOrdenVenta getIdPagoOrdenVenta() {
        return idPagoOrdenVenta;
    }

    /**
     * Define el valor de la propiedad idPagoOrdenVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link PagoOrdenVenta }
     *     
     */
    public void setIdPagoOrdenVenta(PagoOrdenVenta value) {
        this.idPagoOrdenVenta = value;
    }

}
