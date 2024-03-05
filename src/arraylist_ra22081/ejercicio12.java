package arraylist_ra22081;

import java.util.ArrayList;

public class ejercicio12 {
    
    public static void Ejer12(){
        System.out.println("\n-EJERCICIO 12");
        ArrayList<String>nombrepoke= new ArrayList();
         nombrepoke.add("Pikachu");
        nombrepoke.add("Charizard");
        nombrepoke.add( "Bulbasaur");
        nombrepoke.add("Squirtle");
        nombrepoke.add("Jigglypuff");
        
        System.out.println("Listado de pokemons:");
        for(String pokemon : nombrepoke){
            System.out.println("-->"+pokemon);
            
        }
        int inicio=1;
        int fin=4;
        
        ArrayList<String>extraido = new ArrayList(nombrepoke.subList(inicio, fin));
        
        System.out.println("\nExtraidos:");
        for( String pokemon : extraido){
            System.out.println("--> "+pokemon);
        }
        
    }
    
}
