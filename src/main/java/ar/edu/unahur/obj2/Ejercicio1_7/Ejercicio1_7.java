package ar.edu.unahur.obj2.Ejercicio1_7;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1_7 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[10][10];
        Random r = new Random();

        for(int i = 0;i < 10;i++){
            for(int j = 0;j < 10;j++){
                matriz[i][j] = r.nextInt(100);
            }
        }

        for(int i = 0;i < 10;i++){
            for(int j = 0; j< 10;j++){
                System.out.format(" " + matriz[i][j]);
            }
            System.out.println();
        }
    }
}
