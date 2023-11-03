import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Scanner;

public class CadastroDeSites {
    private static final String DIRECTORY = "./sites_data/";
    private static int idCounter = 0;

    private static void loadIndex() {
        File folder = new File(DIRECTORY);
        if (!folder.exists()) {
            folder.mkdir();
        } else {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isFile() && f.getName().endsWith(".data")) {
                        String name = f.getName();
                        int id = Integer.parseInt(name.substring(0, name.indexOf('.')));
                        if (id > idCounter) idCounter = id;
                    }
                }
            }
        }
        idCounter++;
    }

    private static void saveSite(Site site) throws IOException {
        String filename = DIRECTORY + idCounter + ".data";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(site);
        }
        System.out.println("Site cadastrado com sucesso: " + filename);
        idCounter++;
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        loadIndex();

        System.out.println("Bem-vindo ao Cadastro de Sites!");
        while (true) {
            System.out.println("\nDigite a descrição do site:");
            String descricao = scanner.nextLine();

            System.out.println("Digite a URL do site:");
            String url = scanner.nextLine();

            Date dataCadastro = new Date();
            Site site = new Site(descricao, url, dataCadastro);

            try {
                saveSite(site);
            } catch (IOException e) {
                System.out.println("Erro ao salvar o site: " + e.getMessage());
            }

            System.out.println("Deseja cadastrar outro site? (s/n)");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}