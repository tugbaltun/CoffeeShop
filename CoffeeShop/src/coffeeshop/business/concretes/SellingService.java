package coffeeshop.business.concretes;

import coffeeshop.business.abstracts.ISellingService;
import coffeeshop.dataAccess.abstracts.campaign.ICampaignDal;
import coffeeshop.entities.concretes.customer.Customer;

public class SellingService implements ISellingService{
	
	public ICampaignDal campaignDal;

	@Override
	public void count(Customer customer, double amount) {
		campaignDal.baseCampaign(customer, amount);
	}

}
