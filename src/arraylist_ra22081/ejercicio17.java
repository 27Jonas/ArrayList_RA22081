package arraylist_ra22081;

import java.util.ArrayList;

public class ejercicio17 {
    
    public static void Ejer17(){
         System.out.println("\n-EJERCICIO 17");
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
         nombrepoke.clear();
         
         System.out.println("Listado vacio:");
         System.out.println(nombrepoke);
    }
}