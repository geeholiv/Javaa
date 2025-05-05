/******************************************************************************
Comandos de Repetição 09 - Escreva um programa que leia 20 números do usuário e exiba 
quantos números são maiores que 10
*******************************************************************************/
import java.util.Scanner;
public class Rep9
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int contador =0;
       
        
        for (int i=0; i <20; i++) {
        System.out.println("Digite o " +(i + 1)+ "° numero");
        int numero = scanner.nextInt();
    
        
       
       if (numero > 10) {
         contador ++;
       }
    }
       
           System.out.println("os numeros maiores que 10 são: "+contador);
        
    
        

    }
}