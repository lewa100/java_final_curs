package Service;

import Pets.Pet;

public interface iAnimalDB {
    void addPet(Pet pet);
    void getCmdListByID(int id) throws Exception;
    void addCmdInList(int id,String cmdList) throws Exception;
}
