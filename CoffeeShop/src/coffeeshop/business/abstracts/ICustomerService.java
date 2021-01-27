package coffeeshop.business.abstracts;

import coffeeshop.entities.concretes.customer.Customer;

public abstract interface ICustomerService {
	void add(Customer customer);
	void update(Customer customer, Customer update);
	void delete(Customer customer);
}
