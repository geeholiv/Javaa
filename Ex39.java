/******************************************************************************
Ex 39 - ler o nome e a idade de uma pessoa, e exibir quantos dias de vida
ela possui
*******************************************************************************/
import java.util.Scanner;
public class Ex39
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite seu nome: ");
	String nome = scanner.nextLine();
	System.out.println("Digite sua idade: ");
	int idade = scanner.nextInt();
	
	int dv = (idade * 365);
	
	System.out.println(nome + ", você já viveu " + dv + " dias.");
	
	    
	}
	
}
