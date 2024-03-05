package arraylist_ra22081;

import java.util.ArrayList;

public class ejercicio13 {

    public static void Ejer13() {
        System.out.println("\n-EJERCICIO 13");
        ArrayList<String> nombrepoke1 = new ArrayList();
        nombrepoke1.add("Pikachu");
        nombrepoke1.add("Charizard");
        nombrepoke1.add("Bulbasaur");
        ArrayList<String>nombrepoke2 = new ArrayList();
        nombrepoke2.add("Bulbasaur");
        nombrepoke2.add("Squirtle");
        nombrepoke2.add("Jigglypuff");
        System.out.println("conjunto 1");
        for(String pokemon : nombrepoke1){
            System.out.println("--> "+pokemon);
            
        }
        System.out.println("conjunto 2");
        for(String pokemon : nombrepoke2){
            System.out.println("--> "+pokemon);
        }
        
        boolean iguales=nombrepoke1.equals(nombrepoke2);
        if(iguales){
            System.out.println("¿Los conjuntos de pokemons son iguales?. SI");
        }else{
            System.out.println("¿Los conjuntos de pokemons son iguales?. NO");
        }
            
    }

}
