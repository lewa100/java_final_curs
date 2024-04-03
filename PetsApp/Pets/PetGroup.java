package Pets;

import java.util.Iterator;
import java.util.List;

import java.util.ArrayList;

public class PetGroup implements Iterable<Pet>{
    private List<Pet> petList;

    public PetGroup(){
        this.petList = new ArrayList<>();
    }

    public void addPet(Pet pet){
        petList.add(pet);
    }

    public List<Pet> getPetList() {
        return petList;
    }


    @Override
    public Iterator<Pet> iterator() {
        return (Iterator<Pet>) new PetIterator(petList);
    } 

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Pet p : petList) {
            str.append(p.getClass().getSimpleName()+" [id = " +p.getID() + ", name=" + p.getName() + ", birthday=" + p.getBirthday() + ", command List=" + p.getCmdList() + "]\n");
        }
        return str.toString();
    }
}