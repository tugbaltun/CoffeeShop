package coffeeshop.dataAccess.abstracts.customer;

import coffeeshop.entities.concretes.customer.Customer;

public class INeroCustomerDal implements ICustomerDal{

	@Override
	public void add(Customer customer) {
		System.out.println("Nero: Müþteri sisteme eklendi.");
	}

	@Override
	public void update(Customer customer, Customer update) {
		System.out.println("Nero: Müþteri bilgileri güncellendi.");
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Nero: Müþteri kaydý silindi.");
	}

}
