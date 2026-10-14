public class ContadorA implements ContadorLetras {
    private ContadorLetras proximo = null;
    private int quantidade = 0;

    @Override
    public void setProximo(ContadorLetras proximo) {
        this.proximo = proximo;
    }

    @Override
    public void processar(char c) {
        if (c == 'a' || c == 'A') {
            quantidade++;
        } else if (proximo != null) {
            proximo.processar(c); // Passa para o próximo elo
        }
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }
}