package ex3;

import java.util.ArrayList;
import java.util.List;

public class ZooApplication {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo("Thoiry");

		long nb = zoo.getZones().stream().count();
		System.out.println(nb);
		
		zoo.getZones().stream().forEach(z -> z.afficherListeAnimaux());
		
		
		
	}

}
