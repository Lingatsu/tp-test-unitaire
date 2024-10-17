package ex5;

/**
 * Représente un item avec un nom et un poids.
 */
public class Item {

    private String nom;
    private int poids;

    /**
     * Constructeur
     *
     * @param nom   le nom de l'item
     * @param poids le poids de l'item
     */
    public Item(String nom, int poids) {
        this.nom = nom;
        this.poids = poids;
    }

    /**
     * Getter pour l'attribut nom
     *
     * @return le nom de l'item
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour l'attribut nom
     *
     * @param nom le nom à définir
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour l'attribut poids
     *
     * @return le poids de l'item
     */
    public int getPoids() {
        return poids;
    }

    /**
     * Setter pour l'attribut poids
     *
     * @param poids le poids à définir
     */
    public void setPoids(int poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nom='" + nom + '\'' +
                ", poids=" + poids +
                '}';
    }
}
