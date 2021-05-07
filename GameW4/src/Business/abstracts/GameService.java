package Business.abstracts;

import Entities.concreates.Games;

public interface GameService {
	void add(Games games);
	void delete(Games games);
	void update(Games games);

}
