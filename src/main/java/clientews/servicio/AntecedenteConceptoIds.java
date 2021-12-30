
package clientews.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para antecedenteConceptoIds complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="antecedenteConceptoIds">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAntecedente" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idConcepto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "antecedenteConceptoIds", propOrder = {
    "idAntecedente",
    "idConcepto"
})
public class AntecedenteConceptoIds {

    protected Long idAntecedente;
    protected Long idConcepto;

    /**
     * Obtiene el valor de la propiedad idAntecedente.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAntecedente() {
        return idAntecedente;
    }

    /**
     * Define el valor de la propiedad idAntecedente.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAntecedente(Long value) {
        this.idAntecedente = value;
    }

    /**
     * Obtiene el valor de la propiedad idConcepto.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdConcepto() {
        return idConcepto;
    }

    /**
     * Define el valor de la propiedad idConcepto.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdConcepto(Long value) {
        this.idConcepto = value;
    }

}
