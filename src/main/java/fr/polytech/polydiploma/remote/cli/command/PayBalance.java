package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaAlumPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;

import java.util.List;

public class PayBalance extends Command<PolydiplomaAlumPublicAPI> {

    private String email;
    private String extraData;

    @Override
    public String identifier() {
        return "payer";
    }

    @Override
    public void execute() {
        shell.system.alum.payBalance(email, extraData);
    }

    @Override
    public void load(List<String> args) {
        email = args.get(0);
        extraData = args.get(1);
    }

    @Override
    public String describe() {
        return "Permet de payer son solde (payer EMAIL_DIPLOMÉ DONNÉES_BANCAIRES)";
    }
}
