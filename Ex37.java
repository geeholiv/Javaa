/******************************************************************************
Ex 37 - Calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras
*******************************************************************************/
import java.util.Scanner;
public class Ex37
{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Digite a quantidade de cavalos comprados para um haras: ");
int quant = scanner.nextInt();

int ferraduras;
ferraduras = (quant * 4);
System.out.println("A quantidade de ferraduras para equipar todos os cavalos sera: "+ ferraduras);
  }
}    