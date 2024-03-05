package arraylist_ra22081;

import java.util.ArrayList;

public class ejercicio5 {

    public static void Ejer5() {
        System.out.println("\n-EJERCICIO 5");
        ArrayList<String> nombrepoke = new ArrayList();
        nombrepoke.add("Pikachu");
        nombrepoke.add("Charizard");
        nombrepoke.add("Bulbasaur");
        nombrepoke.add("Squirtle");
        nombrepoke.add("Jigglypuff");

        System.out.println("Listado de pokemon:");
        for (String pokemon : nombrepoke) {
            System.out.println("--> " + pokemon);

        }
            String actualizar = "Charizard";
        String nuevo = "Dragonite";

      
        int i = nombrepoke.indexOf(actualizar);
        if (i != -1) {
            nombrepoke.set(i, nuevo);
        }

       
        System.out.println("\nLista de pokemons actualizadad: ");
        for (String pokemon : nombrepoke) {
            System.out.println("--> " + pokemon);
        }
        }
    }

