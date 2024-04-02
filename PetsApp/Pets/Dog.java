package Pets;

import java.util.Date;
import java.util.ArrayList;

public class Dog extends Pet{
    public Dog(String name, Date birthday, ArrayList<String> cmdList) {
        super(name, birthday,cmdList);
    }

    public void toBark() {
        System.out.println("Wowf Wowf Wowf");
    }

    @Override
    public void toDo() {
        toBark();
    }

    @Override
    public boolean leaningCommand(String cmd) {
        var list = super.getCmdList();
        list.add(cmd);
        super.setCmdList(list);
        return true;
    }

    @Override
    public ArrayList<String>  getAnimalCmdList() {
        return super.getCmdList();
    }
}
