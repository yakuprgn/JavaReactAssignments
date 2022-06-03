package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign, Game game) {
		System.out.println(campaign.getName()+" indirim kullandınız. "+
				game.getPrice()*campaign.getDiscountRate()/100 + "TL indirim kazandınız.");		
	}

	@Override
	public void update(Campaign campaign, Game game) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int campaignId, Game game) {
		// TODO Auto-generated method stub
		
	}
	
	
}
