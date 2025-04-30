/******************************************************************************
Ex 47 - Desenvolva um algoritmo que leia um conjunto de 20 valores inteiros,
guarde-os em um vetor e escreva-os em ordem inversa
*******************************************************************************/
import java.util.Scanner;
public class Ex47
{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int [] numeros = new int [20];
    
    for(int i = 0; i < 20; i++) {
    System.out.print("Digite um valor inteiro: ");
    numeros[i] = scanner.nextInt();
    }
    
    System.out.println("\nValores digitados em ordem inversa:");
    for (int i= 19; i >= 0; i--) {
    System.out.println("Posição " + i + ":"+ numeros[i]);     
        }
}
}