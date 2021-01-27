package coffeeshop.business.concretes;

import coffeeshop.business.abstracts.ICampaignService;
import coffeeshop.dataAccess.abstracts.campaign.ICampaignDal;
import coffeeshop.entities.concretes.campaign.Campaign;

public class CampaignService implements ICampaignService{
	
	public ICampaignDal campainDal;

	@Override
	public void add(Campaign campaign) {
		campainDal.add(campaign);
	}
	
	@Override
	public void update(Campaign campaign, Campaign update) {
		campainDal.update(campaign, update);
	}

	@Override
	public void delete(Campaign campaign) {
		campainDal.delete(campaign);
	}
	
}
