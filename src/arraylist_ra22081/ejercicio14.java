package arraylist_ra22081;

import java.util.ArrayList;

public class ejercicio14 {

    public static void Ejer14() {
        System.out.println("\n -EJERCICIO 14");
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
        
        int i1=0;
        int i2=4;
        
        String temp=nombrepoke.get(i1);
        nombrepoke.set(i1, nombrepoke.get(i2));
        nombrepoke.set(i2, temp);
        
        System.out.println("\n listado intercambiado:");
        for( String pokemon : nombrepoke){
            System.out.println("--> "+pokemon);
        }
                

    }

}
