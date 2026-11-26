import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Altura {
    static List<Double> lista = new ArrayList<>();
    static double media;

    public static void main(String[] args) {
        int numalumn = numeroalumnos();
        leeralturas(numalumn);
        media = calcularmedia();
        mostrarResultado();
    }

    public static int numeroalumnos() {
        System.out.println("Introduce el numero de alumnos");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void leeralturas(int cuantas) {
        System.out.println("Introduce la altura del alumno");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cuantas; i++) {
            lista.add(sc.nextDouble());
        }
    }

    public static double calcularmedia() {
        double suma = 0;
        for (double i : lista) {
            suma = suma + i;
        }
        return suma / lista.size();
    }

    public static int calcularAlumnosAlturaSuperior() {
        int contador = 0;
        for (double i : lista) {
            if (i > media) {
                contador++;
            }
        }
        return contador;
    }

    public static int calcularAlumnosAlturaInferior() {
        int contador = 0;
        for (double i : lista) {
            if (i < media) {
                contador++;
            }
        }
        return contador;
    }
    public static void mostrarResultado(){
        System.out.println("Todas las alturas: "+ lista);
        System.out.println("Media: "+media);
        System.out.println("Alumnos mayores: "+calcularAlumnosAlturaSuperior());
        System.out.println("Alumnos menores: "+calcularAlumnosAlturaInferior());
    }
}
