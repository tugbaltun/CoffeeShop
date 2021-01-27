package coffeeshop.business.concretes;

import coffeeshop.business.abstracts.ICustomerService;
import coffeeshop.dataAccess.abstracts.customer.ICustomerDal;
import coffeeshop.entities.concretes.customer.Customer;

public class CustomerService implements ICustomerService{
	public ICustomerDal customerDal;
	
	public void add(Customer customer) {
		customerDal.add(customer);
	}
	
	public void update(Customer customer, Customer update) {
		customerDal.update(customer, update);
	}
	
	public void delete(Customer customer) {
		customerDal.delete(customer);
	}
	
}
