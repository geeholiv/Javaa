/******************************************************************************
Ex 27 - Permita o usuário escrever o nome de cinco pessoas e os mostre na tela
*******************************************************************************/
import java.util.Scanner;
public class Ex27 
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] nomes = new String[5];
    
    int i = 0;
    while (i < 5) {
    System.out.print("Insira o nome da pessoa " + (i + 1) + ": ");
    nomes[i] = scanner.nextLine();  
    i++;
    }


    System.out.println("\nNomes inseridos:");
    for (int j = 0; j < 5; j++) {
    System.out.println(nomes[j]);
    }
        
    scanner.close();
    }
}