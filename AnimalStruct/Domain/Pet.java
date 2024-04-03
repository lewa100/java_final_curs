package Domain;

import java.util.Date;

public class Pet extends Animal{
    private String homeAddress;

    public Pet(String name, Date birthday, String sex, String[] cmdList, String address) {
        super(name, birthday,sex,cmdList);
        this.homeAddress = address;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String address) {
        this.homeAddress = address;
    }

    @Override
    public String toString() {
        return "Animal [name=" + getName() + ", sex=" + getSex() + ", birthday=" + getBirthday() + ", command List=" + getCmdList() + ", address=" + homeAddress +"]";
    }
}
