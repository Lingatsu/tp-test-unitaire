package dev.levenshtein;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

class DistanceLevenshteinTest {

    private final DistanceLevenshtein distanceLevenshtein = new DistanceLevenshtein();

    // Tests vérifiant le calcul de la distance de Levenshtein
    @Tag("calcul")
    @ParameterizedTest(name = "Test avec les mots {0} et {1} : distance attendue = {2}")
    @CsvFileSource(resources = "/dev/levenshtein/DistanceLevenshtein.csv", delimiter = ';', numLinesToSkip = 1)
    void calculerDistance(String mot1, String mot2, int distanceAttendue) {
        int distanceCalculee = distanceLevenshtein.calculerDistance(mot1, mot2);
        assertEquals(distanceAttendue, distanceCalculee);
    }

    // Tests validant les entrées (vérification des exceptions)
    @Tag("validation")
    @Test
    void testPremierParametreNull() {
        AppException exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance(null, "mot");
        });
        assertEquals("le premier paramètre ne peut être null ou vide", exception.getMessage());
    }

    @Tag("validation")
    @Test
    void testPremierParametreVide() {
        AppException exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance("", "mot");
        });
        assertEquals("le premier paramètre ne peut être null ou vide", exception.getMessage());
    }

    @Tag("validation")
    @Test
    void testSecondParametreNull() {
        AppException exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance("mot", null);
        });
        assertEquals("le second paramètre ne peut être null ou vide", exception.getMessage());
    }

    @Tag("validation")
    @Test
    void testSecondParametreVide() {
        AppException exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance("mot", "");
        });
        assertEquals("le second paramètre ne peut être null ou vide", exception.getMessage());
    }
}