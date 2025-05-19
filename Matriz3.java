/******************************************************************************
Matriz Ex3 - Faça um programa que leia uma matriz [5,5]de inteiros e verifique se existem elementos repetidos.
Mostrar a matriz e os números repetidos.
*******************************************************************************/
public class Matriz3
{
    public static void main(String[] args) {
    ///defina a matriz 5X5
    int [][] matriz = new int [5][5];
    matriz[0][0]= 5;
    matriz[0][1]= 6;
    matriz[0][2]= 9;
    matriz[0][3]= 8;
    matriz[0][4]= 1;
 
    matriz[1][0]= 8;
    matriz[1][1]= 3;
    matriz[1][2]= 1;
    matriz[1][3]= 5;
    matriz[1][4]= 4;
 
    matriz[2][0]= 3;
    matriz[2][1]= 2;
    matriz[2][2]= 6;
    matriz[2][3]= 7;
    matriz[2][4]= 8;
    
    matriz[3][0]= 5;
    matriz[3][1]= 6;
    matriz[3][2]= 9;
    matriz[3][3]= 8;
    matriz[3][4]= 7;
    
    matriz[4][0]= 5;
    matriz[4][1]= 6;
    matriz[4][2]= 9;
    matriz[4][3]= 1;
    matriz[4][4]= 2;
    
    //imprimindo a matriz
    System.out.print("\nMatriz original: \n");
    for(int i=0; i < matriz.length; i++){
    for(int j =0; j < matriz[i].length; j++){
    System.out.print(matriz[i][j]+" ");
    }
    System.out.println();
}
   
    int[] todos = new int[25];
    int k = 0;
    for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
    todos[k] = matriz[i][j];
    k++;
 }
  }

    // Verificar e imprimir os números repetidos
    System.out.println("\nNúmeros repetidos:");
    for (int i = 0; i < todos.length; i++) {
    boolean jaMostrei = false;

    // Verifica se o número já foi mostrado
    for (int m = 0; m < i; m++) {
    if (todos[i] == todos[m]) {
    jaMostrei = true;
    break;
 }
   }
    if (!jaMostrei) {
    int contador = 0;
    for (int j = 0; j < todos.length; j++) {
    if (todos[i] == todos[j]) {
    contador++;
}
    }

    // Se aparecer mais de 1 vez, é repetido
    if (contador > 1) {
    System.out.println(todos[i]);
 }
    
   }
    }
    }
}