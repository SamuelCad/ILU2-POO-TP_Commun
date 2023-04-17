package formulaire;

public class FormulaireSpectacle extends Formulaire{

	private int num_Chaise;
	private int num_Zone;
	
	public FormulaireSpectacle(int jour, int mois, int num_Zone) {
		super(jour, mois);
		this.num_Zone = num_Zone;
	}

	public int getNum_Chaise() {
		return num_Chaise;
	}

	public void setNum_Chaise(int num_Chaise) {
		this.num_Chaise = num_Chaise;
	}

	public int getNum_Zone() {
		return num_Zone;
	}
	
}
