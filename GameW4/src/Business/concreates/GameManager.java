package Business.concreates;

import Business.abstracts.GameService;
import Entities.concreates.Games;

public class GameManager implements GameService{

	@Override
	public void add(Games games) {
		System.out.println(games.getGameName() + " SIMDI OYNANABILIR!");
		
	}

	@Override
	public void delete(Games games) {
		System.out.println(games.getGameName() + " ARTIK MEVCUT DEGIL");
		
	}

	@Override
	public void update(Games games) {
		System.out.println(games.getGameName() + " GUNCELLENDI!");
		
	}

}
