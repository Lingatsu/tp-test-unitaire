package ex2;

/**
 * Représente un compte courant.
 */
public class CompteCourant extends CompteBancaire {

    /**
     * Constructeur pour un compte courant.
     *
     * @param solde     le solde initial
     * @param decouvert le découvert autorisé
     */
    public CompteCourant(double solde, double decouvert) {
        super(TypeCompte.COURANT, solde, decouvert, 0);
    }

    @Override
    public void debiterMontant(double montant) {
        if (this.getSolde() - montant >= -this.getDecouvert()) {
            this.setSolde(this.getSolde() - montant);
        }
    }
}
