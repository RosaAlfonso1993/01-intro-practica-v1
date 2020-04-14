package ar.edu.unahur.obj2.Ejercicio3_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Asignatura {
    ArrayList<Alumno> alumnosAnotados = new ArrayList<>();

    String nombre;

    public int getNumAsignatura() {
        return numAsignatura;
    }

    public void setNumAsignatura(int numAsignatura) {
        this.numAsignatura = numAsignatura;
    }

    int hrSem, numAsignatura;

    public int getHrSem() {
        return hrSem;
    }

    public void setHrSem(int hrSem) {
        this.hrSem = hrSem;
    }

    public ArrayList<Alumno> getAlumnosAnotados() {
        return alumnosAnotados;
    }

    public void setAlumnosAnotados(ArrayList<Alumno> alumnosAnotados) {
        this.alumnosAnotados = alumnosAnotados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void cargarDatosAsignatura(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la asignatura: ");
        this.setNombre(entrada.nextLine());

        System.out.println("Ingrese las horas semanales: ");
        this.setHrSem(Integer.parseInt(entrada.nextLine()));

        System.out.println("Ingrese ID asignatura: ");
        this.setNumAsignatura(Integer.parseInt(entrada.nextLine()));
    }

    public void cargarAlumno(Alumno alumno){
        alumnosAnotados.add(alumno);
    }
}
