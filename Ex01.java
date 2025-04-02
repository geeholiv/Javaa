/******************************************************************************

Ex1 - Média Final

*******************************************************************************/
import java.util.Scanner;
public class Ex01
{
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       
    System.out.print("Digite o nome do aluno: ");
    String nome = scanner.nextLine();
    
    System.out.print("Digite a primeira nota (0 a 10): ");
    double nota1 = scanner.nextDouble();
       
    System.out.print("Digite a segunda nota (0 a 10): ");
    double nota2 = scanner.nextDouble();
       
    double soma = nota1 + nota2;
    double media = soma / 2;
       
    System.out.println("Soma das notas: " + soma);
    System.out.println("Média das notas: " + media);
       
    if (media >= 7) {
    System.out.println("Aluno aprovado!");
    
    } else {
    System.out.println("Aluno reprovado!");
        }
       //saida
     scanner.close();
    }
}