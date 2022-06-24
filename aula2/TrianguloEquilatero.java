package aula2;

public class TrianguloEquilatero extends Triangulo {

    public TrianguloEquilatero(int lado) {
        super(lado, lado, lado);
    }

    @Override
    public String toString() {
        return "Triangulo Equilatero [" + getLadoA() +"]";
    }
}
