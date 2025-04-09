/******************************************************************************
Ex 42 - Forneça a quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a máquina
informe quanto será o valor arrecadado.
*******************************************************************************/
import java.util.Scanner;
public class Ex42
{
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite a quantidade de camisetas P vendidas: ");
	int tamanhoP = scanner.nextInt();
	System.out.println("Digite a quantidade de camisetas M vendidas: ");
	int tamanhoM = scanner.nextInt();
	System.out.println("Digite a quantidade de camisetas G vendidas: ");
	int tamanhoG = scanner.nextInt();
	
	double precoP = 10;
	double precoM = 12;
	double precoG = 15;
	
	double total;
	total = (tamanhoP * 10 + tamanhoM * 12+ tamanhoG * 15);
	
	System.out.println("O valor arrecadado será: " + total);
	
    }
}
