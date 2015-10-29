package lesson3;

public class MonkeyTroubleCheck {
	
	public static void main(String[] args) {
		if (monkeyTrouble(true, true)==true){
			System.out.println("true, true => true   OK!");
		}
		
		if (monkeyTrouble(false, false)==true){
			System.out.println("false, false => true   OK!");
		}
		
		if (monkeyTrouble(true, true)==false){
			System.out.println("true, true => false  Wrong!");
		}
		
		if (monkeyTrouble(false, false)==false){
			System.out.println("false, false => false   Wrong!");
		}
		
		if (monkeyTrouble(true, false)==false){
			System.out.println("true, false => false   OK!");
		}
		
		if (monkeyTrouble(false, true)==false){
			System.out.println("false, true => false   OK!");
		}
		
		if (monkeyTrouble(true, false)==true){
			System.out.println("true, false => true   Wrong!");
		}
		
		if (monkeyTrouble(false, true)==true){
			System.out.println("false, true => true   Wrong!");
		}
		
		
	}
	
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){
		return true;
		
	}

}
