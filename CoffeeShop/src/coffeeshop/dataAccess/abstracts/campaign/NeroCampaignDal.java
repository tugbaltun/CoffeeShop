package coffeeshop.dataAccess.abstracts.campaign;

import coffeeshop.entities.concretes.campaign.Campaign;
import coffeeshop.entities.concretes.customer.Customer;

public class NeroCampaignDal implements ICampaignDal{

	@Override
	public void baseCampaign(Customer customer, double amount) {
		System.out.println("Nero: Sipariþiniz hesaplandý: " + amount*0.92);
	}

	@Override
	public void add(Campaign campaign) {
		System.out.println("Nero: Kampanya eklendi.");
	}

	@Override
	public void update(Campaign campaign, Campaign update) {
		System.out.println("Nero: Kampanya güncellendi.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Nero: Kampanya silindi.");
	}

}