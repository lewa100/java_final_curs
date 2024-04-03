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
