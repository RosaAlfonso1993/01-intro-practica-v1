package ar.edu.unahur.obj2.Ejercicio2_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numIngresado = 3;
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();

        do {
            System.out.println("Ingrese 1 si el empleado es Administrador, o 2 si el empleado es Vendedor. Ingrese 0 para finalizar");
            numIngresado = entrada.nextInt();

            if(numIngresado == 1){
                Administrador adm = new Administrador();
                adm.cargar_Datos();
                empleados.add(adm);
            }
            if(numIngresado == 2){
                Vendedor vend = new Vendedor();
                vend.cargar_Datos();
                empleados.add(vend);
            }

        } while (numIngresado != 0);

        getLista_Empleado(empleados);
    }

    public static void getLista_Empleado(ArrayList<Empleado> empleados){
        System.out.println("Listado de empleados: "+ "\n");
        for(Empleado e :empleados){

            System.out.println("Nombre: " + e.getNombre());

            System.out.println("DNI: " + e.getDNI());

            System.out.println("Apellido: " + e.getApellido());

            System.out.println("Sueldo: " + e.getSueldo() + "\n");
        }
    }
}
