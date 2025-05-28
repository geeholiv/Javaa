/******************************************************************************
Matriz Ex4 - Crie um programa que leia uma matriz 5x5. Em seguida, conte quantos
números pares existem na matriz.
*******************************************************************************/
public class Matriz4
{
	public static void main(String[] args) {
    ///defina a matriz 5X5
    int [][] matriz = new int [5][5];
 
    matriz[0][0]= 5;
    matriz[0][1]= 6;
    matriz[0][2]= 8;
    matriz[0][3]= 4;
    matriz[0][4]= 7;
 
    matriz[1][0]= 8;
    matriz[1][1]= 3;
    matriz[1][2]= 1;
    matriz[1][3]= 9;
    matriz[1][4]= 4;
 
    matriz[2][0]= 3;
    matriz[2][1]= 2;
    matriz[2][2]= 6;
    matriz[2][3]= 6;
    matriz[2][4]= 5;
   
    matriz[3][0]= 9;
    matriz[3][1]= 4;
    matriz[3][2]= 7;
    matriz[3][3]= 5;
    matriz[3][4]= 2;
    
    matriz[4][0]= 9;
    matriz[4][1]= 4;
    matriz[4][2]= 7;
    matriz[4][3]= 5;
    matriz[4][4]= 1;
    
    int par = 0;
    
    System.out.print("\nMatriz 5X5: \n");
    for(int i=0; i < matriz.length; i++){
    for(int j =0; j < matriz[i].length; j++){
    System.out.print(matriz[i][j]+"");
    if(matriz[i][j] % 2 != 0){
    par++;
    }
    }
    System.out.println();
    }
    System.out.println("\nOs numeros pares são:"+ par);
    
    }
    }]