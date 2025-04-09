/******************************************************************************
Ex 32 - leia 5 números e informe o maior número
*******************************************************************************/
import java.util.Scanner;
public class Ex32
{
	public static void main(String[] args) {
	 Scanner ler = new Scanner (System.in);
	
	int numero, contador = 0, maiorNumero = Integer.MIN_VALUE;
	
    while (contador < 5) {
    System.out.print("Digite um número: ");
    numero = ler.nextInt();
    contador++;
  
    if (numero > maiorNumero) {
    maiorNumero = numero;
     }
    }
  
    System.out.println("O maior número é: " + maiorNumero);
    }
}