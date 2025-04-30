/******************************************************************************
Ex 51 - Desenvolva um algoritmo que preencha aleatoriamente um vetor de 10 posicões com números entre 0 a 100. 
Calcule e escreva o maior, menor e a média desses números.
*******************************************************************************/
import java.util.Random;
public class Ex51
{
    public static void main(String[] args) {
      int[] num1 = new int [10];
      Random number = new Random();
      int maiornumber = 0;
      int menornumber = 100;
      int totalnum = 0;
       
      for (int i = 0; i < num1.length ; i++){
      num1[i]= number.nextInt(100);
      System.out.println("o "+ i +" º numero é de: "+ num1[i]);
      totalnum += num1[i];
      
      if(num1[i] < menornumber){
      menornumber = num1[i];
      } else if(num1[i] > maiornumber){
      maiornumber = num1[i];
    }
   }
      double nahidwin = totalnum / 10;
      System.out.println("o maior numero é: " + maiornumber);
      System.out.println("o menor numero é: " + menornumber);
      System.out.println("a media é de: " + nahidwin);
        
        
    }
}