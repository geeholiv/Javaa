/******************************************************************************
Ex 53 - Faça um programa que leia 10 valores reais e os apresente na ordem:
       a) crescente
       b) decrescente
       c) inversa da entrada.
*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays;
public class Ex53 
{
public static void main(String[] args) {

    double[] valorReal = new double[11];
    Scanner scanner = new Scanner(System.in);
    
    for (int i = 1; i < 11; i++) {
    System.out.print("Digite o " + i + "° valor: ");
    valorReal[i] = scanner.nextDouble();
    }
    System.out.println("\nValores na ordem inversa da entrada:");
    for (int i = valorReal.length - 1; i >= 0; i--) {
    System.out.println(valorReal[i]);
    }

        double[] crescente = Arrays.copyOf(valorReal, valorReal.length);
        Arrays.sort(crescente);
        System.out.println("\nValores em ordem crescente:");
        for (double v : crescente) {
            System.out.println(v);
        }
        
    double[] decrescente = Arrays.copyOf(valorReal, valorReal.length);
    Arrays.sort(decrescente);
    System.out.println("\nValores em ordem decrescente:");
    for (int i = decrescente.length - 1; i >= 0; i--) {
    System.out.println(decrescente[i]);
    
        }
}
  }