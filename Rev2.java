/******************************************************************************
Revisão Ex2 - Faça um Programa que peça dois números e imprima a soma.
*******************************************************************************/
import java.util.Scanner;
public class Rev2
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	System.out.print("Informe o primeiro número: ");
	int numero1 = ler.nextInt();
	System.out.print("Informe o segundo número: ");
	int numero2 = ler.nextInt();
	
    int soma = numero1 + numero2;
	
	System.out.print("A soma é: " +soma);
	}
}
