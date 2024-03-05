package arraylist_ra22081;

import java.util.ArrayList;

public class ejercicio7 {

    public static void Ejer7() {
        System.out.println("\n -EJERCICIO 7");
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
        String buscar = "Squirtle";
        int i = nombrepoke.indexOf(buscar);

        if (i != -1) {
            System.out.println("\nEL pokemon a buscar es: "+buscar+" y se encuentra en la poscion: #"+i);

        }

    }

}
