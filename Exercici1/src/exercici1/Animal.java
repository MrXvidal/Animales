
package exercici1;

public class Animal {
    
    protected String nom;
    protected int numPotes;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumPotes() {
        return numPotes;
    }

    public void setNumPotes(int numPotes) {
        this.numPotes = numPotes;
    }
    
    public Animal (String nom, int numPotes)
    {
        this.nom = nom;
        this.numPotes = numPotes;
    }
    
    public Animal ()
    {
        this("",0);
    }
    
    public Animal (Animal copy)
    {
        this(copy.nom,copy.numPotes);
    }
    
    public String toString()
    {
        String frase;
        
        frase = "Nom de l'animal: " + this.nom + ". " +
                "Te" + this.numPotes + " potes. ";
        
        return frase;
    }
}
