import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


import Nursery.*;
import Pets.PetGroup;


public class App {
    public static void main(String[] args) throws Exception {
        var pets = new PetGroup();
        
        pets.addPet(new GetCat());
        pets.addPet(new GetDog());
        pets.addPet(new GetHamster());
        pets.addPet(new GetCat());
        pets.addPet(new GetHamster());
        pets.addPet(new GetHamster());

        // Random rnd = ThreadLocalRandom.current();
        // for(int i =0;i<10;i++)
        // {
        //     int index = rnd.nextInt(6);
        //     generatorList.get(index).startToDo();
        // }
        
        System.out.println(pets);
        // for (PetGenerator item : pets) {
        //     System.out.println(item);
        // }
    }
    // public static void main(String[] args) {
    //     iHome home = new Home();
    //     ViewAnimalController view = new ViewAnimalController(home);
    //     view.run();
    // }
}