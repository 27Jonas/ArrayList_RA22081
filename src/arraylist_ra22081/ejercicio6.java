package arraylist_ra22081;

import java.util.ArrayList;

public class ejercicio6 {

    public static void Ejer6() {
        System.out.println("\n-EJERCICIO 6");
        ArrayList<String> nombrepoke = new ArrayList();
        nombrepoke.add("Pikachu");
        nombrepoke.add("Charizard");
        nombrepoke.add("Bulbasaur");
        nombrepoke.add("Squirtle");
        nombrepoke.add("Jigglypuff");
        
        System.out.println("Listado de los pokemons:");
        for(String pokemon : nombrepoke){
            System.out.println("--> "+pokemon);
        }
          nombrepoke.remove(2);
          System.out.println("\n Listado despues de eliminar el tecer elemento:");
          for(String pokemon : nombrepoke){
              System.out.println("--> "+pokemon); 
          }
    }

}
