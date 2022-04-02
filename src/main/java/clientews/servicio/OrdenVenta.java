
package clientews.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ordenVenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ordenVenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adicionalesCOv" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="adicionalesEiOv" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="adicionalesElOv" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="adicionalesPOv" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="adicionalesSOv" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="contadorOv" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descDCta" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="descDImg" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="descDLab" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="descDPro" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="descDServ" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="estatusOv" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="facturadaOv" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="fechaVentaOv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="granTotalOv" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="idFormaPago" type="{http://servicio.sga.gm.com.mx/}catalogoFormaPago" minOccurs="0"/>
 *         &lt;element name="idOv" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idPacienteOv" type="{http://servicio.sga.gm.com.mx/}pacientes" minOccurs="0"/>
 *         &lt;element name="ivaOv" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="medicoCOv" type="{http://servicio.sga.gm.com.mx/}medico" minOccurs="0"/>
 *         &lt;element name="medicoEiOv" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="medicoElOv" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="motivoCOv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivoDescCOv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivoDescFOv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivoDescIOv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivoDescLOv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivoDescSOv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="muestrasOv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noTempOv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacionesIOv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacionesLOv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacionesSOv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PDescCta" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="PDescImg" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="PDescLab" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="PDescPro" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="PDescServ" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="pagado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="personalSOv" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="procedenciaOv" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="referenciaOv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requiereFactura" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="subTotalC" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="subTotalI" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="subTotalL" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="subTotalP" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="subTotalS" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="subtotalOv" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="sucursalOv" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TDescCta" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="TDescImg" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="TDescLab" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="TDescPro" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="TDescServ" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="totalC" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="totalEi" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="totalEl" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="totalP" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="totalS" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="usuarioOv" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ordenVenta", propOrder = {
    "adicionalesCOv",
    "adicionalesEiOv",
    "adicionalesElOv",
    "adicionalesPOv",
    "adicionalesSOv",
    "contadorOv",
    "descDCta",
    "descDImg",
    "descDLab",
    "descDPro",
    "descDServ",
    "estatusOv",
    "facturadaOv",
    "fechaVentaOv",
    "granTotalOv",
    "idFormaPago",
    "idOv",
    "idPacienteOv",
    "ivaOv",
    "medicoCOv",
    "medicoEiOv",
    "medicoElOv",
    "motivoCOv",
    "motivoDescCOv",
    "motivoDescFOv",
    "motivoDescIOv",
    "motivoDescLOv",
    "motivoDescSOv",
    "muestrasOv",
    "noTempOv",
    "observacionesIOv",
    "observacionesLOv",
    "observacionesSOv",
    "pDescCta",
    "pDescImg",
    "pDescLab",
    "pDescPro",
    "pDescServ",
    "pagado",
    "personalSOv",
    "procedenciaOv",
    "referenciaOv",
    "requiereFactura",
    "subTotalC",
    "subTotalI",
    "subTotalL",
    "subTotalP",
    "subTotalS",
    "subtotalOv",
    "sucursalOv",
    "tDescCta",
    "tDescImg",
    "tDescLab",
    "tDescPro",
    "tDescServ",
    "totalC",
    "totalEi",
    "totalEl",
    "totalP",
    "totalS",
    "usuarioOv"
})
public class OrdenVenta {

    protected Float adicionalesCOv;
    protected Float adicionalesEiOv;
    protected Float adicionalesElOv;
    protected Float adicionalesPOv;
    protected Float adicionalesSOv;
    protected int contadorOv;
    protected float descDCta;
    protected float descDImg;
    protected float descDLab;
    protected float descDPro;
    protected float descDServ;
    protected short estatusOv;
    protected short facturadaOv;
    protected String fechaVentaOv;
    protected Float granTotalOv;
    protected CatalogoFormaPago idFormaPago;
    protected Long idOv;
    protected Pacientes idPacienteOv;
    protected float ivaOv;
    protected Medico medicoCOv;
    protected Integer medicoEiOv;
    protected Integer medicoElOv;
    protected String motivoCOv;
    protected String motivoDescCOv;
    protected String motivoDescFOv;
    protected String motivoDescIOv;
    protected String motivoDescLOv;
    protected String motivoDescSOv;
    protected String muestrasOv;
    protected String noTempOv;
    protected String observacionesIOv;
    protected String observacionesLOv;
    protected String observacionesSOv;
    @XmlElement(name = "PDescCta")
    protected short pDescCta;
    @XmlElement(name = "PDescImg")
    protected short pDescImg;
    @XmlElement(name = "PDescLab")
    protected short pDescLab;
    @XmlElement(name = "PDescPro")
    protected short pDescPro;
    @XmlElement(name = "PDescServ")
    protected short pDescServ;
    protected boolean pagado;
    protected Integer personalSOv;
    protected short procedenciaOv;
    protected String referenciaOv;
    protected boolean requiereFactura;
    protected Float subTotalC;
    protected Float subTotalI;
    protected Float subTotalL;
    protected Float subTotalP;
    protected Float subTotalS;
    protected float subtotalOv;
    protected Integer sucursalOv;
    @XmlElement(name = "TDescCta")
    protected float tDescCta;
    @XmlElement(name = "TDescImg")
    protected float tDescImg;
    @XmlElement(name = "TDescLab")
    protected float tDescLab;
    @XmlElement(name = "TDescPro")
    protected float tDescPro;
    @XmlElement(name = "TDescServ")
    protected float tDescServ;
    protected Float totalC;
    protected Float totalEi;
    protected Float totalEl;
    protected Float totalP;
    protected Float totalS;
    protected int usuarioOv;

    /**
     * Obtiene el valor de la propiedad adicionalesCOv.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAdicionalesCOv() {
        return adicionalesCOv;
    }

    /**
     * Define el valor de la propiedad adicionalesCOv.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAdicionalesCOv(Float value) {
        this.adicionalesCOv = value;
    }

    /**
     * Obtiene el valor de la propiedad adicionalesEiOv.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAdicionalesEiOv() {
        return adicionalesEiOv;
    }

    /**
     * Define el valor de la propiedad adicionalesEiOv.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAdicionalesEiOv(Float value) {
        this.adicionalesEiOv = value;
    }

    /**
     * Obtiene el valor de la propiedad adicionalesElOv.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAdicionalesElOv() {
        return adicionalesElOv;
    }

    /**
     * Define el valor de la propiedad adicionalesElOv.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAdicionalesElOv(Float value) {
        this.adicionalesElOv = value;
    }

    /**
     * Obtiene el valor de la propiedad adicionalesPOv.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAdicionalesPOv() {
        return adicionalesPOv;
    }

    /**
     * Define el valor de la propiedad adicionalesPOv.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAdicionalesPOv(Float value) {
        this.adicionalesPOv = value;
    }

    /**
     * Obtiene el valor de la propiedad adicionalesSOv.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAdicionalesSOv() {
        return adicionalesSOv;
    }

    /**
     * Define el valor de la propiedad adicionalesSOv.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAdicionalesSOv(Float value) {
        this.adicionalesSOv = value;
    }

    /**
     * Obtiene el valor de la propiedad contadorOv.
     * 
     */
    public int getContadorOv() {
        return contadorOv;
    }

    /**
     * Define el valor de la propiedad contadorOv.
     * 
     */
    public void setContadorOv(int value) {
        this.contadorOv = value;
    }

    /**
     * Obtiene el valor de la propiedad descDCta.
     * 
     */
    public float getDescDCta() {
        return descDCta;
    }

    /**
     * Define el valor de la propiedad descDCta.
     * 
     */
    public void setDescDCta(float value) {
        this.descDCta = value;
    }

    /**
     * Obtiene el valor de la propiedad descDImg.
     * 
     */
    public float getDescDImg() {
        return descDImg;
    }

    /**
     * Define el valor de la propiedad descDImg.
     * 
     */
    public void setDescDImg(float value) {
        this.descDImg = value;
    }

    /**
     * Obtiene el valor de la propiedad descDLab.
     * 
     */
    public float getDescDLab() {
        return descDLab;
    }

    /**
     * Define el valor de la propiedad descDLab.
     * 
     */
    public void setDescDLab(float value) {
        this.descDLab = value;
    }

    /**
     * Obtiene el valor de la propiedad descDPro.
     * 
     */
    public float getDescDPro() {
        return descDPro;
    }

    /**
     * Define el valor de la propiedad descDPro.
     * 
     */
    public void setDescDPro(float value) {
        this.descDPro = value;
    }

    /**
     * Obtiene el valor de la propiedad descDServ.
     * 
     */
    public float getDescDServ() {
        return descDServ;
    }

    /**
     * Define el valor de la propiedad descDServ.
     * 
     */
    public void setDescDServ(float value) {
        this.descDServ = value;
    }

    /**
     * Obtiene el valor de la propiedad estatusOv.
     * 
     */
    public short getEstatusOv() {
        return estatusOv;
    }

    /**
     * Define el valor de la propiedad estatusOv.
     * 
     */
    public void setEstatusOv(short value) {
        this.estatusOv = value;
    }

    /**
     * Obtiene el valor de la propiedad facturadaOv.
     * 
     */
    public short getFacturadaOv() {
        return facturadaOv;
    }

    /**
     * Define el valor de la propiedad facturadaOv.
     * 
     */
    public void setFacturadaOv(short value) {
        this.facturadaOv = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVentaOv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVentaOv() {
        return fechaVentaOv;
    }

    /**
     * Define el valor de la propiedad fechaVentaOv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVentaOv(String value) {
        this.fechaVentaOv = value;
    }

    /**
     * Obtiene el valor de la propiedad granTotalOv.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGranTotalOv() {
        return granTotalOv;
    }

    /**
     * Define el valor de la propiedad granTotalOv.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGranTotalOv(Float value) {
        this.granTotalOv = value;
    }

    /**
     * Obtiene el valor de la propiedad idFormaPago.
     * 
     * @return
     *     possible object is
     *     {@link CatalogoFormaPago }
     *     
     */
    public CatalogoFormaPago getIdFormaPago() {
        return idFormaPago;
    }

    /**
     * Define el valor de la propiedad idFormaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogoFormaPago }
     *     
     */
    public void setIdFormaPago(CatalogoFormaPago value) {
        this.idFormaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad idOv.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdOv() {
        return idOv;
    }

    /**
     * Define el valor de la propiedad idOv.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdOv(Long value) {
        this.idOv = value;
    }

    /**
     * Obtiene el valor de la propiedad idPacienteOv.
     * 
     * @return
     *     possible object is
     *     {@link Pacientes }
     *     
     */
    public Pacientes getIdPacienteOv() {
        return idPacienteOv;
    }

    /**
     * Define el valor de la propiedad idPacienteOv.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacientes }
     *     
     */
    public void setIdPacienteOv(Pacientes value) {
        this.idPacienteOv = value;
    }

    /**
     * Obtiene el valor de la propiedad ivaOv.
     * 
     */
    public float getIvaOv() {
        return ivaOv;
    }

    /**
     * Define el valor de la propiedad ivaOv.
     * 
     */
    public void setIvaOv(float value) {
        this.ivaOv = value;
    }

    /**
     * Obtiene el valor de la propiedad medicoCOv.
     * 
     * @return
     *     possible object is
     *     {@link Medico }
     *     
     */
    public Medico getMedicoCOv() {
        return medicoCOv;
    }

    /**
     * Define el valor de la propiedad medicoCOv.
     * 
     * @param value
     *     allowed object is
     *     {@link Medico }
     *     
     */
    public void setMedicoCOv(Medico value) {
        this.medicoCOv = value;
    }

    /**
     * Obtiene el valor de la propiedad medicoEiOv.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMedicoEiOv() {
        return medicoEiOv;
    }

    /**
     * Define el valor de la propiedad medicoEiOv.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMedicoEiOv(Integer value) {
        this.medicoEiOv = value;
    }

    /**
     * Obtiene el valor de la propiedad medicoElOv.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMedicoElOv() {
        return medicoElOv;
    }

    /**
     * Define el valor de la propiedad medicoElOv.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMedicoElOv(Integer value) {
        this.medicoElOv = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoCOv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoCOv() {
        return motivoCOv;
    }

    /**
     * Define el valor de la propiedad motivoCOv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoCOv(String value) {
        this.motivoCOv = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoDescCOv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoDescCOv() {
        return motivoDescCOv;
    }

    /**
     * Define el valor de la propiedad motivoDescCOv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoDescCOv(String value) {
        this.motivoDescCOv = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoDescFOv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoDescFOv() {
        return motivoDescFOv;
    }

    /**
     * Define el valor de la propiedad motivoDescFOv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoDescFOv(String value) {
        this.motivoDescFOv = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoDescIOv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoDescIOv() {
        return motivoDescIOv;
    }

    /**
     * Define el valor de la propiedad motivoDescIOv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoDescIOv(String value) {
        this.motivoDescIOv = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoDescLOv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoDescLOv() {
        return motivoDescLOv;
    }

    /**
     * Define el valor de la propiedad motivoDescLOv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoDescLOv(String value) {
        this.motivoDescLOv = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoDescSOv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoDescSOv() {
        return motivoDescSOv;
    }

    /**
     * Define el valor de la propiedad motivoDescSOv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoDescSOv(String value) {
        this.motivoDescSOv = value;
    }

    /**
     * Obtiene el valor de la propiedad muestrasOv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuestrasOv() {
        return muestrasOv;
    }

    /**
     * Define el valor de la propiedad muestrasOv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuestrasOv(String value) {
        this.muestrasOv = value;
    }

    /**
     * Obtiene el valor de la propiedad noTempOv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoTempOv() {
        return noTempOv;
    }

    /**
     * Define el valor de la propiedad noTempOv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoTempOv(String value) {
        this.noTempOv = value;
    }

    /**
     * Obtiene el valor de la propiedad observacionesIOv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacionesIOv() {
        return observacionesIOv;
    }

    /**
     * Define el valor de la propiedad observacionesIOv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacionesIOv(String value) {
        this.observacionesIOv = value;
    }

    /**
     * Obtiene el valor de la propiedad observacionesLOv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacionesLOv() {
        return observacionesLOv;
    }

    /**
     * Define el valor de la propiedad observacionesLOv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacionesLOv(String value) {
        this.observacionesLOv = value;
    }

    /**
     * Obtiene el valor de la propiedad observacionesSOv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacionesSOv() {
        return observacionesSOv;
    }

    /**
     * Define el valor de la propiedad observacionesSOv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacionesSOv(String value) {
        this.observacionesSOv = value;
    }

    /**
     * Obtiene el valor de la propiedad pDescCta.
     * 
     */
    public short getPDescCta() {
        return pDescCta;
    }

    /**
     * Define el valor de la propiedad pDescCta.
     * 
     */
    public void setPDescCta(short value) {
        this.pDescCta = value;
    }

    /**
     * Obtiene el valor de la propiedad pDescImg.
     * 
     */
    public short getPDescImg() {
        return pDescImg;
    }

    /**
     * Define el valor de la propiedad pDescImg.
     * 
     */
    public void setPDescImg(short value) {
        this.pDescImg = value;
    }

    /**
     * Obtiene el valor de la propiedad pDescLab.
     * 
     */
    public short getPDescLab() {
        return pDescLab;
    }

    /**
     * Define el valor de la propiedad pDescLab.
     * 
     */
    public void setPDescLab(short value) {
        this.pDescLab = value;
    }

    /**
     * Obtiene el valor de la propiedad pDescPro.
     * 
     */
    public short getPDescPro() {
        return pDescPro;
    }

    /**
     * Define el valor de la propiedad pDescPro.
     * 
     */
    public void setPDescPro(short value) {
        this.pDescPro = value;
    }

    /**
     * Obtiene el valor de la propiedad pDescServ.
     * 
     */
    public short getPDescServ() {
        return pDescServ;
    }

    /**
     * Define el valor de la propiedad pDescServ.
     * 
     */
    public void setPDescServ(short value) {
        this.pDescServ = value;
    }

    /**
     * Obtiene el valor de la propiedad pagado.
     * 
     */
    public boolean isPagado() {
        return pagado;
    }

    /**
     * Define el valor de la propiedad pagado.
     * 
     */
    public void setPagado(boolean value) {
        this.pagado = value;
    }

    /**
     * Obtiene el valor de la propiedad personalSOv.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPersonalSOv() {
        return personalSOv;
    }

    /**
     * Define el valor de la propiedad personalSOv.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPersonalSOv(Integer value) {
        this.personalSOv = value;
    }

    /**
     * Obtiene el valor de la propiedad procedenciaOv.
     * 
     */
    public short getProcedenciaOv() {
        return procedenciaOv;
    }

    /**
     * Define el valor de la propiedad procedenciaOv.
     * 
     */
    public void setProcedenciaOv(short value) {
        this.procedenciaOv = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaOv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaOv() {
        return referenciaOv;
    }

    /**
     * Define el valor de la propiedad referenciaOv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaOv(String value) {
        this.referenciaOv = value;
    }

    /**
     * Obtiene el valor de la propiedad requiereFactura.
     * 
     */
    public boolean isRequiereFactura() {
        return requiereFactura;
    }

    /**
     * Define el valor de la propiedad requiereFactura.
     * 
     */
    public void setRequiereFactura(boolean value) {
        this.requiereFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad subTotalC.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSubTotalC() {
        return subTotalC;
    }

    /**
     * Define el valor de la propiedad subTotalC.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSubTotalC(Float value) {
        this.subTotalC = value;
    }

    /**
     * Obtiene el valor de la propiedad subTotalI.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSubTotalI() {
        return subTotalI;
    }

    /**
     * Define el valor de la propiedad subTotalI.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSubTotalI(Float value) {
        this.subTotalI = value;
    }

    /**
     * Obtiene el valor de la propiedad subTotalL.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSubTotalL() {
        return subTotalL;
    }

    /**
     * Define el valor de la propiedad subTotalL.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSubTotalL(Float value) {
        this.subTotalL = value;
    }

    /**
     * Obtiene el valor de la propiedad subTotalP.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSubTotalP() {
        return subTotalP;
    }

    /**
     * Define el valor de la propiedad subTotalP.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSubTotalP(Float value) {
        this.subTotalP = value;
    }

    /**
     * Obtiene el valor de la propiedad subTotalS.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSubTotalS() {
        return subTotalS;
    }

    /**
     * Define el valor de la propiedad subTotalS.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSubTotalS(Float value) {
        this.subTotalS = value;
    }

    /**
     * Obtiene el valor de la propiedad subtotalOv.
     * 
     */
    public float getSubtotalOv() {
        return subtotalOv;
    }

    /**
     * Define el valor de la propiedad subtotalOv.
     * 
     */
    public void setSubtotalOv(float value) {
        this.subtotalOv = value;
    }

    /**
     * Obtiene el valor de la propiedad sucursalOv.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSucursalOv() {
        return sucursalOv;
    }

    /**
     * Define el valor de la propiedad sucursalOv.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSucursalOv(Integer value) {
        this.sucursalOv = value;
    }

    /**
     * Obtiene el valor de la propiedad tDescCta.
     * 
     */
    public float getTDescCta() {
        return tDescCta;
    }

    /**
     * Define el valor de la propiedad tDescCta.
     * 
     */
    public void setTDescCta(float value) {
        this.tDescCta = value;
    }

    /**
     * Obtiene el valor de la propiedad tDescImg.
     * 
     */
    public float getTDescImg() {
        return tDescImg;
    }

    /**
     * Define el valor de la propiedad tDescImg.
     * 
     */
    public void setTDescImg(float value) {
        this.tDescImg = value;
    }

    /**
     * Obtiene el valor de la propiedad tDescLab.
     * 
     */
    public float getTDescLab() {
        return tDescLab;
    }

    /**
     * Define el valor de la propiedad tDescLab.
     * 
     */
    public void setTDescLab(float value) {
        this.tDescLab = value;
    }

    /**
     * Obtiene el valor de la propiedad tDescPro.
     * 
     */
    public float getTDescPro() {
        return tDescPro;
    }

    /**
     * Define el valor de la propiedad tDescPro.
     * 
     */
    public void setTDescPro(float value) {
        this.tDescPro = value;
    }

    /**
     * Obtiene el valor de la propiedad tDescServ.
     * 
     */
    public float getTDescServ() {
        return tDescServ;
    }

    /**
     * Define el valor de la propiedad tDescServ.
     * 
     */
    public void setTDescServ(float value) {
        this.tDescServ = value;
    }

    /**
     * Obtiene el valor de la propiedad totalC.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotalC() {
        return totalC;
    }

    /**
     * Define el valor de la propiedad totalC.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTotalC(Float value) {
        this.totalC = value;
    }

    /**
     * Obtiene el valor de la propiedad totalEi.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotalEi() {
        return totalEi;
    }

    /**
     * Define el valor de la propiedad totalEi.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTotalEi(Float value) {
        this.totalEi = value;
    }

    /**
     * Obtiene el valor de la propiedad totalEl.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotalEl() {
        return totalEl;
    }

    /**
     * Define el valor de la propiedad totalEl.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTotalEl(Float value) {
        this.totalEl = value;
    }

    /**
     * Obtiene el valor de la propiedad totalP.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotalP() {
        return totalP;
    }

    /**
     * Define el valor de la propiedad totalP.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTotalP(Float value) {
        this.totalP = value;
    }

    /**
     * Obtiene el valor de la propiedad totalS.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotalS() {
        return totalS;
    }

    /**
     * Define el valor de la propiedad totalS.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTotalS(Float value) {
        this.totalS = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioOv.
     * 
     */
    public int getUsuarioOv() {
        return usuarioOv;
    }

    /**
     * Define el valor de la propiedad usuarioOv.
     * 
     */
    public void setUsuarioOv(int value) {
        this.usuarioOv = value;
    }

}
