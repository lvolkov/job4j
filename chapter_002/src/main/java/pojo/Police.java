package pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License l = new License();
        l.setOwner("Leonid Volkov");
        l.setCreated(new Date());
        l.setModel("Nissan Almera");
        l.setCode("wwdd344");
        System.out.println(l.getOwner() + " has a car - " + l.getModel() + " : " + l.getCode());
    }
}
