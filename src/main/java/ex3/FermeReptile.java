package ex3;

public class FermeReptile extends Zone{
	
	public FermeReptile() {
		animaux.add(new Animal("Boa constrictor", Type.SERPENT, Comportement.CARNIVORE));
		animaux.add(new Animal("Python", Type.SERPENT, Comportement.CARNIVORE));
	}

	public double calculerKgsNourritureParJour(){
		return animaux.size() * 0.1;
	}
}
