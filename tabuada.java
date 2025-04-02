/******************************************************************************
exemplo de repeticao
*******************************************************************************/
import java.util.Scanner;
public class tabuada
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int n;
	
	System.out.print("Digite um numero para ver a tabuada: ");
	n = ler.nextInt ();
	
	System.out.print("Tabuada do " + n + ":");
	for (int i = 1; i <= 10; i++) {
	    System.out.println(n + "X" + i + "=" + (n*i));
	}
	}
}
