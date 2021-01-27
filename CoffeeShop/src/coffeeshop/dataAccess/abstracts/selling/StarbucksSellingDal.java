package coffeeshop.dataAccess.abstracts.selling;

import coffeeshop.entities.concretes.customer.Customer;

public class StarbucksSellingDal implements ISellingDal{

	@Override
	public void count(Customer customer, double amount) {
		System.out.println("Starbucks: Sipariþ Hesaplandý.");
	}
	
}
