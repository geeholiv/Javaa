/******************************************************************************
Ex 46 - Calculadora de Áreas
*******************************************************************************/
import java.util.Scanner;
public class Ex46
{
    //área do retângulo
    public static double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    //área do triângulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    //área do círculo
    public static double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcao;
    double base, altura, raio, area;

    do {

    System.out.println("--- Calculadora de Áreas ---");
    System.out.println("1. Calcular Área do Retângulo");
    System.out.println("2. Calcular Área do Triângulo");
    System.out.println("3. Calcular Área do Círculo");
    System.out.println("0. Sair");
    System.out.print("-- Escolha uma opção: ");
    opcao = scanner.nextInt();

    switch (opcao) {
    case 1:
    System.out.print("Digite a base do retângulo: ");
    base = scanner.nextDouble();
    System.out.print("Digite a altura do retângulo: ");
    altura = scanner.nextDouble();
    area = calcularAreaRetangulo(base, altura);
    System.out.println("A área do retângulo é: " + area);
    break;

    case 2:
    System.out.print("Digite a base do triângulo: ");
    base = scanner.nextDouble();
    System.out.print("Digite a altura do triângulo: ");
    altura = scanner.nextDouble();
    area = calcularAreaTriangulo(base, altura);
    System.out.println("A área do triângulo é: " + area);
    break;

    case 3:
    System.out.print("Digite o raio do círculo: ");
    raio = scanner.nextDouble();
    area = calcularAreaCirculo(raio);
    System.out.println("A área do círculo é: " + area);
    break;

    case 0:
    System.out.println("Saindo do programa...");
    break;

    default:
    System.out.println("Opção inválida! Tente novamente.");
    break;
            }

        } while (opcao != 0);

        scanner.close(); 
    }
}
