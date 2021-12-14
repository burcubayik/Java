package gameProject.concrete;

import gameProject.abstracts.CampaignService;
import gameProject.entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("kampanya eklendi: "+ campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

}
