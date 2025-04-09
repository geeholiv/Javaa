/******************************************************************************
Ex 29 - Pergunte ao usuário quantos alunos ele
tem em sua academia
*******************************************************************************/
import java.util.Scanner;
public class Ex29 
{
 public static void main (String[] args) {
     Scanner ler = new Scanner(System.in);

     int numstudent, pesostudent, mediapeso = 0, pesototal = 0;

     System.out.println("Qual o numero de alunos cadastrados na academia?");
     numstudent = ler.nextInt();

     int numppls = 1;

     while ( numppls <= numstudent) {
     System.out.println("Qual o peso do " + numppls +"° aluno(a)?");
     pesostudent = ler.nextInt();

    pesototal += pesostudent;
    numppls++;
     }

     mediapeso = pesototal / numstudent;
     System.out.println("A média do peso dos alunos é de: " + mediapeso);

}
}


