package coffeeshop.dataAccess.abstracts.selling;

import coffeeshop.entities.abstracts.IEntity;
import coffeeshop.entities.concretes.customer.Customer;

public abstract interface IEntityRepository <T extends IEntity> {
	public abstract void count(Customer customer, double amount);	
}
