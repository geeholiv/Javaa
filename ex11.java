/******************************************************************************
Exercício 11:  Crie uma classe chamada Pessoa com os atributos nome e idade.

*******************************************************************************/
import java.util.Scanner;
public class Pessoa {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       
    System.out.print("Digite seu nome: ");
    String nome = scanner.nextLine();
    
    System.out.print("Digite sua idade: ");
    int idade = scanner.nextInt();
    

    }
}
