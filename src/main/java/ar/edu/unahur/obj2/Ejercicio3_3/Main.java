package ar.edu.unahur.obj2.Ejercicio3_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        ArrayList<Asignatura> listaAsignatura = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);
        int numIngresado;

        System.out.println(
                "1-Crear nuevo alumno.\n" +
                "2-Crear nueva asignatura.\n" +
                "3-Matricular alumno en asignatura.\n" +
                "4-Listado de alumnos matriculados en una asignatura.\n" +
                "5-Listado de asignaturas en las que está matriculado un alumno y total de horas.\n" +
                "6-Salir");
        numIngresado = entrada.nextInt();

        while(numIngresado != 6){
            if(numIngresado == 1){
                Alumno alum = new Alumno();
                alum.cargarDatos();
                listaAlumnos.add(alum);
            }
            if(numIngresado == 2){
                Asignatura asig = new Asignatura();
                asig.cargarDatosAsignatura();
                listaAsignatura.add(asig);

                listadoDeMaterias(listaAsignatura);
            }
            if(numIngresado == 3){
                matricularAlumnoEnAsignatura(listaAsignatura,listaAlumnos);
            }
            if(numIngresado == 4){
                int asignatura;
                System.out.println("Ingrese la asigantura: ");
                asignatura = entrada.nextInt();

                listadoDeAlumnos(devolverAsignatura(listaAsignatura, asignatura).alumnosAnotados);
            }
            if(numIngresado == 5){
                int alumno;
                System.out.println("Ingresar DNI alumno: ");
                alumno = entrada.nextInt();

                listadoDeAsignaturasYHrsDeAlumno(listaAsignatura,devolverAlumno(listaAlumnos,alumno));
            }
            System.out.println(
                    "1-Crear nuevo alumno.\n" +
                            "2-Crear nueva asignatura.\n" +
                            "3-Matricular alumno en asignatura.\n" +
                            "4-Listado de alumnos matriculados en una asignatura.\n" +
                            "5-Listado de asignaturas en las que está matriculado un alumno y total de horas.\n" +
                            "6-Salir");
            numIngresado = entrada.nextInt();
        }
    }


    public static Asignatura devolverAsignatura(ArrayList<Asignatura> lista, int asignatura){
        Asignatura guardarAsignatura = null;
        for(Asignatura asig :lista){
            if(asig.getNumAsignatura() == asignatura){
                guardarAsignatura = asig;
            }
        }
        return guardarAsignatura;
    }

    public static Alumno devolverAlumno(ArrayList<Alumno> lista, int alumno){
        Alumno guardarAlumno = null;
        for(Alumno alm :lista){
            if(alm.getDni() == alumno){
                guardarAlumno = alm;
            }
        }
        return guardarAlumno;
    }

    public static void listadoDeAsignaturasYHrsDeAlumno(ArrayList<Asignatura> lista, Alumno al){
        ArrayList<Asignatura> listaAsignaturasAnotado = new ArrayList<>();
        int cantHrs = 0;
        for(Asignatura asig : lista){
            for(Alumno alu : asig.alumnosAnotados){
                if(alu.getDni() == al.getDni()){
                    listaAsignaturasAnotado.add(asig);
                    cantHrs += asig.getHrSem();
                }
            }
            listadoDeMaterias(listaAsignaturasAnotado);
            System.out.println("Cantidad de horas semanales que cursa: " + cantHrs);
        }
    }

    public static void listadoDeAlumnos(ArrayList<Alumno> lista){
        for(Alumno alum : lista){
            System.out.println("Nombre Completo: "+ alum.getNombre() +" "+ alum.getApellido());
        }
    }

    public static void listadoDeMaterias(ArrayList<Asignatura> lista){
        for(Asignatura asig : lista){
            System.out.println("Nombre asignatura: "+ asig.getNombre());
        }
    }

    public static void matricularAlumnoEnAsignatura(ArrayList<Asignatura> listaAsignatura, ArrayList<Alumno> listaAlumnos){
        Scanner entrada = new Scanner(System.in);

        int asignatura;
        System.out.println("Ingrese el nombre de la Asignatura: ");
        asignatura = entrada.nextInt();

        int alumno;
        System.out.println("Ingrese el DNI del alumno: ");
        alumno = entrada.nextInt();

        Alumno alu = devolverAlumno(listaAlumnos,alumno);
        Asignatura asi = devolverAsignatura(listaAsignatura,asignatura);

        asi.cargarAlumno(alu);
    }
}
