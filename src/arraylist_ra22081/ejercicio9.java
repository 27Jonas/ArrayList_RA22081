package arraylist_ra22081;

import java.util.ArrayList;

public class ejercicio9 {

    public static void Ejer9() {
        System.out.println("\n -EJERCICIO 9");
        ArrayList<String> nombrepoke = new ArrayList();
        nombrepoke.add("Pikachu");
        nombrepoke.add("Charizard");
        nombrepoke.add("Bulbasaur");
        nombrepoke.add("Squirtle");
        nombrepoke.add("Jigglypuff");
        
        ArrayList<String>pokecopia= new ArrayList(nombrepoke);
        
        System.out.println("Listado copiado:");
        for(String pokemon : pokecopia){
            System.out.println("--> "+pokemon);
        }
    }

}
