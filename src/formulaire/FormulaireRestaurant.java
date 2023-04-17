package formulaire;

public class FormulaireRestaurant extends Formulaire {

	private int num_Table;
	private int nb_Person;
	private int num_Service;
	
	
	public FormulaireRestaurant(int jour, int mois, int nb_Person, int num_Service) {
		super(jour, mois);
		this.nb_Person = nb_Person;
		this.num_Service = num_Service;
	}

	
	public int getNombrePersonnes() {
		return nb_Person;
	}
	
	public int getNumService() {
		return num_Service;
	}
	
	public int getJour() {
		return jour;
	}
	
	public int getMois() {
		return mois;
	}
	public int getIdentificationEntite() {
		return num_Table;
	}

	public void setIdentificationEntite(int num_Table) {
		this.num_Table = num_Table;
	}
	
}
