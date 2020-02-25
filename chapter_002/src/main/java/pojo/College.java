package pojo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class College {
    public static void main(String[] args) {
        Student s = new Student();
        Calendar c = new GregorianCalendar();
        c.set(Calendar.YEAR, 2017);
        c.set(Calendar.MONTH, 7);
        c.set(Calendar.DAY_OF_MONTH, 5);
        s.setName("Иванов Иван Иванович");
        s.setGroup("B12");
        System.out.println("Студент " + s.getName()+"," + "группа " + s.getGroup() + " " + ", дата поступления " + c.getTime());
    }
}
