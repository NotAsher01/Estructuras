import java.util.*;

public class Telefonos2 {
    public static void main(String[] args) {
        Map<String, List<String>> contactos = new HashMap<>();
        List telefonos = new ArrayList<>();
        telefonos.add("4124213");
        telefonos.add("47868");
        contactos.put("pepe", telefonos);
        telefonos.add("121203");
        contactos.put("pepe", telefonos);

        telefonos= new ArrayList<>();
        telefonos.add("4176");
        contactos.put("maria", telefonos);

        List<String> telefonospepe= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String contacto= sc.nextLine();
        telefonospepe= contactos.get(contacto);
        for(String t: telefonospepe){
            System.out.println(t);
        }
    }
}
