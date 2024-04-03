import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Pets.*;
import Pets.PetGroup;
import Service.AnimalDB;
import Service.iAnimalDB;
import view.ViewAnimalController;


public class App {
    // public static void main(String[] args) throws Exception {
        // var pets = new PetGroup();
        
        // pets.addPet(new Cat(null, null, null));
        // pets.addPet(new Dog(null, null, null));
        // pets.addPet(new Hamster(null, null, null));
        // pets.addPet(new Cat(null, null, null));
        // pets.addPet(new Hamster(null, null, null));
        // pets.addPet(new Hamster(null, null, null));

        // Random rnd = ThreadLocalRandom.current();
        // for(int i =0;i<10;i++)
        // {
        //     int index = rnd.nextInt(6);
        //     generatorList.get(index).startToDo();
        // }
        
        // System.out.println(pets);
        // for (PetGenerator item : pets) {
        //     System.out.println(item);
        // }
    // }
    public static void main(String[] args) {
        iAnimalDB home = new AnimalDB();
        ViewAnimalController view = new ViewAnimalController(home);
        view.run();
    }
}