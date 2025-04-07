/*
7)Desenvolva um programa que calcule a área de um círculo utilizando a constante Math.PI
   // Define PI como uma constante --> final double PI = Math.PI;
*/

import java.util.Scanner;
public class AreaCirculo {

public static void main(String[] args) {
final double PI = Math.PI;

Scanner scanner = new Scanner(System.in);

System.out.print("Digite o valor do raio do círculo: ");
double raio = scanner.nextDouble();

//área do círculo
double area = PI * raio * raio;


System.out.println("A área do círculo é: " + area);


scanner.close();
    }
}