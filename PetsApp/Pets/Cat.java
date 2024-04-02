package Pets;

import java.util.Date;
import java.util.ArrayList;

public class Cat extends Pet{
    public Cat(String name, Date birthday, ArrayList<String> cmdList) {
        super(name, birthday,cmdList);
    }

    public void toMeow() {
        System.out.println("Meow Meow Meow");
    }

    @Override
    public void toDo() {
        toMeow();
    }

    @Override
    public boolean leaningCommand(String cmd) {
        var list = super.getCmdList();
        list.add(cmd);
        super.setCmdList(list);
        return true;
    }

    @Override
    public ArrayList<String> getAnimalCmdList() {
        return super.getCmdList();
    }
}
