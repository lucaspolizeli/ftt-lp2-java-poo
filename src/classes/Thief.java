package classes;

public class Thief extends Person {
    private String crime;

    public void setCrime(String crime){
        this.crime = crime;
    }

    public void getCrime(){
        System.out.println("Estou respondendo por " + crime);
    }

    @Override
    public void run() {
        System.out.println("Correndo de policial!");
    }
}
