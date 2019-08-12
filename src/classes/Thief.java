package classes;

public class Thief extends Person {
    @Override
    public void Saudation(Person p) {
        System.out.println(this.GetName() + ": Fala Comédia, meu nome é " + this.GetName());
    }

    @Override
    public void AskRG(Person p) {
        System.out.println(this.GetName() + ": Qual seu RG, " + p.GetName() + " de merda?");
    }

    @Override
    public void SayRG() {
        System.out.println(this.GetName() + ": Meu RG é " + this.GetRg() + ", na favela conhecido como 157.");
    }

    @Override
    public void run() {
        System.out.println(this.GetName() + ": Deu ruim menor, CORRE VIADO!");
    }
}
