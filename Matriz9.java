/******************************************************************************
Matriz Ex9 - Desenvolva um programa que leia duas matrizes 5x2 e crie uma terceira matriz também 5x2
com o valor da soma dos elementos de mesmo índice.
*******************************************************************************/
public class Matriz9
{
	public static void main(String[] args) {
    ///defina a matriz 5X2
    int [][] matriz1 = new int [5][2];
    matriz1[0][0]= 5;
    matriz1[0][1]= 6;
    
    matriz1[1][0]= 4;
    matriz1[1][1]= 7;
 
    matriz1[2][0]= 8;
    matriz1[2][1]= 3;
    
    matriz1[3][0]= 9;
    matriz1[3][1]= 4;
    
    matriz1[4][0]= 9;
    matriz1[4][1]= 4;
    
    //matriz2
    int [][] matriz2 = new int [5][2];
    matriz2[0][0]= 8;
    matriz2[0][1]= 7;
    
    matriz2[1][0]= 6;
    matriz2[1][1]= 5;
 
    matriz2[2][0]= 4;
    matriz2[2][1]= 3;
    
    matriz2[3][0]= 2;
    matriz2[3][1]= 1;
    
    matriz2[4][0]= 4;
    matriz2[4][1]= 8;
    
int[][] matrizSoma = new int[5][2];

    // Calculando a soma das matrizes
    for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 2; j++) {
    matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
  }
}

    // Imprimindo a primeira matriz
    System.out.println("Primeira matriz 5x2:");
    for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 2; j++) {
    System.out.print(matriz1[i][j] + " ");
}
    System.out.println();
}

    // Imprimindo a segunda matriz
    System.out.println("\nSegunda matriz 5x2:");
    for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 2; j++) {
    System.out.print(matriz2[i][j] + " ");
}
    System.out.println();
}

    // Imprimindo a matriz soma
    System.out.println("\nMatriz soma 5x2:");
    for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 2; j++) {
    System.out.print(matrizSoma[i][j] + " ");
}
    System.out.println();
   }
    }
}