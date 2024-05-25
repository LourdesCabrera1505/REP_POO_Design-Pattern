package Biblioteca;

import java.util.Scanner;

public class SingletonBiblioteca {

    // Sistema de clasificacion dewey
    private int Clase;
    private float Numero_Clasificacion;
    private String Seccion;
    private int Volumen;
    private static SingletonBiblioteca instance;

    private SingletonBiblioteca(int clase, float numero_Clasificacion, String seccion, int volumen) {
        Clase = clase;
        Numero_Clasificacion = numero_Clasificacion;
        Seccion = seccion;
        Volumen = volumen;
    }

    public static  SingletonBiblioteca getInstance() {
        if (instance == null) {
            createInstanceFromUserPut();
        }
        return  instance;
    }


    private static void createInstanceFromUserPut() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la clase donde se ubicara el material → ");
        int clase = scan.nextInt();
        scan.nextLine();

        System.out.println("Ingrese el numero de clasificacion que tendra → ");
        float numero_Clasificacion = scan.nextFloat();
        scan.nextLine();


        System.out.println("Ingrese la seccion en donde se alojara el material → ");
        String seccion = scan.nextLine();
        scan.nextLine();

        System.out.println("Ingrese el volumen actual del material → ");
        int volumen = scan.nextInt();
        scan.nextLine();

        instance = new SingletonBiblioteca(clase, numero_Clasificacion,seccion,volumen);
        instance.createBook();
    }

    private void createBook() {

    }

    public int getClase() {
        return Clase;
    }

    public void setClase(int clase) {
        Clase = clase;
    }

    public float getNumero_Clasificacion() {
        return Numero_Clasificacion;
    }

    public void setNumero_Clasificacion(float numero_Clasificacion) {
        Numero_Clasificacion = numero_Clasificacion;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String seccion) {
        Seccion = seccion;
    }

    public int getVolumen() {
        return Volumen;
    }

    public void setVolumen(int volumen) {
        Volumen = volumen;
    }


}
