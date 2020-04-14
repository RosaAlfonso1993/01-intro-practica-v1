package ar.edu.unahur.obj2.Ejercicio3_1;

import java.util.ArrayList;
import java.util.Scanner;

public class LineaTicket {
    String producto;
    double precioPorUnidad;
    int numUnidades;

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public void setPrecioPorUnidad(double precioPorUnidad) {
        this.precioPorUnidad = precioPorUnidad;
    }

    public int getNumUnidades() {
        return numUnidades;
    }

    public void setNumUnidades(int numUnidades) {
        this.numUnidades = numUnidades;
    }

    public void cargarProducto(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el nombre del producto: ");
        this.setProducto(entrada.nextLine());

        System.out.println("Ingresa el precio por unidad: ");
        this.setPrecioPorUnidad(Double.parseDouble(entrada.nextLine()));

        System.out.println("Ingrese la cantidad de unidades: ");
        this.setNumUnidades(Integer.parseInt(entrada.nextLine()));
    }

    public double getPrecioTotal(){
        return getNumUnidades()*getPrecioPorUnidad();
    }
}
