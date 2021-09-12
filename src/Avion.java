public class Avion {
    int numero;
    static int nbLimitPassager = 100;
    int nbPassager;

    Avion(int numero, int nbLimitPassager){
        this.numero = numero;
        this.nbLimitPassager = nbLimitPassager;
    }

    void detailAvion(){
        System.out.println("Détails Avion - " + numero);
        System.out.println("Nombre de passager - " + nbPassager);
        System.out.println("Nombre de sièges : - " + nbLimitPassager +"\n");
    }
}
