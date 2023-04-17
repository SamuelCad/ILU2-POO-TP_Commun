package reservation;

public class ReservationHotel extends Reservation {

	private int nbrLit_Simple;
	private int nbrLit_Double;
	private int num_Chambre;
	
	
	public ReservationHotel(int jour, int mois, int nbrLit_Simple, int nbrLit_Double, int num_Chambre) {
		super(jour, mois);
		this.nbrLit_Simple = nbrLit_Simple;
		this.nbrLit_Double = nbrLit_Double;
		this.num_Chambre = num_Chambre;
	}
	
	
	
	
	
	
	
}
