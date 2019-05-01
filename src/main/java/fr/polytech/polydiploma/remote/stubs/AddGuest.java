
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour addGuest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="addGuest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guestFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guestLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addGuest", propOrder = {
    "email",
    "guestFirstName",
    "guestLastName"
})
public class AddGuest {

    protected String email;
    protected String guestFirstName;
    protected String guestLastName;

    /**
     * Obtient la valeur de la propriété email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Définit la valeur de la propriété email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtient la valeur de la propriété guestFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestFirstName() {
        return guestFirstName;
    }

    /**
     * Définit la valeur de la propriété guestFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestFirstName(String value) {
        this.guestFirstName = value;
    }

    /**
     * Obtient la valeur de la propriété guestLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestLastName() {
        return guestLastName;
    }

    /**
     * Définit la valeur de la propriété guestLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestLastName(String value) {
        this.guestLastName = value;
    }

}
