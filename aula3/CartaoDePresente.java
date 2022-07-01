package aula3;

public abstract class CartaoDePresente {

    private final String nomeRemetente;
    private final String nomeDestinatario;

    public static final String MINHA_CONSTANTE = "Cartao de presente";

    public CartaoDePresente(String nomeRemetente, String nomeDestinatario) {
        this.nomeRemetente = nomeRemetente;
        this.nomeDestinatario = nomeDestinatario;
    }

    public String getNomeRemetente() {
        return nomeRemetente;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public abstract String mensagem();
}

