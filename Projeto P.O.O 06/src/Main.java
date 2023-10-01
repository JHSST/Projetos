import java.util.Scanner;

interface Formatador {
    String formatar(Object objeto);
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        VeiculoEletrico veiculo = new VeiculoEletrico("Model S", "Tesla", 500, 250, 80000.0);
        UF uf = new UF("São Paulo", "SP", "São Paulo", "23.5505° S, 46.6333° W", 12345678, 248219.481, new String[]{"São Paulo", "Guarulhos", "Campinas"});

        System.out.println("Escolha o formato de estruturação da informação (XML, JSON ou YAML):");
        String formatoEscolhido = scanner.nextLine().toUpperCase();

        Formatador formatador;
        if (formatoEscolhido.equals("XML")) {
            formatador = new XMLFormatador();
        } else if (formatoEscolhido.equals("JSON")) {
            formatador = new JSONFormatador();
        } else if (formatoEscolhido.equals("YAML")) {
            formatador = new YAMLFormatador();
        } else {
            System.out.println("Formato não suportado.");
            return;
        }

        System.out.println(formatador.formatar(veiculo));
        System.out.println(formatador.formatar(uf));

        scanner.close();
    }
}
