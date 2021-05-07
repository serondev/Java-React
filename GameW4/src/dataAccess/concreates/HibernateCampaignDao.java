package dataAccess.concreates;

import java.util.List;

import Entities.concreates.Campaigns;
import Entities.concreates.Games;
import dataAccess.abstracts.CampaignDao;

public class HibernateCampaignDao implements CampaignDao {

	@Override
	public void add(Campaigns campaigns) {
		System.out.println("Campaign Dao ile eklendi " + campaigns.getCampaignName());
		
	}

	@Override
	public void delete(Campaigns campaigns) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Campaigns campaigns) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Campaigns get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Campaigns> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sale(Games games, Campaigns campaigns) {
		// TODO Auto-generated method stub
		
	}

}
