package Repo;

import java.util.ArrayList;
import java.util.List;

import Uzytkownik.Uzytkownik;

public class DummyRepo implements UserRepo{

    private static List<Uzytkownik> db = new ArrayList<Uzytkownik>();

    @Override
    public Uzytkownik getUserByName(String name) {
        for(Uzytkownik Uzytkownik: db) {
            if(Uzytkownik.getName().equals(name))
                return Uzytkownik;
        }
        return null;
    }

    @Override
    public void add(Uzytkownik uzytkownik) {
        db.add(uzytkownik);
    }

    @Override
    public int count() {
        return db.size();
    }

}
