/******************************************************************************
Ex 3 - Identificar o maior número

*******************************************************************************/
import java.util.Scanner;
public class Ex03 {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       
    System.out.print("Digite o primeiro numero: ");
    double numero1 = scanner.nextDouble();
    
    System.out.print("Digite o segundo numero: ");
    double numero2 = scanner.nextDouble();
       
    System.out.print("Digite o terceiro numero: ");
    double numero3 = scanner.nextDouble();
       
    if (numero1 >= numero2 && numero1 >= numero3) {
    System.out.println("O primeiro numero é maior");
    
    }else if (numero2 >= numero1 && numero2 >= numero3) {
    System.out.println("O segundo numero é maior");
    } else {
    System.out.println("O terceiro numero é maior");
     }
     //saida
     scanner.close();
    }
 }
