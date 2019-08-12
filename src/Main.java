import classes.Thief;
import classes.Polician;

public class Main {
    public static void main(String[] args){
        Polician bolsonaro = new Polician();
        bolsonaro.SetName("Bolsonaro");
        bolsonaro.SetRG(561795885);

        Thief lula = new Thief();
        lula.SetName("Lula");
        lula.SetRG(66666666);

        bolsonaro.Saudation(lula);
        lula.Saudation(bolsonaro);

        bolsonaro.AskRG(lula);
        lula.AskRG(bolsonaro);

        bolsonaro.SayRG();
        lula.SayRG();

        bolsonaro.run();
        lula.run();
    }
}
