package pl.edu.wszib.contexty.db;

import org.springframework.stereotype.Component;

public class Database implements IDatabase {

    @Override
    public void loadData() {
        System.out.println("Pobieram dane !!");
    }
}
