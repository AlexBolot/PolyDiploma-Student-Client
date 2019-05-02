package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaAlumPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;

public class Exit extends Command<PolydiplomaAlumPublicAPI> {

    @Override
    public String identifier() { return "exit"; }

    @Override
    public void execute() { }

    @Override
    public String describe() {
        return "Quitter Polydiploma";
    }

    @Override
    public boolean shouldContinue() { return false; }

}
