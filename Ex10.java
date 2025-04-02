/******************************************************************************
Ex 10 - Cálculo do valor para encher o tanque
*******************************************************************************/
import java.util.Scanner;
public class Ex10
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tipo de carro (G - gasolina / A - álcool): ");
        char TC = sc.next().toUpperCase().charAt(0);
        System.out.print("Capacidade do tanque (litros): ");
        double CT = sc.nextDouble();

        double VG;
        if (TC == 'G') {
            VG = CT * 1.80;
        } else {
            VG = CT * 1.00;
        }

        System.out.println("Valor gasto para encher o tanque: R$ " + VG);
        sc.close();
    }
}