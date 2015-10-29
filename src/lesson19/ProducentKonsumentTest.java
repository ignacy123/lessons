package lesson19;

public class ProducentKonsumentTest {
	public static void main(String[] args) {
		
	Pudelko pudelko = new Pudelko(10);
	Konsument konsument = new Konsument(pudelko);
	Producent producent = new Producent(pudelko);
	
	
	Thread t1 = new Thread(konsument);
	Thread t2 = new Thread(producent);
	t1.start();
	t2.start();
	}
}
