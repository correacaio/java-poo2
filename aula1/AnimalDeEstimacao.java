package aula1;

public class AnimalDeEstimacao extends Animal {

    public AnimalDeEstimacao(String raca) {
        super(raca, aula1.PorteAnimal.PEQUENO); // super() chama o construtor da classe pai -> Animal
        setPelo("pelo do animal de estimacao"); // setPelo é um metodo de Animal que é herdado pela classe AnimalDeEstimacao
    }
}
