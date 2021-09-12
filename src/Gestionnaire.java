
public class Gestionnaire {
    public static void main(String... args){

        /*********Initialisation des destinations*********/
        Destination destinationParis = new Destination("Paris","FRANCE");
        Destination destinationLyon = new Destination("Lyon", "FRANCE");
        Destination destinationToulon = new Destination("Toulon", "FRANCE");
        Destination destinationLondres = new Destination("Londres","ROYAUME-UNI");

        /****************Initialisation des avions************************/

        Avion avion1 = new Avion(02002,50);
        Avion avion2 = new Avion(03002,100);
        Avion avion3 = new Avion(04010,30);
        Avion avion4 = new Avion(04050,10);

        Avion[] avions = {avion1, avion2, avion3, avion4};

        /****************Initialisation des voyages************************/

        Voyage volLondres = new Voyage(destinationLondres , avion1.numero);
        Voyage volParis = new Voyage(destinationParis, avion2.numero);
        Voyage volToulon = new Voyage(destinationToulon, avion3.numero);
        Voyage volLyon = new Voyage(destinationLyon, avion4.numero);

        Voyage[] listeVols = {volLondres, volParis, volToulon, volLyon};

        /****************Initialisation du planning************************/

        TableHoraire planning = new TableHoraire();

        planning.planning[0][1] = Integer.toString(volLondres.numeroAvion);
        planning.planning[1][1] = Integer.toString(volParis.numeroAvion);
        planning.planning[2][1] = Integer.toString(volToulon.numeroAvion);
        planning.planning[3][1] = Integer.toString(volLyon.numeroAvion);
        planning.planning[4][1] = Integer.toString(volLondres.numeroAvion);
        planning.planning[5][1] = Integer.toString(volToulon.numeroAvion);

        /****************Début du système de Gestion************************/

        System.out.println("\nBienvenue dans le gestionnaire de passager de l'aéroport de Brest");
        System.out.println("Voici la liste des prochains départs : \n");

        /***************Chargement de la session utilisateur***********/
        Session sessionUtilisateur = new Session(planning, listeVols, avions);
        sessionUtilisateur.actionsMenuPrincipal();

    }
}
