package arraylist_ra22081;

import java.util.ArrayList;

public class ejercicio20 {
    
    public static void Ejer20(){
           System.out.println("\n-EJERCICIO 20");
        ArrayList<String> nombrepoke = new ArrayList();
        nombrepoke.add("Pikachu");
        nombrepoke.add("Charizard");
        nombrepoke.add( "Bulbasaur");
        
         System.out.println("Listado de pokemons:");
        for (String pokemon : nombrepoke) {
            System.out.println("--> " + pokemon);
        }
        
        int aumento=5;
        while(nombrepoke.size()<aumento){
            nombrepoke.add(null);
        }
        System.out.println("listado aumentado");
        for(String pokemon : nombrepoke){
            System.out.println("--> "+pokemon);
        }
    }
    
}
