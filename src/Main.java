import classes.Thief;
import classes.Polician;

public class Main {
    public static void main(String[] args){
        Polician p = new Polician();
        Thief l = new Thief();

        p.setName("Marcão");
        p.setPatente("General");

        p.sayName();
        p.getPatente();
        p.askRg();

        l.setRg(561795585);
        System.out.println(l.getRg());
        l.setCrime("Homicidio");
        l.getCrime();

        l.run();
        p.run();
    }
}
