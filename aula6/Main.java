package aula6;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Adicao adicao = new Adicao(20, 40);
        Adicao adicao2 = new Adicao(10, 10);

        calculadora.executa(adicao);
        calculadora.executa(adicao2);

        System.out.println("Historico de operacoes: ");

        List<Operacao> operacoes = calculadora.getOperacoes();

//        for (int index = 0; index < operacoes.size(); index++) {
//            System.out.println(operacoes.get(index));
//        }

        for (Operacao operacao : operacoes) {
            System.out.println(operacao);
        }
    }
}
