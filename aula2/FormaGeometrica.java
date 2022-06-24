package aula2;

// abstract -> Que não é concreto (em Java significa que você não pode instanciar diretamente essa classe)
public abstract class FormaGeometrica extends Object {

    public FormaGeometrica() { }

    public abstract int calculaPerimetro();

    @Override
    public String toString() {
        return "Forma geometrica []";
    }
}

//public class FormaGeometrica { }
