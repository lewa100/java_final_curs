package Nursery;

import Pets.Dog;
import Service.iAnimalDB;

public class GetDog extends PetGenerator{

    @Override
    public iAnimalDB createItem() {
        return (iAnimalDB) new Dog("D1", null, null);
    }

} 