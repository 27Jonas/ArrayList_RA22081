package arraylist_ra22081;

import java.util.ArrayList;

public class ejercicio22 {
    public static void Ejer22(){
        System.out.println("\n -EJERCICIO 22");
        ArrayList<String>nombrepoke= new ArrayList();
        nombrepoke.add("Pikachu");
        nombrepoke.add("Charizard");
        nombrepoke.add("Bulbasaur");
        nombrepoke.add("Squirtle");
        nombrepoke.add("Jigglypuff");
        nombrepoke.add("Eevee");
        nombrepoke.add("Mewtwo");
        nombrepoke.add("Gyarados");
        nombrepoke.add("Snorlax");
        nombrepoke.add("Vulpix");
        
        System.out.println("Todos los elementos:");
        for (int i = 0; i < 10; i++) {
            System.out.println("posicion: #"+i+"-"+nombrepoke.get(i));
            
        }
    }
    
}
