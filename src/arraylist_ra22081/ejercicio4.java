package arraylist_ra22081;

import java.util.ArrayList;

public class ejercicio4 {

    public static void Ejer4() {
        System.out.println("\n-EJERCICIO 4");
        ArrayList<String> nombrepoke = new ArrayList();
        nombrepoke.add("Pikachu");
        nombrepoke.add("Charizard");
        nombrepoke.add("Bulbasaur");
        nombrepoke.add("Squirtle");
        nombrepoke.add("Jigglypuff");
        nombrepoke.add("Eevee");
        nombrepoke.add("Mewtwo");
        nombrepoke.add("Gyarado");
        nombrepoke.add("Snorlax");
        nombrepoke.add("Vulpix");
        
        System.out.println("Listado de pokemons:");
        for(String pokemon :nombrepoke){
            System.out.println("--> "+pokemon);
        }
        int i=2;
        String pokemon= nombrepoke.get(i);
        
        System.out.println("EL pokemon que esta en el indice #"+i+" es: "+pokemon);
        
    }

}
