package Service;
import java.util.ArrayList;

public interface iAnimalDB {
    boolean leaningCommand(String cmd);
    ArrayList<String> getAnimalCmdList();
    int getID();
    void toDo();
    String getName();
    String getBirthday();
}
