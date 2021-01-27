package coffeeshop.business.abstracts;

import coffeeshop.entities.concretes.customer.Customer;

public abstract interface ISellingService {
	public void count(Customer customer, double amount);
}
