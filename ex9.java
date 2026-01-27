/******************************************************************************
Ex 9 - Leia um número inteiro e informe se ele é par ou ímpar.
*******************************************************************************/
import java.util.Scanner;
public class ex9 {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       
    System.out.print("Digite um número: ");
    int numero = scanner.nextInt();
    
    if (numero % 2 ==0 ){
    System.out.println(" Numero par");
  
    
    } else {
    System.out.println("Numero impar");
   
    }
}
}