
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour payBalance complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="payBalance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="graduate" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/alum}graduate" minOccurs="0"/&gt;
 *         &lt;element name="extraData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payBalance", propOrder = {
    "graduate",
    "extraData"
})
public class PayBalance {

    protected Graduate graduate;
    protected String extraData;

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

    /**
     * Obtient la valeur de la propriété extraData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraData() {
        return extraData;
    }

    /**
     * Définit la valeur de la propriété extraData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraData(String value) {
        this.extraData = value;
    }

}
