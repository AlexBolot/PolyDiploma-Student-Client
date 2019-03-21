
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.polytech.polydiploma.remote.stubs package. 
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

    private final static QName _ConfirmAttendance_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/alum", "confirmAttendance");
    private final static QName _ConfirmAttendanceResponse_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/alum", "confirmAttendanceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.polytech.polydiploma.remote.stubs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConfirmAttendance }
     * 
     */
    public ConfirmAttendance createConfirmAttendance() {
        return new ConfirmAttendance();
    }

    /**
     * Create an instance of {@link ConfirmAttendanceResponse }
     * 
     */
    public ConfirmAttendanceResponse createConfirmAttendanceResponse() {
        return new ConfirmAttendanceResponse();
    }

    /**
     * Create an instance of {@link Graduate }
     * 
     */
    public Graduate createGraduate() {
        return new Graduate();
    }

    /**
     * Create an instance of {@link Expected }
     * 
     */
    public Expected createExpected() {
        return new Expected();
    }

    /**
     * Create an instance of {@link Guest }
     * 
     */
    public Guest createGuest() {
        return new Guest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmAttendance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/alum", name = "confirmAttendance")
    public JAXBElement<ConfirmAttendance> createConfirmAttendance(ConfirmAttendance value) {
        return new JAXBElement<ConfirmAttendance>(_ConfirmAttendance_QNAME, ConfirmAttendance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmAttendanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/alum", name = "confirmAttendanceResponse")
    public JAXBElement<ConfirmAttendanceResponse> createConfirmAttendanceResponse(ConfirmAttendanceResponse value) {
        return new JAXBElement<ConfirmAttendanceResponse>(_ConfirmAttendanceResponse_QNAME, ConfirmAttendanceResponse.class, null, value);
    }

}
