package Entities.concreates;

import Entities.abstracts.Entity;

public class Campaigns implements Entity{
	private String campaignName;
	private int campaignCode;
	private double priceAfterDiscount;
	
	public Campaigns() {}

	public Campaigns(String campaignName, int campaignCode, double priceAfterDiscount) {
		super();
		this.campaignName = campaignName;
		this.campaignCode = campaignCode;
		this.priceAfterDiscount = priceAfterDiscount;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getCampaignCode() {
		return campaignCode;
	}

	public void setCampaignCode(int campaignCode) {
		this.campaignCode = campaignCode;
	}

	public double getPriceAfterDiscount() {
		return priceAfterDiscount;
	}

	public void setPriceAfterDiscount(double priceAfterDiscount) {
		this.priceAfterDiscount = priceAfterDiscount;
	}
	

}
