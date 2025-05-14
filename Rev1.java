/******************************************************************************
Revisão Ex1 - Faça um Programa que peça um número e então mostre a mensagem
O número informado foi [número].
*******************************************************************************/
import java.util.Scanner;
public class Rev1
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	System.out.print("Informe um número: ");
	int numero = ler.nextInt();
	
	System.out.print("O número informado foi " +numero);
	}
}
