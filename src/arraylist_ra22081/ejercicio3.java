package arraylist_ra22081;

import java.util.ArrayList;

public class ejercicio3 {

    public static void Ejer3() {
        System.out.println("\n-EJERCICIO 3");
        String insertarnuevo="pikachu";
        ArrayList<String> nombrepoke = new ArrayList();
        nombrepoke.add("Charizard");
        nombrepoke.add("Bulbasaur");
        nombrepoke.add("Squirtle");
        nombrepoke.add("Jigglypuff");
        System.out.println("Listado de pokemons:");
        for(String pokemon : nombrepoke){
            System.out.println("--> "+pokemon);
        }
        
        System.out.println("\nlistado con el pokemon ingresado:");
        nombrepoke.add(0,insertarnuevo);
        
        for(String pokemons: nombrepoke){
            System.out.println("--> "+pokemons);
        }
        

    }

}
