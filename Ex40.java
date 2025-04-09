/******************************************************************************
Ex 40 - ler o preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no
tanque
*******************************************************************************/
import java.util.Scanner;
public class Ex40
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite quantos reais você deseja abastecer no seu tanque: R$ ");
	double reais = scanner.nextDouble();
	
	double gasolina = 5.90;
	
	double litros;
	litros = reais / gasolina;
	
	System.out.println("Foram abastecidos: " +litros+ "litros");
	
	}
}
