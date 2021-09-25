
package clientews.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para catalogoFormaPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="catalogoFormaPago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formaPagoFp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idFp" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catalogoFormaPago", propOrder = {
    "formaPagoFp",
    "idFp"
})
public class CatalogoFormaPago {

    protected String formaPagoFp;
    protected Short idFp;

    /**
     * Obtiene el valor de la propiedad formaPagoFp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPagoFp() {
        return formaPagoFp;
    }

    /**
     * Define el valor de la propiedad formaPagoFp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPagoFp(String value) {
        this.formaPagoFp = value;
    }

    /**
     * Obtiene el valor de la propiedad idFp.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIdFp() {
        return idFp;
    }

    /**
     * Define el valor de la propiedad idFp.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIdFp(Short value) {
        this.idFp = value;
    }

}
