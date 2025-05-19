/******************************************************************************
Sistema bancário
*******************************************************************************/
import java.util.Scanner;
public class SistemaBancario 
{
    static String[] nomes = new String[5];
    static int[] contas = new int[5];
    static double[] saldos = new double[5];
    static int totalContas = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n1. Criar nova conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    criarConta();
                    break;
                case 2:
                    depositar();
                    break;
                case 3:
                    sacar();
                    break;
                case 4:
                    consultarSaldo();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
    }

    public static void criarConta() {
        if (totalContas >= 5) {
            System.out.println("Limite de contas atingido!");
            return;
        }
        scanner.nextLine(); // Limpa o buffer do scanner
        System.out.print("Digite o nome do usuário: ");
        nomes[totalContas] = scanner.nextLine();
        contas[totalContas] = 1000 + totalContas;
        saldos[totalContas] = 0.0;
        System.out.println("Conta criada com sucesso! Número da conta: " + contas[totalContas]);
        totalContas++;
    }

    public static int buscarConta(int numero) {
        for (int i = 0; i < totalContas; i++) {
            if (contas[i] == numero) {
                return i;
            }
        }
        return -1;
    }

    public static void depositar() {
        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        int indice = buscarConta(numero);
        if (indice == -1) {
            System.out.println("Conta não encontrada!");
            return;
        }
        System.out.print("Digite o valor para depósito: ");
        double valor = scanner.nextDouble();
        if (valor > 0) {
            saldos[indice] += valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public static void sacar() {
        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        int indice = buscarConta(numero);
        if (indice == -1) {
            System.out.println("Conta não encontrada!");
            return;
        }
        System.out.print("Digite o valor para saque: ");
        double valor = scanner.nextDouble();
        if (valor > 0 && saldos[indice] >= valor) {
            saldos[indice] -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public static void consultarSaldo() {
        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        int indice = buscarConta(numero);
        if (indice == -1) {
            System.out.println("Conta não encontrada!");
            return;
        }
        System.out.println("Saldo da conta " + numero + " (usuário: " + nomes[indice] + "): R$" + saldos[indice]);
    }
}
