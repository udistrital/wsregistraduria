
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nuip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="particula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="municipioExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departamentoExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoCedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numResolucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anoResolucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lugarNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="informante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDefuncion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lugarNovedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lugarPreparacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grupoSanguineo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaAfectacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datos", propOrder = {
    "nuip",
    "codError",
    "primerApellido",
    "particula",
    "segundoApellido",
    "primerNombre",
    "segundoNombre",
    "municipioExpedicion",
    "departamentoExpedicion",
    "fechaExpedicion",
    "estadoCedula",
    "numResolucion",
    "anoResolucion",
    "genero",
    "fechaNacimiento",
    "lugarNacimiento",
    "informante",
    "serial",
    "fechaDefuncion",
    "lugarNovedad",
    "lugarPreparacion",
    "grupoSanguineo",
    "estatura",
    "fechaReferencia",
    "fechaAfectacion"
})
public class Datos {

    protected String nuip;
    protected String codError;
    protected String primerApellido;
    protected String particula;
    protected String segundoApellido;
    protected String primerNombre;
    protected String segundoNombre;
    protected String municipioExpedicion;
    protected String departamentoExpedicion;
    protected String fechaExpedicion;
    protected String estadoCedula;
    protected String numResolucion;
    protected String anoResolucion;
    protected String genero;
    protected String fechaNacimiento;
    protected String lugarNacimiento;
    protected String informante;
    protected String serial;
    protected String fechaDefuncion;
    protected String lugarNovedad;
    protected String lugarPreparacion;
    protected String grupoSanguineo;
    protected String estatura;
    protected String fechaReferencia;
    protected String fechaAfectacion;

    /**
     * Obtiene el valor de la propiedad nuip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuip() {
        return nuip;
    }

    /**
     * Define el valor de la propiedad nuip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuip(String value) {
        this.nuip = value;
    }

    /**
     * Obtiene el valor de la propiedad codError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodError() {
        return codError;
    }

    /**
     * Define el valor de la propiedad codError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodError(String value) {
        this.codError = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Define el valor de la propiedad primerApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellido(String value) {
        this.primerApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad particula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticula() {
        return particula;
    }

    /**
     * Define el valor de la propiedad particula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticula(String value) {
        this.particula = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * Define el valor de la propiedad segundoApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellido(String value) {
        this.segundoApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad primerNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * Define el valor de la propiedad primerNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerNombre(String value) {
        this.primerNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * Define el valor de la propiedad segundoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoNombre(String value) {
        this.segundoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad municipioExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioExpedicion() {
        return municipioExpedicion;
    }

    /**
     * Define el valor de la propiedad municipioExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioExpedicion(String value) {
        this.municipioExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad departamentoExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamentoExpedicion() {
        return departamentoExpedicion;
    }

    /**
     * Define el valor de la propiedad departamentoExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamentoExpedicion(String value) {
        this.departamentoExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Define el valor de la propiedad fechaExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicion(String value) {
        this.fechaExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoCedula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCedula() {
        return estadoCedula;
    }

    /**
     * Define el valor de la propiedad estadoCedula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCedula(String value) {
        this.estadoCedula = value;
    }

    /**
     * Obtiene el valor de la propiedad numResolucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumResolucion() {
        return numResolucion;
    }

    /**
     * Define el valor de la propiedad numResolucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumResolucion(String value) {
        this.numResolucion = value;
    }

    /**
     * Obtiene el valor de la propiedad anoResolucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnoResolucion() {
        return anoResolucion;
    }

    /**
     * Define el valor de la propiedad anoResolucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnoResolucion(String value) {
        this.anoResolucion = value;
    }

    /**
     * Obtiene el valor de la propiedad genero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Define el valor de la propiedad genero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenero(String value) {
        this.genero = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    /**
     * Define el valor de la propiedad lugarNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarNacimiento(String value) {
        this.lugarNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad informante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformante() {
        return informante;
    }

    /**
     * Define el valor de la propiedad informante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformante(String value) {
        this.informante = value;
    }

    /**
     * Obtiene el valor de la propiedad serial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerial() {
        return serial;
    }

    /**
     * Define el valor de la propiedad serial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerial(String value) {
        this.serial = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDefuncion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDefuncion() {
        return fechaDefuncion;
    }

    /**
     * Define el valor de la propiedad fechaDefuncion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDefuncion(String value) {
        this.fechaDefuncion = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarNovedad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarNovedad() {
        return lugarNovedad;
    }

    /**
     * Define el valor de la propiedad lugarNovedad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarNovedad(String value) {
        this.lugarNovedad = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarPreparacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarPreparacion() {
        return lugarPreparacion;
    }

    /**
     * Define el valor de la propiedad lugarPreparacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarPreparacion(String value) {
        this.lugarPreparacion = value;
    }

    /**
     * Obtiene el valor de la propiedad grupoSanguineo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    /**
     * Define el valor de la propiedad grupoSanguineo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupoSanguineo(String value) {
        this.grupoSanguineo = value;
    }

    /**
     * Obtiene el valor de la propiedad estatura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstatura() {
        return estatura;
    }

    /**
     * Define el valor de la propiedad estatura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstatura(String value) {
        this.estatura = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaReferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaReferencia() {
        return fechaReferencia;
    }

    /**
     * Define el valor de la propiedad fechaReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaReferencia(String value) {
        this.fechaReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAfectacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAfectacion() {
        return fechaAfectacion;
    }

    /**
     * Define el valor de la propiedad fechaAfectacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAfectacion(String value) {
        this.fechaAfectacion = value;
    }

}
