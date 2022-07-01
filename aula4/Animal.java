package aula4;

public abstract class Animal {

    private final String nome;

    public Animal (String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void emitirSom();


}
