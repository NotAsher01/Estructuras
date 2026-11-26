import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos {
    public static void main(String[] args) {
        Map<String, String> num= new HashMap<>();
        num.put("Mario", "6333213");
        num.put("Maria", "6632568");
        num.put("Mar", "6235493");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del contacto: ");
        String nom = sc.nextLine();
        System.out.println(num.getOrDefault(nom, "No existe"));
    }
}
