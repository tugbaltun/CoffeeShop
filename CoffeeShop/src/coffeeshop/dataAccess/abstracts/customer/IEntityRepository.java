package coffeeshop.dataAccess.abstracts.customer;

import coffeeshop.entities.abstracts.IEntity;
import coffeeshop.entities.concretes.customer.Customer;

public abstract interface IEntityRepository <T extends IEntity>{
	public void  add(Customer customer);
	public void update(Customer customer, Customer update);
	public void delete(Customer customer);
}
