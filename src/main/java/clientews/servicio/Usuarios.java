
package clientews.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para usuarios complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuarios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accesoU" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="activoU" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="amaternoU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apaternoU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calleU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cedulaProfesionalEu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cedulaProfesionalu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coloniaU" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="contactoEmergenciau" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contrasena1U" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contrasenaU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coordenadasU" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="cpU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="curpU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entidadFederativau" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="especialidadU" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="estatusEscolarU" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="estatusLaboralU" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="extensionTtu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FNacu" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaIngresoU" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="firmaU" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="fotoU" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="horarioEDo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="horarioEJu" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="horarioELu" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="horarioEMa" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="horarioEMi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="horarioESa" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="horarioEVi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="horarioSDo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="horarioSJu" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="horarioSLu" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="horarioSMa" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="horarioSMi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="horarioSSa" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="horarioSVi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idAreau" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="idDepartamentou" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="idEscolaridadu" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="idOcupacionu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idProfesionu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idPuestou" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSucursalu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idTituloU" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="idU" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idUsuarioRu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="multisucursalU" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="municipioU" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nacionalidadU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noIDu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreFotou" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notasU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permisosU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotorU" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rfcU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sexoU" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="TCelularu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TEmergenciau" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TParticularu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TSanguineou" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="TTrabajou" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="temporalU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tituloU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="universidadEU" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="universidadU" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="usuarioNuevou" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="usuarioU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validadoU" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="variableTemporal1U" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="variableTemporal2U" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="variableTemporal3U" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="variableTemporal4U" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="variableTemporalU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuarios", propOrder = {
    "accesoU",
    "activoU",
    "amaternoU",
    "apaternoU",
    "calleU",
    "cedulaProfesionalEu",
    "cedulaProfesionalu",
    "coloniaU",
    "contactoEmergenciau",
    "contrasena1U",
    "contrasenaU",
    "coordenadasU",
    "cpU",
    "curpU",
    "emailU",
    "entidadFederativau",
    "especialidadU",
    "estatusEscolarU",
    "estatusLaboralU",
    "extensionTtu",
    "fNacu",
    "fechaIngresoU",
    "firmaU",
    "fotoU",
    "horarioEDo",
    "horarioEJu",
    "horarioELu",
    "horarioEMa",
    "horarioEMi",
    "horarioESa",
    "horarioEVi",
    "horarioSDo",
    "horarioSJu",
    "horarioSLu",
    "horarioSMa",
    "horarioSMi",
    "horarioSSa",
    "horarioSVi",
    "idAreau",
    "idDepartamentou",
    "idEscolaridadu",
    "idOcupacionu",
    "idProfesionu",
    "idPuestou",
    "idSucursalu",
    "idTituloU",
    "idU",
    "idUsuarioRu",
    "multisucursalU",
    "municipioU",
    "nacionalidadU",
    "noIDu",
    "nombreFotou",
    "nombreU",
    "notasU",
    "permisosU",
    "promotorU",
    "rfcU",
    "sexoU",
    "tCelularu",
    "tEmergenciau",
    "tParticularu",
    "tSanguineou",
    "tTrabajou",
    "temporalU",
    "tituloU",
    "universidadEU",
    "universidadU",
    "usuarioNuevou",
    "usuarioU",
    "validadoU",
    "variableTemporal1U",
    "variableTemporal2U",
    "variableTemporal3U",
    "variableTemporal4U",
    "variableTemporalU"
})
public class Usuarios {

