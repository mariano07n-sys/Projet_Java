public class Auteur {
    private String nom;
    private String prenom;
    public Auteur(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    public void setNom(String newNom){
        this.nom = newNom;
    }
    public String getNom(){
        return nom;
    }
    public void setPrenom(String newPrenom){
        this.prenom = newPrenom;
    }
    public String getPrenom(){
        return prenom;
    }
}









