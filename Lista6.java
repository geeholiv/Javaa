/******************************************************************************
Lista 6 - Faça um programa que calcule e exiba a soma dos números pares de 1 a 100 utilizando um laço de repetição
*******************************************************************************/
import java.util.Scanner;
public class Lista6
{
	public static void main(String[] args) {
	int numeroPar = 0;
	
	for(int i=0;i<=100;i++){
	if (i % 2==0){
	numeroPar +=i;
	} 
	} 
	System.out.print("A soma dos números pares é: " + numeroPar);
	}
}
