package fr.polytech.polydiploma.remote.stubs;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2019-03-21T19:03:13.521+01:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/alum", name = "AlumWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface AlumWebService {

    @WebMethod
    @RequestWrapper(localName = "confirmAttendance", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/alum", className = "fr.polytech.polydiploma.remote.stubs.ConfirmAttendance")
    @ResponseWrapper(localName = "confirmAttendanceResponse", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/alum", className = "fr.polytech.polydiploma.remote.stubs.ConfirmAttendanceResponse")
    public void confirmAttendance(
        @WebParam(name = "graduate", targetNamespace = "")
        fr.polytech.polydiploma.remote.stubs.Graduate graduate
    );
}
