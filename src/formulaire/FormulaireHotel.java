package formulaire;

public class FormulaireHotel extends Formulaire {

	private int numero_Chambre;
	private int nbrLit_Simple;
	private int nbrLit_Double;
	
	
	public FormulaireHotel(int jour, int mois, int nbrLit_Simple, int nbrLit_Double) {
		super(jour, mois);
		this.nbrLit_Simple = nbrLit_Simple;
		this.nbrLit_Double = nbrLit_Double;
	}

	public int getNumero_Chambre() {
		return numero_Chambre;
	}

	public void setNumero_Chambre(int numero_Chambre) {
		this.numero_Chambre = numero_Chambre;
	}

	public int getNbrLit_Simple() {
		return nbrLit_Simple;
	}

	public int getNbrLit_Double() {
		return nbrLit_Double;
	}
	

}
