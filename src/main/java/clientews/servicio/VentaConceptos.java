
package clientews.servicio;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ventaConceptos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ventaConceptos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="biradVc" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="contadorVc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="enWorklist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="esBeneficioVc" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estatusVc" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="fechaAsignado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaEdo1e" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaEdo2e" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaEdo3e" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaEdo4e" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaEdo5e" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaEdo6e" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaTransfiereVc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaVentaVc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaAsignado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAnesteciologoVc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idConceptoEs" type="{http://servicio.sga.gm.com.mx/}conceptos" minOccurs="0"/>
 *         &lt;element name="idConceptosBeneficios" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idConvenioVc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idEquipoDicom" type="{http://servicio.sga.gm.com.mx/}equipoDicom" minOccurs="0"/>
 *         &lt;element name="idInstitucion" type="{http://servicio.sga.gm.com.mx/}institucion" minOccurs="0"/>
 *         &lt;element name="idOrdenVenta" type="{http://servicio.sga.gm.com.mx/}ordenVenta" minOccurs="0"/>
 *         &lt;element name="idPacienteVc" type="{http://servicio.sga.gm.com.mx/}pacientes" minOccurs="0"/>
 *         &lt;element name="idPacs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idPersonalMedicoVc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idRadiologoExterno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idSignosvVc" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="idUsuarioVc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idVc" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="interpretacionVc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivoVisitaVc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noTempVc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notaInterpretacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notaRadiologoVc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notaReceta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacionesVc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otrasIndicaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precioVc" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="referenciaVc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salvadoVc" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="temporalVc" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="urgenteVc" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="usuarioEdo1e" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="usuarioEdo2e" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="usuarioEdo3e" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="usuarioEdo4e" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="usuarioEdo5e" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuarioEdo6e" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuarioTransfiereVc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ventaConceptos", propOrder = {
    "biradVc",
    "contadorVc",
    "enWorklist",
    "esBeneficioVc",
    "estado",
    "estatusVc",
    "fechaAsignado",
    "fechaEdo1E",
    "fechaEdo2E",
    "fechaEdo3E",
    "fechaEdo4E",
    "fechaEdo5E",
    "fechaEdo6E",
    "fechaTransfiereVc",
    "fechaVentaVc",
    "horaAsignado",
    "idAnesteciologoVc",
    "idConceptoEs",
    "idConceptosBeneficios",
    "idConvenioVc",
    "idEquipoDicom",
    "idInstitucion",
    "idOrdenVenta",
    "idPacienteVc",
    "idPacs",
    "idPersonalMedicoVc",
    "idRadiologoExterno",
    "idSignosvVc",
    "idUsuarioVc",
    "idVc",
    "interpretacionVc",
    "motivoVisitaVc",
    "noTempVc",
    "notaInterpretacion",
    "notaRadiologoVc",
    "notaReceta",
    "observacionesVc",
    "otrasIndicaciones",
    "precioVc",
    "referenciaVc",
    "salvadoVc",
    "temporalVc",
    "urgenteVc",
    "usuarioEdo1E",
    "usuarioEdo2E",
    "usuarioEdo3E",
    "usuarioEdo4E",
    "usuarioEdo5E",
    "usuarioEdo6E",
    "usuarioTransfiereVc"
})
public class VentaConceptos {

    protected Short biradVc;
    protected Integer contadorVc;
    protected boolean enWorklist;
    protected short esBeneficioVc;
    protected String estado;
    protected short estatusVc;
    protected String fechaAsignado;
    @XmlElement(name = "fechaEdo1e")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEdo1E;
    @XmlElement(name = "fechaEdo2e")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEdo2E;
    @XmlElement(name = "fechaEdo3e")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEdo3E;
    @XmlElement(name = "fechaEdo4e")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEdo4E;
    @XmlElement(name = "fechaEdo5e")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEdo5E;
    @XmlElement(name = "fechaEdo6e")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEdo6E;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaTransfiereVc;
    protected String fechaVentaVc;
    protected String horaAsignado;
    protected Integer idAnesteciologoVc;
    protected Conceptos idConceptoEs;
    protected long idConceptosBeneficios;
    protected int idConvenioVc;
    protected EquipoDicom idEquipoDicom;
    protected Institucion idInstitucion;
    protected OrdenVenta idOrdenVenta;
    protected Pacientes idPacienteVc;
    protected String idPacs;
    protected int idPersonalMedicoVc;
    protected int idRadiologoExterno;
    protected BigInteger idSignosvVc;
    protected int idUsuarioVc;
    protected Long idVc;
    protected String interpretacionVc;
    protected String motivoVisitaVc;
    protected String noTempVc;
    protected String notaInterpretacion;
    protected String notaRadiologoVc;
    protected String notaReceta;
    protected String observacionesVc;
    protected String otrasIndicaciones;
    protected float precioVc;
    protected String referenciaVc;
    protected short salvadoVc;
    protected short temporalVc;
    protected Short urgenteVc;
    @XmlElement(name = "usuarioEdo1e")
    protected Integer usuarioEdo1E;
    @XmlElement(name = "usuarioEdo2e")
    protected Integer usuarioEdo2E;
    @XmlElement(name = "usuarioEdo3e")
    protected Integer usuarioEdo3E;
    @XmlElement(name = "usuarioEdo4e")
    protected Integer usuarioEdo4E;
    @XmlElement(name = "usuarioEdo5e")
    protected String usuarioEdo5E;
    @XmlElement(name = "usuarioEdo6e")
    protected String usuarioEdo6E;
    protected Integer usuarioTransfiereVc;

    /**
     * Obtiene el valor de la propiedad biradVc.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBiradVc() {
        return biradVc;
    }

    /**
     * Define el valor de la propiedad biradVc.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBiradVc(Short value) {
        this.biradVc = value;
    }

    /**
     * Obtiene el valor de la propiedad contadorVc.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContadorVc() {
        return contadorVc;
    }

    /**
     * Define el valor de la propiedad contadorVc.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContadorVc(Integer value) {
        this.contadorVc = value;
    }

    /**
     * Obtiene el valor de la propiedad enWorklist.
     * 
     */
    public boolean isEnWorklist() {
        return enWorklist;
    }

    /**
     * Define el valor de la propiedad enWorklist.
     * 
     */
    public void setEnWorklist(boolean value) {
        this.enWorklist = value;
    }

    /**
     * Obtiene el valor de la propiedad esBeneficioVc.
     * 
     */
    public short getEsBeneficioVc() {
        return esBeneficioVc;
    }

    /**
     * Define el valor de la propiedad esBeneficioVc.
     * 
     */
    public void setEsBeneficioVc(short value) {
        this.esBeneficioVc = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad estatusVc.
     * 
     */
    public short getEstatusVc() {
        return estatusVc;
    }

    /**
     * Define el valor de la propiedad estatusVc.
     * 
     */
    public void setEstatusVc(short value) {
        this.estatusVc = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAsignado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAsignado() {
        return fechaAsignado;
    }

    /**
     * Define el valor de la propiedad fechaAsignado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAsignado(String value) {
        this.fechaAsignado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEdo1E.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEdo1E() {
        return fechaEdo1E;
    }

    /**
     * Define el valor de la propiedad fechaEdo1E.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEdo1E(XMLGregorianCalendar value) {
        this.fechaEdo1E = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEdo2E.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEdo2E() {
        return fechaEdo2E;
    }

    /**
     * Define el valor de la propiedad fechaEdo2E.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEdo2E(XMLGregorianCalendar value) {
        this.fechaEdo2E = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEdo3E.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEdo3E() {
        return fechaEdo3E;
    }

    /**
     * Define el valor de la propiedad fechaEdo3E.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEdo3E(XMLGregorianCalendar value) {
        this.fechaEdo3E = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEdo4E.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEdo4E() {
        return fechaEdo4E;
    }

    /**
     * Define el valor de la propiedad fechaEdo4E.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEdo4E(XMLGregorianCalendar value) {
        this.fechaEdo4E = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEdo5E.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEdo5E() {
        return fechaEdo5E;
    }

    /**
     * Define el valor de la propiedad fechaEdo5E.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEdo5E(XMLGregorianCalendar value) {
        this.fechaEdo5E = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEdo6E.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEdo6E() {
        return fechaEdo6E;
    }

    /**
     * Define el valor de la propiedad fechaEdo6E.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEdo6E(XMLGregorianCalendar value) {
        this.fechaEdo6E = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaTransfiereVc.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaTransfiereVc() {
        return fechaTransfiereVc;
    }

    /**
     * Define el valor de la propiedad fechaTransfiereVc.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaTransfiereVc(XMLGregorianCalendar value) {
        this.fechaTransfiereVc = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVentaVc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVentaVc() {
        return fechaVentaVc;
    }

    /**
     * Define el valor de la propiedad fechaVentaVc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVentaVc(String value) {
        this.fechaVentaVc = value;
    }

    /**
     * Obtiene el valor de la propiedad horaAsignado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraAsignado() {
        return horaAsignado;
    }

    /**
     * Define el valor de la propiedad horaAsignado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraAsignado(String value) {
        this.horaAsignado = value;
    }

    /**
     * Obtiene el valor de la propiedad idAnesteciologoVc.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAnesteciologoVc() {
        return idAnesteciologoVc;
    }

    /**
     * Define el valor de la propiedad idAnesteciologoVc.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAnesteciologoVc(Integer value) {
        this.idAnesteciologoVc = value;
    }

    /**
     * Obtiene el valor de la propiedad idConceptoEs.
     * 
     * @return
     *     possible object is
     *     {@link Conceptos }
     *     
     */
    public Conceptos getIdConceptoEs() {
        return idConceptoEs;
    }

    /**
     * Define el valor de la propiedad idConceptoEs.
     * 
     * @param value
     *     allowed object is
     *     {@link Conceptos }
     *     
     */
    public void setIdConceptoEs(Conceptos value) {
        this.idConceptoEs = value;
    }

    /**
     * Obtiene el valor de la propiedad idConceptosBeneficios.
     * 
     */
    public long getIdConceptosBeneficios() {
        return idConceptosBeneficios;
    }

    /**
     * Define el valor de la propiedad idConceptosBeneficios.
     * 
     */
    public void setIdConceptosBeneficios(long value) {
        this.idConceptosBeneficios = value;
    }

    /**
     * Obtiene el valor de la propiedad idConvenioVc.
     * 
     */
    public int getIdConvenioVc() {
        return idConvenioVc;
    }

    /**
     * Define el valor de la propiedad idConvenioVc.
     * 
     */
    public void setIdConvenioVc(int value) {
        this.idConvenioVc = value;
    }

    /**
     * Obtiene el valor de la propiedad idEquipoDicom.
     * 
     * @return
     *     possible object is
     *     {@link EquipoDicom }
     *     
     */
    public EquipoDicom getIdEquipoDicom() {
        return idEquipoDicom;
    }

    /**
     * Define el valor de la propiedad idEquipoDicom.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipoDicom }
     *     
     */
    public void setIdEquipoDicom(EquipoDicom value) {
        this.idEquipoDicom = value;
    }

    /**
     * Obtiene el valor de la propiedad idInstitucion.
     * 
     * @return
     *     possible object is
     *     {@link Institucion }
     *     
     */
    public Institucion getIdInstitucion() {
        return idInstitucion;
    }

    /**
     * Define el valor de la propiedad idInstitucion.
     * 
     * @param value
     *     allowed object is
     *     {@link Institucion }
     *     
     */
    public void setIdInstitucion(Institucion value) {
        this.idInstitucion = value;
    }

    /**
     * Obtiene el valor de la propiedad idOrdenVenta.
     * 
     * @return
     *     possible object is
     *     {@link OrdenVenta }
     *     
     */
    public OrdenVenta getIdOrdenVenta() {
        return idOrdenVenta;
    }

    /**
     * Define el valor de la propiedad idOrdenVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdenVenta }
     *     
     */
    public void setIdOrdenVenta(OrdenVenta value) {
        this.idOrdenVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad idPacienteVc.
     * 
     * @return
     *     possible object is
     *     {@link Pacientes }
     *     
     */
    public Pacientes getIdPacienteVc() {
        return idPacienteVc;
    }

    /**
     * Define el valor de la propiedad idPacienteVc.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacientes }
     *     
     */
    public void setIdPacienteVc(Pacientes value) {
        this.idPacienteVc = value;
    }

    /**
     * Obtiene el valor de la propiedad idPacs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPacs() {
        return idPacs;
    }

    /**
     * Define el valor de la propiedad idPacs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPacs(String value) {
        this.idPacs = value;
    }

    /**
     * Obtiene el valor de la propiedad idPersonalMedicoVc.
     * 
     */
    public int getIdPersonalMedicoVc() {
        return idPersonalMedicoVc;
    }

    /**
     * Define el valor de la propiedad idPersonalMedicoVc.
     * 
     */
    public void setIdPersonalMedicoVc(int value) {
        this.idPersonalMedicoVc = value;
    }

    /**
     * Obtiene el valor de la propiedad idRadiologoExterno.
     * 
     */
    public int getIdRadiologoExterno() {
        return idRadiologoExterno;
    }

    /**
     * Define el valor de la propiedad idRadiologoExterno.
     * 
     */
    public void setIdRadiologoExterno(int value) {
        this.idRadiologoExterno = value;
    }

    /**
     * Obtiene el valor de la propiedad idSignosvVc.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdSignosvVc() {
        return idSignosvVc;
    }

    /**
     * Define el valor de la propiedad idSignosvVc.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdSignosvVc(BigInteger value) {
        this.idSignosvVc = value;
    }

    /**
     * Obtiene el valor de la propiedad idUsuarioVc.
     * 
     */
    public int getIdUsuarioVc() {
        return idUsuarioVc;
    }

    /**
     * Define el valor de la propiedad idUsuarioVc.
     * 
     */
    public void setIdUsuarioVc(int value) {
        this.idUsuarioVc = value;
    }

    /**
     * Obtiene el valor de la propiedad idVc.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdVc() {
        return idVc;
    }

    /**
     * Define el valor de la propiedad idVc.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdVc(Long value) {
        this.idVc = value;
    }

    /**
     * Obtiene el valor de la propiedad interpretacionVc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterpretacionVc() {
        return interpretacionVc;
    }

    /**
     * Define el valor de la propiedad interpretacionVc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterpretacionVc(String value) {
        this.interpretacionVc = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoVisitaVc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoVisitaVc() {
        return motivoVisitaVc;
    }

    /**
     * Define el valor de la propiedad motivoVisitaVc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoVisitaVc(String value) {
        this.motivoVisitaVc = value;
    }

    /**
     * Obtiene el valor de la propiedad noTempVc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoTempVc() {
        return noTempVc;
    }

    /**
     * Define el valor de la propiedad noTempVc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoTempVc(String value) {
        this.noTempVc = value;
    }

    /**
     * Obtiene el valor de la propiedad notaInterpretacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaInterpretacion() {
        return notaInterpretacion;
    }

    /**
     * Define el valor de la propiedad notaInterpretacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaInterpretacion(String value) {
        this.notaInterpretacion = value;
    }

    /**
     * Obtiene el valor de la propiedad notaRadiologoVc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaRadiologoVc() {
        return notaRadiologoVc;
    }

    /**
     * Define el valor de la propiedad notaRadiologoVc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaRadiologoVc(String value) {
        this.notaRadiologoVc = value;
    }

    /**
     * Obtiene el valor de la propiedad notaReceta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaReceta() {
        return notaReceta;
    }

    /**
     * Define el valor de la propiedad notaReceta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaReceta(String value) {
        this.notaReceta = value;
    }

    /**
     * Obtiene el valor de la propiedad observacionesVc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacionesVc() {
        return observacionesVc;
    }

    /**
     * Define el valor de la propiedad observacionesVc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacionesVc(String value) {
        this.observacionesVc = value;
    }

    /**
     * Obtiene el valor de la propiedad otrasIndicaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtrasIndicaciones() {
        return otrasIndicaciones;
    }

    /**
     * Define el valor de la propiedad otrasIndicaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtrasIndicaciones(String value) {
        this.otrasIndicaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad precioVc.
     * 
     */
    public float getPrecioVc() {
        return precioVc;
    }

    /**
     * Define el valor de la propiedad precioVc.
     * 
     */
    public void setPrecioVc(float value) {
        this.precioVc = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaVc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaVc() {
        return referenciaVc;
    }

    /**
     * Define el valor de la propiedad referenciaVc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaVc(String value) {
        this.referenciaVc = value;
    }

    /**
     * Obtiene el valor de la propiedad salvadoVc.
     * 
     */
    public short getSalvadoVc() {
        return salvadoVc;
    }

    /**
     * Define el valor de la propiedad salvadoVc.
     * 
     */
    public void setSalvadoVc(short value) {
        this.salvadoVc = value;
    }

    /**
     * Obtiene el valor de la propiedad temporalVc.
     * 
     */
    public short getTemporalVc() {
        return temporalVc;
    }

    /**
     * Define el valor de la propiedad temporalVc.
     * 
     */
    public void setTemporalVc(short value) {
        this.temporalVc = value;
    }

    /**
     * Obtiene el valor de la propiedad urgenteVc.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUrgenteVc() {
        return urgenteVc;
    }

    /**
     * Define el valor de la propiedad urgenteVc.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUrgenteVc(Short value) {
        this.urgenteVc = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioEdo1E.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsuarioEdo1E() {
        return usuarioEdo1E;
    }

    /**
     * Define el valor de la propiedad usuarioEdo1E.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsuarioEdo1E(Integer value) {
        this.usuarioEdo1E = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioEdo2E.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsuarioEdo2E() {
        return usuarioEdo2E;
    }

    /**
     * Define el valor de la propiedad usuarioEdo2E.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsuarioEdo2E(Integer value) {
        this.usuarioEdo2E = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioEdo3E.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsuarioEdo3E() {
        return usuarioEdo3E;
    }

    /**
     * Define el valor de la propiedad usuarioEdo3E.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsuarioEdo3E(Integer value) {
        this.usuarioEdo3E = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioEdo4E.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsuarioEdo4E() {
        return usuarioEdo4E;
    }

    /**
     * Define el valor de la propiedad usuarioEdo4E.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsuarioEdo4E(Integer value) {
        this.usuarioEdo4E = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioEdo5E.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioEdo5E() {
        return usuarioEdo5E;
    }

    /**
     * Define el valor de la propiedad usuarioEdo5E.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioEdo5E(String value) {
        this.usuarioEdo5E = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioEdo6E.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioEdo6E() {
        return usuarioEdo6E;
    }

    /**
     * Define el valor de la propiedad usuarioEdo6E.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioEdo6E(String value) {
        this.usuarioEdo6E = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioTransfiereVc.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsuarioTransfiereVc() {
        return usuarioTransfiereVc;
    }

    /**
     * Define el valor de la propiedad usuarioTransfiereVc.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsuarioTransfiereVc(Integer value) {
        this.usuarioTransfiereVc = value;
    }

}
