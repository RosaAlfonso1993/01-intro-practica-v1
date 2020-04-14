package ar.edu.unahur.obj2.Ejercicio3_1;

import ar.edu.unahur.obj2.Ejercicio2_1.Empleado;

import java.util.ArrayList;
import java.util.Scanner;

public class Ticket {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<LineaTicket> productos = new ArrayList<>();
        int numIngresado;

        System.out.println("Ingrese 1 para continuar y 0 para finalizar");
        numIngresado = entrada.nextInt();

        while (numIngresado != 0) {
            LineaTicket producto = new LineaTicket();
            producto.cargarProducto();
            productos.add(producto);
            System.out.println("Ingrese 1 para continuar y 0 para finalizar");
            numIngresado = entrada.nextInt();
        }

        getLista_Ticket(productos);
    }

    public static void getLista_Ticket(ArrayList<LineaTicket> producto){
        double total = 0;
        System.out.println("Listado de productos: "+ "\n");
        for(LineaTicket lt :producto){
            total += lt.getPrecioTotal();
            System.out.println("Producto: " + lt.getProducto());

            System.out.println("Precio por unidad: " + lt.getPrecioPorUnidad());

            System.out.println("Cantidad de producto: " + lt.getNumUnidades());

            System.out.println("Precio total: " + lt.getPrecioTotal() + "\n");
        }
        System.out.println("Total Ticket: " + total);
    }
}
