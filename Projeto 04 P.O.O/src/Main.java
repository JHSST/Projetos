import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha a operação:");
            System.out.println("1. Calcular área");
            System.out.println("2. Calcular perímetro");
            System.out.println("3. Sair");

            int escolha = scanner.nextInt();

            if (escolha == 3) {
                break;
            }

            switch (escolha) {
                case 1 -> calcularArea(scanner);
                case 2 -> calcularPerimetro(scanner);
                default -> System.out.println("Opção inválida. Por favor, escolha 1, 2 ou 3.");
            }
        }

        scanner.close();
    }

    private static void calcularArea(Scanner scanner) {
        System.out.println("Escolha a figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Quadrado");
        System.out.println("3. Retângulo");
        System.out.println("4. Triângulo");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                Circulo circulo = new Circulo(raio);
                System.out.println("Área do círculo: " + circulo.calcularArea());
                break;
            case 2:
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                Quadrado quadrado = new Quadrado(lado);
                System.out.println("Área do quadrado: " + quadrado.calcularArea());
                break;
            case 3:
                System.out.print("Digite a largura do retângulo: ");
                double largura = scanner.nextDouble();
                System.out.print("Digite a altura do retângulo: ");
                double altura = scanner.nextDouble();
                Retangulo retangulo = new Retangulo(largura, altura);
                System.out.println("Área do retângulo: " + retangulo.calcularArea());
                break;
            case 4:
                System.out.print("Digite a base do triângulo: ");
                double base = scanner.nextDouble();
                System.out.print("Digite a altura do triângulo: ");
                altura = scanner.nextDouble();
                System.out.print("Digite o lado 1 do triângulo: ");
                double lado1 = scanner.nextDouble();
                System.out.print("Digite o lado 2 do triângulo: ");
                double lado2 = scanner.nextDouble();
                System.out.print("Digite o lado 3 do triângulo: ");
                double lado3 = scanner.nextDouble();
                Triangulo triangulo = new Triangulo(base, altura, lado1, lado2, lado3);
                System.out.println("Área do triângulo: " + triangulo.calcularArea());
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha 1, 2, 3 ou 4.");
        }
    }

    private static void calcularPerimetro(Scanner scanner) {
        System.out.println("Escolha a figura geométrica:");
        System.out.println("1. Círculo (não há perímetro)");
        System.out.println("2. Quadrado");
        System.out.println("3. Retângulo");
        System.out.println("4. Triângulo");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1 -> System.out.println("O círculo não possui perímetro.");
            case 2 -> {
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                Quadrado quadrado = new Quadrado(lado);
                System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());
            }
            case 3 -> {
                System.out.print("Digite a largura do retângulo: ");
                double largura = scanner.nextDouble();
                System.out.print("Digite a altura do retângulo: ");
                double altura = scanner.nextDouble();
                Retangulo retangulo = new Retangulo(largura, altura);
                System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
            }
            case 4 -> {
                System.out.print("Digite o lado 1 do triângulo: ");
                double lado1 = scanner.nextDouble();
                System.out.print("Digite o lado 2 do triângulo: ");
                double lado2 = scanner.nextDouble();
                System.out.print("Digite o lado 3 do triângulo: ");
                double lado3 = scanner.nextDouble();
                Triangulo triangulo = new Triangulo(0, 0, lado1, lado2, lado3);
                System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());
            }
            default -> System.out.println("Opção inválida. Por favor, escolha 1, 2, 3 ou 4.");
        }
    }
}
