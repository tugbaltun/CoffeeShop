package coffeeshop.entities.concretes.customer;

public class StarbucksCustomer extends Customer {
	
	private String tcNo;
	private String birthDate;
	private int star;
	
	public StarbucksCustomer(int id, String name, String surname) {
		super(id, name, surname);
	}
	
	public StarbucksCustomer(int id, String name, String surname, String tcNo, String birthDate, int star) {
		super(id, name, surname);
		this.tcNo = tcNo;
		this.birthDate = birthDate;
		this.star = star;
	}

	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

}
