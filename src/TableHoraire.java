public class TableHoraire {
    String[] horaires = {"08h00","09h00","10h00","13h00","17h00","21h00"};
    String[][] planning = new String[horaires.length][3];

    TableHoraire(){
        for(int i=0; i<this.horaires.length; i++){
            this.planning[i][0] = horaires[i];
        }
    }

    void afficherTableauDesHoraires(Voyage[] ListeVols){
        for(int i=0; i<this.horaires.length; i++){
            String destination = "";
            for(Voyage destVol : ListeVols){
                if(this.planning[i][1].equals(Integer.toString(destVol.numeroAvion))){
                    destination = destVol.destination.ville;
                    break;
                }
            }
            System.out.printf("%s - D : Brest - A : %s - n° %s\n",this.planning[i][0], destination,this.planning[i][1]);
        }
    }


}