    protected short accesoU;
    protected short activoU;
    protected String amaternoU;
    protected String apaternoU;
    protected String calleU;
    protected String cedulaProfesionalEu;
    protected String cedulaProfesionalu;
    protected Integer coloniaU;
    protected String contactoEmergenciau;
    protected String contrasena1U;
    protected String contrasenaU;
    protected byte[] coordenadasU;
    protected String cpU;
    protected String curpU;
    protected String emailU;
    protected Integer entidadFederativau;
    protected Short especialidadU;
    protected Short estatusEscolarU;
    protected Short estatusLaboralU;
    protected String extensionTtu;
    @XmlElement(name = "FNacu")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fNacu;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaIngresoU;
    protected short firmaU;
    protected Short fotoU;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar horarioEDo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar horarioEJu;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar horarioELu;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar horarioEMa;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar horarioEMi;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar horarioESa;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar horarioEVi;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar horarioSDo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar horarioSJu;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar horarioSLu;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar horarioSMa;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar horarioSMi;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar horarioSSa;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar horarioSVi;
    protected Short idAreau;
    protected Short idDepartamentou;
    protected Short idEscolaridadu;
    protected Integer idOcupacionu;
    protected Integer idProfesionu;
    protected Integer idPuestou;
    protected Integer idSucursalu;
    protected short idTituloU;
    protected Integer idU;
    protected Integer idUsuarioRu;
    protected short multisucursalU;
    protected Integer municipioU;
    protected String nacionalidadU;
    protected String noIDu;
    protected String nombreFotou;
    protected String nombreU;
    protected String notasU;
    protected String permisosU;
    protected Integer promotorU;
    protected String rfcU;
    protected Short sexoU;
    @XmlElement(name = "TCelularu")
    protected String tCelularu;
    @XmlElement(name = "TEmergenciau")
    protected String tEmergenciau;
    @XmlElement(name = "TParticularu")
    protected String tParticularu;
    @XmlElement(name = "TSanguineou")
    protected Short tSanguineou;
    @XmlElement(name = "TTrabajou")
    protected String tTrabajou;
    protected String temporalU;
    protected String tituloU;
    protected Integer universidadEU;
    protected Integer universidadU;
    protected short usuarioNuevou;
    protected String usuarioU;
    protected short validadoU;
    protected String variableTemporal1U;
    protected String variableTemporal2U;
    protected String variableTemporal3U;
    protected String variableTemporal4U;
    protected String variableTemporalU;

    /**
     * Obtiene el valor de la propiedad accesoU.
     * 
     */
    public short getAccesoU() {
        return accesoU;
    }

    /**
     * Define el valor de la propiedad accesoU.
     * 
     */
    public void setAccesoU(short value) {
        this.accesoU = value;
    }

    /**
     * Obtiene el valor de la propiedad activoU.
     * 
     */
    public short getActivoU() {
        return activoU;
    }

    /**
     * Define el valor de la propiedad activoU.
     * 
     */
    public void setActivoU(short value) {
        this.activoU = value;
    }

