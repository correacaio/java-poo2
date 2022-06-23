package aula1;

// Toda classe que não extende explicitamente a outra classe, extende implicitamente ao Object
// Logo, podemos afirmar que todas as classes são filhas direta ou indiretamente de Object
public class Animal extends Object {

    private String raca;
    private String especie;
    private Enum<PorteAnimal> porte; // 'p', 'm', 'g'
    private String pelo;
    private String nome;
    private int idade;

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    // posso chamar metodos e atributos estaticos sem precisar de uma instancia da classe
    public static Boolean ehFofo = true;
    public Boolean ehBravo = false;

//    public Animal() { } // construtor padrao que o java cria se a gente nao definir nenhum outro

    public Animal(String raca, Enum<PorteAnimal> porte) {
        this.raca = raca;
        this.porte = porte;
    }

    public static void meuMetodoEstatico() {
//        System.out.println("Metodo estatico que nao faz nada alem de printar essa mensagem");
    }

    public String getPelo() {
        return pelo;
    }

    // get -> obter (pegar)  +
    // set -> setar (definir) = encapsulamento
    public String getRaca() {
        return raca;
    }

    public void setRaca(String novaRaca) {
        if (!novaRaca.equals("")) { // if -> se
            this.raca = novaRaca;
        }

//        "raca" -> "RACA"
        this.raca = novaRaca.toUpperCase();
    }

    public void metodoComIf(boolean condicao) {
        if (condicao) {
            System.out.println("A condicacao eh verdadeira");
        } else {
            System.out.println("A condicacao eh falsa");
        }

        if (1 < 2) {
            System.out.println("1 eh menor que 2");
            // precisamos das chaves no if para executar varias linhas
        }

        if (1 < 2) // se for 1 linha so nao precisamos de chaves
            System.out.println("1 eh menor que 2");
        else
            System.out.println("1 nao eh menor que 2");
    }

    /*
    * Estrutura de um método:
    * {controlador de acesso} {tipo do retorno} {nome do método}
    * {parametros dentro de parenteses} {chaves}
    * */

    // Vamos trabalhar melhor esses conceitos de sobrescrita de metodos
    @Override
    public boolean equals(Object objetoParaComparar) {
        Animal animalParaComparar = (Animal) objetoParaComparar;
        return this.raca.equals(animalParaComparar.raca) &&
            this.porte.equals(animalParaComparar.porte);
    }

    @Override
    public String toString() {
        return "Raca: " + raca +", porte: " + porte;
    }
}
