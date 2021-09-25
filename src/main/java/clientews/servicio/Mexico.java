
package clientews.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para mexico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mexico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CClaveCiudad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CCp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CEstado" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="CMunicipio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="COficina" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CTipoAsenta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DAsenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DCiudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DCodigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DCp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DMunicipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DTipoAsenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DZona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAsentaCpcons" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idMx" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mexico", propOrder = {
    "cClaveCiudad",
    "cCp",
    "cEstado",
    "cMunicipio",
    "cOficina",
    "cTipoAsenta",
    "dAsenta",
    "dCiudad",
    "dCodigo",
    "dCp",
    "dEstado",
    "dMunicipio",
    "dTipoAsenta",
    "dZona",
    "idAsentaCpcons",
    "idMx"
})
public class Mexico {

    @XmlElement(name = "CClaveCiudad")
    protected Integer cClaveCiudad;
    @XmlElement(name = "CCp")
    protected Integer cCp;
    @XmlElement(name = "CEstado")
    protected Short cEstado;
    @XmlElement(name = "CMunicipio")
    protected Integer cMunicipio;
    @XmlElement(name = "COficina")
    protected Integer cOficina;
    @XmlElement(name = "CTipoAsenta")
    protected Integer cTipoAsenta;
    @XmlElement(name = "DAsenta")
    protected String dAsenta;
    @XmlElement(name = "DCiudad")
    protected String dCiudad;
    @XmlElement(name = "DCodigo")
    protected Integer dCodigo;
    @XmlElement(name = "DCp")
    protected Integer dCp;
    @XmlElement(name = "DEstado")
    protected String dEstado;
    @XmlElement(name = "DMunicipio")
    protected String dMunicipio;
    @XmlElement(name = "DTipoAsenta")
    protected String dTipoAsenta;
    @XmlElement(name = "DZona")
    protected String dZona;
    protected Integer idAsentaCpcons;
    protected Integer idMx;

    /**
     * Obtiene el valor de la propiedad cClaveCiudad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCClaveCiudad() {
        return cClaveCiudad;
    }

    /**
     * Define el valor de la propiedad cClaveCiudad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCClaveCiudad(Integer value) {
        this.cClaveCiudad = value;
    }

    /**
     * Obtiene el valor de la propiedad cCp.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCCp() {
        return cCp;
    }

    /**
     * Define el valor de la propiedad cCp.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCCp(Integer value) {
        this.cCp = value;
    }

    /**
     * Obtiene el valor de la propiedad cEstado.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCEstado() {
        return cEstado;
    }

    /**
     * Define el valor de la propiedad cEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCEstado(Short value) {
        this.cEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad cMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCMunicipio() {
        return cMunicipio;
    }

    /**
     * Define el valor de la propiedad cMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCMunicipio(Integer value) {
        this.cMunicipio = value;
    }

    /**
     * Obtiene el valor de la propiedad cOficina.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCOficina() {
        return cOficina;
    }

    /**
     * Define el valor de la propiedad cOficina.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCOficina(Integer value) {
        this.cOficina = value;
    }

    /**
     * Obtiene el valor de la propiedad cTipoAsenta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCTipoAsenta() {
        return cTipoAsenta;
    }

    /**
     * Define el valor de la propiedad cTipoAsenta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCTipoAsenta(Integer value) {
        this.cTipoAsenta = value;
    }

    /**
     * Obtiene el valor de la propiedad dAsenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAsenta() {
        return dAsenta;
    }

    /**
     * Define el valor de la propiedad dAsenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAsenta(String value) {
        this.dAsenta = value;
    }

    /**
     * Obtiene el valor de la propiedad dCiudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCiudad() {
        return dCiudad;
    }

    /**
     * Define el valor de la propiedad dCiudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCiudad(String value) {
        this.dCiudad = value;
    }

    /**
     * Obtiene el valor de la propiedad dCodigo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDCodigo() {
        return dCodigo;
    }

    /**
     * Define el valor de la propiedad dCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDCodigo(Integer value) {
        this.dCodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad dCp.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDCp() {
        return dCp;
    }

    /**
     * Define el valor de la propiedad dCp.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDCp(Integer value) {
        this.dCp = value;
    }

    /**
     * Obtiene el valor de la propiedad dEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEstado() {
        return dEstado;
    }

    /**
     * Define el valor de la propiedad dEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEstado(String value) {
        this.dEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad dMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDMunicipio() {
        return dMunicipio;
    }

    /**
     * Define el valor de la propiedad dMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDMunicipio(String value) {
        this.dMunicipio = value;
    }

    /**
     * Obtiene el valor de la propiedad dTipoAsenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTipoAsenta() {
        return dTipoAsenta;
    }

    /**
     * Define el valor de la propiedad dTipoAsenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTipoAsenta(String value) {
        this.dTipoAsenta = value;
    }

    /**
     * Obtiene el valor de la propiedad dZona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDZona() {
        return dZona;
    }

    /**
     * Define el valor de la propiedad dZona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDZona(String value) {
        this.dZona = value;
    }

    /**
     * Obtiene el valor de la propiedad idAsentaCpcons.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAsentaCpcons() {
        return idAsentaCpcons;
    }

    /**
     * Define el valor de la propiedad idAsentaCpcons.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAsentaCpcons(Integer value) {
        this.idAsentaCpcons = value;
    }

    /**
     * Obtiene el valor de la propiedad idMx.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdMx() {
        return idMx;
    }

    /**
     * Define el valor de la propiedad idMx.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMx(Integer value) {
        this.idMx = value;
    }

}
