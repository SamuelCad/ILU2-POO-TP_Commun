package reservation;

public class ReservationRestaurant extends Reservation {

	private int num_Service;
	private int num_Table;
	
	
	public ReservationRestaurant(int jour, int mois, int num_Service, int num_Table) {
		super(jour, mois);
		this.num_Service = num_Service;
		this.num_Table = num_Table;
	}
	
	@Override
	public String toString()   {
		String num_ServiceL = null;
		if (num_Service==1) {
			num_ServiceL= "premier";	
		}
		if (num_Service==2) {
			num_ServiceL= "deuxième";	
		}
		String message= "Le " + jour + "/" + mois+" : table n°" + num_Table+ " pour le "+num_ServiceL+" service.\n";
		return message;

	}
	
	@Override
	public void name() {
		
	}

}
