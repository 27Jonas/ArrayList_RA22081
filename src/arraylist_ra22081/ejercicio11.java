package arraylist_ra22081;

import java.util.ArrayList;
import java.util.Collections;

public class ejercicio11 {

    public static void Ejer11() {
        System.out.println("\n-EJERCICIO 11");
        ArrayList<String> nombrepoke = new ArrayList();
        nombrepoke.add("Pikachu");
        nombrepoke.add("Charizard");
        nombrepoke.add( "Bulbasaur");
        nombrepoke.add("Squirtle");
        nombrepoke.add("Jigglypuff");
        
        System.out.println("Listado de pokemons:");
        for(String pokemon : nombrepoke){
            System.out.println("--> "+pokemon);
        }
        Collections.reverse(nombrepoke);
        System.out.println("Listado invertido:");
        for(String pokemon : nombrepoke){
            System.out.println("--> "+pokemon);
        }
    }

}
