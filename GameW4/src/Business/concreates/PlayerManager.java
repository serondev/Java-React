package Business.concreates;

import java.util.List;

import Business.abstracts.PlayerService;
import Entities.concreates.Campaigns;
import Entities.concreates.Games;
import Entities.concreates.Player;
import dataAccess.abstracts.PlayerDao;

public class PlayerManager implements PlayerService {
	private PlayerDao playerdao;

	public PlayerManager(PlayerDao playerdao) {
		super();
		this.playerdao = playerdao;
	}

	@Override
	public void add(Player player) {
		this.playerdao.add(player);
		System.out.println(player.getName() + player.getSurName() + " başarıyla sisteme kayıt edildi! ");
		
	}

	@Override
	public void delete(Player player) {
		this.playerdao.delete(player);
		System.out.println(player.getName() + player.getSurName() + " başarıyla sistemden silindi! ");
		
	}

	@Override
	public void update(Player player) {
		this.playerdao.update(player);
		System.out.println(player.getName() + player.getSurName() + " başarıyla güncellendi! ");
		
	}

	@Override
	public void sale(Games games, Campaigns campaigns) {
		this.playerdao.sale(games, campaigns);
		System.out.println(games.getGameName() + "oyununda " + campaigns.getCampaignCode() + campaigns.getCampaignName()+ " yapılmıştır! ");
		
	}

	@Override
	public void purchase(Games games, Player player) {
		this.playerdao.purchase(player, games);
		System.out.println(games.getGameName() + games.getNumber()+ " kodlu oyun " + games.getPrice()+" TL karşılığında "+ player.getName() + " tarafından satın alınmıştır.");
		
	}

	@Override
	public List<Player> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
