
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour distinction.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="distinction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MAJOR"/&gt;
 *     &lt;enumeration value="HONOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "distinction")
@XmlEnum
public enum Distinction {

    MAJOR,
    HONOR;

    public String value() {
        return name();
    }

    public static Distinction fromValue(String v) {
        return valueOf(v);
    }

}
