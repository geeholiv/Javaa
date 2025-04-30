/******************************************************************************
Ex 50 - Desenvolva um algoritmo que leia um vetor de 10 elementos com valores de uma compra no final mostre o valor gasto e o imposto.
a) Se a compra foi acima de R1.200,00 colocar imposto de 2.5% senão colocar imposto de 0.8%.
b) Mostrar os valores finais com e sem imposto
*******************************************************************************/
import java.util.Scanner;
public class Ex50 
{
public static void main(String[] args) {
    double[] compras = new double[10];
    double total = 0;  
    Scanner scanner = new Scanner(System.in);
       
    System.out.println("Digite os 10 valores das compras:");
    for (int i = 0; i < 10; i++) {
    System.out.print("Valor da compra " + (i + 1) + ": ");
    compras[i] = scanner.nextDouble();
    total += compras[i];  
}
       
    double imposto;
    if (total > 1200) {
    imposto = total * 0.025;  
} else {
    imposto = total * 0.008;
}
       
    double totalComImposto = total + imposto;
       
    System.out.println("\nTotal da compra sem imposto: R$ " + total);
    System.out.println("Imposto: R$ " + imposto);
    System.out.println("Total com imposto: R$ " + totalComImposto);
    }
}