package ödev4;

public class EDevletController implements Controller{

	@Override
	public void doControl(Gamer gamer) {
		if(gamer.getIdentityNumber()=="123456789"&&gamer.getFirstName()=="Hamza"&&gamer.getLastName()=="Karaca"&&gamer.getYear()=="2001") {
			System.out.println("oyuncu e-devlet ile kontrol edildi.Eklendi");
		}
		else {
			System.out.println("bilgiler onaylanmadý");
		}
		
	}

}
