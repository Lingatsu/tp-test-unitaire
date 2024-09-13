package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un zoo avec une liste d'animaux.
 */
public class Zoo {

    private String nom;
    private List<Animal> animaux;

    public Zoo(String nom) {
        this.nom = nom;
        this.animaux = new ArrayList<>();
    }

    /**
     * Ajoute un animal au zoo.
     *
     * @param nom         le nom de l'animal
     * @param type        le type de l'animal
     * @param comportement le comportement de l'animal
     */
    public void addAnimal(String nom, String type, String comportement) {
        Animal animal = new Animal(nom, type, comportement);
        animaux.add(animal);
    }

    /**
     * Affiche la liste des animaux du zoo.
     */
    public void afficherListeAnimaux() {
        for (Animal animal : animaux) {
            System.out.println(animal);
        }
    }

    public int taille() {
        return animaux.size();
    }

    /**
     * Getter for nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
