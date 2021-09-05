public class Gestionnaire {
    public static void main(String... args){

        /*********Initialisation des destinations*********/
        Destination destinationParis = new Destination();
        destinationParis.pays = "FRANCE";
        destinationParis.ville = "Paris";

        Destination destinationLyon = new Destination();
        destinationLyon.pays = "FRANCE";
        destinationLyon.ville = "Lyon";

        Destination destinationToulon = new Destination();
        destinationToulon.pays = "FRANCE";
        destinationToulon.ville = "Toulon";

        Destination destinationLondres = new Destination();
        destinationLondres.pays = "ROYAUME-UNI";
        destinationLondres.ville = "Londres";

        /****************Initialisation des avions************************/

        Avion avion1 = new Avion(02002);
        Avion avion2 = new Avion(03002);
        Avion avion3 = new Avion(04010);
        Avion avion4 = new Avion(04050);

        /****************Initialisation des voyages************************/

        Voyage volLondres = new Voyage();
        volLondres.numeroAvion = avion1.numero;
        volLondres.destination = destinationLondres;

        Voyage volParis = new Voyage();
        volParis.numeroAvion = avion2.numero;
        volParis.destination = destinationParis;

        Voyage volToulon = new Voyage();
        volToulon.numeroAvion = avion3.numero;
        volToulon.destination = destinationToulon;

        Voyage volLyon = new Voyage();
        volLyon.numeroAvion = avion4.numero;
        volLyon.destination = destinationLyon;

        Voyage[] ListeVols = {volLondres, volParis, volToulon, volLyon};

        /****************Initialisation du planning************************/

        TableHoraire planning = new TableHoraire();

        planning.planning[0][1] = Integer.toString(volLondres.numeroAvion);
        planning.planning[1][1] = Integer.toString(volParis.numeroAvion);
        planning.planning[2][1] = Integer.toString(volToulon.numeroAvion);
        planning.planning[3][1] = Integer.toString(volLyon.numeroAvion);
        planning.planning[4][1] = Integer.toString(volLondres.numeroAvion);
        planning.planning[5][1] = Integer.toString(volToulon.numeroAvion);


        for(int i=0; i<planning.horaires.length; i++){
            String destination = "";
            for(Voyage destVol : ListeVols){
                if(planning.planning[i][1].equals(Integer.toString(destVol.numeroAvion))){
                    destination = destVol.destination.ville;
                    break;
                }
            }
            System.out.printf("%s - D : Brest - A : %s - n° %s\n",planning.planning[i][0], destination,planning.planning[i][1]);
        }


        /**************** ************************/


    }
}
