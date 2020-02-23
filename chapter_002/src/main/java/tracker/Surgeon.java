package tracker;

public class Surgeon extends Doctor {
    String location = "Госпиталь";
    public Surgeon(String name,String surname,String education,String birthday){
        super(name,surname, education,birthday);
       }
    public void operate(){
        // делает операцию
    }
}
