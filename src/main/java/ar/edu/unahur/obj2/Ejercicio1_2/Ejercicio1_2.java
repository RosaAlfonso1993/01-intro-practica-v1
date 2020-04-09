package ar.edu.unahur.obj2.Ejercicio1_2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ejercicio1_2 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int num1;
        int[] lista = {12,4,234,63,75,234,74,23,425,536,1,24,6,86,34,65,7,3,78,977,234};

        System.out.println("Introduzca un numero: ");
        num1 = entrada.nextInt();

        for (int i = 0 ; i < lista.length ;i++ ){
            if(lista[i] > num1){
                System.out.print(lista[i] + " ");
            }
        }
    }
}
