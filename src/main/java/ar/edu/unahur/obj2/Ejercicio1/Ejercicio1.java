package ar.edu.unahur.obj2.Ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args){
        int[] n = new int[10];

        int[] v = {1,8,6,9,5,3,9,56,98,7};

        System.out.println("valor posicion 7: " + v[2]);

        for (int i = 9; i >= 0; i--){
            System.out.print(v[i] + " ");
        }
    }
}
