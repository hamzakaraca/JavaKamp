package �dev4;

import java.util.ArrayList;

public class CampaignManager implements CampaignService{
	ArrayList<Campaign> campaigns= new ArrayList<>();
		@Override
		public void add(Campaign campaign) {
			System.out.println(campaign.getName()+" Kampanyas� eklendi.");
			
			campaigns.add(campaign);
			
			
		}
		@Override
		public void update(Campaign campaign) {
			System.out.println(campaign.getName()+" Kampanyas� g�ncellendi.");
			campaigns.add(0, campaign);
		}
		@Override
		public void delete(Campaign campaign) {
			System.out.println(campaign.getName()+" Kampanyas� silindi.");
			campaigns.remove(campaign);
		}
		@Override
		public void getCampaign() {
			for (Campaign ca : campaigns) {
				System.out.println(ca.getName());
			}
		}
}
