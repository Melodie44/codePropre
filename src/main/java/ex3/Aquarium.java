package ex3;

public class Aquarium extends Zone{
	
	public Aquarium() {
		animaux.add(new Animal("Requin blanc", Type.POISSON, Comportement.CARNIVORE));
		animaux.add(new Animal("Truite dorée", Type.POISSON, Comportement.HERBIVORE));
	}

	public double calculerKgsNourritureParJour(){
		return animaux.size() * 0.2;
	}
}
