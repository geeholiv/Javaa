/******************************************************************************
Ex 4 - Leia um número inteiro e informe se ele é positivo ou negativo.
*******************************************************************************/
import java.util.Scanner;
public class ex4 {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       
    System.out.print("Digite o primeiro número: ");
    int numero = scanner.nextInt();
    
     if (numero > 0 ){
    System.out.println("Numero positivo");
  
    
    } else {
    System.out.println("Numero negativo");
   
    }
}
}