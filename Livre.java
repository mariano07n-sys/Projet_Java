public class Livre extends Document{
    private Auteur auteur;
    public Livre(String titre, int prix, Auteur auteur){
        super(titre, prix);
        this.auteur = auteur;
    }
    public void setAuteur(Auteur newAuteur){
        this.auteur = newAuteur;
    }
    public Auteur getAuteur(){
        return auteur;
    }
    @Override
    public void describe(){
        System.out.println("Le livre "+ getTitre() + " écrit par " + auteur.getNom() +" "+ auteur.getPrenom() + " est disponible à " + getPrix());
    }
} 
