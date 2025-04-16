/******************************************************************************
Desafio 6 - Faça um programa em Java para resolver a equação de 2º grau
*******************************************************************************/
import java.util.Scanner;
public class Desafio6
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor de A: ");
    double a = scanner.nextDouble();
    System.out.print("Digite o valor de B: ");
    double b = scanner.nextDouble();
    System.out.print("Digite o valor de C: ");
    double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

    if (a == 0) {
    System.out.println("Não é uma equação de 2º grau.");
    } else if (delta < 0) {
    System.out.println("Delta = " + delta + " (sem raízes reais)");
    } else {
    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
    System.out.println("Delta = " + delta);
    System.out.println("x1 = " + x1);
    System.out.println("x2 = " + x2);
        }

        scanner.close();
    }
}