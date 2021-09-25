
package clientews.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para equipoDicom complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="equipoDicom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aeTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idArea" type="{http://servicio.sga.gm.com.mx/}areas" minOccurs="0"/>
 *         &lt;element name="idEquipo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="modalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "equipoDicom", propOrder = {
    "aeTitle",
    "idArea",
    "idEquipo",
    "modalidad",
    "nombre"
})
public class EquipoDicom {

    protected String aeTitle;
    protected Areas idArea;
    protected Long idEquipo;
    protected String modalidad;
    protected String nombre;

    /**
     * Obtiene el valor de la propiedad aeTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAeTitle() {
        return aeTitle;
    }

    /**
     * Define el valor de la propiedad aeTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAeTitle(String value) {
        this.aeTitle = value;
    }

    /**
     * Obtiene el valor de la propiedad idArea.
     * 
     * @return
     *     possible object is
     *     {@link Areas }
     *     
     */
    public Areas getIdArea() {
        return idArea;
    }

    /**
     * Define el valor de la propiedad idArea.
     * 
     * @param value
     *     allowed object is
     *     {@link Areas }
     *     
     */
    public void setIdArea(Areas value) {
        this.idArea = value;
    }

    /**
     * Obtiene el valor de la propiedad idEquipo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdEquipo() {
        return idEquipo;
    }

    /**
     * Define el valor de la propiedad idEquipo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdEquipo(Long value) {
        this.idEquipo = value;
    }

    /**
     * Obtiene el valor de la propiedad modalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModalidad() {
        return modalidad;
    }

    /**
     * Define el valor de la propiedad modalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModalidad(String value) {
        this.modalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

}
