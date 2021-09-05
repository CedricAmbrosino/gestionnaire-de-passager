public class Gestionnaire {
    public static void main(String... args){
        TableHoraire planning = new TableHoraire();
        for(int i=0; i<planning.horaires.length; i++){
            System.out.println(planning.horaires[i]);
        }
    }
}
