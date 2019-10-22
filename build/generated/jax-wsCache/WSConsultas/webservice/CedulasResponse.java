
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cedulasResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cedulasResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estadoConsulta" type="{http://ws.ani.rnec.gov.co/}estadoConsulta" minOccurs="0"/>
 *         &lt;element name="datosCedulas" type="{http://ws.ani.rnec.gov.co/}datosCedulas" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cedulasResponse", propOrder = {
    "estadoConsulta",
    "datosCedulas"
})
public class CedulasResponse {

    protected EstadoConsulta estadoConsulta;
    protected DatosCedulas datosCedulas;

    /**
     * Obtiene el valor de la propiedad estadoConsulta.
     * 
     * @return
     *     possible object is
     *     {@link EstadoConsulta }
     *     
     */
    public EstadoConsulta getEstadoConsulta() {
        return estadoConsulta;
    }

    /**
     * Define el valor de la propiedad estadoConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoConsulta }
     *     
     */
    public void setEstadoConsulta(EstadoConsulta value) {
        this.estadoConsulta = value;
    }

    /**
     * Obtiene el valor de la propiedad datosCedulas.
     * 
     * @return
     *     possible object is
     *     {@link DatosCedulas }
     *     
     */
    public DatosCedulas getDatosCedulas() {
        return datosCedulas;
    }

    /**
     * Define el valor de la propiedad datosCedulas.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosCedulas }
     *     
     */
    public void setDatosCedulas(DatosCedulas value) {
        this.datosCedulas = value;
    }

}
