package classes;

public abstract class Person {
    private String name;
    private int rg;

    public String GetName() {
        return name;
    }

    public int GetRg(){
        return rg;
    }

    public void SetName(String name){
        this.name = name;
    }

    public void SetRG(int rg){
        this.rg = rg;
    }

    public void AskRG(Person p){
        System.out.println(this.GetName() + ": Qual seu RG "+ p.GetName() + "?");
    }

    public void SayRG(){
        System.out.println(this.GetName() + ": Meu RG é: " + this.GetRg());
    }

    public void Saudation(Person p){
        System.out.println(this.GetName() + ": Olá " + p.GetName() + ". Como vai? Eu sou o " + this.GetName() + ".");
    }

    public abstract void run();
}
