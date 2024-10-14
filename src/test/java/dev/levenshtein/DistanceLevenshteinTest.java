package dev.levenshtein;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

class DistanceLevenshteinTest {

    private final DistanceLevenshtein distanceLevenshtein = new DistanceLevenshtein();

    // Test paramétré avec les données du fichier CSV
    @ParameterizedTest(name = "Test avec les mots {0} et {1} : distance attendue = {2}")
    @CsvFileSource(resources = "/dev/levenshtein/DistanceLevenshtein.csv", delimiter = ';', numLinesToSkip = 1)
    @DisplayName("Tests paramétrés pour le calcul de la distance de Levenshtein")
    void calculerDistance(String mot1, String mot2, int distanceAttendue) {
        // Appel de la méthode à tester
        int distanceCalculee = distanceLevenshtein.calculerDistance(mot1, mot2);

        // Vérification que la distance calculée est correcte
        assertEquals(distanceAttendue, distanceCalculee);
        
        System.out.println("mot1 = " + mot1 + ", mot2 = " + mot2 + ", distanceAttendue = " + distanceAttendue);
    }
}