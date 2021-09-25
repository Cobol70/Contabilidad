
package clientews.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para pacientes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pacientes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activoP" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="alergiasP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amaternoP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apaternoP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apgarP" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="calleP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callePf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="centroSaludP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ciudadP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ciudadPf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coloniaP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coloniaPf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactoEmergenciap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coordenadasP" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="cpP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpPf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="curpP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="edoCivilP" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="emailP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailPf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entidadFederativap" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entidadFederativapf" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entidadNacimientoP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="escolaridadP" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="extensionTtp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FNacp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaRp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="grupoEtnicop" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="idDiscapacidadp" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="idOcupacionp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idP" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idReligionp" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="idSucursalp" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="idUsuarioRp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="municipioP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="municipioPf" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NSocioeconomicop" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="nacionalidadP" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="noSeguridadSocialP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreCompletoP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notasP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentescoContactoP" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="razonSocialP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfcFP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfcP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sexoP" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="TCelularp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TEmergenciap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TParticularp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TSanguineop" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="TTrabajop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TViviendap" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="tamizP" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pacientes", propOrder = {
    "activoP",
    "alergiasP",
    "amaternoP",
    "apaternoP",
    "apgarP",
    "calleP",
    "callePf",
    "centroSaludP",
    "ciudadP",
    "ciudadPf",
    "coloniaP",
    "coloniaPf",
    "contactoEmergenciap",
    "coordenadasP",
    "cpP",
    "cpPf",
    "curpP",
    "edoCivilP",
    "emailP",
    "emailPf",
    "entidadFederativap",
    "entidadFederativapf",
    "entidadNacimientoP",
    "escolaridadP",
    "extensionTtp",
    "fNacp",
    "fechaRp",
    "grupoEtnicop",
    "idDiscapacidadp",
    "idOcupacionp",
    "idP",
    "idReligionp",
    "idSucursalp",
    "idUsuarioRp",
    "municipioP",
    "municipioPf",
    "nSocioeconomicop",
    "nacionalidadP",
    "noSeguridadSocialP",
    "nombreCompletoP",
    "nombreP",
    "notasP",
    "parentescoContactoP",
    "razonSocialP",
    "rfcFP",
    "rfcP",
    "sexoP",
    "tCelularp",
    "tEmergenciap",
    "tParticularp",
    "tSanguineop",
    "tTrabajop",
    "tViviendap",
    "tamizP"
})
public class Pacientes {

