/******************************************************************************
Ex 09 - Algoritmo para calcular valor do estacionamento

*******************************************************************************/
import java.util.Scanner;
public class Ex09
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hora de entrada: ");
        int HE = sc.nextInt();
        System.out.print("Minuto de entrada: ");
        int ME = sc.nextInt();
        System.out.print("Hora de saída: ");
        int HS = sc.nextInt();
        System.out.print("Minuto de saída: ");
        int MS = sc.nextInt();

        int minutosEntrada = HE * 60 + ME;
        int minutosSaida = HS * 60 + MS;

        int tempoTotal = minutosSaida - minutosEntrada;

        int horasCobradas = (tempoTotal + 59) / 60; // Arredonda para cima

        int PAG;
        if (horasCobradas == 1) {
            PAG = 4;
        } else if (horasCobradas == 2) {
            PAG = 6;
        } else {
            PAG = 6 + (horasCobradas - 2);
        }

        System.out.println("Valor a pagar: R$ " + PAG);
        sc.close();
    }
}