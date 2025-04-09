/******************************************************************************
Ex 35 - leia o nome e o valor de 10 produtos, calcule o valor total da compra e apC3s escolha a forma de pagamento
*******************************************************************************/
import java.util.Scanner;
public class Ex35 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCompra = 0;
        int quantidadeProdutos = 10;
        int i = 1;

        do {
            System.out.print("Digite o nome do " + i + "º produto: ");
            String nomeProduto = scanner.nextLine();  
            System.out.print("Digite o valor do " + i + "º produto: R$ ");
            double valorProduto = scanner.nextDouble();  
            scanner.nextLine();  
            totalCompra += valorProduto;
            i++;
        } while (i <= quantidadeProdutos);

        System.out.println("\nTotal da compra: R$ " + String.format("%.2f", totalCompra));

        int opcaoPagamento;
        do {
            System.out.println("\nEscolha a forma de pagamento:");
            System.out.println("1 - À Vista em Dinheiro ou Pix (desconto de 8%)");
            System.out.println("2 - À Vista no Cartão de Crédito (desconto de 3%)");
            System.out.println("3 - Parcelado no Cartão em 2 vezes (sem juros)");
            System.out.println("4 - Parcelado no Cartão em 3 vezes ou até 10 parcelas (juros de 10%)");
            System.out.print("Digite a opção (1/2/3/4): ");
            opcaoPagamento = scanner.nextInt();  
            scanner.nextLine();  
            if (opcaoPagamento == 1) {
                totalCompra -= totalCompra * 0.08; 
                System.out.println("Você escolheu À Vista em Dinheiro ou Pix. Desconto de 8%.");
            } else if (opcaoPagamento == 2) {
                totalCompra -= totalCompra * 0.03; 
                System.out.println("Você escolheu À Vista no Cartão de Crédito. Desconto de 3%.");
            } else if (opcaoPagamento == 3) {
                System.out.println("Você escolheu Parcelado no Cartão em 2 vezes. Sem juros.");
            } else if (opcaoPagamento == 4) {
                totalCompra += totalCompra * 0.10; 
                System.out.println("Você escolheu Parcelado no Cartão em 3 vezes ou até 10 parcelas. Juros de 10%.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcaoPagamento < 1 || opcaoPagamento > 4); 

        System.out.println("\nValor final da compra: R$ " + String.format("%.2f", totalCompra));

        scanner.close();
    }
}