    protected short activoP;
    protected String alergiasP;
    protected String amaternoP;
    protected String apaternoP;
    protected Short apgarP;
    protected String calleP;
    protected String callePf;
    protected Integer centroSaludP;
    protected String ciudadP;
    protected String ciudadPf;
    protected String coloniaP;
    protected String coloniaPf;
    protected String contactoEmergenciap;
    protected byte[] coordenadasP;
    protected String cpP;
    protected String cpPf;
    protected String curpP;
    protected Short edoCivilP;
    protected String emailP;
    protected String emailPf;
    protected Integer entidadFederativap;
    protected Integer entidadFederativapf;
    protected Integer entidadNacimientoP;
    protected Short escolaridadP;
    protected String extensionTtp;
    @XmlElement(name = "FNacp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fNacp;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRp;
    protected Short grupoEtnicop;
    protected Short idDiscapacidadp;
    protected Integer idOcupacionp;
    protected Long idP;
    protected Short idReligionp;
    protected short idSucursalp;
    protected int idUsuarioRp;
    protected Integer municipioP;
    protected Integer municipioPf;
    @XmlElement(name = "NSocioeconomicop")
    protected Short nSocioeconomicop;
    protected short nacionalidadP;
    protected String noSeguridadSocialP;
    protected String nombreCompletoP;
    protected String nombreP;
    protected String notasP;
    protected Short parentescoContactoP;
    protected String razonSocialP;
    protected String rfcFP;
    protected String rfcP;
    protected Short sexoP;
    @XmlElement(name = "TCelularp")
    protected String tCelularp;
    @XmlElement(name = "TEmergenciap")
    protected String tEmergenciap;
    @XmlElement(name = "TParticularp")
    protected String tParticularp;
    @XmlElement(name = "TSanguineop")
    protected Short tSanguineop;
    @XmlElement(name = "TTrabajop")
    protected String tTrabajop;
    @XmlElement(name = "TViviendap")
    protected Short tViviendap;
    protected Short tamizP;

    /**
     * Obtiene el valor de la propiedad activoP.
     * 
     */
    public short getActivoP() {
        return activoP;
    }

    /**
     * Define el valor de la propiedad activoP.
     * 
     */
    public void setActivoP(short value) {
        this.activoP = value;
    }

    /**
     * Obtiene el valor de la propiedad alergiasP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlergiasP() {
        return alergiasP;
    }

    /**
     * Define el valor de la propiedad alergiasP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlergiasP(String value) {
        this.alergiasP = value;
    }

    /**
     * Obtiene el valor de la propiedad amaternoP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmaternoP() {
        return amaternoP;
    }

    /**
     * Define el valor de la propiedad amaternoP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmaternoP(String value) {
        this.amaternoP = value;
    }

    /**
     * Obtiene el valor de la propiedad apaternoP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApaternoP() {
        return apaternoP;
    }

    /**
     * Define el valor de la propiedad apaternoP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApaternoP(String value) {
        this.apaternoP = value;
    }

    /**
     * Obtiene el valor de la propiedad apgarP.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getApgarP() {
        return apgarP;
    }

    /**
     * Define el valor de la propiedad apgarP.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setApgarP(Short value) {
        this.apgarP = value;
    }

    /**
     * Obtiene el valor de la propiedad calleP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalleP() {
        return calleP;
    }

    /**
     * Define el valor de la propiedad calleP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalleP(String value) {
        this.calleP = value;
    }

    /**
     * Obtiene el valor de la propiedad callePf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallePf() {
        return callePf;
    }

    /**
     * Define el valor de la propiedad callePf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallePf(String value) {
        this.callePf = value;
    }

    /**
     * Obtiene el valor de la propiedad centroSaludP.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCentroSaludP() {
        return centroSaludP;
    }

    /**
     * Define el valor de la propiedad centroSaludP.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCentroSaludP(Integer value) {
        this.centroSaludP = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadP() {
        return ciudadP;
    }

    /**
     * Define el valor de la propiedad ciudadP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadP(String value) {
        this.ciudadP = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadPf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadPf() {
        return ciudadPf;
    }

    /**
     * Define el valor de la propiedad ciudadPf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadPf(String value) {
        this.ciudadPf = value;
    }

    /**
     * Obtiene el valor de la propiedad coloniaP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColoniaP() {
        return coloniaP;
    }

    /**
     * Define el valor de la propiedad coloniaP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColoniaP(String value) {
        this.coloniaP = value;
    }

    /**
     * Obtiene el valor de la propiedad coloniaPf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColoniaPf() {
        return coloniaPf;
    }

    /**
     * Define el valor de la propiedad coloniaPf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColoniaPf(String value) {
        this.coloniaPf = value;
    }

    /**
     * Obtiene el valor de la propiedad contactoEmergenciap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactoEmergenciap() {
        return contactoEmergenciap;
    }

    /**
     * Define el valor de la propiedad contactoEmergenciap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactoEmergenciap(String value) {
        this.contactoEmergenciap = value;
    }

    /**
     * Obtiene el valor de la propiedad coordenadasP.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCoordenadasP() {
        return coordenadasP;
    }

    /**
     * Define el valor de la propiedad coordenadasP.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCoordenadasP(byte[] value) {
        this.coordenadasP = value;
    }

    /**
     * Obtiene el valor de la propiedad cpP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpP() {
        return cpP;
    }

    /**
     * Define el valor de la propiedad cpP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpP(String value) {
        this.cpP = value;
    }

    /**
     * Obtiene el valor de la propiedad cpPf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpPf() {
        return cpPf;
    }

    /**
     * Define el valor de la propiedad cpPf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpPf(String value) {
        this.cpPf = value;
    }

    /**
     * Obtiene el valor de la propiedad curpP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurpP() {
        return curpP;
    }

    /**
     * Define el valor de la propiedad curpP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurpP(String value) {
        this.curpP = value;
    }

    /**
     * Obtiene el valor de la propiedad edoCivilP.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getEdoCivilP() {
        return edoCivilP;
    }

    /**
     * Define el valor de la propiedad edoCivilP.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setEdoCivilP(Short value) {
        this.edoCivilP = value;
    }

    /**
     * Obtiene el valor de la propiedad emailP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailP() {
        return emailP;
    }

    /**
     * Define el valor de la propiedad emailP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailP(String value) {
        this.emailP = value;
    }

    /**
     * Obtiene el valor de la propiedad emailPf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailPf() {
        return emailPf;
    }

    /**
     * Define el valor de la propiedad emailPf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailPf(String value) {
        this.emailPf = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadFederativap.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntidadFederativap() {
        return entidadFederativap;
    }

    /**
     * Define el valor de la propiedad entidadFederativap.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntidadFederativap(Integer value) {
        this.entidadFederativap = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadFederativapf.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntidadFederativapf() {
        return entidadFederativapf;
    }

    /**
     * Define el valor de la propiedad entidadFederativapf.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntidadFederativapf(Integer value) {
        this.entidadFederativapf = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadNacimientoP.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntidadNacimientoP() {
        return entidadNacimientoP;
    }

    /**
     * Define el valor de la propiedad entidadNacimientoP.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntidadNacimientoP(Integer value) {
        this.entidadNacimientoP = value;
    }

    /**
     * Obtiene el valor de la propiedad escolaridadP.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getEscolaridadP() {
        return escolaridadP;
    }

    /**
     * Define el valor de la propiedad escolaridadP.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setEscolaridadP(Short value) {
        this.escolaridadP = value;
    }

    /**
     * Obtiene el valor de la propiedad extensionTtp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionTtp() {
        return extensionTtp;
    }

    /**
     * Define el valor de la propiedad extensionTtp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionTtp(String value) {
        this.extensionTtp = value;
    }

    /**
     * Obtiene el valor de la propiedad fNacp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFNacp() {
        return fNacp;
    }

    /**
     * Define el valor de la propiedad fNacp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFNacp(XMLGregorianCalendar value) {
        this.fNacp = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRp() {
        return fechaRp;
    }

    /**
     * Define el valor de la propiedad fechaRp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRp(XMLGregorianCalendar value) {
        this.fechaRp = value;
    }

    /**
     * Obtiene el valor de la propiedad grupoEtnicop.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGrupoEtnicop() {
        return grupoEtnicop;
    }

    /**
     * Define el valor de la propiedad grupoEtnicop.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGrupoEtnicop(Short value) {
        this.grupoEtnicop = value;
    }

    /**
     * Obtiene el valor de la propiedad idDiscapacidadp.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIdDiscapacidadp() {
        return idDiscapacidadp;
    }

    /**
     * Define el valor de la propiedad idDiscapacidadp.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIdDiscapacidadp(Short value) {
        this.idDiscapacidadp = value;
    }

    /**
     * Obtiene el valor de la propiedad idOcupacionp.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOcupacionp() {
        return idOcupacionp;
    }

    /**
     * Define el valor de la propiedad idOcupacionp.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOcupacionp(Integer value) {
        this.idOcupacionp = value;
    }

    /**
     * Obtiene el valor de la propiedad idP.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdP() {
        return idP;
    }

    /**
     * Define el valor de la propiedad idP.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdP(Long value) {
        this.idP = value;
    }

    /**
     * Obtiene el valor de la propiedad idReligionp.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIdReligionp() {
        return idReligionp;
    }

    /**
     * Define el valor de la propiedad idReligionp.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIdReligionp(Short value) {
        this.idReligionp = value;
    }

    /**
     * Obtiene el valor de la propiedad idSucursalp.
     * 
     */
    public short getIdSucursalp() {
        return idSucursalp;
    }

    /**
     * Define el valor de la propiedad idSucursalp.
     * 
     */
    public void setIdSucursalp(short value) {
        this.idSucursalp = value;
    }

    /**
     * Obtiene el valor de la propiedad idUsuarioRp.
     * 
     */
    public int getIdUsuarioRp() {
        return idUsuarioRp;
    }

    /**
     * Define el valor de la propiedad idUsuarioRp.
     * 
     */
    public void setIdUsuarioRp(int value) {
        this.idUsuarioRp = value;
    }

    /**
     * Obtiene el valor de la propiedad municipioP.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMunicipioP() {
        return municipioP;
    }

    /**
     * Define el valor de la propiedad municipioP.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMunicipioP(Integer value) {
        this.municipioP = value;
    }

    /**
     * Obtiene el valor de la propiedad municipioPf.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMunicipioPf() {
        return municipioPf;
    }

    /**
     * Define el valor de la propiedad municipioPf.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMunicipioPf(Integer value) {
        this.municipioPf = value;
    }

    /**
     * Obtiene el valor de la propiedad nSocioeconomicop.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNSocioeconomicop() {
        return nSocioeconomicop;
    }

    /**
     * Define el valor de la propiedad nSocioeconomicop.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNSocioeconomicop(Short value) {
        this.nSocioeconomicop = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidadP.
     * 
     */
    public short getNacionalidadP() {
        return nacionalidadP;
    }

    /**
     * Define el valor de la propiedad nacionalidadP.
     * 
     */
    public void setNacionalidadP(short value) {
        this.nacionalidadP = value;
    }

    /**
     * Obtiene el valor de la propiedad noSeguridadSocialP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoSeguridadSocialP() {
        return noSeguridadSocialP;
    }

    /**
     * Define el valor de la propiedad noSeguridadSocialP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoSeguridadSocialP(String value) {
        this.noSeguridadSocialP = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCompletoP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCompletoP() {
        return nombreCompletoP;
    }

    /**
     * Define el valor de la propiedad nombreCompletoP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCompletoP(String value) {
        this.nombreCompletoP = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreP() {
        return nombreP;
    }

    /**
     * Define el valor de la propiedad nombreP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreP(String value) {
        this.nombreP = value;
    }

    /**
     * Obtiene el valor de la propiedad notasP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotasP() {
        return notasP;
    }

    /**
     * Define el valor de la propiedad notasP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotasP(String value) {
        this.notasP = value;
    }

    /**
     * Obtiene el valor de la propiedad parentescoContactoP.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getParentescoContactoP() {
        return parentescoContactoP;
    }

    /**
     * Define el valor de la propiedad parentescoContactoP.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setParentescoContactoP(Short value) {
        this.parentescoContactoP = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocialP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocialP() {
        return razonSocialP;
    }

    /**
     * Define el valor de la propiedad razonSocialP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocialP(String value) {
        this.razonSocialP = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcFP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcFP() {
        return rfcFP;
    }

    /**
     * Define el valor de la propiedad rfcFP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcFP(String value) {
        this.rfcFP = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcP() {
        return rfcP;
    }

    /**
     * Define el valor de la propiedad rfcP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcP(String value) {
        this.rfcP = value;
    }

    /**
     * Obtiene el valor de la propiedad sexoP.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSexoP() {
        return sexoP;
    }

    /**
     * Define el valor de la propiedad sexoP.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSexoP(Short value) {
        this.sexoP = value;
    }

    /**
     * Obtiene el valor de la propiedad tCelularp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCelularp() {
        return tCelularp;
    }

    /**
     * Define el valor de la propiedad tCelularp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCelularp(String value) {
        this.tCelularp = value;
    }

    /**
     * Obtiene el valor de la propiedad tEmergenciap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEmergenciap() {
        return tEmergenciap;
    }

    /**
     * Define el valor de la propiedad tEmergenciap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEmergenciap(String value) {
        this.tEmergenciap = value;
    }

    /**
     * Obtiene el valor de la propiedad tParticularp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTParticularp() {
        return tParticularp;
    }

    /**
     * Define el valor de la propiedad tParticularp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTParticularp(String value) {
        this.tParticularp = value;
    }

    /**
     * Obtiene el valor de la propiedad tSanguineop.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTSanguineop() {
        return tSanguineop;
    }

    /**
     * Define el valor de la propiedad tSanguineop.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTSanguineop(Short value) {
        this.tSanguineop = value;
    }

    /**
     * Obtiene el valor de la propiedad tTrabajop.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTrabajop() {
        return tTrabajop;
    }

    /**
     * Define el valor de la propiedad tTrabajop.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTrabajop(String value) {
        this.tTrabajop = value;
    }

    /**
     * Obtiene el valor de la propiedad tViviendap.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTViviendap() {
        return tViviendap;
    }

    /**
     * Define el valor de la propiedad tViviendap.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTViviendap(Short value) {
        this.tViviendap = value;
    }

    /**
     * Obtiene el valor de la propiedad tamizP.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTamizP() {
        return tamizP;
    }

    /**
     * Define el valor de la propiedad tamizP.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTamizP(Short value) {
        this.tamizP = value;
    }

}
