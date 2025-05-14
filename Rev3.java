/******************************************************************************
Revisão Ex3 - Faça um Programa que peça as 4 notas bimestrais e mostre a média.
*******************************************************************************/
import java.util.Scanner;
public class Rev3
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	System.out.print("Informe a nota do 1° bimestre: ");
	double nota1 = ler.nextDouble();	
	System.out.print("Informe a nota do 2° bimestre: ");
	double nota2 = ler.nextDouble();
	System.out.print("Informe a nota do 3° bimestre: ");
    double nota3 = ler.nextDouble();
    System.out.print("Informe a nota do 4° bimestre: ");
	double nota4 = ler.nextDouble();
	
	double media = (nota1 + nota2 + nota3 + nota4) / 4;
	
	System.out.print("A média das notas é: " +media);
	}
}
