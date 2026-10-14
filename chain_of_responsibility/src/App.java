import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Uso: java App <texto ou arquivo.txt>");
            return;
        }

        String conteudo = "";
        Path caminho = Path.of(args[0]);


        // Verifica se o argumento passado é válido
        try {
            if (Files.exists(caminho)) {
                conteudo = Files.readString(caminho);
            } else {
                conteudo = args[0];
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }

        // Elos da corrente instanciados
        ContadorLetras contadorA = new ContadorA();
        ContadorLetras contadorEspaco = new ContadorEspaco();
        ContadorLetras contadorPonto = new ContadorPonto();

        // Conecta cada elo da corrente
        contadorA.setProximo(contadorEspaco);
        contadorEspaco.setProximo(contadorPonto);

        // Processa o texto caractere por caractere
        for (char c : conteudo.toCharArray()) {
            contadorA.processar(c);
        }

        // Imprime as estatísticas
        System.out.println("'a' ou 'A': " + contadorA.getQuantidade());
        System.out.println("Espaços: " + contadorEspaco.getQuantidade());
        System.out.println("Pontos: " + contadorPonto.getQuantidade());
    }
}