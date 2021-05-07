package Business.abstracts;

import Entities.concreates.Campaigns;
import Entities.concreates.Games;

public interface CampaignService {
	void add(Campaigns campaigns);
	void delete(Campaigns campaigns);
	void update(Campaigns campaigns);
	void sale(Games games,Campaigns campaigns);
	

}
