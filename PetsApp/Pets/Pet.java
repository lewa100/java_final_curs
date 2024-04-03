package Pets;

import java.util.Date;
import Service.iAnimalDB;

import java.text.Format;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public abstract class Pet  implements iAnimalDB{
    private int id; 
    private String name;
    private Date birthday;
    private ArrayList<String> commandList;
    
    public Pet(int id, String name, Date birthday, ArrayList<String> cmdList) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        if (cmdList == null){
            cmdList = new ArrayList<>();
        }else{
            this.commandList = cmdList;
        } 
    }

    public int getID(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        if (birthday == null){
            return "empty";
        }
        return birthday.toString();
    }

    public Format getBirthdayInString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return formatter.toFormat();
    }

    public void setBirthday(Date biDate) {
        this.birthday = biDate;
    }

    public ArrayList<String> getCmdList() {
        return commandList;
    }

    public void setCmdList(ArrayList<String> cmdList) {
        this.commandList = cmdList;
    }

    public void addCmdInList(String cmdList) {
        this.commandList.add(cmdList);
    }
}
