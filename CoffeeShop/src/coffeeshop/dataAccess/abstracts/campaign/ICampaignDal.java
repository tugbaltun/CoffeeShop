package coffeeshop.dataAccess.abstracts.campaign;

import coffeeshop.entities.concretes.campaign.Campaign;
import coffeeshop.entities.concretes.customer.Customer;

public abstract interface ICampaignDal extends IEntityRepository<Campaign> {
	public abstract void baseCampaign(Customer customer, double amount);
	public abstract void add(Campaign campaign);
	public abstract void update(Campaign campaign, Campaign update);
	public abstract void delete(Campaign campaign);
}
