package aula3;

public class Boleto implements ImprimirPapel {

    @Override
    public String imprime() {
        return "Imprimindo o boleto";
    }

    @Override
    public String metodo() {
        return null;
    }
}
