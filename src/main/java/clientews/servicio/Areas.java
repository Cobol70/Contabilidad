
package clientews.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para areas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="areas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claveA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departamentoA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="duracionMinutos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechaA" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="horaFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nombreA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuarioA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "areas", propOrder = {
    "claveA",
    "departamentoA",
    "duracionMinutos",
    "fechaA",
    "horaFin",
    "horaInicio",
    "idA",
    "nombreA",
    "usuarioA"
})
public class Areas {

    protected String claveA;
    protected int departamentoA;
    protected int duracionMinutos;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaA;
    protected String horaFin;
    protected String horaInicio;
    protected Integer idA;
    protected String nombreA;
    protected Integer usuarioA;

    /**
     * Obtiene el valor de la propiedad claveA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveA() {
        return claveA;
    }

    /**
     * Define el valor de la propiedad claveA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveA(String value) {
        this.claveA = value;
    }

    /**
     * Obtiene el valor de la propiedad departamentoA.
     * 
     */
    public int getDepartamentoA() {
        return departamentoA;
    }

    /**
     * Define el valor de la propiedad departamentoA.
     * 
     */
    public void setDepartamentoA(int value) {
        this.departamentoA = value;
    }

    /**
     * Obtiene el valor de la propiedad duracionMinutos.
     * 
     */
    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    /**
     * Define el valor de la propiedad duracionMinutos.
     * 
     */
    public void setDuracionMinutos(int value) {
        this.duracionMinutos = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaA.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaA() {
        return fechaA;
    }

    /**
     * Define el valor de la propiedad fechaA.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaA(XMLGregorianCalendar value) {
        this.fechaA = value;
    }

    /**
     * Obtiene el valor de la propiedad horaFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraFin() {
        return horaFin;
    }

    /**
     * Define el valor de la propiedad horaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraFin(String value) {
        this.horaFin = value;
    }

    /**
     * Obtiene el valor de la propiedad horaInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraInicio() {
        return horaInicio;
    }

    /**
     * Define el valor de la propiedad horaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraInicio(String value) {
        this.horaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad idA.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdA() {
        return idA;
    }

    /**
     * Define el valor de la propiedad idA.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdA(Integer value) {
        this.idA = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreA() {
        return nombreA;
    }

    /**
     * Define el valor de la propiedad nombreA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreA(String value) {
        this.nombreA = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioA.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsuarioA() {
        return usuarioA;
    }

    /**
     * Define el valor de la propiedad usuarioA.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsuarioA(Integer value) {
        this.usuarioA = value;
    }

}
