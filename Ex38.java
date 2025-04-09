/******************************************************************************
Ex 38 - Algoritmo para ler as quantidades de pães e de broas, e depois calcular os dados solicitados
*******************************************************************************/
import java.util.Scanner;
public class Ex38
{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Digite a quantidade de broas vendidas: ");
int broas = scanner.nextInt();
System.out.println("Digite a quantidade de paes franceses vendidos: ");
int paof = scanner.nextInt();

double paofTotal;
double broasTotal;
paofTotal = (paof*0.12);
broasTotal = (broas*1.50);

double total;
total = (paofTotal + broasTotal);

System.out.println("A quantidade total vendida foi: "+ total);

double guardar;
guardar = total/ 10;
System.out.println("A quantidade que sera guardado na poupança sera: "+ guardar);

  }
}    
