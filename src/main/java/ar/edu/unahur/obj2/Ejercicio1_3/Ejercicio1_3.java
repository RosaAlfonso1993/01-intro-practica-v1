package ar.edu.unahur.obj2.Ejercicio1_3;
import java.util.Scanner;

public class Ejercicio1_3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double[] miArrayList = new double[24];
        double num;

        for(int i = 0; i < miArrayList.length ; i++ ){
            System.out.println("Ingrese la temperatura: ");
            num = entrada.nextDouble();
            miArrayList[i] = num;
        }

        for(int r = 0 ; r < 24; r++ ) {
            double n = miArrayList[r];
            String in = "*";

            String result = "";
            for (int i = 0; i < n; i++) {
                result += in;
                System.out.print(result);
            }
            System.out.println(miArrayList[r] + " ");
        }

    }
}
