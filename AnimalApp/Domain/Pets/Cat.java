package Domain.Pets;

import java.util.Date;
import Domain.Pet;

public class Cat extends Pet{
    public Cat(String name, Date birthday, String sex, String[] cmdList, String address) {
        super(name, birthday,sex,cmdList, address);
    }

    public void toMeow() {
        System.out.println("Meow Meow Meow");
    }
}
