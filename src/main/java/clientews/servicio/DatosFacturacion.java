
package clientews.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosFacturacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosFacturacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colonia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idCfdi" type="{http://servicio.sga.gm.com.mx/}cfdi" minOccurs="0"/>
 *         &lt;element name="idPagoOrdenVenta" type="{http://servicio.sga.gm.com.mx/}pagoOrdenVenta" minOccurs="0"/>
 *         &lt;element name="nombreORazon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosFacturacion", propOrder = {
    "calle",
    "ciudad",
    "colonia",
    "correo",
    "cp",
    "id",
    "idCfdi",
    "idPagoOrdenVenta",
    "nombreORazon",
    "rfc"
})
public class DatosFacturacion {

    protected String calle;
    protected String ciudad;
    protected String colonia;
    protected String correo;
    protected String cp;
    protected Long id;
    protected Cfdi idCfdi;
    protected PagoOrdenVenta idPagoOrdenVenta;
    protected String nombreORazon;
    protected String rfc;

    /**
     * Obtiene el valor de la propiedad calle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Define el valor de la propiedad calle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalle(String value) {
        this.calle = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudad(String value) {
        this.ciudad = value;
    }

    /**
     * Obtiene el valor de la propiedad colonia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Define el valor de la propiedad colonia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColonia(String value) {
        this.colonia = value;
    }

    /**
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreo(String value) {
        this.correo = value;
    }

    /**
     * Obtiene el valor de la propiedad cp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCp() {
        return cp;
    }

    /**
     * Define el valor de la propiedad cp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCp(String value) {
        this.cp = value;
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
     * Obtiene el valor de la propiedad idCfdi.
     * 
     * @return
     *     possible object is
     *     {@link Cfdi }
     *     
     */
    public Cfdi getIdCfdi() {
        return idCfdi;
    }

    /**
     * Define el valor de la propiedad idCfdi.
     * 
     * @param value
     *     allowed object is
     *     {@link Cfdi }
     *     
     */
    public void setIdCfdi(Cfdi value) {
        this.idCfdi = value;
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

    /**
     * Obtiene el valor de la propiedad nombreORazon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreORazon() {
        return nombreORazon;
    }

    /**
     * Define el valor de la propiedad nombreORazon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreORazon(String value) {
        this.nombreORazon = value;
    }

    /**
     * Obtiene el valor de la propiedad rfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Define el valor de la propiedad rfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfc(String value) {
        this.rfc = value;
    }

}
