package lesson11;

public enum Species {
	DOG, CAT, LION;
	public static void main(String[] args) {
		Species s = Species.DOG;
		
		switch(s){
		case CAT:
			break;
		case DOG:
			break;
		case LION:
			break;
		default:
			break;
		
		}
	}
}
