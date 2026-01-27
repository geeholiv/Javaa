/******************************************************************************
Ex 8 - Leia 5 números inteiros e calcule a média deles.
*******************************************************************************/
import java.util.Scanner;
public class ex8 {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      int soma = 0;
      int media;
       
    for(int i = 1; i <= 5; i++) {
    System.out.print("Insira o "+(i)+" número inteiro: ");
    int num = scanner.nextInt();
    soma += num;
}
media = soma/5;

System.out.print("A média dos números inseridos é: "+ media);


}

    }