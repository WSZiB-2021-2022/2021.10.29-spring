package pl.edu.wszib.contexty.db;

import org.springframework.stereotype.Component;

@Component
public class Database2 implements IDatabase {

    @Override
    public void loadData() {
        System.out.println("Pobieram dane inaczej niż db1 !!");
    }
}
