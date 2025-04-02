/******************************************************************************

Ex 4 - Aumento salário

*******************************************************************************/
 import java.util.Scanner;
public class Ex04
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       
    System.out.print("Digite o salario: ");
    double salario = scanner.nextDouble();
    
    System.out.print("Digite o tempo de trabalho: ");
    double tempo = scanner.nextDouble();
       

    if (tempo>= 5 ) {
    salario= salario*1.20;
    System.out.println("O salario com o aumento de 20% será : "+salario);
    
    }else {
    salario = salario * 1.10;
    System.out.println("O salario com o aumento de 10% será: "+ salario);
   
     }
     //saida
     scanner.close();
    }
 }
