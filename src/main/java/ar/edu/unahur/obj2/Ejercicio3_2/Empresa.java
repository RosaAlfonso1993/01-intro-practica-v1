package ar.edu.unahur.obj2.Ejercicio3_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    ArrayList<Empleado> listaEmpleado = new ArrayList<>();

    String nombre;
    int cuil;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public ArrayList<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(ArrayList<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }


    public void cargarDatosEmpresa(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la empresa: ");
        this.setNombre(entrada.nextLine());

        System.out.println("Ingrese el cuil de la empresa: ");
        this.setCuil(Integer.parseInt(entrada.nextLine()));
    }

    public void cargarListaDeEmpleados(){
        Empleado emp = new Empleado();
        emp.cargarDatosEmpleado();
        listaEmpleado.add(emp);
    }

}
