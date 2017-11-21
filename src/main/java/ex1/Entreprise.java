package ex1;

import java.util.Date;

/**
 * Classe regroupant les informations d'une entreprise.
 * 
 * @author Maubois Mélodie
 *
 */
public class Entreprise {

	/** siret: numéro d'identification de l'entreprise **/
	public int siret;
	/** nom: nom de l'entreprise **/
	public String nom;
	/** adresse: adresse de l'entreprise **/
	public String adresse;
	/** dateCreation: date de création de l'entreprise **/
	public Date dateCreation;
	
	public static final int CAPITAL_MAX = 3000000;
	
	/**
	 * Méthode permettant d'afficher le statut de l'entreprise.
	 */
	public void AfficherStatut(){
		
	}
	
}
