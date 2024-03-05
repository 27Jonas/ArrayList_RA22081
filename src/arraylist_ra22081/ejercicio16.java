package arraylist_ra22081;

import java.util.ArrayList;

public class ejercicio16 {
    
    public static void Ejer16(){
          System.out.println("\n-EJERCICIO 16");
        ArrayList<String> nombrepoke = new ArrayList();
        nombrepoke.add("Pikachu");
        nombrepoke.add("Charizard");
        nombrepoke.add("Bulbasaur");
        
        ArrayList<String>clon = new ArrayList(nombrepoke);
        
        System.out.println("Clonado:");
        for(String pokemon : clon){
            System.out.println("--> "+pokemon);
        }
        
    }
    
}
