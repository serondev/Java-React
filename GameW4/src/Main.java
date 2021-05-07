import Adapter.MernisServiceAdapter;
import Business.concreates.CampaignManager;
import Business.concreates.GameManager;
import Business.concreates.PlayerManager;
import Entities.concreates.Campaigns;
import Entities.concreates.Games;
import Entities.concreates.Player;
import dataAccess.concreates.HibernateCampaignDao;
import dataAccess.concreates.HibernatePlayerDao;

public class Main {

	public static void main(String[] args) {
		MernisServiceAdapter controller = new MernisServiceAdapter();
		Player player1 = new Player(1,"Serkan","Önder","35588412369",2000);
		//controller.CheckIfRealPerson(player1);
		Player player2 = new Player(2,"Furkan","Cetin","35568452359",1999);
		controller.CheckIfRealPerson(player2);
		
		Games game1 = new Games(1, "Pink Doll", 19.9);
		Games game2 = new Games(2, "SamattaRace",9.99);
		Games game3 = new Games(3, "HuntFishes", 17.99);
		
		Campaigns campaign = new Campaigns("Ogrenci Indirimi",25,20);
		
	
		PlayerManager playerManager = new PlayerManager(new HibernatePlayerDao());
		playerManager.add(player1);
		playerManager.add(player2);
		playerManager.sale(game2,campaign);
		playerManager.purchase(game1, player1);
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.delete(game2);
		gameManager.update(game3);
		CampaignManager campaignManager = new CampaignManager(new HibernateCampaignDao());
		campaignManager.add(campaign);
		
		
		
		
		
		
		
		
		
		

	}

}
