package ödev4;

public class MemoryController implements Controller{

	@Override
	public void doControl(Gamer gamer) {
		if(gamer.getFirstName()=="Bahattin") {
			System.out.println("oyuncu memory controller ile kontrol edildi.");
		}
		else {
			System.out.println("bilgiler onaylanamadý");
		}
	}

}
