package classes;

import classes.Person;

public class Polician extends Person {
    private String patente;
    private int age;

    public void sayAge(){
        System.out.println("Olá, minha idade é: " + age);
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
        System.out.println("Minha idade é: " + age);
    }

    public void setPatente(String patente){
        this.patente = patente;
        System.out.println("Eu sou: " + patente);
    }

    @Override
    public void run() {
        System.out.println("Correndo atrás de bandido safado!");
    }
}
