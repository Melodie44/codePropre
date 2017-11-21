package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private String nom;
	private List<Zone> zones = new ArrayList<Zone>();
	
	public Zoo(String nom){
		this.nom = nom;
		zones.add(new Aquarium());
		zones.add(new FermeReptile());
		zones.add(new SavaneAfricaine());
		zones.add(new Carnivore());
	}
	
	public void addZone(Zone zone) {
		zones.add(zone);
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public List<Zone> getZones() {
		return zones;
	}

	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}

}
