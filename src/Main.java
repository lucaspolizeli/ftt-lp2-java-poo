import classes.Ladrao;
import classes.Polician;

public class Main {
    public static void main(String[] args){
        Polician p = new Polician();
        Ladrao l = new Ladrao();

        p.setName("Moro");
        l.setName("Lula");

        p.getName();
        l.getName();

        p.run();
        l.run();
    }
}
