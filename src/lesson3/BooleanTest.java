package lesson3;

public class BooleanTest {
	public static void main(String[] args) {
		if (sleepIn(true, false)==false){
			System.out.println("true, false =>false   OK!");
			}
		if (sleepIn(true, false)==true){
			System.out.println("true, false =>false   Wrong!");
			}
		if (sleepIn(false, false)==true){
			System.out.println("false, false =>true   OK!");
			}
		if (sleepIn(false, false)==false){
			System.out.println("false, false =>false   Wrong!");
			}
		if (sleepIn(true, true)==true){
			System.out.println("true, true =>true   OK!");
			}
		if (sleepIn(true, true)==false){
			System.out.println("true, true =>true   Wrong!");
			}
		if (sleepIn(false, true)==true){
			System.out.println("false, true =>true   OK!");
			}
		if (sleepIn(false, true)==false){
			System.out.println("false, true =>false   Wrong!");
			}
		
	}
	
	
	public static boolean sleepIn(boolean weekday, boolean vacation){
		
		if (!weekday || vacation){
			return true;
		}
		
		return false;
	}

}
