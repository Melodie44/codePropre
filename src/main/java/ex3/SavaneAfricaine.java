package ex3;

public class SavaneAfricaine extends Zone{
	
	public SavaneAfricaine() {
		animaux.add(new Animal("Gazelle", Type.MAMMIFERE, Comportement.HERBIVORE));
		animaux.add(new Animal("Zèbre", Type.MAMMIFERE, Comportement.HERBIVORE));
	}

	public double calculerKgsNourritureParJour(){
		return animaux.size() * 10;
	}
}
