package lesson9;

public class Captain extends Player{
	
	Captain(String name, String position, int age) {
		super(name, position, age);
	}
	
	public void makeMatch(int when, String stadium, String withWho) throws Exception{
		if(when>23 || when<6){
			throw new Exception("Wrong match begginig hours.");
		}
		System.out.println("Match with: "+withWho+"at: "+when+" o'clock"+" on:"+stadium);
	}


}
