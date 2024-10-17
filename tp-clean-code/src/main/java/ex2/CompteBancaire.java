package ex2;

/**
 * Représente un compte bancaire. Les comptes peuvent être de type {@link TypeCompte#COURANT} ou {@link TypeCompte#LIVRET_A}.
 */
public abstract class CompteBancaire {

    /**
     * Solde du compte.
     */
    private double solde;

    /**
     * Découvert autorisé pour les comptes courants.
     */
    private double decouvert;

    /**
     * Taux de rémunération pour les livrets A.
     */
    private double tauxRemuneration;

    /**
     * Type de compte (COURANT ou LIVRET_A).
     */
    private TypeCompte type;

    /**
     * Constructeur pour un compte bancaire.
     *
     * @param type             le type du compte
     * @param solde            le solde initial
     * @param decouvert        le découvert autorisé (0 pour les livrets A)
     * @param tauxRemuneration le taux de rémunération (0 pour les comptes courants)
     */
    public CompteBancaire(TypeCompte type, double solde, double decouvert, double tauxRemuneration) {
        this.type = type;
        this.solde = solde;
        this.decouvert = decouvert;
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Ajoute un montant au solde du compte.
     *
     * @param montant le montant à ajouter
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /**
     * Débite un montant du compte. La méthode doit être implémentée par les sous-classes.
     *
     * @param montant le montant à débiter
     */
    public abstract void debiterMontant(double montant);

    /**
     * Applique la rémunération annuelle au solde pour les livrets A.
     */
    public void appliquerRemuAnnuelle() {
        if (type == TypeCompte.LIVRET_A) {
            this.solde += this.solde * tauxRemuneration / 100;
        }
    }

    // Getters et Setters
    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    public TypeCompte getType() {
        return type;
    }

    public void setType(TypeCompte type) {
        this.type = type;
    }
}
