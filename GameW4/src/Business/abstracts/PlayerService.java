package Business.abstracts;

import java.util.List;

import Entities.concreates.Campaigns;
import Entities.concreates.Games;
import Entities.concreates.Player;

public interface PlayerService {
	void add(Player player);
	void delete(Player player);
	void update(Player player);
	void sale(Games games,Campaigns campaigns);
	void purchase(Games games,Player player);
	List<Player> getAll();

}
