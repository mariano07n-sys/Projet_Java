import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception{
        Auteur A1 = new Auteur("Bâ", "Mariama");
        Auteur A2 = new Auteur("Pliya", "Jean");
        Auteur A3 = new Auteur("Agatha", "Christie");
        Auteur A4 = new Auteur("Oyono", "Ferdinand");
        Livre L1 = new Livre("Une si longue lettre", 3000, A1);
        Livre L2 = new Livre("L'arbre fétiche", 4500, A2);
        Livre L3 = new Livre("Les 10 petits nègres", 3000, A3);
        Livre L4 = new Livre("Une vie de boy", 4500, A4);
        ArrayList<Livre> docs = new ArrayList<Livre>();
        docs.add(L1);
        docs.add(L2);
        docs.add(L3);
        docs.add(L4);
        for (Livre livre : docs){
            livre.describe();
        }
    }
}
