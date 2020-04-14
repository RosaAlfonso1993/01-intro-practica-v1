package ar.edu.unahur.obj2.Ejercicio2_1;

import java.util.Scanner;

public abstract class Empleado {
    int DNI;
    String nombre;
    String apellido;
    String email;
    double sueldoBase;

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void cargar_Datos(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese DNI");
        this.setDNI(Integer.parseInt(entrada.nextLine()));

        System.out.println("Ingrese Nombre");
        this.setNombre(entrada.nextLine());

        System.out.println("Ingrese Apellido");
        this.setApellido(entrada.nextLine());

        System.out.println("Ingrese mail");
        this.setEmail(entrada.nextLine());

        System.out.println("Ingrese Salario base");
        this.setSueldoBase(Double.parseDouble(entrada.nextLine()));
    }

    public abstract double getSueldo();
}
