package ex2;

public class LivretA extends CompteBancaire {
	
	/** tauxRemuneration : taux de rÃ©munÃ©ration */
	private double tauxRemuneration;
	
	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde);
		super.type = type;
		super.solde = solde;
		this.tauxRemuneration = tauxRemuneration;
	}
	
	/**
	 * Application du taux de rémunération au livret A
	 */
	public void appliquerRemuAnnuelle(){
		this.solde = solde + solde*tauxRemuneration/100;
	}
	
	/** Enl�ve un montant au solde du livret A
	 * @param montant
	 */
	public void debiterMontantLA(double montant){
		
			if (this.solde - montant > 0)
				this.solde = solde - montant;

	}
	
	/** Récupération du taux de rémunération
	 * @return le taux de rémunération
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	
	/** Modification du taux de rémunération
	 * @param le nouveau taux de rémunération
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
