package ex1;

import java.util.Date;

/**
 * La classe {@code Entreprise} représente une entreprise avec des informations de base telles que
 * le numéro SIRET, le nom, l'adresse et la date de création. Elle fournit également une méthode pour
 * afficher le statut de l'entreprise.
 */
public class Entreprise {

    /**
     * Le capital maximum autorisé pour une entreprise.
     */
    public static final int CAPITAL_MAX = 3000000;

    /**
     * Le numéro SIRET de l'entreprise.
     */
    public int siret;

    /**
     * Le nom de l'entreprise.
     */
    public String nom;

    /**
     * L'adresse de l'entreprise.
     */
    public String adresse;

    /**
     * La date de création de l'entreprise.
     */
    public Date dateCreation;

    /**
     * Affiche le statut actuel de l'entreprise. La méthode est encore non implémentée.
     * Cette méthode pourrait être utilisée pour afficher des informations comme le nom,
     * l'adresse, la date de création, etc.
     */
    public void afficherStatut() {
        // TODO: Implémenter cette méthode pour afficher le statut de l'entreprise

    }

}
