/******************************************************************************
Ex 54 - Faça um programa para ler N valores inteiros e armazená-los em um Array.  
O programa deve contar quantos valores pares ele possui e multiplicar os valores ímpares
*******************************************************************************/
import java.util.Scanner;
public class Ex54 
{

    public static void main(String[] args) {
    double[] valores = new double[10];
    Scanner scanner = new Scanner(System.in);
    double multiplicacao = 0;
    int par = 0;
    int impar = 0;
    int imparM = 1;
   
    for (int i = 0; i < 10; i++) {
    System.out.print("Digite valores inteiros: ");
    valores[i] = scanner.nextInt();
    if(valores[i] % 2 != 0){
    impar++;
    imparM *= valores[i];
    } else {
        par++;
    }
    }
    System.out.println("Quantidade de numeros pares são:" + par + "\nE a multiplicação de valores ímpares é: "+ imparM);
    
    }
}