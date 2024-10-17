package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

    private String nom;
    private List<Item> items;
    private int poidsMax;

    /**
     * Constructeur
     *
     * @param nom      le nom de la caisse
     * @param poidsMax le poids maximum que la caisse peut accepter
     */
    public Caisse(String nom, int poidsMax) {
        this.nom = nom;
        this.poidsMax = poidsMax;
        this.items = new ArrayList<>();
    }

    /**
     * Vérifie si l'item peut être ajouté à cette caisse.
     *
     * @param item l'item à vérifier
     * @return true si l'item peut être ajouté, false sinon
     */
    public boolean peutAccepter(Item item) {
        return item.getPoids() <= poidsMax;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
