package ex1;

/**
 * La classe {@code Calculator} fournit des méthodes pour effectuer des opérations arithmétiques de base.
 * Elle permet de réaliser des additions et des soustractions sur deux entiers.
 */
public class Calculator {

    /**
     * Effectue l'addition de deux entiers.
     *
     * @param a le premier entier à ajouter
     * @param b le deuxième entier à ajouter
     * @return la somme de {@code a} et {@code b}
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Effectue la soustraction de deux entiers.
     *
     * @param a le minuend (l'entier à partir duquel on soustrait)
     * @param b le subtrahend (l'entier à soustraire)
     * @return la différence entre {@code a} et {@code b}
     */
    public int subtract(int a, int b) {
        return a - b;
    }
}
