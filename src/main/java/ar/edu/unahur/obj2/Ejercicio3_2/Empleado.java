package ar.edu.unahur.obj2.Ejercicio3_2;

import java.util.Scanner;

public class Empleado {
    String nombre;
    String apellido;
    int dni, edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void cargarDatosEmpleado(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del nuevo empleado: ");
        this.setNombre(entrada.nextLine());

        System.out.println("Ingrese el apellido del nuevo empleado: ");
        this.setApellido(entrada.nextLine());

        System.out.println("Ingrese el DNI del nuevo empleado: ");
        this.setDni(Integer.parseInt(entrada.nextLine()));

        System.out.println("Ingrese la edad del nuevo empleado: ");
        this.setEdad(Integer.parseInt(entrada.nextLine()));
    }
}
