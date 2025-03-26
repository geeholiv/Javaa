/******************************************************************************
 Ex4- Desenvolva um sistema para calcular a média do aluno.
*******************************************************************************/
import java.util.Scanner;
public class MediaAluno {
  
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe o nome do aluno: ");
        String nome = ler.nextLine();
        
        double n1, n2, n3;
        
        System.out.print("Informe a primeira nota: ");
        n1 = ler.nextDouble();
        
        System.out.print("Informe a segunda nota: ");
        n2 = ler.nextDouble();
        
        System.out.print("Informe a terceira nota: ");
         n3 = ler.nextDouble();
        
        double soma = n1 + n2 + n3;
        double media = soma / 3;
        
        System.out.println("A média do aluno " + nome + " é: " + media);
        
        if (media >= 5) {
            System.out.println("Aluno aprovado!");
        } else { 
            System.out.println("Aluno reprovado!");
        }
        
        
    }
    
}