
package clientews.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para conceptosInstitucion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="conceptosInstitucion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idConcepto" type="{http://servicio.sga.gm.com.mx/}conceptos" minOccurs="0"/>
 *         &lt;element name="idContpaq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idInstitucion" type="{http://servicio.sga.gm.com.mx/}institucion" minOccurs="0"/>
 *         &lt;element name="idInternoInstitucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limiteDiario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pensionesClaveAnterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="precioPublico" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conceptosInstitucion", propOrder = {
    "activo",
    "id",
    "idConcepto",
    "idContpaq",
    "idInstitucion",
    "idInternoInstitucion",
    "limiteDiario",
    "pensionesClaveAnterior",
    "precio",
    "precioPublico"
})
public class ConceptosInstitucion {

    protected boolean activo;
    protected Long id;
    protected Conceptos idConcepto;
    protected String idContpaq;
    protected Institucion idInstitucion;
    protected String idInternoInstitucion;
    protected int limiteDiario;
    protected String pensionesClaveAnterior;
    protected double precio;
    protected double precioPublico;

    /**
     * Obtiene el valor de la propiedad activo.
     * 
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * Define el valor de la propiedad activo.
     * 
     */
    public void setActivo(boolean value) {
        this.activo = value;
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
     * Obtiene el valor de la propiedad idConcepto.
     * 
     * @return
     *     possible object is
     *     {@link Conceptos }
     *     
     */
    public Conceptos getIdConcepto() {
        return idConcepto;
    }

    /**
     * Define el valor de la propiedad idConcepto.
     * 
     * @param value
     *     allowed object is
     *     {@link Conceptos }
     *     
     */
    public void setIdConcepto(Conceptos value) {
        this.idConcepto = value;
    }

    /**
     * Obtiene el valor de la propiedad idContpaq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdContpaq() {
        return idContpaq;
    }

    /**
     * Define el valor de la propiedad idContpaq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdContpaq(String value) {
        this.idContpaq = value;
    }

    /**
     * Obtiene el valor de la propiedad idInstitucion.
     * 
     * @return
     *     possible object is
     *     {@link Institucion }
     *     
     */
    public Institucion getIdInstitucion() {
        return idInstitucion;
    }

    /**
     * Define el valor de la propiedad idInstitucion.
     * 
     * @param value
     *     allowed object is
     *     {@link Institucion }
     *     
     */
    public void setIdInstitucion(Institucion value) {
        this.idInstitucion = value;
    }

    /**
     * Obtiene el valor de la propiedad idInternoInstitucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdInternoInstitucion() {
        return idInternoInstitucion;
    }

    /**
     * Define el valor de la propiedad idInternoInstitucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdInternoInstitucion(String value) {
        this.idInternoInstitucion = value;
    }

    /**
     * Obtiene el valor de la propiedad limiteDiario.
     * 
     */
    public int getLimiteDiario() {
        return limiteDiario;
    }

    /**
     * Define el valor de la propiedad limiteDiario.
     * 
     */
    public void setLimiteDiario(int value) {
        this.limiteDiario = value;
    }

    /**
     * Obtiene el valor de la propiedad pensionesClaveAnterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPensionesClaveAnterior() {
        return pensionesClaveAnterior;
    }

    /**
     * Define el valor de la propiedad pensionesClaveAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPensionesClaveAnterior(String value) {
        this.pensionesClaveAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(double value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad precioPublico.
     * 
     */
    public double getPrecioPublico() {
        return precioPublico;
    }

    /**
     * Define el valor de la propiedad precioPublico.
     * 
     */
    public void setPrecioPublico(double value) {
        this.precioPublico = value;
    }

}
