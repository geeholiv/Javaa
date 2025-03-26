/******************************************************************************
 Ex4- Desenvolva um sistema para calcular a área de um triângulo
*******************************************************************************/
import java.util.Scanner;
public class AreaTriangulo {
  
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe a base do triangulo: ");
        double base = ler.nextDouble();
        
        System.out.print("Informe a altura do triangulo: ");
        double altura =  ler.nextDouble();
        
        double area = (base * altura) / 2;
        
        
            System.out.println("A area do triangulo é:" + area);
        }
        
        
    }
    
