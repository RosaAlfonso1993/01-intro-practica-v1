package ar.edu.unahur.obj2.Ejercicio1_4;

import java.util.Scanner;

public class Ejercicio1_4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int i = 0;
        System.out.println("Ingrese los nombres de todos sus compañeros e ingrese la palabra FIN cuando quiera terminar");

        String[] lista = new String[1000];

        do {
            nombre = entrada.nextLine();
            if(!"FIN".equals(nombre)) {
                lista[i] = nombre;
                i++;
            }
        }while (!"FIN".equals(nombre));

        System.out.println("Ingrese la inicial que quiera buscar: ");
        String inicial = entrada.nextLine();

        for (int j = 0;j < i ;j++){
            if(lista[j].charAt(0) == inicial.charAt(0)){
                System.out.print(lista[j] + " ");
            }
        }
    }
}
