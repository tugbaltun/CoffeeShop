package coffeeshop.dataAccess.abstracts.selling;

import coffeeshop.entities.concretes.customer.Customer;

public class INeroSellingDal implements ISellingDal {

	@Override
	public void count(Customer customer, double amount) {
		System.out.println("Nero: Sipari� Hesapland�.");
	}

}
