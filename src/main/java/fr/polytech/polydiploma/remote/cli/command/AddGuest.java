package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaAlumPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;

import java.util.List;

public class AddGuest extends Command<PolydiplomaAlumPublicAPI> {

    private String email;
    private String guestFirstname;
    private String guestLastname;

    @Override
    public String identifier() {
        return "ajouter_invité";
    }

    @Override
    public void execute() {
        boolean success = shell.system.alum.addGuest(email, guestFirstname, guestLastname);

        if (success)
            log(guestFirstname + " " + guestLastname + " a bien été ajouté à vos invités");
        else
            log("Erreur lors de l'ajout d'un invité !");
    }

    @Override
    public void load(List<String> args) {
        email = args.get(0);
        guestFirstname = args.get(1);
        guestLastname = args.get(2);
    }

    @Override
    public String describe() {
        return "Permet d'inscrire un invité supplémentaire (ajouter_invité EMAIL_DIPLOMÉ PRENOM_INVITÉ NOM_INVITÉ)";
    }
}
