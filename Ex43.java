/******************************************************************************
Ex 43 - ler o salário de um funcionário e aumentá-Io em 15%. Após o aumento,
desconte 8% de impostos
*******************************************************************************/
import java.util.Scanner;
public class Ex43
{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Digite o salário do funcionário: ");
double salario = scanner.nextDouble();


 double aumentoem15 = salario * 0.15+ salario;
 double imposto =  aumentoem15 - (aumentoem15 * 0.08);

System.out.println("salario inicial: "+salario);
System.out.println("salario com aumento: "+aumentoem15);
System.out.println("salario final: "+imposto);



   scanner.close();
  }
}    