public class Commande{
    private String etat;
    private Ligne ligne;
    public Commande(String etat, Ligne ligne){
        this.etat = etat;
        this.ligne = ligne;
    }
    public String getEtat(){
        return etat;
    }
    public void setEtat(String newEtat){
        this.etat = newEtat;
    }
    public Ligne getLigne(){
        return  Ligne;
    }

}