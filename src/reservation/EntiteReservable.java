package reservation;

import formulaire.Formulaire;
import formulaire.FormulaireRestaurant;
import model.CalendrierAnnuel;

public class EntiteReservable<T extends Formulaire >  {

	private CalendrierAnnuel calendrier_perso;
	private int numero;
	
	
	public EntiteReservable(CalendrierAnnuel calendrier_perso, int numero) {
		super();
		this.calendrier_perso = calendrier_perso;
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Boolean estLibre(T formulaire) {
		int jour = formulaire.getJour();
		int mois = formulaire.getMois();
		return calendrier_perso.estLibre(jour, mois);
	}
	
	public Boolean compatible(T formulaire) {
		Boolean bool = false;
	
		
		return bool;
	}
	
	
	
	
	
	
	
	
}
