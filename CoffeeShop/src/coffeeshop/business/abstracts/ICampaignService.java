package coffeeshop.business.abstracts;

import coffeeshop.entities.concretes.campaign.Campaign;

public abstract interface ICampaignService {
	public abstract void add(Campaign campaign);
	public abstract void update(Campaign campaign, Campaign update);
	public abstract void delete(Campaign campaign);
}
