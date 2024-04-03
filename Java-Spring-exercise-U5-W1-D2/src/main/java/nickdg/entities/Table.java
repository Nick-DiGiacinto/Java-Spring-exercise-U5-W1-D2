package nickdg.entities;
import nickdg.enums.stato;


public class Table {
    private int numero;
    private int numeroPostiMax=8;
    private nickdg.enums.stato stato;
    private Ordine ordine;

    public Table(int numero, stato stato, Ordine ordine) {
        this.numero = numero;
        this.stato = stato;
    }
}