    /**
     * Obtiene el valor de la propiedad amaternoU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmaternoU() {
        return amaternoU;
    }

    /**
     * Define el valor de la propiedad amaternoU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmaternoU(String value) {
        this.amaternoU = value;
    }

    /**
     * Obtiene el valor de la propiedad apaternoU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApaternoU() {
        return apaternoU;
    }

    /**
     * Define el valor de la propiedad apaternoU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApaternoU(String value) {
        this.apaternoU = value;
    }

    /**
     * Obtiene el valor de la propiedad calleU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalleU() {
        return calleU;
    }

    /**
     * Define el valor de la propiedad calleU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalleU(String value) {
        this.calleU = value;
    }

    /**
     * Obtiene el valor de la propiedad cedulaProfesionalEu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedulaProfesionalEu() {
        return cedulaProfesionalEu;
    }

    /**
     * Define el valor de la propiedad cedulaProfesionalEu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedulaProfesionalEu(String value) {
        this.cedulaProfesionalEu = value;
    }

    /**
     * Obtiene el valor de la propiedad cedulaProfesionalu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedulaProfesionalu() {
        return cedulaProfesionalu;
    }

    /**
     * Define el valor de la propiedad cedulaProfesionalu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedulaProfesionalu(String value) {
        this.cedulaProfesionalu = value;
    }

    /**
     * Obtiene el valor de la propiedad coloniaU.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getColoniaU() {
        return coloniaU;
    }

    /**
     * Define el valor de la propiedad coloniaU.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColoniaU(Integer value) {
        this.coloniaU = value;
    }

    /**
     * Obtiene el valor de la propiedad contactoEmergenciau.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactoEmergenciau() {
        return contactoEmergenciau;
    }

    /**
     * Define el valor de la propiedad contactoEmergenciau.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactoEmergenciau(String value) {
        this.contactoEmergenciau = value;
    }

    /**
     * Obtiene el valor de la propiedad contrasena1U.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasena1U() {
        return contrasena1U;
    }

    /**
     * Define el valor de la propiedad contrasena1U.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasena1U(String value) {
        this.contrasena1U = value;
    }

    /**
     * Obtiene el valor de la propiedad contrasenaU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasenaU() {
        return contrasenaU;
    }

    /**
     * Define el valor de la propiedad contrasenaU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasenaU(String value) {
        this.contrasenaU = value;
    }

    /**
     * Obtiene el valor de la propiedad coordenadasU.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCoordenadasU() {
        return coordenadasU;
    }

    /**
     * Define el valor de la propiedad coordenadasU.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCoordenadasU(byte[] value) {
        this.coordenadasU = value;
    }

    /**
     * Obtiene el valor de la propiedad cpU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpU() {
        return cpU;
    }

    /**
     * Define el valor de la propiedad cpU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpU(String value) {
        this.cpU = value;
    }

    /**
     * Obtiene el valor de la propiedad curpU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurpU() {
        return curpU;
    }

    /**
     * Define el valor de la propiedad curpU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurpU(String value) {
        this.curpU = value;
    }

    /**
     * Obtiene el valor de la propiedad emailU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailU() {
        return emailU;
    }

    /**
     * Define el valor de la propiedad emailU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailU(String value) {
        this.emailU = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadFederativau.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntidadFederativau() {
        return entidadFederativau;
    }

    /**
     * Define el valor de la propiedad entidadFederativau.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntidadFederativau(Integer value) {
        this.entidadFederativau = value;
    }

    /**
     * Obtiene el valor de la propiedad especialidadU.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getEspecialidadU() {
        return especialidadU;
    }

    /**
     * Define el valor de la propiedad especialidadU.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setEspecialidadU(Short value) {
        this.especialidadU = value;
    }

    /**
     * Obtiene el valor de la propiedad estatusEscolarU.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getEstatusEscolarU() {
        return estatusEscolarU;
    }

    /**
     * Define el valor de la propiedad estatusEscolarU.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setEstatusEscolarU(Short value) {
        this.estatusEscolarU = value;
    }

    /**
     * Obtiene el valor de la propiedad estatusLaboralU.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getEstatusLaboralU() {
        return estatusLaboralU;
    }

    /**
     * Define el valor de la propiedad estatusLaboralU.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setEstatusLaboralU(Short value) {
        this.estatusLaboralU = value;
    }

    /**
     * Obtiene el valor de la propiedad extensionTtu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionTtu() {
        return extensionTtu;
    }

    /**
     * Define el valor de la propiedad extensionTtu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionTtu(String value) {
        this.extensionTtu = value;
    }

    /**
     * Obtiene el valor de la propiedad fNacu.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFNacu() {
        return fNacu;
    }

    /**
     * Define el valor de la propiedad fNacu.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFNacu(XMLGregorianCalendar value) {
        this.fNacu = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaIngresoU.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaIngresoU() {
        return fechaIngresoU;
    }

    /**
     * Define el valor de la propiedad fechaIngresoU.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaIngresoU(XMLGregorianCalendar value) {
        this.fechaIngresoU = value;
    }

    /**
     * Obtiene el valor de la propiedad firmaU.
     * 
     */
    public short getFirmaU() {
        return firmaU;
    }

    /**
     * Define el valor de la propiedad firmaU.
     * 
     */
    public void setFirmaU(short value) {
        this.firmaU = value;
    }

