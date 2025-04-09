/******************************************************************************
Ex 41 - Leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar
*******************************************************************************/
import java.util.Scanner;
public class Ex41
{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Digite o peso do prato montado (kg): ");
double pesoPratoMontado = scanner.nextDouble();
double precoPorKg = 12.00;

 double valorAPagar = pesoPratoMontado * precoPorKg;

System.out.printf("Valor a pagar: R$ %.2f\n", valorAPagar);

   scanner.close();
  }
}    
