package ödev4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Gamer gamer=new Gamer(1,"123456789","Hamza","Karaca", "2001");
		Gamer gamer2=new Gamer(1,"123456789","Doruk","Karaca", "2021");
		Game game=new Game(1, "Counter Strike Global Offensive", "20$");
		Campaign campaign=new Campaign(1, "Kara Cuma", "11 aralýkta olur!","1 gün");
		Campaign campaign2=new Campaign(1, "Winter Is Coming", "1 ocakta olur","1 hafta");
		Controller[] controllers= {new EDevletController(),new MemoryController()};
		GamerManager gamerManager=new GamerManager(new EDevletController());
		gamerManager.add(gamer);
		gamerManager.add(gamer2);
		/*SaleManager saleManager=new SaleManager(campaign);
		saleManager.Sale(gamer, game);
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.add(campaign2);*/
		//campaignManager.getCampaign();
		gamerManager.getAllGamer();


	}

}
