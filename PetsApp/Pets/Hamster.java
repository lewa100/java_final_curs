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
    public void getCmdListByID(int id) {
        super.getCmdList();
    }

    @Override
    public void addPet(Pet pet) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addPet'");
    }

    @Override
    public void addCmdInList(int id, String cmdList) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addCmdInList'");
    }
}
