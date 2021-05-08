package �dev4;

import java.util.ArrayList;

public class GamerManager implements GamerService{
	private Controller controller;
	ArrayList<Gamer> gamers= new ArrayList<>();
		public GamerManager(Controller controller) {
		this.controller = controller;
	}
		public void add(Gamer gamer) {
			System.out.println(gamer.getFirstName()+"Adl� Oyuncu Eklendi.");
			//for (Controller controller : controllers) {
			/*	controller.doControl(gamer);
				gamers.add(gamer);*/
			//}
			controller.doControl(gamer);
			gamers.add(gamer);
		}
		@Override
		public void update(Gamer gamer) {
			System.out.println(gamer.getFirstName()+"Adl� Oyuncu G�ncellendi.");
		}
		@Override
		public void delete(Gamer gamer) {
			System.out.println(gamer.getFirstName()+"Adl� Oyuncu Silindi.");
		}
		@Override
		public void getGamer(Gamer gamer) {
			System.out.println(gamer.getFirstName()+"Adl� Oyuncu Getirildi.");
		}
		@Override
		public void getAllGamer() {
			for (Gamer ga : gamers) {
				System.out.println(ga.getFirstName());
			}
			
		}
}
