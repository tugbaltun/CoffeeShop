package coffeeshop.dataAccess.abstracts.customer;

import coffeeshop.entities.concretes.customer.Customer;

public class INeroCustomerDal implements ICustomerDal{

	@Override
	public void add(Customer customer) {
		System.out.println("Nero: M��teri sisteme eklendi.");
	}

	@Override
	public void update(Customer customer, Customer update) {
		System.out.println("Nero: M��teri bilgileri g�ncellendi.");
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Nero: M��teri kayd� silindi.");
	}

}
