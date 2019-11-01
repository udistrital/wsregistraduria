
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para estadoConsulta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="estadoConsulta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroControl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHoraConsulta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estadoConsulta", propOrder = {
    "numeroControl",
    "codError",
    "descripcionError",
    "fechaHoraConsulta"
})
public class EstadoConsulta {

    protected String numeroControl;
    protected String codError;
    protected String descripcionError;
    protected String fechaHoraConsulta;

    /**
     * Obtiene el valor de la propiedad numeroControl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroControl() {
        return numeroControl;
    }

    /**
     * Define el valor de la propiedad numeroControl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroControl(String value) {
        this.numeroControl = value;
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
     * Obtiene el valor de la propiedad descripcionError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionError() {
        return descripcionError;
    }

    /**
     * Define el valor de la propiedad descripcionError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionError(String value) {
        this.descripcionError = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraConsulta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaHoraConsulta() {
        return fechaHoraConsulta;
    }

    /**
     * Define el valor de la propiedad fechaHoraConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaHoraConsulta(String value) {
        this.fechaHoraConsulta = value;
    }

}
