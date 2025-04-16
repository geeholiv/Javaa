/******************************************************************************
Desafio 4 - Caixa eletrônico com cédulas disponíveis
*******************************************************************************/
import java.util.Scanner;
public class Desafio4
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] cedulas = {100, 50, 20, 10, 5};

    System.out.print("Digite o valor do saque: ");
    int valor = scanner.nextInt();
    int valorInicial = valor;
    int[] resultado = new int[cedulas.length];

    for (int i = 0; i < cedulas.length; i++) {
    resultado[i] = valor / cedulas[i];
    valor %= cedulas[i];
        }

    if (valor != 0) {
    System.out.println("Não é possível sacar esse valor com as cédulas disponíveis.");
        } else {
    System.out.println("Saque de R$" + valorInicial + ":");
    for (int i = 0; i < cedulas.length; i++) {
    if (resultado[i] > 0) {
    System.out.println(cedulas[i] + " reais: " + resultado[i] + " cédula(s)");
                }
            }
        }

        scanner.close();
    }
}