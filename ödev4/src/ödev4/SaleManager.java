package �dev4;

public class SaleManager {
	private Campaign campaign;
	
		public SaleManager(Campaign campaign) {
		this.campaign = campaign;
	}
		public SaleManager() {
			
		}

		public void Sale(Gamer gamer,Game game) {
			System.out.println(game.getName()+" Adl� oyun "+gamer.getFirstName()+" Adl� oyuncuya sat�lm��t�r.");
			System.out.println("by "+campaign.getName());
		}
}
