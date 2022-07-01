package aula4;

public class Papagaio extends Ave implements AnimalDomesticado {

    private static final String NOME_PAPAGAIO = "Novo Papagaio";

    public Papagaio(){
        super(NOME_PAPAGAIO);
    }

    @Override
    public void alimentar(){
        System.out.println("Alimentando o papagaio");
    }
    @Override
    public void levarVeterinario(){
        System.out.println("Levando o papagaio ao veterinario");
    }

    @Override
    public void emitirSom(){
        System.out.println("som de papagaio");
    }

    @Override
    public void voar(){
        System.out.println("papagaio voa alto");
    }


}
