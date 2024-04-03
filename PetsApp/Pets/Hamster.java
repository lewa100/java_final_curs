package Pets;

import java.util.Date;

import java.util.ArrayList;

public class Hamster extends Pet{
    public Hamster(int id,String name, Date birthday, ArrayList<String>  cmdList) {
        super(id,name, birthday,cmdList);
    }

    public void toStockedUp() {
        System.out.println("Hrum Hrum Hrum");
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
