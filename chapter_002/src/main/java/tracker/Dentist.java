package tracker;

public class Dentist extends Doctor {
    String location = "Поликлиника";
    public Dentist(String name, String surname, String education, String birthday) {
        super(name,surname, education,birthday);
    }
    public void treatTeeth() {
        // лечит зубы
    }
}
