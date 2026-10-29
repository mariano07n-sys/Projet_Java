public class Document {
    private String titre;
    private int prix;
    public Document(String titre, int prix){
        this.titre = titre;
        this.prix = prix;
    }
    public String getTitre(){
        return titre;
    }
    public void setTitre(String newTitre){
        this.titre = newTitre;
    }
    public void setPrix(int newPrix){
        this.prix = newPrix;
    }
    public int getPrix(){
        return prix;
    }
    public void describe(){
        System.out.println("Le document "+ this.titre + " est à "+ this.prix);
    }   
}
