/******************************************************************************
Lista 7 - Escreva um programa que calcule e exiba o valor da potência de um número informado pelo usuário elevado a um expoente também
*******************************************************************************/
import java.util.Scanner;
public class Lista7
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Digite a base: ");
	double base = scanner.nextDouble();
	System.out.print("Informe o expoente: ");
	double expoente = scanner.nextDouble();
	
	double result = 1;
	if(expoente > 0){
	for(int i=0;i<expoente;i++){
	result *= base;
	}
	}else if(expoente<0){
	 for(int i=0;i>-expoente;i++){
	 result *= base;
	}
    result = 1 / result;
	}else{
	result = 1;
	}
	System.out.print("A potência é: " +result);
	}
	}

