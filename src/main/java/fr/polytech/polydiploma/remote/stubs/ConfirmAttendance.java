
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour confirmAttendance complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="confirmAttendance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="graduate" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/alum}graduate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmAttendance", propOrder = {
    "graduate"
})
public class ConfirmAttendance {

    protected Graduate graduate;

    /**
     * Obtient la valeur de la propriété graduate.
     * 
     * @return
     *     possible object is
     *     {@link Graduate }
     *     
     */
    public Graduate getGraduate() {
        return graduate;
    }

    /**
     * Définit la valeur de la propriété graduate.
     * 
     * @param value
     *     allowed object is
     *     {@link Graduate }
     *     
     */
    public void setGraduate(Graduate value) {
        this.graduate = value;
    }

}
