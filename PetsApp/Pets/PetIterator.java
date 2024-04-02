package Pets;

import java.util.Iterator;
import java.util.List;

import Nursery.PetGenerator;

public class PetIterator implements Iterator<PetGenerator> {
    private int counter;
    private final List<PetGenerator> pets;
    
    public PetIterator(List<PetGenerator> pets) {
        this.pets = pets;
        this.counter = 0;
    }
    
    @Override
    public boolean hasNext() {
       return counter<pets.size();
    }
    @Override
    public PetGenerator next() {
        if(!hasNext())
        {
            return null;
        }
        //counter++;
        return pets.get(counter++);        
    }
    
}
