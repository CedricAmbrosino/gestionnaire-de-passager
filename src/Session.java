public class Session {
        TableHoraire planning;
        Voyage[] listeVols;
        Avion[] avions;

        Session(TableHoraire planning, Voyage[] listeVols, Avion[] avions){
            this.planning = planning;
            this.listeVols = listeVols;
            this.avions = avions;
        }

        void actionsMenuPrincipal(){
           boolean continuer = true;
           do{
                System.out.println("Pour :");
                System.out.println(listesOptions()); // Présentation menu utilisateur.
                int choix = Util.reponseUtilisateurInt();
                continuer= traitementDesActionsMenuPrincipal(choix);
            } while(continuer);
        }
        boolean actionsMenuPrincipalSousProgramme(){
            boolean continuer = true;
            do{
                System.out.println("Pour :");
                System.out.println(listesOptions()); // Présentation menu utilisateur.
                int choix = Util.reponseUtilisateurInt();
                continuer= traitementDesActionsMenuPrincipal(choix);
            } while(continuer);
            return !continuer;
        }

        private String listesOptions(){
            String message = "- Voir le Planning des vols taper 1";
            message += "\n- Quittez le programme taper 2";
            return message;
        }

        boolean traitementDesActionsMenuPrincipal(int choix){
            switch(choix){
                case 1:     // Voir le Planning des vols
                    planning.afficherTableauDesHoraires(listeVols);
                    int resp = Util.reponseUtilisateurInt();
                    boolean quitter = navigationTableHoraire(resp);
                    if(quitter){
                        return false;
                    }
                    Util.continuer();
                    traitementDesActionsMenuPrincipal(choix);
                    break;
                case 2:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Cette action n'existe pas.");
                    return true;
            }
            return false;
        }

        boolean navigationTableHoraire(int choix){
            if(choix == planning.horaires.length){
                return actionsMenuPrincipalSousProgramme();
            }else{
                System.out.println(planning.planning[choix][0] + " : ");
                for(Voyage vol : listeVols){
                    if(vol.numeroAvion == Integer.parseInt(planning.planning[choix][1])){
                        System.out.println("A destination de " + vol.destination.ville + " - " + vol.destination.pays);
                    }
                }
                for(Avion selectionAvion : avions){
                    if( Integer.parseInt(planning.planning[choix][1]) == selectionAvion.numero){
                        selectionAvion.detailAvion();
                        break;
                    }
                }
            }
            return false;
        }
}
