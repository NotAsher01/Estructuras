import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> coches= new ArrayList<>();
        System.out.println("Introduce tu marca de coches");
        while(true){
            String marca = sc.nextLine();
            if(marca.isBlank()){
                break;
            }
            coches.add(marca);
        }
        for(int i=0;i<coches.size();i++){
            System.out.println(coches.get(i));
        }
    }
}
