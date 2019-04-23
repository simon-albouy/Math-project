package loi;

import java.util.ArrayList;
import java.util.Iterator;

public class loiNormale
{
	private ArrayList<Double> ensembleBoxMuller = new ArrayList<Double>();
	//sqrt(-2ln(U))cos2piV

	public loiNormale(ArrayList<Double> listUn, ArrayList<Double> listDeux)
	{
		if ((listUn.size() != 0) && (listDeux.size() != 0) && (listDeux.size() == listUn.size()) )
		{
			Iterator<Double> itrUn = listUn.iterator();
			Iterator<Double> itrDeux = listDeux.iterator();
		    while (itrUn.hasNext()) {
		    }
		    System.out.println();
		}
		else
		{
			System.out.println("Impossible calculer \n");
		}
	}

}
