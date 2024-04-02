package Pets;

import java.util.Iterator;
import java.util.List;

import Nursery.PetGenerator;

import java.util.ArrayList;

public class PetGroup implements Iterable<PetGenerator>{
    private List<PetGenerator> petList;

    public PetGroup(){
        this.petList = new ArrayList<>();
    }

    public void addPet(PetGenerator pet){
        petList.add(pet);
    }

    public List<PetGenerator> getPetList() {
        return petList;
    }

    @Override
    public Iterator<PetGenerator> iterator() {
        return (Iterator<PetGenerator>) new PetIterator(petList);
    } 

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (PetGenerator petGenerator : petList) {
            str.append("Pet [id = " +petGenerator.getID() + ", name=" + petGenerator.getName() + ", birthday=" + petGenerator.getBirthday() + ", command List=" + petGenerator.getCMDList() + "]\n");
        }
        return str.toString();
    }
}