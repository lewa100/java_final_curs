package Domain.PackAnimals;

import java.sql.Date;
import Domain.PackAnimal;

public class Camel extends PackAnimal{
    public Camel(String name, Date birthday, String sex, String[] cmdList, String address) {
        super(name, birthday,sex,cmdList);
    }

    public void toSplits() {
        System.out.println("----, ----,----");
    }
}
