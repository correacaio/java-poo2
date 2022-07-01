package aula3;

public class ClasseDeTeste {

    // Atributo normal da instancia
       public String marca;

    // Atributo normal da classe
        public static String atributoEstatico;

    // atributo final de instancia
    public final String nomeRemetente;

    // atributo constante
    public static final String ATRIBUTO_CONSTANTE = "constante";


    public ClasseDeTeste(String nomeRemetente) {
        this.nomeRemetente = nomeRemetente;
        System.out.println(ATRIBUTO_CONSTANTE);
    }
}
