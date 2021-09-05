public class TableHoraire {
    String[] horaires = {"08h00","09h00","10h00","13h00","17h00","21h00"};
    String[][] planning = new String[horaires.length][3];

    TableHoraire(){
        for(int i=0; i<this.horaires.length; i++){
            this.planning[i][0] = horaires[i];
        }
    }
}
