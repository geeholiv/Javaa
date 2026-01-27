
/******************************************************************************
Ex 2 -  Leia um número inteiro e mostre o dobro desse número.
*******************************************************************************/
import java.util.Scanner;
public class ex2 {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       
    System.out.print("Digite um número: ");
    int numero = scanner.nextInt();
    
    int resultado = numero * 2;
    
    System.out.println("O dobro do número é: "+resultado);
    
    }
}
