package fr.polytech.polydiploma.remote.api;

import fr.polytech.polydiploma.remote.stubs.AlumWebService;
import fr.polytech.polydiploma.remote.stubs.AlumWebServiceImplService;

import javax.xml.ws.BindingProvider;
import java.net.URL;

public class PolydiplomaAlumPublicAPI {

    public AlumWebService alum;

    public PolydiplomaAlumPublicAPI(String host, String port) {
        initOrganisation(host, port);
    }

    private void initOrganisation(String host, String port) {
        URL wsdlLocation = PolydiplomaAlumPublicAPI.class.getResource("/AlumWS.wsdl");
        AlumWebServiceImplService factory = new AlumWebServiceImplService(wsdlLocation);
        this.alum = factory.getAlumWebServiceImplPort();
        String address = "http://" + host + ":" + port + "/polydiploma-backend/webservices/AlumWS";
        ((BindingProvider) alum).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
    }

}
