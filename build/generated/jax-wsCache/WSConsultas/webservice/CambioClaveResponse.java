
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cambioClaveResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cambioClaveResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estadoCambioClave" type="{http://ws.ani.rnec.gov.co/}estadoCambioClave" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cambioClaveResponse", propOrder = {
    "estadoCambioClave"
})
public class CambioClaveResponse {

    protected EstadoCambioClave estadoCambioClave;

    /**
     * Obtiene el valor de la propiedad estadoCambioClave.
     * 
     * @return
     *     possible object is
     *     {@link EstadoCambioClave }
     *     
     */
    public EstadoCambioClave getEstadoCambioClave() {
        return estadoCambioClave;
    }

    /**
     * Define el valor de la propiedad estadoCambioClave.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoCambioClave }
     *     
     */
    public void setEstadoCambioClave(EstadoCambioClave value) {
        this.estadoCambioClave = value;
    }

}
