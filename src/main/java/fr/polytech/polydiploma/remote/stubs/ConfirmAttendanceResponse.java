
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour confirmAttendanceResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="confirmAttendanceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attendance_confirmed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmAttendanceResponse", propOrder = {
    "attendanceConfirmed"
})
public class ConfirmAttendanceResponse {

    @XmlElement(name = "attendance_confirmed")
    protected boolean attendanceConfirmed;

    /**
     * Obtient la valeur de la propriété attendanceConfirmed.
     * 
     */
    public boolean isAttendanceConfirmed() {
        return attendanceConfirmed;
    }

    /**
     * Définit la valeur de la propriété attendanceConfirmed.
     * 
     */
    public void setAttendanceConfirmed(boolean value) {
        this.attendanceConfirmed = value;
    }

}
