
package clientews.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para antecedenteEstudio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="antecedenteEstudio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idAntecedente" type="{http://servicio.sga.gm.com.mx/}antecedentes" minOccurs="0"/>
 *         &lt;element name="idVentaConcepto" type="{http://servicio.sga.gm.com.mx/}ventaConceptos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "antecedenteEstudio", propOrder = {
    "id",
    "idAntecedente",
    "idVentaConcepto"
})
public class AntecedenteEstudio {

    protected Long id;
    protected Antecedentes idAntecedente;
    protected VentaConceptos idVentaConcepto;

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
     * Obtiene el valor de la propiedad idAntecedente.
     * 
     * @return
     *     possible object is
     *     {@link Antecedentes }
     *     
     */
    public Antecedentes getIdAntecedente() {
        return idAntecedente;
    }

    /**
     * Define el valor de la propiedad idAntecedente.
     * 
     * @param value
     *     allowed object is
     *     {@link Antecedentes }
     *     
     */
    public void setIdAntecedente(Antecedentes value) {
        this.idAntecedente = value;
    }

    /**
     * Obtiene el valor de la propiedad idVentaConcepto.
     * 
     * @return
     *     possible object is
     *     {@link VentaConceptos }
     *     
     */
    public VentaConceptos getIdVentaConcepto() {
        return idVentaConcepto;
    }

    /**
     * Define el valor de la propiedad idVentaConcepto.
     * 
     * @param value
     *     allowed object is
     *     {@link VentaConceptos }
     *     
     */
    public void setIdVentaConcepto(VentaConceptos value) {
        this.idVentaConcepto = value;
    }

}
