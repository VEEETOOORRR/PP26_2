public class ContadorPonto implements ContadorLetras {
    private ContadorLetras proximo = null;
    private int quantidade = 0;

    @Override
    public void setProximo(ContadorLetras proximo) {
        this.proximo = proximo;
    }

    @Override
    public void processar(char c) {
        if (c == '.') {
            quantidade++;
        } else if (proximo != null) {
            proximo.processar(c);
        }
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }
}