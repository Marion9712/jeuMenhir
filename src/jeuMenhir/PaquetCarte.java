package jeuMenhir;
 
import java.util.ArrayList;
import java.util.Collections;

public class PaquetCarte {

	ArrayList <Carte> paquetCarte = new ArrayList<Carte>();		//Cr�ation Paquet de Cartes, liste de cartes
	
	//Ajouter Carte dans PaquetCarte
	//fonction ajouter carte
	public boolean ajouterCarte (Carte c)
	{
		if (paquetCarte.add(c))
		{
			return true;
		}
		else return false;
	}
	
	//m�langer carte
	public void melangerCarte ()
	{
		for (int i = 0; i <= this.length; i++)
		{
			
		}
	}
	//
	
}
