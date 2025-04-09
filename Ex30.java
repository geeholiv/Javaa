/******************************************************************************
Ex 30 - Pergunte um número ao usuário, e
mostre sua tabuada completa desse número (de 1 até 10)
*******************************************************************************/
import java.util.Scanner;
public class Ex30 
{
 public static void main (String[] args) {
     Scanner ler = new Scanner(System.in);

     int num, tabu, i = 1;
     
     System.out.print("Insira um número (1 a 10) para visualizar sua tabuada:");
     num = ler.nextInt();

     if (num < 1 || num > 10 ){
        System.out.println("Número inválido! Insira números Somente de 1 a 10.");
     } else {
        System.out.println("Tabuada do número "+ num + ":");
        while (i <= 9){
            i++;
            tabu = num * i;
            System.out.println(num + "x" + i + " = " + tabu);
        }
     }

    
    
    }
}

