package arraylist_ra22081;

import java.util.ArrayList;

public class ejercicio1 {

    public static void Ejer1() {
        System.out.println("-EJERCICIO 1");
        ArrayList<String> pokemons = new ArrayList<>();
        pokemons.add("pikachu");
        pokemons.add("charizard");
        pokemons.add("Bulbasaur");
        pokemons.add("Squirtle");
        pokemons.add("Jigglypuff");

        for (String nombres : pokemons) {
            System.out.println("-->" + nombres);
        }

    }

}
