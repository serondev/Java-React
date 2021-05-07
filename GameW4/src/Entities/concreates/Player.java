package Entities.concreates;


import Entities.abstracts.Entity;

public class Player implements Entity{
	private int id;
	private String name;
	private String surName;
	private String nationalityId;
	private int birthDate;
	
	public Player(){}

	public Player(int id, String name, String surName, String nationalityId, int birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.nationalityId = nationalityId;
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}
	
	}

