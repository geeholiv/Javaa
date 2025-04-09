/******************************************************************************
Ex 36 - Desenvolver um programa com menu para simular uma conta corrente
*******************************************************************************/
import java.util.Scanner;
public class Ex36 
{

    public static void exibirMenu() {
        System.out.println("\nMenu da Conta Corrente:");
        System.out.println("1 - Depósito bancário");
        System.out.println("2 - Saque");
        System.out.println("3 - Saldo");
        System.out.println("4 - Sair");
    }

    public static double deposito(double saldo, Scanner scanner) {
        System.out.print("Digite o valor do depósito: R$ ");
        double valor = scanner.nextDouble();

        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido. O depósito deve ser positivo.");
        }

        return saldo;
    }

    public static double saque(double saldo, Scanner scanner) {
        System.out.print("Digite o valor do saque: R$ ");
        double valor = scanner.nextDouble();

        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        } else {
            System.out.println("Valor inválido. O saque deve ser positivo.");
        }

        return saldo;
    }

    public static void mostrarSaldo(double saldo) {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public static void main(String[] args) {
        double saldo = 0.0;
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    saldo = deposito(saldo, scanner);
                    break;
                case 2:
                    saldo = saque(saldo, scanner);
                    break;
                case 3:
                    mostrarSaldo(saldo);
                    break;
                case 4:
                    System.out.println("Saindo!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 4);  

        scanner.close(); 
    }
}

