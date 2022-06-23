package aula1;

import java.lang.*; // Todas as classes dentro do java.lang são importadas automaticamente

/*
* Varias linha
*
* a
*  b
* c
*
* */

/**
 Esse comentário com 2 asteriscos é usado para documentar
*/
// public, private, protected -> controladores de acesso
// class Main { } -> menor classe valida

public class MinhaClasseInicial {

    // assinatura do metodo: nome do metodo + retorno + parametros que ele recebe
    // main -> principal / inicial
    // void -> sem retorno (vazio)
    public static void main(String[] podemosUsarQualquerNome) {
//        if (Animal.ehFofo) {
//            System.out.println("Sim, todos os animais sao fofos");
//        } else {
//            System.out.println("Naoooo, nem todos os animais sao fofos!!");
//        }

//        if (Animal.ehBravo) {
//            System.out.println("Sim, todos os animais sao fofos");
//        } else {
//            System.out.println("Naoooo!!");
//        }

        Animal novoAnimal = null;

        Animal animal = new Animal("dalmata", PorteAnimal.MEDIO);
        Animal animalzinho = new Animal("dalmata", PorteAnimal.MEDIO);




//        System.out.println("animal " + animal.getPelo());
//        System.out.println("animalzao " + animalzao.getPelo());
//
//        System.out.println("animalzinho " + animalzinho.getPelo());
//
//        if (animal == animalzinho) {
//            System.out.println("Animal e animalzinho sao iguais");
//        } else {
//            System.out.println("Animal e animalzinho nao sao iguais");
//        }
//
//        if (animal == animalzao) {
//            System.out.println("Animal e animalzao sao iguais");
//        } else {
//            System.out.println("Animal e animalzao nao sao iguais");
//        }

        Animal.meuMetodoEstatico();


        AnimalDeEstimacao animalDeEstimacao = new AnimalDeEstimacao("pinscher");

//        if (animal == animalzinho) {
//        if (animal.equals(animalzinho)) {
//            System.out.println("Animal e animalzinho sao iguais");
//        } else {
//            System.out.println("Animal e animalzinho nao sao iguais");
//        }
//
//        if (animal == animalzinho) {
//            System.out.println("Animal e animalzinho sao iguais");
//        } else {
//            System.out.println("Animal e animalzinho nao sao iguais");
//        }

        System.out.println(animalzinho);
        System.out.println(animal);
    }
}
