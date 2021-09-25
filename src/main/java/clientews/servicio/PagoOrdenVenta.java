
package clientews.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pagoOrdenVenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pagoOrdenVenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idFormaPago" type="{http://servicio.sga.gm.com.mx/}catalogoFormaPago" minOccurs="0"/>
 *         &lt;element name="idOrdenVenta" type="{http://servicio.sga.gm.com.mx/}ordenVenta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pagoOrdenVenta", propOrder = {
    "cantidad",
    "id",
    "idFormaPago",
    "idOrdenVenta"
})
public class PagoOrdenVenta {

    protected double cantidad;
    protected Long id;
    protected CatalogoFormaPago idFormaPago;
    protected OrdenVenta idOrdenVenta;

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(double value) {
        this.cantidad = value;
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

}
