package arraylist_ra22081;

import java.util.ArrayList;

public class ejercicio2 {
    
    public static void Ejer2(){
        System.out.println("\n-EJERCICIO 2");
        System.out.println("Lista de pokemons:");
        ArrayList<String>nombrepoke= new ArrayList();
        nombrepoke.add("pikachu");
        nombrepoke.add("charizard");
        nombrepoke.add("Bulbasaur");
        nombrepoke.add("Squirtle");
        nombrepoke.add("Eevee");
        nombrepoke.add("Mewtwo");
        nombrepoke.add("Gyarados");
        nombrepoke.add("Snorlax");
        nombrepoke.add("Vulpix");
        nombrepoke.add("Jigglypuff");
        
        for(String nombres : nombrepoke){
            System.out.println("--> "+nombres);
        }
        System.out.println("\n ---------------------------");
        System.out.println("Lista de numeros:");
        ArrayList<Integer>num= new ArrayList();
        for (int i = 0; i < 10; i++) {
            num.add(i+1);
        }
        for(Integer numeros : num){
            System.out.println("--> "+numeros);
        }
        System.out.println("\n------------------------------");
        System.out.println("Lista del abecedario:");
        ArrayList<Character>abc=new ArrayList();
        for (char x= 'a'; x<= 'j'; x++) {
            abc.add(x);  
        }
        for(Character letras : abc){
            System.out.println("--> "+letras);
        }
        
        
        
        
    }
    
}
