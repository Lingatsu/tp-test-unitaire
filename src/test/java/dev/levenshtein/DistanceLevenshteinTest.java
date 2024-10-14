package dev.levenshtein;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DistanceLevenshteinTest {

    @Test
    void calculerDistance() {
        DistanceLevenshtein distanceLevenshtein = new DistanceLevenshtein();

        // Mots choisis
        String mot1 = "chat";
        String mot2 = "chats";

        // Calcul manuel de la distance de Levenshtein : 1
        int distanceAttendue = 0;

        // Appel de la méthode à tester
        int distanceCalculee = distanceLevenshtein.calculerDistance(mot1, mot2);

        // Vérification que la distance calculée est correcte
        assertEquals(distanceAttendue, distanceCalculee);
    }
}
