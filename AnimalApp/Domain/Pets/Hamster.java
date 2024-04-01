package Domain.Pets;

import java.util.Date;
import Domain.Pet;

public class Hamster extends Pet{
    public Hamster(String name, Date birthday, String sex, String[] cmdList, String address) {
        super(name, birthday,sex,cmdList, address);
    }

    public void toStockedUp() {
        System.out.println("Hrum Hrum Hrum");
    }
}
