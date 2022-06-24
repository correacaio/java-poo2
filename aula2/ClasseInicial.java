package aula2;

public class ClasseInicial {
    
    public static void main(String[] args) {
//        Não conseguimos mais instanciar a classe FormaGeometrica porque agora ela é abstrata
//        FormaGeometrica formaGeometrica = new FormaGeometrica();
//        System.out.println("O perimetro da forma geometrica é " + formaGeometrica.calculaPerimetro());

        Triangulo triangulo = new Triangulo(2, 5, 4);
//        System.out.println("O perimetro do triangulo é " + triangulo.calculaPerimetro());
//
        TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(5);
//        System.out.println("O perimetro do triangulo equilatero é " + trianguloEquilatero.calculaPerimetro());
//
        Retangulo retangulo = new Retangulo(5, 20);
//        System.out.println("O perimetro do retangulo é " + retangulo.calculaPerimetro());
//
//        System.out.println("Triangulo: " + triangulo);
//        System.out.println("Triangulo Equilatero: " + trianguloEquilatero);
//        System.out.println("Retangulo: " + retangulo);

        imprimePerimetro(triangulo);
        imprimePerimetro(trianguloEquilatero);
        imprimePerimetro(retangulo);


//        Se o método imprimePerimetro() não for estatico precisamos de uma instancia para chamar ele
//        ClasseInicial qualquerNome = new ClasseInicial();
//        qualquerNome.imprimePerimetro();
    }

    public static void imprimePerimetro(FormaGeometrica formaGeometrica) {
        System.out.println(
            "O perimetro do " +
                formaGeometrica +
                " é " +
                formaGeometrica.calculaPerimetro()
        );
    }

//    public static void imprimePerimetro(Retangulo retangulo) {
//        System.out.println("O perimetro do retangulo é " + retangulo.calculaPerimetro());
//    }
//
//    public static void imprimePerimetro(Triangulo triangulo) {
//        System.out.println("O perimetro do triangulo é " + triangulo.calculaPerimetro());
//    }
//
//    public static void imprimePerimetro(TrianguloEquilatero trianguloEquilatero) {
//        System.out.println("O perimetro do triangulo equilatero é " + trianguloEquilatero.calculaPerimetro());
//    }
}
