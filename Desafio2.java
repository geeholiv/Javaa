/******************************************************************************
Desafio 2 - Jogo de adivinhação com dificuldade
*******************************************************************************/
import java.util.Scanner;
import java.util.Random;
public class Desafio2 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

    System.out.println("Escolha a dificuldade: 1 - Fácil (1-10), 2 - Médio (1-50), 3 - Difícil (1-100)");
    int dificuldade = scanner.nextInt();
    int max = 10;

    if (dificuldade == 2) max = 50;
    else if (dificuldade == 3) max = 100;

    int numero = random.nextInt(max) + 1;
    int tentativas = 5;

    for (int i = 1; i <= tentativas; i++) {
    System.out.print("Tentativa " + i + ": ");
    int palpite = scanner.nextInt();

    if (palpite == numero) {
    System.out.println("Parabéns! Você acertou!");
        return;
    } else if (palpite < numero) {
    System.out.println("Tente um número MAIOR.");
    } else {
    System.out.println("Tente um número MENOR.");
            }
        }

        System.out.println("Você perdeu! O número era: " + numero);
        scanner.close();
    }
}