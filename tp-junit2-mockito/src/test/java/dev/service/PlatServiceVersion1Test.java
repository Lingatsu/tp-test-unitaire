package dev.service;

import dev.dao.IPlatDao;
import dev.entite.Plat;
import dev.exception.PlatException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PlatServiceVersion1Test {

    private IPlatDao mockDao;
    private PlatServiceVersion1 platService;

    @BeforeEach
    void setUp() {
        mockDao = Mockito.mock(IPlatDao.class);
        platService = new PlatServiceVersion1(mockDao);
    }

    @Test
    void testListerPlats_ShouldReturnUpperCasePlatNames() {
        // Arrange
        List<Plat> plats = Arrays.asList(
                new Plat("soupe", 1000),
                new Plat("salade", 1500)
        );
        when(mockDao.listerPlats()).thenReturn(plats);

        // Act
        List<Plat> result = platService.listerPlats();

        // Assert
        assertEquals(2, result.size());
        assertEquals("SOUPE", result.get(0).getNom());
        assertEquals("SALADE", result.get(1).getNom());
    }

    @Test
    void testListerPlats_WhenDaoReturnsNull_ShouldThrowPlatException() {
        // Arrange
        when(mockDao.listerPlats()).thenReturn(null);

        // Act & Assert
        PlatException exception = assertThrows(PlatException.class, () -> platService.listerPlats());
        assertEquals("Une erreur est survenue lors de la récupération des plats", exception.getMessage());
        assertTrue(exception.getCause() instanceof NullPointerException);
    }
}