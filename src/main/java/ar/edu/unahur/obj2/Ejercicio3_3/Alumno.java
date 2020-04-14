package ar.edu.unahur.obj2.Ejercicio3_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
    String nombre, apellido;
    int edad, dni;

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void cargarDatos(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        this.setNombre(entrada.nextLine());

        System.out.println("Ingrese el apellido: ");
        this.setApellido(entrada.nextLine());

        System.out.println("Ingrese el DNI: ");
        this.setDni(Integer.parseInt(entrada.nextLine()));

        System.out.println("Ingrese la edad: ");
        this.setEdad(Integer.parseInt(entrada.nextLine()));
    }
}
