package pl.edu.wszib.contexty.gui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.edu.wszib.contexty.db.Database;
import pl.edu.wszib.contexty.db.Database2;
import pl.edu.wszib.contexty.db.IDatabase;

@Component
public class GUI {

    @Autowired
    IDatabase database;

    public void startProgram() {
        System.out.println("Startuję !!!");
        this.database.loadData();
    }
}
