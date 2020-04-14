package ar.edu.unahur.obj2.Ejercicio1_5;

import java.util.Scanner;

public class Ejercicio1_5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String texto;

        System.out.println("Ingrese la palabra que quiera");
        texto = entrada.nextLine();
        visualizarRecuento(texto, contarLetras(texto));
    }

    public static int contarLetra(String cadena, char letra) {
        int cantidad = 0;
        for(int i = 0;i < cadena.length();i++){
            if(cadena.charAt(i) == letra){
                cantidad++;
            }
        }
        return cantidad;
    }

    public static int[] contarLetras(String cadena){
        int[] listaDeNumero = new int[cadena.length()];
        for(int i = 0;i < cadena.length();i++){
            listaDeNumero[i] = contarLetra(cadena, cadena.charAt(i));
        }
        return listaDeNumero;
    }

    public static void visualizarRecuento(String cadena, int[] listaDeNumeros){
        for(int i = 0; i < cadena.length();i++ ){
            System.out.println("Letra: " + cadena.charAt(i) +", cantidad de veces que aparece "+listaDeNumeros[i]);
        }
    }
}
