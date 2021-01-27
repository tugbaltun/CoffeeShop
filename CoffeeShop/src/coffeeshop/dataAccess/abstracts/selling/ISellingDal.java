package coffeeshop.dataAccess.abstracts.selling;

import coffeeshop.dataAccess.abstracts.selling.IEntityRepository;
import coffeeshop.entities.concretes.customer.Customer;
import coffeeshop.entities.concretes.selling.Selling;

public abstract interface ISellingDal extends IEntityRepository<Selling> {
	public abstract void count(Customer customer, double amount);
}
