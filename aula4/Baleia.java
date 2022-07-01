package aula4;

public class Baleia extends Mamifero{

    private static final String NOME_BALEIA = "Nova Baleia";

    public Baleia() {
         super(NOME_BALEIA);
    }


    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de baleia -> baleies");
    }

    @Override
    public void amamentar() {
        System.out.println("Amamentar uma baleia eh diferente de amamentar outros mamiferos");
    }

}
