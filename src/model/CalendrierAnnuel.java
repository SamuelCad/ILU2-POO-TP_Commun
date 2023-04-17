package model;

public class CalendrierAnnuel {
	
	private Mois[] calendrier = {
			new Mois("Janvier",31), new Mois("Février",28), new Mois("Mars",31), 
			new Mois("Avril",30), new Mois("Mai",31),new Mois("Juin",30), 
			new Mois("Juillet",31), new Mois("Août",31) ,new Mois("Septembre", 30), 
			new Mois("Octobre",31), new Mois("Novembre",30), new Mois("Décembre",31)
			};
	
	public CalendrierAnnuel() {
		super();
	}
			private static class Mois{
				private String nom;
				private Boolean[] jours;
		
				public Mois(String nom, int nbjours) {
					super();
					this.nom = nom;
					this.jours = new Boolean[nbjours];
					for (int i = 0; i < jours.length; i++) {
						jours[i]=false;
					}
				}
				
				private Boolean estLibre(int jour) {
					int day = jour-1;
					if (jours[day]) {
						return false;
					}
					return true;
				}
				
				private void reserver(int jour) throws IllegalStateException {
					if(estLibre(jour)==false) {
						throw new IllegalStateException("Le jour à reservé n'est pas libre ");
					}
					jours[jour-1]=true;
				}
			}
	
	public Boolean estLibre(int jour, int mois) {
		Mois month = calendrier[mois-1];
		if (month.estLibre(jour)) {
			return true;
			}
		return false;
	}
	
	public Boolean reserver(int jour, int mois) {
		Mois month = calendrier[mois-1];
		if (estLibre(jour, mois)) {
			month.jours[jour-1]= true;
			return true;
		}
		return false;
	
		
	}
	public static void main(String[] args) {
		CalendrierAnnuel calend = new CalendrierAnnuel();
		System.out.println(calend.reserver(20, 10));
	}
}
