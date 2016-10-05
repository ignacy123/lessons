package lesson9;



public class FootballTeam {
	Coach teamCoach;

	public void addPlayerToSquad(Player player){
		Squad squad = null;
		squad.addPlayer(player);
	}
	public void printCoach() throws Exception {
		System.out.println(teamCoach.getName());
		teamCoach.setName("adam2");

	}
	public static void main(String[] args) throws Exception {
		Coach coach = new Coach();
		coach.setName("adam");
		Player player = new Player("Nobody", "nothing", 2);
		
	}

	}

