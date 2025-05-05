/******************************************************************************
Comandos de Repetição 10 - Faça um algoritmo que leia 10 números inteiros e, 
ao final, escreva quantos estão entre 0 e 100
*******************************************************************************/
import java.util.Scanner;
public class Lista10 
{
    public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int contar = 0;
    for(int i = 1; i <=10; i++) {
    System.out.print("Digite o "+i+ "° numero: ");
    int num = scanner.nextInt();
    
    if( num >= 0 && num <= 100) {
    contar++;
    }
    }
    System.out.print("Os numeros que estao entre 0 e 100 são: "+ contar);
}
}

