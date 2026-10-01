import java.util.Scanner;

public class compte_mot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String phrase; 
        int j = 0;
        System.out.println("Entrez votre phrase: ");
        phrase = sc.nextLine();
        for(int i = 0; i < phrase.length(); i++){
            String num = String.valueOf(phrase.charAt(i));
            if (num.equals(" ")){
                j++;
            }
        }
        System.out.println("Il y a "+ (j+1) +" mots dans votre phrase !");
    }
}