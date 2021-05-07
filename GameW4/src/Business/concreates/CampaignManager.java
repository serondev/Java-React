package Business.concreates;

import Business.abstracts.CampaignService;
import Entities.concreates.Campaigns;
import Entities.concreates.Games;
import dataAccess.abstracts.CampaignDao;

public class CampaignManager implements CampaignService {
	private CampaignDao campaigndao;

	public CampaignManager(CampaignDao campaigndao) {
		super();
		this.campaigndao = campaigndao;
	}

	@Override
	public void add(Campaigns campaigns) {
		this.campaigndao.add(campaigns);
		return;
		
	}

	@Override
	public void delete(Campaigns campaigns) {
		this.campaigndao.delete(campaigns);
		
	}

	@Override
	public void update(Campaigns campaigns) {
		this.campaigndao.update(campaigns);
		
	}

	@Override
	public void sale(Games games, Campaigns campaigns) {
		double priceAfterDiscount = games.getPrice() - (games.getPrice() / campaigns.getCampaignCode() * 100);
		System.out.println(games.getGameName() + "oyunun yeni fiyatı " + priceAfterDiscount);
		this.campaigndao.sale(games, campaigns);
		
	}

}
