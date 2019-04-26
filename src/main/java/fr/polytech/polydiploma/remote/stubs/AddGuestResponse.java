
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour addGuestResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="addGuestResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="guest_added" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addGuestResponse", propOrder = {
    "guestAdded"
})
public class AddGuestResponse {

    @XmlElement(name = "guest_added")
    protected boolean guestAdded;

    /**
     * Obtient la valeur de la propriété guestAdded.
     * 
     */
    public boolean isGuestAdded() {
        return guestAdded;
    }

    /**
     * Définit la valeur de la propriété guestAdded.
     * 
     */
    public void setGuestAdded(boolean value) {
        this.guestAdded = value;
    }

}
