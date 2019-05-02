package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaAlumPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;
import fr.polytech.polydiploma.remote.stubs.Graduate;

import java.util.List;

public class Confirm extends Command<PolydiplomaAlumPublicAPI> {

    private String firstname;
    private String lastname;
    private String mail;

    @Override
    public String identifier() {
        return "confirmer_venue";
    }

    @Override
    public void execute() {
        Graduate graduate = new Graduate();
        graduate.setFirstname(firstname);
        graduate.setLastname(lastname);
        graduate.setMail(mail);

        boolean success = shell.system.alum.confirmAttendance(graduate);

        if (success)
            log("Confirmation bien enregistrée");
        else
            log("Erreur lors de l'enregistrement de la confirmation !");
    }

    @Override
    public void load(List<String> args) {
        firstname = args.get(0);
        lastname = args.get(1);
        mail = args.get(2);
    }

    @Override
    public String describe() {
        return "Confirme la participation d'un étudiant diplômé (confirmer_venue PRENOM NOM EMAIL)";
    }
}
