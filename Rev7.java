/******************************************************************************
Revisão Ex7 - Tendo como dados de entrada a altura de uma pessoa, construa um 
algoritmo que calcule seu peso ideal
*******************************************************************************/
import java.util.Scanner;
public class Rev7
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);	
		
	System.out.print("Informe a sua altura: ");
	double altura = ler.nextDouble();
	
	double pesoIdeal = (72.7 * altura) - 58;
	
	System.out.print("Seu peso ideal é: " + pesoIdeal);
	}
}
