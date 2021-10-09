
package clientews.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para conceptos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="conceptos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aleatorioC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoriaTo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="codigoBarrasTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conceptoTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costoTo" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="descripcionTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diasEntregaTo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="dicom" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="fechaTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="formato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAreaTo" type="{http://servicio.sga.gm.com.mx/}areas" minOccurs="0"/>
 *         &lt;element name="idBeneficioTo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="idCategoriaTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idConvenioTo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idDepartamentoTo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="idGrupoTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idInstrucciones" type="{http://servicio.sga.gm.com.mx/}instrucciones" minOccurs="0"/>
 *         &lt;element name="idMarcaTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idMedicamentoG" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idModeloTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idPresentacionTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idTipoConceptoTo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="idTo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idUmedidaTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="linkPlmTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nivelMedTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precioM" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="precioMu" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="precioTo" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="precioUrgenciaTo" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="usuarioTo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conceptos", propOrder = {
    "aleatorioC",
    "categoriaTo",
    "codigoBarrasTo",
    "conceptoTo",
    "costoTo",
    "descripcionTo",
    "diasEntregaTo",
    "dicom",
    "fechaTo",
    "formato",
    "idAreaTo",
    "idBeneficioTo",
    "idCategoriaTo",
    "idConvenioTo",
    "idDepartamentoTo",
    "idGrupoTo",
    "idInstrucciones",
    "idMarcaTo",
    "idMedicamentoG",
    "idModeloTo",
    "idPresentacionTo",
    "idTipoConceptoTo",
    "idTo",
    "idUmedidaTo",
    "linkPlmTo",
    "nivelMedTo",
    "precioM",
    "precioMu",
    "precioTo",
    "precioUrgenciaTo",
    "usuarioTo"
})
public class Conceptos {

    protected String aleatorioC;
    protected Short categoriaTo;
    protected String codigoBarrasTo;
    protected String conceptoTo;
    protected Float costoTo;
    protected String descripcionTo;
    protected Short diasEntregaTo;
    protected Short dicom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaTo;
    protected String formato;
    protected Areas idAreaTo;
    protected Short idBeneficioTo;
    protected Integer idCategoriaTo;
    protected int idConvenioTo;
    protected short idDepartamentoTo;
    protected Integer idGrupoTo;
    protected Instrucciones idInstrucciones;
    protected Integer idMarcaTo;
    protected Integer idMedicamentoG;
    protected Integer idModeloTo;
    protected Integer idPresentacionTo;
    protected short idTipoConceptoTo;
    protected Long idTo;
    protected Integer idUmedidaTo;
    protected String linkPlmTo;
    protected String nivelMedTo;
    protected float precioM;
    protected float precioMu;
    protected float precioTo;
    protected float precioUrgenciaTo;
    protected int usuarioTo;

    /**
     * Obtiene el valor de la propiedad aleatorioC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAleatorioC() {
        return aleatorioC;
    }

    /**
     * Define el valor de la propiedad aleatorioC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAleatorioC(String value) {
        this.aleatorioC = value;
    }

    /**
     * Obtiene el valor de la propiedad categoriaTo.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCategoriaTo() {
        return categoriaTo;
    }

    /**
     * Define el valor de la propiedad categoriaTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCategoriaTo(Short value) {
        this.categoriaTo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoBarrasTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoBarrasTo() {
        return codigoBarrasTo;
    }

    /**
     * Define el valor de la propiedad codigoBarrasTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoBarrasTo(String value) {
        this.codigoBarrasTo = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptoTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptoTo() {
        return conceptoTo;
    }

    /**
     * Define el valor de la propiedad conceptoTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptoTo(String value) {
        this.conceptoTo = value;
    }

    /**
     * Obtiene el valor de la propiedad costoTo.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCostoTo() {
        return costoTo;
    }

    /**
     * Define el valor de la propiedad costoTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCostoTo(Float value) {
        this.costoTo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionTo() {
        return descripcionTo;
    }

    /**
     * Define el valor de la propiedad descripcionTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionTo(String value) {
        this.descripcionTo = value;
    }

    /**
     * Obtiene el valor de la propiedad diasEntregaTo.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDiasEntregaTo() {
        return diasEntregaTo;
    }

    /**
     * Define el valor de la propiedad diasEntregaTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDiasEntregaTo(Short value) {
        this.diasEntregaTo = value;
    }

    /**
     * Obtiene el valor de la propiedad dicom.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDicom() {
        return dicom;
    }

    /**
     * Define el valor de la propiedad dicom.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDicom(Short value) {
        this.dicom = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaTo() {
        return fechaTo;
    }

    /**
     * Define el valor de la propiedad fechaTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaTo(XMLGregorianCalendar value) {
        this.fechaTo = value;
    }

    /**
     * Obtiene el valor de la propiedad formato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormato() {
        return formato;
    }

    /**
     * Define el valor de la propiedad formato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormato(String value) {
        this.formato = value;
    }

    /**
     * Obtiene el valor de la propiedad idAreaTo.
     * 
     * @return
     *     possible object is
     *     {@link Areas }
     *     
     */
    public Areas getIdAreaTo() {
        return idAreaTo;
    }

    /**
     * Define el valor de la propiedad idAreaTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Areas }
     *     
     */
    public void setIdAreaTo(Areas value) {
        this.idAreaTo = value;
    }