    /**
     * Obtiene el valor de la propiedad fotoU.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFotoU() {
        return fotoU;
    }

    /**
     * Define el valor de la propiedad fotoU.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFotoU(Short value) {
        this.fotoU = value;
    }

    /**
     * Obtiene el valor de la propiedad horarioEDo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHorarioEDo() {
        return horarioEDo;
    }

    /**
     * Define el valor de la propiedad horarioEDo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHorarioEDo(XMLGregorianCalendar value) {
        this.horarioEDo = value;
    }

    /**
     * Obtiene el valor de la propiedad horarioEJu.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHorarioEJu() {
        return horarioEJu;
    }

    /**
     * Define el valor de la propiedad horarioEJu.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHorarioEJu(XMLGregorianCalendar value) {
        this.horarioEJu = value;
    }

    /**
     * Obtiene el valor de la propiedad horarioELu.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHorarioELu() {
        return horarioELu;
    }

    /**
     * Define el valor de la propiedad horarioELu.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHorarioELu(XMLGregorianCalendar value) {
        this.horarioELu = value;
    }

    /**
     * Obtiene el valor de la propiedad horarioEMa.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHorarioEMa() {
        return horarioEMa;
    }

    /**
     * Define el valor de la propiedad horarioEMa.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHorarioEMa(XMLGregorianCalendar value) {
        this.horarioEMa = value;
    }

    /**
     * Obtiene el valor de la propiedad horarioEMi.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHorarioEMi() {
        return horarioEMi;
    }

    /**
     * Define el valor de la propiedad horarioEMi.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHorarioEMi(XMLGregorianCalendar value) {
        this.horarioEMi = value;
    }

    /**
     * Obtiene el valor de la propiedad horarioESa.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHorarioESa() {
        return horarioESa;
    }

    /**
     * Define el valor de la propiedad horarioESa.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHorarioESa(XMLGregorianCalendar value) {
        this.horarioESa = value;
    }

    /**
     * Obtiene el valor de la propiedad horarioEVi.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHorarioEVi() {
        return horarioEVi;
    }

    /**
     * Define el valor de la propiedad horarioEVi.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHorarioEVi(XMLGregorianCalendar value) {
        this.horarioEVi = value;
    }

    /**
     * Obtiene el valor de la propiedad horarioSDo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHorarioSDo() {
        return horarioSDo;
    }

    /**
     * Define el valor de la propiedad horarioSDo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHorarioSDo(XMLGregorianCalendar value) {
        this.horarioSDo = value;
    }

    /**
     * Obtiene el valor de la propiedad horarioSJu.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHorarioSJu() {
        return horarioSJu;
    }

    /**
     * Define el valor de la propiedad horarioSJu.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHorarioSJu(XMLGregorianCalendar value) {
        this.horarioSJu = value;
    }

    /**
     * Obtiene el valor de la propiedad horarioSLu.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHorarioSLu() {
        return horarioSLu;
    }

    /**
     * Define el valor de la propiedad horarioSLu.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHorarioSLu(XMLGregorianCalendar value) {
        this.horarioSLu = value;
    }

    /**
     * Obtiene el valor de la propiedad horarioSMa.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHorarioSMa() {
        return horarioSMa;
    }

    /**
     * Define el valor de la propiedad horarioSMa.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHorarioSMa(XMLGregorianCalendar value) {
        this.horarioSMa = value;
    }

    /**
     * Obtiene el valor de la propiedad horarioSMi.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHorarioSMi() {
        return horarioSMi;
    }

    /**
     * Define el valor de la propiedad horarioSMi.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHorarioSMi(XMLGregorianCalendar value) {
        this.horarioSMi = value;
    }

    /**
     * Obtiene el valor de la propiedad horarioSSa.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHorarioSSa() {
        return horarioSSa;
    }

    /**
     * Define el valor de la propiedad horarioSSa.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHorarioSSa(XMLGregorianCalendar value) {
        this.horarioSSa = value;
    }

    /**
     * Obtiene el valor de la propiedad horarioSVi.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHorarioSVi() {
        return horarioSVi;
    }

    /**
     * Define el valor de la propiedad horarioSVi.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHorarioSVi(XMLGregorianCalendar value) {
        this.horarioSVi = value;
    }

    /**
     * Obtiene el valor de la propiedad idAreau.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIdAreau() {
        return idAreau;
    }

    /**
     * Define el valor de la propiedad idAreau.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIdAreau(Short value) {
        this.idAreau = value;
    }

    /**
     * Obtiene el valor de la propiedad idDepartamentou.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIdDepartamentou() {
        return idDepartamentou;
    }

    /**
     * Define el valor de la propiedad idDepartamentou.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIdDepartamentou(Short value) {
        this.idDepartamentou = value;
    }

    /**
     * Obtiene el valor de la propiedad idEscolaridadu.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIdEscolaridadu() {
        return idEscolaridadu;
    }

    /**
     * Define el valor de la propiedad idEscolaridadu.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIdEscolaridadu(Short value) {
        this.idEscolaridadu = value;
    }

    /**
     * Obtiene el valor de la propiedad idOcupacionu.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOcupacionu() {
        return idOcupacionu;
    }

    /**
     * Define el valor de la propiedad idOcupacionu.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOcupacionu(Integer value) {
        this.idOcupacionu = value;
    }

    /**
     * Obtiene el valor de la propiedad idProfesionu.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdProfesionu() {
        return idProfesionu;
    }

    /**
     * Define el valor de la propiedad idProfesionu.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdProfesionu(Integer value) {
        this.idProfesionu = value;
    }

    /**
     * Obtiene el valor de la propiedad idPuestou.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdPuestou() {
        return idPuestou;
    }

    /**
     * Define el valor de la propiedad idPuestou.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdPuestou(Integer value) {
        this.idPuestou = value;
    }

    /**
     * Obtiene el valor de la propiedad idSucursalu.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSucursalu() {
        return idSucursalu;
    }

    /**
     * Define el valor de la propiedad idSucursalu.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSucursalu(Integer value) {
        this.idSucursalu = value;
    }

    /**
     * Obtiene el valor de la propiedad idTituloU.
     * 
     */
    public short getIdTituloU() {
        return idTituloU;
    }

