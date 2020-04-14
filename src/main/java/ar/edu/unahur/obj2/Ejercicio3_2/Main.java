package ar.edu.unahur.obj2.Ejercicio3_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Empresa> listaEmpresas = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);
        int numIngresado;

        System.out.println(
                "1-Crear nueva empresa.\n" +
                "2-Añadir empleado a empresa ya existente.\n" +
                "3-Listado de empresas.\n" +
                "4-Listado detallado de empresas y empleados.\n" +
                "5-Salir\n");
        numIngresado = entrada.nextInt();

        while (numIngresado != 5){
            if(numIngresado == 1){
                Empresa empr = new Empresa();
                empr.cargarDatosEmpresa();
                listaEmpresas.add(empr);
            }if(numIngresado == 2){
                int cuil;
                System.out.println("Ingrese el numero de cuil de la empresa que busca: ");
                cuil = entrada.nextInt();
                if(devolverEmpresa(cuil, listaEmpresas) == null){
                    System.out.println("El cuil que ingreso no pertenece a ninguna empresa existente");
                }
                else{
                    devolverEmpresa(cuil, listaEmpresas).cargarListaDeEmpleados();
                }
            }if(numIngresado == 3){listadoDeEmpresas(listaEmpresas);}
            if(numIngresado == 4){listadoDetalladoDeEmpresasYEmpleados(listaEmpresas);}

            System.out.println(
                    "1-Crear nueva empresa.\n" +
                            "2-Añadir empleado a empresa ya existente.\n" +
                            "3-Listado de empresas.\n" +
                            "4-Listado detallado de empresas y empleados.\n" +
                            "5-Salir\n");
            numIngresado = entrada.nextInt();
        }
    }

    public static Empresa devolverEmpresa(int cuil, ArrayList<Empresa> list){
        Empresa guardada = null;
        for(Empresa em : list){
            if(em.getCuil() == cuil){
                guardada = em;
            }
        }
        return guardada;
    }

    public static void listadoDeEmpresas(ArrayList<Empresa> lista){
        for(Empresa emp : lista){
            System.out.println("Nombre de empresa: " + emp.getNombre());
        }
    }

    public static void listadoDetalladoDeEmpresasYEmpleados(ArrayList<Empresa> lista){
        for(Empresa emp : lista){
            System.out.println("Nombre de empresa: " + emp.getNombre());
            devolverListaEmpleados(emp.listaEmpleado);
            System.out.println("\n");
        }
    }

    public static void devolverListaEmpleados(ArrayList<Empleado> lista){
        for(Empleado le: lista){
            System.out.println("Nombre Completo: " + le.getNombre() + " " + le.getApellido());
        }
    }
}
