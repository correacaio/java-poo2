package aula5;

public class Caixa<T> {

    private T conteudo;

    public void coloca(T conteudoParaColocar) {
        this.conteudo = conteudoParaColocar;
    }

    public T retira() {
        T conteudoAtualDaCaixa = this.conteudo;
        this.conteudo = null;
        return conteudoAtualDaCaixa;
    }
}
