/******************************************************************************
Matriz Ex1 - Desenvolver um programa que leia uma matriz 4 X 4
   a) Verificar o número de linhas e colunas
   b) Mostrar a matriz  formatada
*******************************************************************************/
public class Matriz1
{
    public static void main(String[] args) {
    ///defina a matriz 4X4
    int [][] matriz = new int [4][4];
       matriz[0][0]= 5;
       matriz[0][1]= 6;
       matriz[0][2]= 8;
       matriz[0][3]= 4;
       
       matriz[1][0]= 8;
       matriz[1][1]= 3;
       matriz[1][2]= 1;
       matriz[1][3]= 9;
       
       matriz[2][0]= 3;
       matriz[2][1]= 2;
       matriz[2][2]= 6;
       matriz[2][3]= 6;
       
       matriz[3][0]= 9;
       matriz[3][1]= 4;
       matriz[3][2]= 7;
       matriz[3][3]= 5;
       
    
    //imprimindo a matriz
    System.out.print("\nMatriz 4X4: \n");
    for(int i=0; i < matriz.length; i++){
        for(int j =0; j < matriz[i].length; j++){
            System.out.print(matriz[i][j]+"");
        }
        System.out.println();
    }
    }
    }