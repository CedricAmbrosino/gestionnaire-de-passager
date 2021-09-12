import java.util.Scanner;

public class Util {

    static int reponseUtilisateurInt(){
        System.out.println("\nEntrez-votre reponse : ");
        int choix = -1;
        boolean continuer = false;

        do{
            try{
                Scanner scanner = new Scanner(System.in);
                choix= scanner.nextInt();
                continuer = false;
            }catch (Exception  error){
                System.out.println("Veuillez entrez un nombre." + error);
                continuer = true;
            }
        }while(continuer);
        return choix;
    }

    static String reponseUtilisateurString(){
        System.out.println("\nEntrez-votre reponse : ");
        String choix= "";
        boolean continuer = false;
        do{
            try{
                Scanner scanner = new Scanner(System.in);
               choix= scanner.nextLine();
                continuer = false;
            }catch (Exception  error){
                System.out.println("Veuillez entrez un caractère." + error);
                continuer = true;
            }
        }while(continuer);
        return choix;
    }

    static String reponseUtilisateurString(String question){
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        String choix= scanner.nextLine();
        return choix;
    }

    static void continuer(){
        System.out.println();
        reponseUtilisateurString("Souhaitez-vous continuer ? (appuyer sur entrée) ");
    }

}
