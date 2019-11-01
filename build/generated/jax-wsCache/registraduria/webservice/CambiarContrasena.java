
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cambiarContrasena complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cambiarContrasena">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cambioClaveRequest" type="{http://ws.ani.rnec.gov.co/}cambioClaveRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cambiarContrasena", propOrder = {
    "cambioClaveRequest"
})
public class CambiarContrasena {

    protected CambioClaveRequest cambioClaveRequest;

    /**
     * Obtiene el valor de la propiedad cambioClaveRequest.
     * 
     * @return
     *     possible object is
     *     {@link CambioClaveRequest }
     *     
     */
    public CambioClaveRequest getCambioClaveRequest() {
        return cambioClaveRequest;
    }

    /**
     * Define el valor de la propiedad cambioClaveRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CambioClaveRequest }
     *     
     */
    public void setCambioClaveRequest(CambioClaveRequest value) {
        this.cambioClaveRequest = value;
    }

}
