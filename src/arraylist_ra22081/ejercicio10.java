package arraylist_ra22081;

import java.util.ArrayList;
import java.util.Collections;

public class ejercicio10 {

    public static void Ejer10() {
        System.out.println("\n -EJERCICIO 10");
        ArrayList<String> nombrepoke = new ArrayList();
        nombrepoke.add("Pikachu");
        nombrepoke.add("Charizard");
        nombrepoke.add("Bulbasaur");
        nombrepoke.add("Squirtle");
        nombrepoke.add("Jigglypuff");
        
        System.out.println("Listado de pokemons:");
        for(String pokemon : nombrepoke){
            System.out.println("--> "+pokemon);
        }
        Collections.shuffle(nombrepoke);
        System.out.println("\nLista mezclada:");
        for(String pokemon : nombrepoke){
            System.out.println("--> "+pokemon);
        }
    }

}
