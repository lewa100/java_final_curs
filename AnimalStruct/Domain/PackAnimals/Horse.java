package Domain.PackAnimals;

import java.sql.Date;
import Domain.PackAnimal;

public class Horse extends PackAnimal{
    public Horse(String name, Date birthday, String sex, String[] cmdList, String address) {
        super(name, birthday,sex,cmdList);
    }

    public void toRide() {
        System.out.println("Cock Cock Cock");
    }
}
