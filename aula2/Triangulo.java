package aula2;

public class Triangulo implements FormaGeometrica {

    // final -> significa que o atributo não pod eser alterado
    private final int ladoA;
    private final int ladoB;
    private final int ladoC;

    public Triangulo(int lado1, int lado2, int lado3) {
        ladoA = lado1;
        ladoB = lado2;
        ladoC = lado3;
    }

    public int getLadoA() {
        return ladoA;
    }

    @Override // -> Sobrescrita
    public final int calculaPerimetro() { // final em métodos bloqueia que filhos sobrescrevam esse método
        return ladoA + ladoB + ladoC;
    }

//    Sobrecarga de metodo é quando criamos métodos com o mesmo nome, mas com parametros diferentes
//    public int calculaPerimetro(String qualquerCoisa) { }

    @Override
    public String toString() {
        return "Triangulo [" + ladoA +", " + ladoB + ", " + ladoC +"]";
    }
}
