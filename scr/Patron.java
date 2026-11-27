import java.util.HashMap;
import java.util.Map;

public class Patron {
    public static void main(String[] args) {
        String texto= "El perro y el gato y el raton";
        Map<String, Integer> frecuencias= new HashMap<>();
        String[] palabras= texto.split(" ");
        for(String p: palabras) {
            frecuencias.put(p,frecuencias.getOrDefault(p,0)+1);
        }
        System.out.println(frecuencias);
    }
}
