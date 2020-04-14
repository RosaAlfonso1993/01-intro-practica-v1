package ar.edu.unahur.obj2.Ejercicio1_6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1_6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];


        for(int i=0;i < 3;i++){
            for(int j = 0; j < 3 ;j++){
                System.out.println("Ingrese los numeros de la posicion "+i+" "+j + ": ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        for(int i = 0;i < 3;i++){
            for(int j = 0; j< 3;j++){
                System.out.format(" " + matriz[i][j]);
            }
            System.out.println();
        }
    }
}
