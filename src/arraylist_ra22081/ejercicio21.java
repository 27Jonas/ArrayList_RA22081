package arraylist_ra22081;

import java.util.ArrayList;

public class ejercicio21 {
    
    public static void Ejer21(){
                System.out.println("\n-EJERCICIO 21");
        ArrayList<String> nombrepoke = new ArrayList();
        nombrepoke.add("Pikachu");
        nombrepoke.add("Charizard");
        nombrepoke.add("Bulbasaur");
        nombrepoke.add("Squirtle");
        nombrepoke.add("Jigglypuff");

        System.out.println("Listado de pokemons:");
        for (String pokemon : nombrepoke) {
            System.out.println("--> "+pokemon);
        }
        String nuevo="Venusaur";
        nombrepoke.set(1, nuevo);
        
        System.out.println("\nNuevo listado:");
        for(String pokemon : nombrepoke){
            System.out.println("--> "+pokemon);
        }
    }
    
}