    /**
     * Obtiene el valor de la propiedad idBeneficioTo.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIdBeneficioTo() {
        return idBeneficioTo;
    }

    /**
     * Define el valor de la propiedad idBeneficioTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIdBeneficioTo(Short value) {
        this.idBeneficioTo = value;
    }

    /**
     * Obtiene el valor de la propiedad idCategoriaTo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCategoriaTo() {
        return idCategoriaTo;
    }

    /**
     * Define el valor de la propiedad idCategoriaTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCategoriaTo(Integer value) {
        this.idCategoriaTo = value;
    }

    /**
     * Obtiene el valor de la propiedad idConvenioTo.
     * 
     */
    public int getIdConvenioTo() {
        return idConvenioTo;
    }

    /**
     * Define el valor de la propiedad idConvenioTo.
     * 
     */
    public void setIdConvenioTo(int value) {
        this.idConvenioTo = value;
    }

    /**
     * Obtiene el valor de la propiedad idDepartamentoTo.
     * 
     */
    public short getIdDepartamentoTo() {
        return idDepartamentoTo;
    }

    /**
     * Define el valor de la propiedad idDepartamentoTo.
     * 
     */
    public void setIdDepartamentoTo(short value) {
        this.idDepartamentoTo = value;
    }

    /**
     * Obtiene el valor de la propiedad idGrupoTo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdGrupoTo() {
        return idGrupoTo;
    }

    /**
     * Define el valor de la propiedad idGrupoTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdGrupoTo(Integer value) {
        this.idGrupoTo = value;
    }

    /**
     * Obtiene el valor de la propiedad idInstrucciones.
     * 
     * @return
     *     possible object is
     *     {@link Instrucciones }
     *     
     */
    public Instrucciones getIdInstrucciones() {
        return idInstrucciones;
    }

    /**
     * Define el valor de la propiedad idInstrucciones.
     * 
     * @param value
     *     allowed object is
     *     {@link Instrucciones }
     *     
     */
    public void setIdInstrucciones(Instrucciones value) {
        this.idInstrucciones = value;
    }

    /**
     * Obtiene el valor de la propiedad idMarcaTo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdMarcaTo() {
        return idMarcaTo;
    }

    /**
     * Define el valor de la propiedad idMarcaTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMarcaTo(Integer value) {
        this.idMarcaTo = value;
    }

    /**
     * Obtiene el valor de la propiedad idMedicamentoG.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdMedicamentoG() {
        return idMedicamentoG;
    }

    /**
     * Define el valor de la propiedad idMedicamentoG.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMedicamentoG(Integer value) {
        this.idMedicamentoG = value;
    }

    /**
     * Obtiene el valor de la propiedad idModeloTo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdModeloTo() {
        return idModeloTo;
    }

    /**
     * Define el valor de la propiedad idModeloTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdModeloTo(Integer value) {
        this.idModeloTo = value;
    }

    /**
     * Obtiene el valor de la propiedad idPresentacionTo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdPresentacionTo() {
        return idPresentacionTo;
    }

    /**
     * Define el valor de la propiedad idPresentacionTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdPresentacionTo(Integer value) {
        this.idPresentacionTo = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoConceptoTo.
     * 
     */
    public short getIdTipoConceptoTo() {
        return idTipoConceptoTo;
    }

    /**
     * Define el valor de la propiedad idTipoConceptoTo.
     * 
     */
    public void setIdTipoConceptoTo(short value) {
        this.idTipoConceptoTo = value;
    }

    /**
     * Obtiene el valor de la propiedad idTo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdTo() {
        return idTo;
    }

    /**
     * Define el valor de la propiedad idTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdTo(Long value) {
        this.idTo = value;
    }

    /**
     * Obtiene el valor de la propiedad idUmedidaTo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdUmedidaTo() {
        return idUmedidaTo;
    }

    /**
     * Define el valor de la propiedad idUmedidaTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdUmedidaTo(Integer value) {
        this.idUmedidaTo = value;
    }

    /**
     * Obtiene el valor de la propiedad linkPlmTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkPlmTo() {
        return linkPlmTo;
    }

    /**
     * Define el valor de la propiedad linkPlmTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkPlmTo(String value) {
        this.linkPlmTo = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelMedTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivelMedTo() {
        return nivelMedTo;
    }

    /**
     * Define el valor de la propiedad nivelMedTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivelMedTo(String value) {
        this.nivelMedTo = value;
    }

    /**
     * Obtiene el valor de la propiedad precioM.
     * 
     */
    public float getPrecioM() {
        return precioM;
    }

    /**
     * Define el valor de la propiedad precioM.
     * 
     */
    public void setPrecioM(float value) {
        this.precioM = value;
    }

    /**
     * Obtiene el valor de la propiedad precioMu.
     * 
     */
    public float getPrecioMu() {
        return precioMu;
    }

    /**
     * Define el valor de la propiedad precioMu.
     * 
     */
    public void setPrecioMu(float value) {
        this.precioMu = value;
    }

    /**
     * Obtiene el valor de la propiedad precioTo.
     * 
     */
    public float getPrecioTo() {
        return precioTo;
    }

    /**
     * Define el valor de la propiedad precioTo.
     * 
     */
    public void setPrecioTo(float value) {
        this.precioTo = value;
    }

    /**
     * Obtiene el valor de la propiedad precioUrgenciaTo.
     * 
     */
    public float getPrecioUrgenciaTo() {
        return precioUrgenciaTo;
    }

    /**
     * Define el valor de la propiedad precioUrgenciaTo.
     * 
     */
    public void setPrecioUrgenciaTo(float value) {
        this.precioUrgenciaTo = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioTo.
     * 
     */
    public int getUsuarioTo() {
        return usuarioTo;
    }

    /**
     * Define el valor de la propiedad usuarioTo.
     * 
     */
    public void setUsuarioTo(int value) {
        this.usuarioTo = value;
    }

}
