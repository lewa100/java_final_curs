package Nursery;

import Pets.Hamster;
import Service.iAnimalDB;

public class GetHamster extends PetGenerator{

    @Override
    public iAnimalDB createItem() {
        return (iAnimalDB) new Hamster("H1", null, null);
    }
} 