/******************************************************************************
Revisão Ex6 - Faça um Programa que peça a temperatura em graus Farenheit, transforme 
e mostre a temperatura em graus Celsius.
*******************************************************************************/
import java.util.Scanner;
public class Rev6
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);	
		
	System.out.print("Informe a temperatura em graus Farenheit: ");
	double F = ler.nextDouble();
	
	double celsius = (F - 32)* 5 / 9;
	
	System.out.print("O valor em graus Celsius é: " + celsius);
	}
}
