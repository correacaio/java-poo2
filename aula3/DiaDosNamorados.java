package aula3;

public class DiaDosNamorados extends CartaoDePresente {

    private static final String MENSAGEM = "Mensagem do dia dos namorados";
    private static final int IDADE_MAXIMA = 15;

    public DiaDosNamorados(String nomeRemetente, String nomeDestinatario) {
        super(nomeRemetente, nomeDestinatario);
    }

    @Override
    public String mensagem() {
        return MENSAGEM;
    }
}
