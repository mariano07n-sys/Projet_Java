public class Ligne{
    private Document document;
    private int quantite;
    public Ligne(Document document, int quantite){
        this.document = document;
        this. quantite = quantite;
    }
    public void setDocument(Document newDocument){
        this.document = newDocument;
    }
    public Document getDocument(){
        return document;
    }
    public void setQuantite(Quantite newQuantite){
        this.quantite = newQuantite;
    }
    public int getQuantite(){
        return quantite;
    }
}