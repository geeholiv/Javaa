/******************************************************************************
Ex 26 - Mostre na tela de 0 até N, em que N é o limite inserido pelo usuário
*******************************************************************************/
import java.util.Scanner;
public class Ex26 
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero=0;

    System.out.print("Insira o numeo limite: " );
    int n = scanner.nextInt();

    while (numero <= n) {
    System.out.println(numero);
    numero++;  
    }
    
 
    }
}