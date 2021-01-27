package coffeeshop.dataAccess.abstracts.customer;

import coffeeshop.entities.concretes.customer.Customer;

public abstract interface ICustomerDal extends IEntityRepository<Customer>{
	public abstract void add(Customer customer);
	public abstract void update(Customer customer, Customer update);
	public abstract void delete(Customer customer);
}