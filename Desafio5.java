/******************************************************************************
Desafio 5 - Simulador de empréstimo com juros compostos
*******************************************************************************/
import java.util.Scanner;
public class Desafio5
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    while (true) {
    System.out.print("Digite o valor do empréstimo (0 para sair): ");
    double valor = scanner.nextDouble();
    if (valor == 0) break;

    System.out.print("Digite o número de parcelas: ");
    int parcelas = scanner.nextInt();

    double taxa = 0.02;
    double valorFinal = valor * Math.pow(1 + taxa, parcelas);
    double valorParcela = valorFinal / parcelas;

    System.out.printf("Valor final com juros: R$ %.2f\n", valorFinal);
    System.out.printf("Valor de cada parcela: R$ %.2f\n", valorParcela);
        }

        scanner.close();
    }
}
