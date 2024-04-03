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
    public void addPet(Pet pet) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addPet'");
    }

    @Override
    public void getCmdListByID(int id) {
        super.getCmdList();
    }

    @Override
    public void addCmdInList(int id, String cmdList) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addCmdInList'");
    }
}
