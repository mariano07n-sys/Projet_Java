import java.util.Scanner;
import java.util.ArrayList;
//Création de la classe book  purement orienté data
class book{
    String titre;
    String auteur;
    String maison_edition;
    int Qte ,prix;
    public book(String titre, String auteur, String maison_edition, int Qte, int prix){
        this.titre = titre;
        this.auteur = auteur;
        this.maison_edition = maison_edition;
        this.Qte = Qte;
        this.prix = prix;
    }
}
//Création de la classe pour la gestion des livres de la bibliothèque
class Bibliotheque{
        ArrayList<book> tab = new ArrayList<book>();
        public void ajouter_livre(){
            Scanner sc = new Scanner(System.in);
            String response;
            do{ 
            System.out.print("Titre: ");
            String titre = sc.nextLine();
            System.out.print("Auteur: ");
            String auteur = sc.nextLine();
            System.out.print("Maison d'édition: ");
            String maison_edition = sc.nextLine();
            System.out.print("Quantité: ");
            int Qte = sc.nextInt();
            System.out.print("Prix: ");
            int prix = sc.nextInt();
            sc.nextLine();
            book nouveauLivre = new book(titre, auteur, maison_edition, Qte, prix);
            tab.add(nouveauLivre);
            System.out.print("Voulez-vous ajouter un nouveau livre:o/n ");
            response = sc.next();
            sc.nextLine();
            }while(response.equalsIgnoreCase("o"));
        }
        public book livre_verif(String titre, String auteur){
            book  trouveBook = null;
            for(book livreActuel : tab){
                if (livreActuel.titre.equalsIgnoreCase(titre) && livreActuel.auteur.equalsIgnoreCase(auteur))
                    trouveBook = livreActuel;
                    break;
            }
            return trouveBook;
        }
        public void acheter_livre(){
            Scanner sc = new Scanner(System.in);
            String response;
            do{
                System.out.print("Titre de livre demandé: ");
                String titreac = sc.nextLine();
                System.out.print("Auteur: ");
                String auteurac = sc.nextLine();
                int qteac;
                do{
                    System.out.println("Quantité demandée: ");
                    if(!sc.hasNextInt() ){
                        System.out.println("Quantité invalide!");
                        sc.next();
                        continue;
                    }
                    else{
                        qteac = sc.nextInt();
                        if(qteac <= 0){
                            System.out.println("Quantité invalide");
                            continue;
                        }
                        break;
                    }
                }while(true);
                sc.nextLine();
                book verif = livre_verif(titreac, auteurac);
                if (verif == null)
                    System.out.println("Livre indisponible");
                else if(qteac > verif.Qte)
                    System.out.println("Stock insuffisant");
                else
                    verif.Qte -= qteac;
                System.out.print("Voulez-vous acheter un autre livre: o/n ");
                response = sc.next();
                sc.nextLine();
            }while(response.equalsIgnoreCase("o"));
        }
//
    }

public class bibliothequeoai{
    public static void main(String[] args){
        Bibliotheque inventaire = new Bibliotheque();
        Scanner sc = new Scanner(System.in);
        String choix;
        do{
            System.out.println("1.Ajouter un livre.\n2.Acheter un livre.");
            choix = sc.nextLine();
            switch(choix){
                case "0":
                    break;
                case "1":
                    inventaire.ajouter_livre();
                    break;
                case "2":
                    inventaire.acheter_livre();
                    break;
                default:
                    System.out.println("Option invalide.");
                    break;
            }
        }while(!choix.equals("0"));
    }
}

