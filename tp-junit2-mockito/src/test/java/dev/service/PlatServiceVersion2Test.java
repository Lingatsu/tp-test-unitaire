package dev.service;

import dev.dao.IPlatDao;
import dev.entite.Plat;
import dev.exception.PlatException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PlatServiceVersion2Test {

    private IPlatDao mockDao;
    private PlatServiceVersion2 platService;

    @BeforeEach
    void setUp() {
        mockDao = Mockito.mock(IPlatDao.class);
        platService = new PlatServiceVersion2(mockDao);
    }

    @Test
    void testAjouterPlat_WithInvalidName_ShouldThrowPlatException() {
        // Arrange
        String nomPlat = "Sou";
        Integer prixPlat = 1200;

        // Act & Assert
        PlatException exception = assertThrows(PlatException.class, () -> platService.ajouterPlat(nomPlat, prixPlat));
        assertEquals("un plat doit avoir un nom de plus de 5 caractères", exception.getMessage());
    }

    @Test
    void testAjouterPlat_WithValidNameAndPrice_ShouldInvokeDaoMethod() {
        // Arrange
        String nomPlat = "Salade César";
        Integer prixPlat = 1200; // prix en centimes (12 euros)

        // Act
        platService.ajouterPlat(nomPlat, prixPlat);

        // Assert
        // Vérifie que la méthode ajouterPlat du DAO a été appelée avec les bons arguments
        verify(mockDao).ajouterPlat(nomPlat, prixPlat * 2); // Le prix doit être multiplié par 2
    }
}
