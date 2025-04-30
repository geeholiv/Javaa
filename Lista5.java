/******************************************************************************
Lista 5 - Faça um programa que calcule e exiba a soma dos números pares de 1 a 100 utilizando um laço de repetição
*******************************************************************************/
import java.util.Scanner;
public class Lista5
{
	public static void main(String[] args) {
	int numeroPar = 0;
	int i = 1;
	
	while (i <= 100){
	if (i % 2==0){
	numeroPar +=i;
	}
	i++;
	}
	System.out.print("A soma dos números pares é: " +numeroPar);
	}
}
