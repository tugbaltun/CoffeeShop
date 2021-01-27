package coffeeshop.dataAccess.abstracts.campaign;

import coffeeshop.entities.abstracts.IEntity;
import coffeeshop.entities.concretes.campaign.Campaign;
import coffeeshop.entities.concretes.customer.Customer;

public abstract interface IEntityRepository <T extends IEntity> {
	public abstract void baseCampaign(Customer customer, double amount);
	public abstract void add(Campaign campaign);
	public abstract void update(Campaign campaign, Campaign updateCampaign);
	public abstract void delete(Campaign campaign);
}
