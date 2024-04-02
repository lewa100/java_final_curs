package Nursery;

import Service.iAnimalDB;
import java.util.ArrayList;

public abstract class PetGenerator{
    public void startToDo(){
        iAnimalDB item = createItem();
        item.toDo();
    }

    public int getID(){
        iAnimalDB item = createItem();
        return item.getID();
    }

    public String getName(){
        iAnimalDB item = createItem();
        return item.getName();
    }

    public String getBirthday() {
        iAnimalDB item = createItem();
        return item.getBirthday();
    }

    public ArrayList<String> getCMDList() {
        iAnimalDB item = createItem();
        return item.getAnimalCmdList();
    }

    public abstract iAnimalDB createItem();    
    
}
