
package exercici1;

import java.util.Scanner;

public class main {
    
    public static main(final String[] args) 
    {
        Ocell ocells = new Ocell("Colom",2,8);
        Gos gossos = new Gos("Golden Retriever",4,"Marro");
        Animal animals = new Animal("Serp",0);
        
        System.out.println(ocells.toString());
        System.out.println(gossos.toString());
        System.out.println(animals.toString());
        
      
    }
}
