package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;
	
	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	protected String type;
	
	/** Ce constructeur est utilisé pour créer un compte
	 * @param solde
	 * @param decouvert
	 * @param type
	 */
	public CompteBancaire(String type, double solde) {
		super();
		this.type = type;
		this.solde = solde;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Récupération du solde
	 * @return le solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Modification du solde
	 * @param le nouveau solde
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	/** R�cup�ration du type de compte
	 * @return le type
	 */
	public String getType() {
		return type;
	}
	/** Modification du type de compte
	 * @param le nouveau type
	 */
	public void setType(String type) {
		this.type = type;
	}
}
