/******************************************************************************
Matriz Ex7 - Crie um algoritmo que leia uma matriz 3x3 e crie uma nova matriz que seja a matriz
transposta da primeira (troque as linhas por colunas)
*******************************************************************************/
public class Matriz7
{
	public static void main(String[] args) {
     ///defina a matriz 3X3
    int [][] matriz = new int [3][3];
    matriz[0][0]= 5;
    matriz[0][1]= 6;
    matriz[0][2]= 9;
 
    matriz[1][0]= 8;
    matriz[1][1]= 3;
    matriz[1][2]= 1;
 
    matriz[2][0]= 3;
    matriz[2][1]= 2;
    matriz[2][2]= 6;
    
    //imprimindo a matriz
    System.out.print("\nMatriz 3X3: \n");
    for(int i=0; i < matriz.length; i++){
    for(int j =0; j < matriz[i].length; j++){
    System.out.print(matriz[i][j]+" ");
    }
    System.out.println();
}
   // Cria a matriz transposta
    int[][] novaMatriz = new int[3][3];
    for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
    novaMatriz[j][i] = matriz[i][j];
 }
   }

    // Imprime a matriz transposta
    System.out.println("\nMatriz transposta 3x3:");
    for (int i = 0; i < novaMatriz.length; i++) {
    for (int j = 0; j < novaMatriz[i].length; j++) {
    System.out.print(novaMatriz[i][j] + " ");
 }
    System.out.println();
   }
    }
}