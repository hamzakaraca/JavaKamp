package ödev4;

public class SaleManager {
	private Campaign campaign;
	
		public SaleManager(Campaign campaign) {
		this.campaign = campaign;
	}
		public SaleManager() {
			
		}

		public void Sale(Gamer gamer,Game game) {
			System.out.println(game.getName()+" Adlý oyun "+gamer.getFirstName()+" Adlý oyuncuya satýlmýþtýr.");
			System.out.println("by "+campaign.getName());
		}
}
