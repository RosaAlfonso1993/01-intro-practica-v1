package ar.edu.unahur.obj2.Ejercicio2_1;

import java.util.Scanner;

public class Administrador extends Empleado {
    int hsExtras, hsMes;

    public int getHsExtras() {
        return hsExtras;
    }

    public void setHsExtras(int hsExtras) {
        this.hsExtras = hsExtras;
    }

    public int getHsMes() {
        return hsMes;
    }

    public void setHsMes(int hsMes) {
        this.hsMes = hsMes;
    }

    @Override
    public void cargar_Datos() {
        super.cargar_Datos();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas extra: ");
        this.setHsExtras(Integer.parseInt(entrada.nextLine()));

        System.out.println("Ingrese la cantidad de horas de mes");
        this.setHsMes(Integer.parseInt(entrada.nextLine()));
    }

    /*Si es administrativo: sueldoBase * ((hsExtra * 1.5)+hsMes) / hsMes*/
    public double getSueldo(){
        return getSueldoBase()*((getHsExtras()*1.5) + getHsMes())/getHsMes();
    }
}
