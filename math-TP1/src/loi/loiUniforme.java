package loi;

import java.util.ArrayList;

import factory.factoryEnsemble;

public class loisUniforme {

	public static void main(String[] args) {

		System.out.println("TEST UNIFORME BEGIN ");

		ArrayList<Double> ensembleUniforme = factoryEnsemble.ensemble.getEnsembleAleat();

		loiUniforme(ensembleUniforme);

	}

	public static void loiUniforme(ArrayList<Double> ensembleUniforme) {

		int[] testArray = new int[10];

		
		// création du tableau de classe pour le khi 2
		for (int i = 0; i < testArray.length; i++) {

			double pas = i / 10.0;

			testArray[i] = (int) ensembleUniforme.stream()
					.filter(p -> p <= (0.1 + pas))
					.filter(p -> p > pas) 
					.count();

		}

		
		int calculKhi2 = 0;
		// comparation valeur théorique (15 ici) aux valeurs observé
		for (int nb_obs : testArray) {
			calculKhi2 += Math.pow(nb_obs - 15, 2);
		}
		calculKhi2 /= 15;
		
		//System.out.println(calculKhi2);

		System.out.println("test du khi2 de degrée 9 :");
		
		if(calculKhi2 < 16.62) {
			System.out.println(calculKhi2 +" < 16,62 donc la génération de nombre aléatoire suit bien une lois uniforme");
		} else {
			System.out.println(calculKhi2 +" > 16,62 donc la génération de nombre aléatoire ne suit pas une lois uniforme avec 5% de taux d'erreur");
		}
		
	}

}
