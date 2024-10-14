package dev.levenshtein;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DistanceLevenshteinTest {

    private final DistanceLevenshtein distanceLevenshtein = new DistanceLevenshtein();

    @Test
    void testPremierParametreNull() {
        AppException exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance(null, "mot");
        });
        assertEquals("le premier paramètre ne peut être null ou vide", exception.getMessage());
    }

    @Test
    void testPremierParametreVide() {
        AppException exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance("", "mot");
        });
        assertEquals("le premier paramètre ne peut être null ou vide", exception.getMessage());
    }

    @Test
    void testSecondParametreNull() {
        AppException exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance("mot", null);
        });
        assertEquals("le second paramètre ne peut être null ou vide", exception.getMessage());
    }

    @Test
    void testSecondParametreVide() {
        AppException exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance("mot", "");
        });
        assertEquals("le second paramètre ne peut être null ou vide", exception.getMessage());
    }
}