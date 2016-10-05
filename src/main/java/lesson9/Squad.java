package lesson9;

import java.util.ArrayList;
import java.util.List;

public class Squad {
	private List<Player> squadPlayers = new ArrayList<Player>();
	public void addPlayer(Player player){
		if(player.getAge() == 0){
			System.out.println("Finish player configuration before adding to your squad!");
		}
		else{
			if(player.getPosition().equals("")){
				System.out.println("Choose existing position before adding to your squad!");
			}
			else{
				squadPlayers.add(player);
			}
		}
	}
	

}
