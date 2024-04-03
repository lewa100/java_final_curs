package Service;
import java.util.ArrayList;
import java.util.List;
import Pets.*;

public final class AnimalDB implements iAnimalDB {
    private PetGroup group;

    public AnimalDB() {
        this.group = new PetGroup();
    }

    public void addPet(Pet pet){
        group.addPet(pet);
    }

    public List<Pet> getPetList() {
        return group.getPetList();
    }

    public ArrayList<String> getCommandListByID(int id) throws Exception {
        var pets = group.getPetList();  
        for (Pet pet : pets) {
            if (pet.getID() == id){
                return pet.getCmdList();
            }
        }
        throw new Exception("Нет питомца с данным ID");
    }

    public void addCommandInListByID(int id, String cmd) throws Exception {
        var pets = group.getPetList();  
        for (Pet pet : pets) {
            if (pet.getID() == id){
                pet.addCmdInList(cmd);
                return;
            }
        }
        throw new Exception("Нет питомца с данным ID");
    }

    @Override
    public String toString() {
        return group.toString();
    }

    @Override
    public void toDo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'open'");
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    @Override
    public String getBirthday() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBirthday'");
    }

    @Override
    public int getID() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getID'");
    }

    @Override
    public void getCmdListByID(int id) throws Exception{
        System.out.println("Питомец знает команды: " + getCommandListByID(id));
    }

    @Override
    public void addCmdInList(int id, String cmdList) throws Exception {
        try {
            addCommandInListByID(id, cmdList);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
    }
}
