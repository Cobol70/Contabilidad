
package clientews.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para institucion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="institucion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idInstitucion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="limite" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombreInstitucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "institucion", propOrder = {
    "idInstitucion",
    "limite",
    "nombreInstitucion"
})
public class Institucion {

    protected Long idInstitucion;
    protected int limite;
    protected String nombreInstitucion;

    /**
     * Obtiene el valor de la propiedad idInstitucion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdInstitucion() {
        return idInstitucion;
    }

    /**
     * Define el valor de la propiedad idInstitucion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdInstitucion(Long value) {
        this.idInstitucion = value;
    }

    /**
     * Obtiene el valor de la propiedad limite.
     * 
     */
    public int getLimite() {
        return limite;
    }

    /**
     * Define el valor de la propiedad limite.
     * 
     */
    public void setLimite(int value) {
        this.limite = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreInstitucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    /**
     * Define el valor de la propiedad nombreInstitucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreInstitucion(String value) {
        this.nombreInstitucion = value;
    }

}
