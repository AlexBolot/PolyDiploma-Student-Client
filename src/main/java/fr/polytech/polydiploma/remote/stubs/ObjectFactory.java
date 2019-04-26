
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

    private final static QName _AddGuest_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/alum", "addGuest");
    private final static QName _AddGuestResponse_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/alum", "addGuestResponse");
    private final static QName _ConfirmAttendance_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/alum", "confirmAttendance");
    private final static QName _ConfirmAttendanceResponse_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/alum", "confirmAttendanceResponse");
    private final static QName _PayBalance_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/alum", "payBalance");
    private final static QName _PayBalanceResponse_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/alum", "payBalanceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.polytech.polydiploma.remote.stubs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddGuest }
     * 
     */
    public AddGuest createAddGuest() {
        return new AddGuest();
    }

    /**
     * Create an instance of {@link AddGuestResponse }
     * 
     */
    public AddGuestResponse createAddGuestResponse() {
        return new AddGuestResponse();
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
     * Create an instance of {@link PayBalance }
     * 
     */
    public PayBalance createPayBalance() {
        return new PayBalance();
    }

    /**
     * Create an instance of {@link PayBalanceResponse }
     * 
     */
    public PayBalanceResponse createPayBalanceResponse() {
        return new PayBalanceResponse();
    }

    /**
     * Create an instance of {@link Graduate }
     * 
     */
    public Graduate createGraduate() {
        return new Graduate();
    }

    /**
     * Create an instance of {@link Speaker }
     * 
     */
    public Speaker createSpeaker() {
        return new Speaker();
    }

    /**
     * Create an instance of {@link Guest }
     * 
     */
    public Guest createGuest() {
        return new Guest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGuest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/alum", name = "addGuest")
    public JAXBElement<AddGuest> createAddGuest(AddGuest value) {
        return new JAXBElement<AddGuest>(_AddGuest_QNAME, AddGuest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGuestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/alum", name = "addGuestResponse")
    public JAXBElement<AddGuestResponse> createAddGuestResponse(AddGuestResponse value) {
        return new JAXBElement<AddGuestResponse>(_AddGuestResponse_QNAME, AddGuestResponse.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/alum", name = "payBalance")
    public JAXBElement<PayBalance> createPayBalance(PayBalance value) {
        return new JAXBElement<PayBalance>(_PayBalance_QNAME, PayBalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayBalanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/alum", name = "payBalanceResponse")
    public JAXBElement<PayBalanceResponse> createPayBalanceResponse(PayBalanceResponse value) {
        return new JAXBElement<PayBalanceResponse>(_PayBalanceResponse_QNAME, PayBalanceResponse.class, null, value);
    }

}
