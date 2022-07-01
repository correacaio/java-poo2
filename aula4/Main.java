package aula4;

public class Main {

    public static void main(String[] args) {
        Papagaio papagaio = new Papagaio();
        Cachorro cachorro = new Cachorro();

        exibeInformacoesDeAnimal(papagaio);
//        exibeInformacoesDeAnimal(cachorro);
    }

    public static void exibeInformacoesDeAnimal(Animal animal) {
        System.out.println(animal.getNome());
        animal.emitirSom();
    }

    public static void exibeInformacoesDeAnimalEstimacao(AnimalEstimacao animalEstimacao) {
        animalEstimacao.brincar();
        animalEstimacao.darBanho();
    }
}
