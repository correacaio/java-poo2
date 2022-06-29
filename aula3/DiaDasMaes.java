package aula3;

public class DiaDasMaes extends CartaoDePresente implements ImprimirPapel {

    public DiaDasMaes(String nomeRemetente, String nomeDestinatario) {
        super(nomeRemetente, nomeDestinatario);
    }

    @Override
    public String mensagem() {
        return "Mensagem do dia das maes";
    }

    @Override
    public String imprime() {
        return "Imprimindo cartao do dia das maes";
    }
}
