package coffeeshop.dataAccess.abstracts.customer;

import coffeeshop.entities.concretes.customer.Customer;

public class IStarbucksCustomerDal implements ICustomerDal{

	@Override
	public void add(Customer customer) {
		if(customer != null)
		{
			System.out.println("Starbucks: M��teri bilgileri, E-Devlet �zerinden kontrol edildi ve sisteme eklendi.");
		}
		else
			System.out.print("Starbucks: Kullan�c� bilgileri E-Devlet �zerinden do�rulanamad�");
	}

	@Override
	public void update(Customer customer, Customer update) {
		System.out.println("Starbucks: M��teri bilgileri g�ncellendi.");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Starbucks: M��teri kayd� silindi.");
		
	}


}
