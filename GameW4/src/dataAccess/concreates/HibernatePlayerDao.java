package dataAccess.concreates;

import java.util.List;

import Entities.concreates.Campaigns;
import Entities.concreates.Games;
import Entities.concreates.Player;
import dataAccess.abstracts.PlayerDao;

public class HibernatePlayerDao implements PlayerDao {

	@Override
	public void add(Player player) {
		System.out.println("Player Dao ile eklendi " + player.getName());
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Player Dao ile silindi " + player.getName());
		
	}

	@Override
	public void update(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void purchase(Player player, Games games) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Player get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sale(Games games, Campaigns campaigns) {
		// TODO Auto-generated method stub
		
	}

}
