/******************************************************************************
Ex 7 - Leia um número inteiro e mostre a tabuada desse número.
*******************************************************************************/
import java.util.Scanner;
public class ex7 {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num, multinatabu, i = 0;
       
       
       System.out.print("Digite um número (1 a 10) para visualizar a sua tabuada: ");
    num = scanner.nextInt();


while (i <= 9){
i++;
multinatabu = num * i;
System.out.println(num + "x" + i + " = " + multinatabu);


}

    }
}