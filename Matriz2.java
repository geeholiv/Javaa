/******************************************************************************
Matriz Ex2 - Faça um programa que leia uma matriz 3x4 de inteiros, substitua seus
elementos negativos por 0 e imprima a matriz original e a modificada.
*******************************************************************************/
public class Matriz2
{
    public static void main(String[] args) {
    ///defina a matriz 3X4
    int [][] matriz = new int [3][4];
    matriz[0][0]= 5;
    matriz[0][1]= 6;
    matriz[0][2]= 9;
    matriz[0][3]= 8;
 
    matriz[1][0]= 8;
    matriz[1][1]=(-3);
    matriz[1][2]= 1;
    matriz[1][3]= 5;
 
    matriz[2][0]= 3;
    matriz[2][1]= 2;
    matriz[2][2]= (-6);
    matriz[2][3]= 7;
    
    //imprimindo a matriz
    System.out.print("\nMatriz original: \n");
    for(int i=0; i < matriz.length; i++){
    for(int j =0; j < matriz[i].length; j++){
    System.out.print(matriz[i][j]+" ");
    }
    System.out.println();
}
    // Substitui elementos negativos por 0
    for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
    if (matriz[i][j] < 0) {
    matriz[i][j] = 0;
    }
    }
    }
    // Imprime a matriz modificada
    System.out.println("\nMatriz Modificada (sem negativos):");
    for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
    System.out.print(matriz[i][j] + " ");
}
    System.out.println();
       }
    }
}