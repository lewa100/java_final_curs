import Service.AnimalDB;
import Service.iAnimalDB;
import view.ViewAnimalController;


public class App {
    public static void main(String[] args) {
        iAnimalDB home = new AnimalDB();
        ViewAnimalController view = new ViewAnimalController(home);
        view.run();
    }
}