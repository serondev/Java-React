package dataAccess.abstracts;

import java.util.List;

import Entities.concreates.Campaigns;
import Entities.concreates.Games;

public interface CampaignDao {
	void add(Campaigns campaigns);
	void delete(Campaigns campaigns);
	void update(Campaigns campaigns);
	Campaigns get(int id);
	List<Campaigns> getAll();
	public void sale(Games games,Campaigns campaigns);
	

}
