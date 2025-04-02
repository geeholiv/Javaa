/******************************************************************************
Ex 2 - Verificar maior de idade

*******************************************************************************/
import java.util.Scanner;
public class Ex02 {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       
    System.out.print("Digite a idade: ");
    int idade = scanner.nextInt();
    
       
    if (idade >= 18) {
    System.out.println("Maior de idade");
    
    } else {
    System.out.println("Menor de idade");
        }
       //saida
     scanner.close();
    }
}