package Domain.PackAnimals;

import java.sql.Date;
import Domain.PackAnimal;

public class Donkey extends PackAnimal{
    public Donkey(String name, Date birthday, String sex, String[] cmdList, String address) {
        super(name, birthday,sex,cmdList);
    }

    public void toBraying() {
        System.out.println("Bray Bray Bray");
    }
}
