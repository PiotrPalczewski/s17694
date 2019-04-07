package Repo;

import Uzytkownik.Uzytkownik;

public interface UserRepo {

    Uzytkownik getUserByName (String name);
    void add (Uzytkownik uzytkownik);
    int count();

}
