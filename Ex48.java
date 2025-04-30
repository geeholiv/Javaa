/******************************************************************************
Ex 48 - Desenvolva um algoritmo que leia um conjunto de 20 valores inteiros,
guarde-os em um vetor e escreva-os em ordem inversa
*******************************************************************************/
import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
    double[] numeros = new double[10];
    Scanner scanner = new Scanner(System.in);
    double soma = 0;
   
    for (int i = 0; i < 10; i++) {
    System.out.print("Digite o " + (i + 1) + "° número: ");
    numeros[i] = scanner.nextDouble();
}

    for (int i = 0; i < 10; i += 2) {
    soma += numeros[i];
 }

    System.out.println("A soma dos valores nas posições ímpares é: " + soma);

    }
}