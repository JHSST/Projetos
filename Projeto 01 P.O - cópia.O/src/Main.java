import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.print("Digite o raio do círculo: ");
double raio = scanner.nextDouble();
Circulo circulo = new Circulo(raio);
System.out.println("Área do círculo: " + circulo.calcularArea());
System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

System.out.print("Digite o lado do quadrado: ");
double lado = scanner.nextDouble();
Quadrado quadrado = new Quadrado(lado);
System.out.println("Área do quadrado: " + quadrado.calcularArea());
System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());

System.out.print("Digite a largura do retângulo: ");
double largura = scanner.nextDouble();
System.out.print("Digite a altura do retângulo: ");
double altura = scanner.nextDouble();
Retangulo retangulo = new Retangulo(largura, altura);
System.out.println("Área do retângulo: " + retangulo.calcularArea());
System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());

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
System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());

        scanner.close();
    }
}
