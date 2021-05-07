package dataAccess.abstracts;

import java.util.List;

import Entities.concreates.Campaigns;
import Entities.concreates.Games;
import Entities.concreates.Player;

public interface PlayerDao {
	void add(Player player);
	void delete(Player player);
	void update(Player player);
	void purchase(Player player,Games games);
	Player get(int id);
	List<Player> getAll();
	void sale(Games games,Campaigns campaigns);
	

}
