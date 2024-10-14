package dev.levenshtein;

/**
 * Exception personnalisée pour le calcul de la distance de Levenshtein.
 */
public class AppException extends RuntimeException {

    // Constructeur qui prend un message personnalisé
    public AppException(String message) {
        super(message);
    }
}
