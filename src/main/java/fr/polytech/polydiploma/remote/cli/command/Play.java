package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaAlumPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class Play extends Command<PolydiplomaAlumPublicAPI> {

    private String fileName;

    @Override
    public String identifier() { return "play"; }

    @Override
    public void execute() throws Exception {
        InputStream stream = new FileInputStream(new File(fileName));
        shell.run(stream, true, 2);
    }

    @Override
    public void load(List<String> args) { fileName = args.get(0); }

    @Override
    public String describe() {
        return "Execute les commandes dans un fichier (play NOM_DE_FICHIER)";
    }

}
