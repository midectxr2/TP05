public class Salle {
    int numero;
    int capacite;
    String typeTableau;

    public Salle(int numero, int capacite, String typeTableau){
        this.numero = numero;
        this.capacite = capacite;
        this.typeTableau = typeTableau;
    }

    public Salle(){
        int numero = this.numero;
        int capacite = this.capacite;
        String typeTableau = this.typeTableau;
    }
}
