package gameProject.entities;

public class Campaign {
	int campaignId;
	String campaignName;
	double discount;
	public Campaign() {
		
	}
	public Campaign(int campaignId, String campaignName, double discount) {
		
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.discount = discount;
	}
	public int getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
}