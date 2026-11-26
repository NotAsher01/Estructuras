import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PruebaHashMap {
    public static void main(String[] args) {
        Map<String, String> paises= new HashMap<>();
        paises.put("España", "Madrid");
        paises.put("Francia", "París");
        paises.put("Italia", "Roma");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un país: ");
        String pais = sc.nextLine();
        System.out.println(paises.getOrDefault(pais, "No existe el pais"));
    }
}
