package coffeeshop.dataAccess.abstracts.selling;

import coffeeshop.entities.concretes.customer.Customer;

public class NeroSellingDal implements ISellingDal {

	@Override
	public void count(Customer customer, double amount) {
		System.out.println("Nero: Sipariþ Hesaplandý.");
	}

}
