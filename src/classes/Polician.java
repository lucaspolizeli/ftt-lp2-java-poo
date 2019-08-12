package classes;

import classes.Person;

public class Polician extends Person {
    @Override
    public void Saudation(Person p) {
        System.out.println(this.GetName() + ": Oi filho " + p.GetName() + ", meu nome é " + this.GetName() + " da PM.");
    }

    @Override
    public void SayRG() {
        System.out.println(this.GetName() + ": Não obedeço ordens.");
    }

    @Override
    public void run() {
        System.out.println(this.GetName() + ": PEDE PRA SAIR SAFADO, VOLTA AQUI. ");

    }
}
