/******************************************************************************
Revisão Ex5 - Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês.
*******************************************************************************/
import java.util.Scanner;
public class Rev5
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);	
		
	System.out.print("Valor por hora: ");
	double valorHora = ler.nextDouble();
	System.out.print("Horas trabalhadas no mês: ");
	int horasTrabalhadas = ler.nextInt();
	
	double salario = valorHora * horasTrabalhadas;
	
	System.out.printf("O valor do seu salário esse mês será: R$ %.2f%n", +salario);
	}
}
