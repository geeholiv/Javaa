/******************************************************************************
Ex 45 - Faça um algoritmo em que o dono forneça a quantidade de sanduíches a fazer, e a máquina informe as quantidades (em
quilos) de queijo, presunto e carne necessários para compra 
*******************************************************************************/
import java.util.Scanner;
public class Ex45 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de sanduíches a fazer: ");
        int quantidadeSanduiches = scanner.nextInt();

        int pesoQueijoPorSanduiche = 100;
        int pesoPresuntoPorSanduiche = 50;
        int pesoHamburguerPorSanduiche = 100;
   
        int totalQueijo = pesoQueijoPorSanduiche * quantidadeSanduiches;
        int totalPresunto = pesoPresuntoPorSanduiche * quantidadeSanduiches;
        int totalHamburguer = pesoHamburguerPorSanduiche * quantidadeSanduiches;

       
        double totalQueijoKg = totalQueijo / 1000.0;
        double totalPresuntoKg = totalPresunto / 1000.0;
        double totalHamburguerKg = totalHamburguer / 1000.0;

       
        System.out.println("Para " + quantidadeSanduiches + " sanduíches, você precisará de:");
        System.out.println(totalQueijoKg + " kg de queijo.");
        System.out.println(totalPresuntoKg + " kg de presunto.");
        System.out.println(totalHamburguerKg + " kg de hambúrguer.");


        scanner.close();
    }
}