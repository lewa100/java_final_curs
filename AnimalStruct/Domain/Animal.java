package Domain;

import java.text.Format;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public abstract class Animal {
    private String name;
    private Date birthday;
    private String sex;
    private String[] commandList;
    
    public Animal(String name, Date birthday, String sex, String[] cmdList) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.commandList = cmdList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Format getBirthdayInString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return formatter.toFormat();
    }

    public void setBirthday(Date biDate) {
        this.birthday = biDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String[] getCmdList() {
        return commandList;
    }

    public void setCmdList(String[] cmdList) {
        this.commandList = cmdList;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", sex=" + sex + ", birthday=" + birthday + ", command List=" + commandList + "]";
    }
    
}


