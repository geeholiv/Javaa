/******************************************************************************
Lista 4 - Crie um programa que solicite ao usuário um número e exiba a tabuada desse número utilizando um laço de repetição
*******************************************************************************/
import java.util.Scanner;
public class Lista4
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	int numero, tabuada;
	
	System.out.print("Insira um número para visualizar sua tabuada: ");
	numero = ler.nextInt();
	
	System.out.print("A tabuada do número " +numero+ " é:\n");
	for(int i=1;i<=10;i++){
	
	tabuada = numero * i;
	
	System.out.println(numero+ "x" + i + "= " + tabuada);
	}
	}
}
