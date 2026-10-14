public interface ContadorLetras {
    void setProximo(ContadorLetras proximo);
    void processar(char c);
    int getQuantidade();
}