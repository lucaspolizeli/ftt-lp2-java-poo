package classes;

public abstract class Person {
    private int id;
    private int rg;
    private String name;

    public void sayName(){
        System.out.println("Meu nome é: " + name);
    }

    public abstract void run();

    public int getRg(){
        return rg;
    }

    public void setRg(int rg){
        this.rg = rg;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
