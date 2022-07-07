package aula5;

import aula4.Animal;
import aula4.Cachorro;
import aula4.Papagaio;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Caixa<Cachorro> caixa = new Caixa<Cachorro>();
        System.out.println("[1] Conteudo da caixa " + caixa.retira());

        Cachorro cachorro = new Cachorro();
        caixa.coloca(cachorro);
        cachorro = caixa.retira();

        System.out.println("[2] Conteudo da caixa " + cachorro);
        System.out.println("[3] Conteudo da caixa " + caixa.retira());


        Caixa<Papagaio> caixa2 = new Caixa<Papagaio>();
        caixa2.coloca(new Papagaio());
        Papagaio papagaio = caixa2.retira();
        System.out.println("Conteudo da caixa 2: " + papagaio);


        Caixa<String> caixa3 = new Caixa<String>();
        caixa3.coloca("Texto qualquer");
        System.out.println("Conteudo da caixa 3: " + caixa3.retira());

        Caixa<Integer> caixa4 = new Caixa<>();
        caixa4.coloca(40);
        System.out.println("Conteudo da caixa 4: " + caixa4.retira());

        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);

        Animal primeiroAnimalDaLista = animais.get(0);
    }
}
