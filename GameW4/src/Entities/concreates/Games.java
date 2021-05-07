package Entities.concreates;

import Entities.abstracts.Entity;

public class Games implements Entity{
	private int number;
	private String gameName;
	private double price;
	
	public Games() {}

	public Games(int number, String gameName, double price) {
		super();
		this.number = number;
		this.gameName = gameName;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	


}
