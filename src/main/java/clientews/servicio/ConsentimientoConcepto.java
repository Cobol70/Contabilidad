
package clientews.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consentimientoConcepto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consentimientoConcepto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idConcepto" type="{http://servicio.sga.gm.com.mx/}conceptos" minOccurs="0"/>
 *         &lt;element name="idConsentimiento" type="{http://servicio.sga.gm.com.mx/}consentimiento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consentimientoConcepto", propOrder = {
    "id",
    "idConcepto",
    "idConsentimiento"
})
public class ConsentimientoConcepto {

    protected Long id;
    protected Conceptos idConcepto;
    protected Consentimiento idConsentimiento;

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
     * Obtiene el valor de la propiedad idConsentimiento.
     * 
     * @return
     *     possible object is
     *     {@link Consentimiento }
     *     
     */
    public Consentimiento getIdConsentimiento() {
        return idConsentimiento;
    }

    /**
     * Define el valor de la propiedad idConsentimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link Consentimiento }
     *     
     */
    public void setIdConsentimiento(Consentimiento value) {
        this.idConsentimiento = value;
    }

}
