package ex2;

public class CompteCourant extends CompteBancaire{
	
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;

	/** Ce constructeur est utilisé pour créer un compte
	 * @param solde
	 * @param decouvert
	 * @param type
	 */
	public CompteCourant(String type, double solde, double decouvert) {
		super(type, solde);
		super.type = type;
		super.solde = solde;
		this.decouvert = decouvert;
	}
	
	/**
	 * Enlève un montant au solde du compte courant
	 * @param montant
	 */
	public void debiterMontantCC(double montant) {
		
		if(this.solde - montant > decouvert)
			this.solde = solde - montant;
	}
	
	/** R�cup�ration du d�couvert
	 * @return le d�couvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	
	/** Modification du d�couvert
	 * @param le nouveau d�couvert
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

}
