
package clientews.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para conceptoPaquete complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="conceptoPaquete">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idConcepto" type="{http://servicio.sga.gm.com.mx/}conceptos" minOccurs="0"/>
 *         &lt;element name="idPaquete" type="{http://servicio.sga.gm.com.mx/}paquete" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conceptoPaquete", propOrder = {
    "id",
    "idConcepto",
    "idPaquete"
})
public class ConceptoPaquete {

    protected Long id;
    protected Conceptos idConcepto;
    protected Paquete idPaquete;

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
     * Obtiene el valor de la propiedad idPaquete.
     * 
     * @return
     *     possible object is
     *     {@link Paquete }
     *     
     */
    public Paquete getIdPaquete() {
        return idPaquete;
    }

    /**
     * Define el valor de la propiedad idPaquete.
     * 
     * @param value
     *     allowed object is
     *     {@link Paquete }
     *     
     */
    public void setIdPaquete(Paquete value) {
        this.idPaquete = value;
    }

}
