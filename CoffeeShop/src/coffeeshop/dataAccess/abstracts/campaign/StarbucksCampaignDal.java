package coffeeshop.dataAccess.abstracts.campaign;

import coffeeshop.entities.concretes.campaign.Campaign;
import coffeeshop.entities.concretes.customer.Customer;

public class StarbucksCampaignDal implements ICampaignDal{
	
	public void starCount(Customer customer, int star) {
		if(star >= 5)
			System.out.print(" Tebrikler 5 yýldýzý tamamladýnýz ve hediye bir kahve kazandýnýz!");
		else
			System.out.println("Sipariþ verdiðiniz için bir yýldýz kazandýnýz");
	}

	@Override
	public void baseCampaign(Customer customer, double amount) {
		System.out.print("Starbucks: Sipariþiniz hesaplandý: " + amount*0.95);
		this.starCount(customer, 5);
	}

	@Override
	public void add(Campaign campaign) {
		System.out.println("Starbucks: Kampanya eklendi.");
	}

	@Override
	public void update(Campaign campaign, Campaign campaign2) {
		System.out.println("Starbucks: Kampanya güncellendi.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Starbucks: Kampanya silindi.");
	}
	
}