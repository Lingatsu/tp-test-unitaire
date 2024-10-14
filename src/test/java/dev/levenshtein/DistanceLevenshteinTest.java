package dev.levenshtein;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DistanceLevenshteinTest {

    private DistanceLevenshtein distanceLevenshtein;

    // Tableau statique qui contient les paires de mots et les distances attendues
    private static Object[][] testCases;

    // Méthode statique pour initialiser le tableau avant l'exécution des tests
    @BeforeAll
    static void initTestCases() {
        testCases = new Object[][] {
                {"chat", "chats", 1},
                {"machins", "machine", 1},
                {"java", "jee", 3}
        };
    }

    // Méthode qui initialise l'instance de DistanceLevenshtein avant chaque test
    @BeforeEach
    void setUp() {
        distanceLevenshtein = new DistanceLevenshtein();
    }

    // Test pour le cas 1 : "chat" et "chats"
    @Test
    void testDistanceChatChats() {
        String mot1 = (String) testCases[0][0];
        String mot2 = (String) testCases[0][1];
        int distanceAttendue = (int) testCases[0][2];

        int distanceCalculee = distanceLevenshtein.calculerDistance(mot1, mot2);

        assertEquals(distanceAttendue, distanceCalculee);
    }

    // Test pour le cas 2 : "machins" et "machine"
    @Test
    void testDistanceMachinsMachine() {
        String mot1 = (String) testCases[1][0];
        String mot2 = (String) testCases[1][1];
        int distanceAttendue = (int) testCases[1][2];

        int distanceCalculee = distanceLevenshtein.calculerDistance(mot1, mot2);

        assertEquals(distanceAttendue, distanceCalculee);
    }

    // Test pour le cas 3 : "java" et "jee"
    @Test
    void testDistanceJavaJee() {
        String mot1 = (String) testCases[2][0];
        String mot2 = (String) testCases[2][1];
        int distanceAttendue = (int) testCases[2][2];

        int distanceCalculee = distanceLevenshtein.calculerDistance(mot1, mot2);

        assertEquals(distanceAttendue, distanceCalculee);
    }
}