
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour payBalanceResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="payBalanceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount_paid" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payBalanceResponse", propOrder = {
    "amountPaid"
})
public class PayBalanceResponse {

    @XmlElement(name = "amount_paid")
    protected double amountPaid;

    /**
     * Obtient la valeur de la propriété amountPaid.
     * 
     */
    public double getAmountPaid() {
        return amountPaid;
    }

    /**
     * Définit la valeur de la propriété amountPaid.
     * 
     */
    public void setAmountPaid(double value) {
        this.amountPaid = value;
    }

}
