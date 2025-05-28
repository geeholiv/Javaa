/******************************************************************************
Matriz Ex6 - Crie um algoritmo informe qual o maior e qual o menor elemento 
existente em uma matriz 6x3.
*******************************************************************************/
public class Matriz6
{
	public static void main(String[] args) {
    ///defina a matriz 6X3
    int [][] matriz = new int [6][3];
    matriz[0][0]= 5;
    matriz[0][1]= 6;
    matriz[0][2]= 8;
    
    matriz[1][0]= 4;
    matriz[2][1]= 7;
    matriz[2][2]= 3;
 
    matriz[3][0]= 8;
    matriz[3][1]= 3;
    matriz[3][2]= 1;
    
    matriz[4][0]= 9;
    matriz[4][1]= 4;
    matriz[4][2]= 2;
 
    matriz[5][0]= 3;
    matriz[5][1]= 2;
    matriz[5][2]= 6;
    
    int maior = matriz[0][0];
    int menor = matriz[0][0];
    
    //imprimindo a matriz
    System.out.print("\nMatriz 6X3: \n");
    for(int i=0; i < matriz.length; i++){
    for(int j =0; j < matriz[i].length; j++){
    System.out.print(matriz[i][j]+" ");

    // Verifica maior e menor elemento
    if (matriz[i][j] > maior) {
    maior = matriz[i][j];
 }
    if (matriz[i][j] < menor) {
    menor = matriz[i][j];
 }
   }
    System.out.println();
}

    System.out.println("\nMaior elemento: " + maior);
    System.out.println("Menor elemento: " + menor);
}
}