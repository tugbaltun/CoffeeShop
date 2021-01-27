package coffeeshop.dataAccess.abstracts.customer;

import coffeeshop.entities.concretes.customer.Customer;

public class IStarbucksCustomerDal implements ICustomerDal{

	@Override
	public void add(Customer customer) {
		if(customer != null)
		{
			System.out.println("Starbucks: Müþteri bilgileri, E-Devlet üzerinden kontrol edildi ve sisteme eklendi.");
		}
		else
			System.out.print("Starbucks: Kullanýcý bilgileri E-Devlet üzerinden doðrulanamadý");
	}

	@Override
	public void update(Customer customer, Customer update) {
		System.out.println("Starbucks: Müþteri bilgileri güncellendi.");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Starbucks: Müþteri kaydý silindi.");
		
	}


}
