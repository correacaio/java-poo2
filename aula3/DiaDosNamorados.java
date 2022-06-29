package aula3;

public class DiaDosNamorados extends CartaoDePresente {

    public DiaDosNamorados(String nomeRemetente, String nomeDestinatario) {
        super(nomeRemetente, nomeDestinatario);
    }

    @Override
    public String mensagem() {
        return "Mensagem do dia dos namorados";
    }
}
