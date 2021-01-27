package coffeeshop;

import coffeeshop.business.concretes.CampaignService;
import coffeeshop.business.concretes.CustomerService;
import coffeeshop.business.concretes.SellingService;
import coffeeshop.dataAccess.abstracts.campaign.ICampaignDal;
import coffeeshop.dataAccess.abstracts.campaign.INeroCampaignDal;
import coffeeshop.dataAccess.abstracts.campaign.IStarbucksCampaignDal;
import coffeeshop.dataAccess.abstracts.customer.INeroCustomerDal;
import coffeeshop.dataAccess.abstracts.customer.IStarbucksCustomerDal;
import coffeeshop.entities.concretes.campaign.Campaign;
import coffeeshop.entities.concretes.customer.Customer;
import coffeeshop.entities.concretes.customer.NeroCustomer;
import coffeeshop.entities.concretes.customer.StarbucksCustomer;

public class Main {

	public static void main(String[] args) {
		
//		Customer customer1 = new StarbucksCustomer(1,"Selma","Tan","101","1997",0);
//		Customer customer2 = new StarbucksCustomer(2,"Leyla","Mercan","102","1995",0);
//		Customer customer3 = new StarbucksCustomer(3,"Hale","Can","103","1994",0);
		
		Customer customer1 = new NeroCustomer(1,"Selma","Tan");
		Customer customer2 = new NeroCustomer(2,"Leyla","Mercan");
		Customer customer3 = new NeroCustomer(3,"Hale","Can");
		
		CustomerService customerService = new CustomerService();
		customerService.customerDal = new INeroCustomerDal();
		customerService.add(customer1);
		customerService.update(customer1, customer2);
		customerService.add(customer3);
		customerService.delete(customer1);
		
		CampaignService campaignService = new CampaignService();
		campaignService.campainDal = new INeroCampaignDal();
		
		Campaign campaign = new Campaign(1,"Star");
		campaignService.add(campaign);
		campaignService.update(campaign, campaign);
		campaignService.delete(campaign);
		
		SellingService sellingService = new SellingService();
		sellingService.campaignDal = new INeroCampaignDal();
		sellingService.count(customer1, 100);
		
	}
}
