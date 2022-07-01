package aula3;

public interface ImprimirPapel {

    public String nomeRemetente = "";
    public static final String MINHA_CONSTANTE = "valor constante na interface"; // camel case

//     Não podemos criar construtores para Interface
//    public ImprimirPapel() { }

    public String imprime();

    public abstract String metodo();
}
