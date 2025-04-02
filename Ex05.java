/******************************************************************************
Ex 5 - Aprovar empréstimo caso o valor das parcelas representem no maximo 30% do salario do solicitante

*******************************************************************************/
import java.util.Scanner;
public class Ex05 
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       
    System.out.print("valor do empréstimo: ");
    double emprestimo=scanner.nextDouble();
    
    System.out.print("número de parcelas: ");
    double parcelas= scanner.nextDouble();
    
    System.out.print("salario do solicitante: ");
    double salario= scanner.nextDouble();
    
    double valorparcela = (emprestimo/ parcelas);

    if (valorparcela <=( 0.30 * salario)) {
    System.out.println("Empretimo aprovado");
   System.out.println("Valor da parcela: R$ " +valorparcela);

    
    } else {
    System.out.println("Emprestimo não aprovado");
   
     }
     //saida
     scanner.close();
    }
 
 }
 