    /**
     * Define el valor de la propiedad idTituloU.
     * 
     */
    public void setIdTituloU(short value) {
        this.idTituloU = value;
    }

    /**
     * Obtiene el valor de la propiedad idU.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdU() {
        return idU;
    }

    /**
     * Define el valor de la propiedad idU.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdU(Integer value) {
        this.idU = value;
    }

    /**
     * Obtiene el valor de la propiedad idUsuarioRu.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdUsuarioRu() {
        return idUsuarioRu;
    }

    /**
     * Define el valor de la propiedad idUsuarioRu.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdUsuarioRu(Integer value) {
        this.idUsuarioRu = value;
    }

    /**
     * Obtiene el valor de la propiedad multisucursalU.
     * 
     */
    public short getMultisucursalU() {
        return multisucursalU;
    }

    /**
     * Define el valor de la propiedad multisucursalU.
     * 
     */
    public void setMultisucursalU(short value) {
        this.multisucursalU = value;
    }

    /**
     * Obtiene el valor de la propiedad municipioU.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMunicipioU() {
        return municipioU;
    }

    /**
     * Define el valor de la propiedad municipioU.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMunicipioU(Integer value) {
        this.municipioU = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidadU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidadU() {
        return nacionalidadU;
    }

    /**
     * Define el valor de la propiedad nacionalidadU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidadU(String value) {
        this.nacionalidadU = value;
    }

    /**
     * Obtiene el valor de la propiedad noIDu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoIDu() {
        return noIDu;
    }

    /**
     * Define el valor de la propiedad noIDu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoIDu(String value) {
        this.noIDu = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreFotou.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreFotou() {
        return nombreFotou;
    }

    /**
     * Define el valor de la propiedad nombreFotou.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreFotou(String value) {
        this.nombreFotou = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreU() {
        return nombreU;
    }

    /**
     * Define el valor de la propiedad nombreU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreU(String value) {
        this.nombreU = value;
    }

    /**
     * Obtiene el valor de la propiedad notasU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotasU() {
        return notasU;
    }

    /**
     * Define el valor de la propiedad notasU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotasU(String value) {
        this.notasU = value;
    }

    /**
     * Obtiene el valor de la propiedad permisosU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermisosU() {
        return permisosU;
    }

    /**
     * Define el valor de la propiedad permisosU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermisosU(String value) {
        this.permisosU = value;
    }

    /**
     * Obtiene el valor de la propiedad promotorU.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPromotorU() {
        return promotorU;
    }

    /**
     * Define el valor de la propiedad promotorU.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPromotorU(Integer value) {
        this.promotorU = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcU() {
        return rfcU;
    }

    /**
     * Define el valor de la propiedad rfcU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcU(String value) {
        this.rfcU = value;
    }

    /**
     * Obtiene el valor de la propiedad sexoU.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSexoU() {
        return sexoU;
    }

    /**
     * Define el valor de la propiedad sexoU.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSexoU(Short value) {
        this.sexoU = value;
    }

    /**
     * Obtiene el valor de la propiedad tCelularu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCelularu() {
        return tCelularu;
    }

    /**
     * Define el valor de la propiedad tCelularu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCelularu(String value) {
        this.tCelularu = value;
    }

    /**
     * Obtiene el valor de la propiedad tEmergenciau.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEmergenciau() {
        return tEmergenciau;
    }

    /**
     * Define el valor de la propiedad tEmergenciau.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEmergenciau(String value) {
        this.tEmergenciau = value;
    }

    /**
     * Obtiene el valor de la propiedad tParticularu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTParticularu() {
        return tParticularu;
    }

    /**
     * Define el valor de la propiedad tParticularu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTParticularu(String value) {
        this.tParticularu = value;
    }

    /**
     * Obtiene el valor de la propiedad tSanguineou.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTSanguineou() {
        return tSanguineou;
    }

    /**
     * Define el valor de la propiedad tSanguineou.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTSanguineou(Short value) {
        this.tSanguineou = value;
    }

    /**
     * Obtiene el valor de la propiedad tTrabajou.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTrabajou() {
        return tTrabajou;
    }

    /**
     * Define el valor de la propiedad tTrabajou.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTrabajou(String value) {
        this.tTrabajou = value;
    }

    /**
     * Obtiene el valor de la propiedad temporalU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemporalU() {
        return temporalU;
    }

    /**
     * Define el valor de la propiedad temporalU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemporalU(String value) {
        this.temporalU = value;
    }

    /**
     * Obtiene el valor de la propiedad tituloU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTituloU() {
        return tituloU;
    }

    /**
     * Define el valor de la propiedad tituloU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTituloU(String value) {
        this.tituloU = value;
    }

    /**
     * Obtiene el valor de la propiedad universidadEU.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniversidadEU() {
        return universidadEU;
    }

    /**
     * Define el valor de la propiedad universidadEU.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniversidadEU(Integer value) {
        this.universidadEU = value;
    }

    /**
     * Obtiene el valor de la propiedad universidadU.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniversidadU() {
        return universidadU;
    }

    /**
     * Define el valor de la propiedad universidadU.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniversidadU(Integer value) {
        this.universidadU = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioNuevou.
     * 
     */
    public short getUsuarioNuevou() {
        return usuarioNuevou;
    }

