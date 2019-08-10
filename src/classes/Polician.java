package classes;

import classes.Person;

public class Polician extends Person {
    private String patente;

    public void setPatente(String patente){
        this.patente = patente;
    }

    public void getPatente(){
        System.out.println("Eu sou " + patente + " da polícia");
    }

    public void askRg(){
        System.out.println("Qual seu RG comédia? ");
    }

    @Override
    public void run() {
        System.out.println("Correndo atrás de bandido safado!");
    }
}
