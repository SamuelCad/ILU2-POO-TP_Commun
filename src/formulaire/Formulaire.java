package formulaire;

public class Formulaire {
	
	protected int jour;
	protected int mois;
	
	
	public Formulaire(int jour, int mois) {
		super();
		this.jour = jour;
		this.mois = mois;
	}


	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}
	
	
}
