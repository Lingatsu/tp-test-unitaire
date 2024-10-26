package dev.service;

import dev.dao.IPlatDao;
import dev.entite.Plat;
import dev.exception.PlatException;

import java.util.List;

public class PlatServiceVersion1 implements IPlatService {

    private IPlatDao dao;

    public PlatServiceVersion1(IPlatDao dao) {
        this.dao = dao;
    }

    @Override
    // modification de la méthode pour les majuscules
    public List<Plat> listerPlats() {
        List<Plat> plats = dao.listerPlats();
        if (plats == null) {
            throw new PlatException("Une erreur est survenue lors de la récupération des plats", new NullPointerException());
        }
        return plats.stream()
                .map(plat -> new Plat(plat.getNom().toUpperCase(), plat.getPrixEnCentimesEuros()))
                .toList();
    }



    @Override
    public void ajouterPlat(String nomPlat, Integer prixPlat) {

        // règle métier

        if (nomPlat.length() <= 3) {
            throw new PlatException("un plat doit avoir un nom de plus de 3 caractères");
        }

        if (prixPlat <= 500) {
            throw new PlatException("le prix d'un plat doit être supérieur à 5 €");
        }

        // persistance uniquement si les règles métiers sont respectées
        dao.ajouterPlat(nomPlat, prixPlat);
    }
}
