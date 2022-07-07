package aula4;

public class Cachorro extends Animal implements AnimalEstimacao, AnimalDomesticado {

    private String tamanho;
    private String raca;

    public Cachorro() {
        super("cachorro");
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getRaca() {
        return getRaca();
    }

    @Override
    public void emitirSom() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void levarVeterinario() {

    }

    @Override
    public void brincar() {

    }

    @Override
    public void darBanho() {

    }
}