    /**
     * Define el valor de la propiedad usuarioNuevou.
     * 
     */
    public void setUsuarioNuevou(short value) {
        this.usuarioNuevou = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioU() {
        return usuarioU;
    }

    /**
     * Define el valor de la propiedad usuarioU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioU(String value) {
        this.usuarioU = value;
    }

    /**
     * Obtiene el valor de la propiedad validadoU.
     * 
     */
    public short getValidadoU() {
        return validadoU;
    }

    /**
     * Define el valor de la propiedad validadoU.
     * 
     */
    public void setValidadoU(short value) {
        this.validadoU = value;
    }

    /**
     * Obtiene el valor de la propiedad variableTemporal1U.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableTemporal1U() {
        return variableTemporal1U;
    }

    /**
     * Define el valor de la propiedad variableTemporal1U.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableTemporal1U(String value) {
        this.variableTemporal1U = value;
    }

    /**
     * Obtiene el valor de la propiedad variableTemporal2U.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableTemporal2U() {
        return variableTemporal2U;
    }

    /**
     * Define el valor de la propiedad variableTemporal2U.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableTemporal2U(String value) {
        this.variableTemporal2U = value;
    }

    /**
     * Obtiene el valor de la propiedad variableTemporal3U.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableTemporal3U() {
        return variableTemporal3U;
    }

    /**
     * Define el valor de la propiedad variableTemporal3U.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableTemporal3U(String value) {
        this.variableTemporal3U = value;
    }

    /**
     * Obtiene el valor de la propiedad variableTemporal4U.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableTemporal4U() {
        return variableTemporal4U;
    }

    /**
     * Define el valor de la propiedad variableTemporal4U.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableTemporal4U(String value) {
        this.variableTemporal4U = value;
    }

    /**
     * Obtiene el valor de la propiedad variableTemporalU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableTemporalU() {
        return variableTemporalU;
    }

    /**
     * Define el valor de la propiedad variableTemporalU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableTemporalU(String value) {
        this.variableTemporalU = value;
    }

}
