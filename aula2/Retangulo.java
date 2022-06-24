package aula2;

public class Retangulo extends FormaGeometrica {

    private final int lado1;
    private final int lado2;

    public Retangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public int calculaPerimetro() {
        return lado1 * 2 + lado2 * 2;
//        return lado1 + lado1 + lado2 + 2;
    }

    @Override
    public String toString() {
        return "Retangulo [" + lado1 + ", " + lado2 + "]";
    }
}
