package reservation;

public class ReservationSpectacle extends Reservation{

	private int num_Zone;
	private int num_Chaise;
	
	
	public ReservationSpectacle(int jour, int mois, int num_Zone, int num_Chaise) {
		super(jour, mois);
		this.num_Zone = num_Zone;
		this.num_Chaise = num_Chaise;
	}
	
	
}
