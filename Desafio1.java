/******************************************************************************
Desafio 1 - Sistema de votação com contagem por candidato
*******************************************************************************/
import java.util.Scanner;
public class Desafio1
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int votosCandidato1 = 0;
    int votosCandidato2 = 0;
    int votosCandidato3 = 0;

    int voto;

    System.out.println("Sistema de Votação");
    System.out.println("Vote em um dos candidatos:");
    System.out.println("1 - Candidato 1");
    System.out.println("2 - Candidato 2");
    System.out.println("3 - Candidato 3");
    System.out.println("Digite 0 para encerrar a votação.");

    while (true) {
        System.out.print("Digite seu voto: ");
        voto = scanner.nextInt();

    if (voto == 0) {
    break;
        } else if (voto == 1) {
            votosCandidato1++;
        } else if (voto == 2) {
            votosCandidato2++;
        } else if (voto == 3) {
            votosCandidato3++;
        } else {
        System.out.println("Voto inválido! Por favor, vote em 1, 2 ou 3.");
            }
        }

    System.out.println("\nResultado da votação:");
    System.out.println("Candidato 1: " + votosCandidato1 + " votos");
    System.out.println("Candidato 2: " + votosCandidato2 + " votos");
    System.out.println("Candidato 3: " + votosCandidato3 + " votos");

        
    if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3) {
        System.out.println("Candidato 1 é o vencedor!");
    } else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3) {
        System.out.println("Candidato 2 é o vencedor!");
    } else if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2) {
        System.out.println("Candidato 3 é o vencedor!");
    } else {
        System.out.println("Houve um empate!");
        }

        scanner.close();
    }
}
