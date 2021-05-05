package Entities;

import Abstract.Entity;

public class Customer implements Entity {
	public int id;
	public String firstName;
	public String secondName;
	public String dateofBirth;
	public String NationalityId;
	
	Customer()
	{
	}

	public Customer(int id, String firstName, String secondName, String dateofBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.dateofBirth = dateofBirth;
		NationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

}
