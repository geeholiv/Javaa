/******************************************************************************
Ex 44 - Ler o valor total da conta e imprimir quanto cada um deve pagar, mas faça com que
Carlos e André não paguem centavos.
*******************************************************************************/
import java.util.Scanner;
public class Ex44 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da conta no bar: ");
        double contaBar = scanner.nextDouble();

        int valorCarlosAndre = (int) (contaBar / 3); 
        double valorFelipe = contaBar - (valorCarlosAndre * 2); 

        System.out.println("Carlos e André pagarão: R$ " + valorCarlosAndre + ",00");
        System.out.println("Felipe pagará: R$ " + String.format("%.2f", valorFelipe));

        scanner.close();
    }
}
