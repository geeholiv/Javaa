/******************************************************************************
Revisão Ex4 - Faça um Programa que converta metros para centímetro
*******************************************************************************/
import java.util.Scanner;
public class Rev4
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);	
		
	System.out.print("Informe um valor em metros: ");
	double valormetros = ler.nextDouble();
	
	double conversao = valormetros * 100;
	
	System.out.print("O valor em centímetros será: " +conversao);
	}
}
