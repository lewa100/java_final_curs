package Pets;

import java.util.Date;

import java.util.ArrayList;

public class Hamster extends Pet{
    public Hamster(String name, Date birthday, ArrayList<String>  cmdList) {
        super(name, birthday,cmdList);
    }

    public void toStockedUp() {
        System.out.println("Hrum Hrum Hrum");
    }

    @Override
    public void toDo() {
        toStockedUp();
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
