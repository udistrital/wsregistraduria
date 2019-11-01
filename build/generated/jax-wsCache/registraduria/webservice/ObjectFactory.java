
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Ip_QNAME = new QName("http://ws.ani.rnec.gov.co/", "ip");
    private final static QName _ConsultarCedulas_QNAME = new QName("http://ws.ani.rnec.gov.co/", "consultarCedulas");
    private final static QName _CambiarContrasena_QNAME = new QName("http://ws.ani.rnec.gov.co/", "cambiarContrasena");
    private final static QName _CambiarContrasenaResponse_QNAME = new QName("http://ws.ani.rnec.gov.co/", "cambiarContrasenaResponse");
    private final static QName _ConsultarCedulasResponse_QNAME = new QName("http://ws.ani.rnec.gov.co/", "consultarCedulasResponse");
    private final static QName _Contrasena_QNAME = new QName("http://ws.ani.rnec.gov.co/", "contrasena");
    private final static QName _Usuario_QNAME = new QName("http://ws.ani.rnec.gov.co/", "usuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarCedulas }
     * 
     */
    public ConsultarCedulas createConsultarCedulas() {
        return new ConsultarCedulas();
    }

    /**
     * Create an instance of {@link CambiarContrasena }
     * 
     */
    public CambiarContrasena createCambiarContrasena() {
        return new CambiarContrasena();
    }

    /**
     * Create an instance of {@link ConsultarCedulasResponse }
     * 
     */
    public ConsultarCedulasResponse createConsultarCedulasResponse() {
        return new ConsultarCedulasResponse();
    }

    /**
     * Create an instance of {@link CambiarContrasenaResponse }
     * 
     */
    public CambiarContrasenaResponse createCambiarContrasenaResponse() {
        return new CambiarContrasenaResponse();
    }

    /**
     * Create an instance of {@link CambioClaveRequest }
     * 
     */
    public CambioClaveRequest createCambioClaveRequest() {
        return new CambioClaveRequest();
    }

    /**
     * Create an instance of {@link CambioClaveResponse }
     * 
     */
    public CambioClaveResponse createCambioClaveResponse() {
        return new CambioClaveResponse();
    }

    /**
     * Create an instance of {@link CedulasResponse }
     * 
     */
    public CedulasResponse createCedulasResponse() {
        return new CedulasResponse();
    }

    /**
     * Create an instance of {@link Datos }
     * 
     */
    public Datos createDatos() {
        return new Datos();
    }

    /**
     * Create an instance of {@link EstadoConsulta }
     * 
     */
    public EstadoConsulta createEstadoConsulta() {
        return new EstadoConsulta();
    }

    /**
     * Create an instance of {@link DatosCedulas }
     * 
     */
    public DatosCedulas createDatosCedulas() {
        return new DatosCedulas();
    }

    /**
     * Create an instance of {@link EstadoCambioClave }
     * 
     */
    public EstadoCambioClave createEstadoCambioClave() {
        return new EstadoCambioClave();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ani.rnec.gov.co/", name = "ip")
    public JAXBElement<String> createIp(String value) {
        return new JAXBElement<String>(_Ip_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCedulas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ani.rnec.gov.co/", name = "consultarCedulas")
    public JAXBElement<ConsultarCedulas> createConsultarCedulas(ConsultarCedulas value) {
        return new JAXBElement<ConsultarCedulas>(_ConsultarCedulas_QNAME, ConsultarCedulas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarContrasena }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ani.rnec.gov.co/", name = "cambiarContrasena")
    public JAXBElement<CambiarContrasena> createCambiarContrasena(CambiarContrasena value) {
        return new JAXBElement<CambiarContrasena>(_CambiarContrasena_QNAME, CambiarContrasena.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarContrasenaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ani.rnec.gov.co/", name = "cambiarContrasenaResponse")
    public JAXBElement<CambiarContrasenaResponse> createCambiarContrasenaResponse(CambiarContrasenaResponse value) {
        return new JAXBElement<CambiarContrasenaResponse>(_CambiarContrasenaResponse_QNAME, CambiarContrasenaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCedulasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ani.rnec.gov.co/", name = "consultarCedulasResponse")
    public JAXBElement<ConsultarCedulasResponse> createConsultarCedulasResponse(ConsultarCedulasResponse value) {
        return new JAXBElement<ConsultarCedulasResponse>(_ConsultarCedulasResponse_QNAME, ConsultarCedulasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ani.rnec.gov.co/", name = "contrasena")
    public JAXBElement<String> createContrasena(String value) {
        return new JAXBElement<String>(_Contrasena_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ani.rnec.gov.co/", name = "usuario")
    public JAXBElement<String> createUsuario(String value) {
        return new JAXBElement<String>(_Usuario_QNAME, String.class, null, value);
    }

}
