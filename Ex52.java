/******************************************************************************
Ex 52 - Faça um programa que leia 5 idades de pessoas, armazeno-os em um Array, calcule e apresente a soma das idades. 
Verificar as idades e apresentar se a pessoal é " Melhor idade", " Adulto" ou "Criança".
*******************************************************************************/
import java.util.Scanner;
public class Ex52
{
    public static void main(String[] args) {
    int[] idade = new int[6];
    Scanner scanner = new Scanner(System.in);
    int soma = 0;
    
    for(int i = 1; i < 6; i++){
    System.out.print("Digite a " + i + "° idade: ");
    idade[i] = scanner.nextInt();
    soma += idade[i];
    }
    
     System.out.println("A soma das idades é: " + soma);

    for (int i = 1; i < 6; i++) {
    if (idade[i] <= 12) {
    System.out.println("A pessoa de idade " + idade[i] + " é uma Criança.");
    } else if (idade[i] <= 59) {
System.out.println("A pessoa de idade " + idade[i] + " é um Adulto.");
} else {
    System.out.println("A pessoa de idade " + idade[i] + " está na Melhor Idade.");
     }
}
    }
}