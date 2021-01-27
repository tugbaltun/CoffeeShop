package coffeeshop.entities.concretes.campaign;

public class StarbucksCampaign extends Campaign{
	
	public StarbucksCampaign(int id, String campaignName, int star) {
		super(id, campaignName);
		this.star = star;
	}

	private int star;
	
	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}
}
