package Service;

import Pets.Pet;

public interface iAnimalDB {
    int getID();
    void toDo();
    String getName();
    String getBirthday();
    void addPet(Pet pet);
    void getCmdListByID(int id) throws Exception;
    void addCmdInList(int id,String cmdList) throws Exception;
}
