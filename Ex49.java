/******************************************************************************
Ex 49 -Desenvolva um algoritmo que leia 2 vetores de 10 elementos inteiros
cada. Em seguida, calcule a soma desses vetores, guarde o resultado em um terceiro vetor e escreva o resultado
*******************************************************************************/
import java.util.Scanner;
public class Ex49
{
    public static void main(String[] args) {
    int[] vetor1 = new int[10];
    int[] vetor2 = new int[10];
    int[] soma = new int[10];

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite os 10 números do primeiro vetor:");
    for (int i = 0; i < 10; i++) {
    System.out.print("Vetor1[" + i + "]: ");
    vetor1[i] = scanner.nextInt();
}

    System.out.println("\nDigite os 10 números do segundo vetor:");
    for (int i = 0; i < 10; i++) {
        System.out.print("Vetor2[" + i + "]: ");
    vetor2[i] = scanner.nextInt();
}
       
    for (int i = 0; i < 10; i++) {
    soma[i] = vetor1[i] + vetor2[i];
}

    System.out.println("\nVetor resultante da soma:");
    for (int i = 0; i < 10; i++) {
    System.out.println("Soma[" + i + "] = " + soma[i]);
}
    }
}