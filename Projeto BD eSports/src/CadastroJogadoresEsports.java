import java.util.ArrayList;
import java.util.List;

public class CadastroJogadoresEsports {
    public static void main(String[] args) {
        // Criar uma lista para simular o banco de dados de jogadores
        List<JogadorEsports> bancoDeDados = new ArrayList<>();

        // Inserir jogadores na base de dados
        bancoDeDados.add(new JogadorEsports("Jogador1", "Atirador", "TimeA", "Patente1"));
        bancoDeDados.add(new JogadorEsports("Jogador2", "Suporte", "TimeB", "Patente2"));
        bancoDeDados.add(new JogadorEsports("Jogador3", "Topo", "TimeC", "Patente3"));

        // Consultar e imprimir os dados de cada jogador
        for (JogadorEsports jogador : bancoDeDados) {
            System.out.println("Nome: " + jogador.getNome());
            System.out.println("Função: " + jogador.getFuncao());
            System.out.println("Time: " + jogador.getTime());
            System.out.println("Patente: " + jogador.getPatente());
            System.out.println();
        }
    }
}
