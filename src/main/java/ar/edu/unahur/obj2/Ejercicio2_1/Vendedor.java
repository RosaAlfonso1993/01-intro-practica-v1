package ar.edu.unahur.obj2.Ejercicio2_1;

import java.util.Scanner;

public class Vendedor extends Empleado{
    double porcetajeComision;
    int totalVentas;

    public double getPorcetajeComision() {
        return porcetajeComision;
    }

    public void setPorcetajeComision(double porcetajeComision) {
        this.porcetajeComision = porcetajeComision;
    }

    public int getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }

    @Override
    public void cargar_Datos() {
        super.cargar_Datos();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el porcentaje de comisión: ");
        this.setPorcetajeComision(Double.parseDouble(entrada.nextLine()));

        System.out.println("Ingrese el total de ventas: ");
        this.setTotalVentas(Integer.parseInt(entrada.nextLine()));
    }

    @Override
    /*Si es vendedor: sueldoBase + (porcenComision*totalVtas/100)*/
    public double getSueldo() {
        return getSueldoBase()+(getPorcetajeComision()*getTotalVentas()/100);
    }
}
