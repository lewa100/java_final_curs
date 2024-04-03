package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;


public class Row {
    private String name;
    private Date birthday;
    private ArrayList<String> commandList;

    final static String DATE_FORMAT = "dd.MM.yyyy";

    public void parse(String rowString) throws Exception {
        var parts = rowString.trim().toLowerCase().split(" ");
        try {
            validate(parts);
        }catch (Exception e){
            throw new Exception(e);
        }
        this.name = parts[0];
        this.birthday = new SimpleDateFormat(DATE_FORMAT).parse(parts[1]);
        var cmdList = parts[2].split(","); 
        if (cmdList.length > 0){
            this.commandList = new ArrayList<>();
            for (String cmd : cmdList) {
                this.commandList.add(cmd);
            }
        }
    }


    ///VALIDATOR
    private static boolean validate(String[] parts) throws Exception{
        if (parts.length != 3){
            throw new Exception("Формат строки не соответсвует формату");
        }
        if (parts[0].length() < 2){
            throw new Exception("Кличка должна быть больше 2-х символов");
        }
        if (!isDateValid(parts[1])){
            throw  new Exception("Указана некорректный формат даты");
        }
        if (parts[2].length() > 2){
            var cmdList = parts[2].split(","); 
            if (cmdList.length < 1){
               throw  new Exception("Питомец должен знать хотя бы 1 команду");
            }
        } else{
            throw  new Exception("Команда должна быть больше от 2х и более букв");
        }
        

        return true;
    }

    private static boolean isDateValid(String date) {
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public String getName(){
        return this.name;
    }

    public Date getBirthday(){
        return this.birthday;
    }

    public ArrayList<String> getCommandList(){
        return this.commandList;
    }
}
