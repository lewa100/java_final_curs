package Nursery;

import Pets.Cat;
import Service.iAnimalDB;

public class GetCat extends PetGenerator {

    @Override
    public iAnimalDB createItem() {
        return (iAnimalDB) new Cat("C1", null, null);
    }
}
