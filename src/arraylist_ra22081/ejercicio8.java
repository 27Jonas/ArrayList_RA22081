package arraylist_ra22081;

import java.util.ArrayList;
import java.util.Collections;

public class ejercicio8 {

    public static void Ejer8() {
        System.out.println("\n -EJERCICIO 8");
        ArrayList<String> nombrepoke = new ArrayList();
        nombrepoke.add("Pikachu");
        nombrepoke.add("Charizard");
        nombrepoke.add("Bulbasaur");
        nombrepoke.add("Squirtle");
        nombrepoke.add("Jigglypuff");
        
        System.out.println("Lista de pokemons:");
        for(String pokemon : nombrepoke){
            System.out.println("--> "+pokemon);
        }
        
        Collections.sort(nombrepoke);
        
        System.out.println("\n Listado de pokemons ordenados alfabeticamente:");
        for(String pokemon : nombrepoke){
            System.out.println("--> "+pokemon);
        }
    }

}
