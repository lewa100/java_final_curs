package Domain.Pets;

import java.util.Date;
import Domain.Pet;

public class Dog extends Pet{
    public Dog(String name, Date birthday, String sex, String[] cmdList, String address) {
        super(name, birthday,sex,cmdList, address);
    }

    public void toBark() {
        System.out.println("Wowf Wowf Wowf");
    }
}
