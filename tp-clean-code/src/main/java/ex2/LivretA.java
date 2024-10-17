package ex2;

/**
 * Représente un livret A.
 */
public class LivretA extends CompteBancaire {

    /**
     * Constructeur pour un livret A.
     *
     * @param solde            le solde initial
     * @param tauxRemuneration le taux de rémunération
     */
    public LivretA(double solde, double tauxRemuneration) {
        super(TypeCompte.LIVRET_A, solde, 0, tauxRemuneration);
    }

    @Override
    public void debiterMontant(double montant) {
        if (this.getSolde() >= montant) {
            this.setSolde(this.getSolde() - montant);
        }
    }
}
