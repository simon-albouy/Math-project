package generator;

import java.util.ArrayList;
import java.util.Iterator;

public class aleatGener
{
	private int tailleEnsembleAleat = 0;
	private ArrayList<Double> ensembleAleat= new ArrayList<Double>();

	public aleatGener(int taille)
	{
		for (int i = 0; i<taille;i++)
		{
			ensembleAleat.add(Math.random());
		}

		ensembleAleat.sort(null);
		tailleEnsembleAleat = taille;
	}

	public int getTailleEnsembleAleat()
	{
		return tailleEnsembleAleat;
	}

	public void setTailleEnsembleAleat(int taille)
	{
		tailleEnsembleAleat = taille;
	}

	public ArrayList<Double> getEnsembleAleat()
	{
		return ensembleAleat;
	}

	public void afficherEnsemble()
	{
		if(ensembleAleat.size() != 0)
		{
			System.out.print("Contenu de l'ensemble \n");
			Iterator<Double> itr = ensembleAleat.iterator();
			while (itr.hasNext())
			{
				Double element = itr.next();
				System.out.print(element + " \n");
			}
			System.out.println();
		}
	}
}
