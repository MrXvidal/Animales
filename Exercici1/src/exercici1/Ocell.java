
package exercici1;

public class Ocell extends Animal{
    
    protected float midaAles;

    public float getMidaAles() {
        return midaAles;
    }

    public void setMidaAles(float midaAles) {
        this.midaAles = midaAles;
    }
    
    public Ocell (String nom, int numPotes, float midaAles)
    {
        super(nom,numPotes);
        this.midaAles = midaAles;
    }
    
    public Ocell ()
    {
        this("",0,(float) 0);
    }
    
    public Ocell (Ocell copy)
    {
        this(copy.getNom(),copy.getNumPotes(),copy.midaAles);
    }

    public String toString()
    {
        String frase;
        
        frase = "Nom de l'animal: " + this.nom + ". " +
                "Té " + this.numPotes + " potes. " + 
                "Les ales medeixen " + this.midaAles + "cm.";
        
        return frase;
    }
    
    
}
