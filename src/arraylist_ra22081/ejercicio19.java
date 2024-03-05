package arraylist_ra22081;

import java.util.ArrayList;

public class ejercicio19 {

    public static void Ejer19() {
        System.out.println("\n-EJERCICIO 19");
        ArrayList<String> nombrepoke = new ArrayList();
        nombrepoke.add("Pikachu");
        nombrepoke.add("Charizard");
        nombrepoke.add("Bulbasaur");
        nombrepoke.add("Squirtle");
        nombrepoke.add("Jigglypuff");

        System.out.println("Listado de pokemons:");
        for (String pokemon : nombrepoke) {
            System.out.println("--> " + pokemon);
        }
        int Cap = 3;

        if (Cap < nombrepoke.size()) {
            nombrepoke = new ArrayList<>(nombrepoke.subList(0, Cap));
        }

        // Imprimir la lista después de reducir la capacidad
        System.out.println("Lista despues de reducir la capacidad:");
        for (String pokemon : nombrepoke) {
            System.out.println("--> " + pokemon);
        }
    }

}
