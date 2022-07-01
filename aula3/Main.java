package aula3;

public class Main {

    public static void main(String[] arg) {
//        DiaDasMaes diaDasMaes =
//            new DiaDasMaes("filho", "mae");
//
//        DiaDosNamorados diaDosNamorados =
//            new DiaDosNamorados("namorado", "namorada");
//
//        Boleto boleto = new Boleto();
//
//        escreverCartao(diaDasMaes);
//        escreverCartao(diaDosNamorados);
//
//        ImprimirPapel aux = new DiaDasMaes("filho", "mae");
//        imprimirPapel(aux);
//        imprimirPapel(diaDasMaes);
//        imprimirPapel(boleto);

//        System.out.println(ClasseDeTeste.ATRIBUTO_CONSTANTE);
//        System.out.println(ClasseDeTeste.atributoEstatico);

        System.out.println(CartaoDePresente.MINHA_CONSTANTE);
        System.out.println(DiaDasMaes.MINHA_CONSTANTE);

        System.out.println(DiaDosNamorados.MINHA_CONSTANTE);
//        System.out.println(ImprimirPapel.MINHA_CONSTANTE);
    }

    public static void escreverCartao(DiaDasMaes cartaoDePresente) {

    }

    public static void escreverCartao(CartaoDePresente cartaoDePresente) {
        System.out.println("Remetente: " + cartaoDePresente.getNomeRemetente());
        System.out.println("Destinatario: " + cartaoDePresente.getNomeDestinatario());
        System.out.println("Mensagem: " + cartaoDePresente.mensagem());
    }

    public static void imprimirPapel(ImprimirPapel imprimirPapel) {

        System.out.println(imprimirPapel.imprime());
    }
}
