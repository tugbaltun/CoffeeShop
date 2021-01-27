package coffeeshop.entities.concretes.campaign;

import coffeeshop.entities.abstracts.IEntity;

public class Campaign implements IEntity{
	
	public Campaign(int id, String campaignName) {
		super();
		this.id = id;
		this.campaignName = campaignName;
	}
	private int id;
	private String campaignName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
}
