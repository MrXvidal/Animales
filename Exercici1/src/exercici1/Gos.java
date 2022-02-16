
package exercici1;

public class Gos extends Animal {
    
    private String colorPell;

    public String getColorPell() {
        return colorPell;
    }

    public void setColorPell(String colorPell) {
        this.colorPell = colorPell;
    }
    
    public Gos (String nom, int numPotes, String colorPell)
    {
        super(nom,numPotes);
        this.colorPell = colorPell;
        
    }
    
    public Gos ()
    {
        this("",0,"");
    }
    
    public Gos (Gos copy)
    {
        this(copy.getNom(),copy.getNumPotes(),copy.colorPell);
    }
    
    public String toString()
    {
        String frase;
        
        frase = "Nom de l'animal: " + this.nom + ". " +
                "Té " + this.numPotes + " potes. " +
                "Es de color " + this.colorPell;
        
        
        return frase;
    }
}
