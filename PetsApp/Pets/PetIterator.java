package Pets;

import java.util.Iterator;
import java.util.List;

public class PetIterator implements Iterator<Pet> {
    private int counter;
    private final List<Pet> pets;
    
    public PetIterator(List<Pet> pets) {
        this.pets = pets;
        this.counter = 0;
    }
    
    @Override
    public boolean hasNext() {
       return counter<pets.size();
    }
    @Override
    public Pet next() {
        if(!hasNext())
        {
            return null;
        }
        //counter++;
        return pets.get(counter++);        
    }
    
}
