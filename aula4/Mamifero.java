package aula4;

public abstract class Mamifero extends Animal {

    public Mamifero(String nome){
        super(nome);
    }

    public void amamentar() {
        System.out.println("Amamentando de forma padrao");
    }
}
