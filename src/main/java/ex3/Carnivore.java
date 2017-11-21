package ex3;

public class Carnivore extends Zone{

	public Carnivore() {
		animaux.add(new Animal("Lion", Type.MAMMIFERE, Comportement.CARNIVORE));
		animaux.add(new Animal("Panthère", Type.MAMMIFERE, Comportement.CARNIVORE));
	}

	public double calculerKgsNourritureParJour(){
		return animaux.size() * 10;
	}
	
}
