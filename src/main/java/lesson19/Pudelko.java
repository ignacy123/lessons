package lesson19;

public class Pudelko {
	private int zawartosc = 0;
	private int pojemnosc;

	public Pudelko(int pojemnosc) {
		this.pojemnosc = pojemnosc;
	}

	public synchronized void wez(int ile) {
		while (zawartosc - ile <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Konsument wyjal: " +ile+" produkt(ow).");
		zawartosc -= ile;
		notifyAll();
		return;
	}

	public synchronized void wloz(int ile) {
//		if (zawartosc + ile > pojemnosc) {
//			zawartosc = pojemnosc;
			while (zawartosc + ile > pojemnosc) {
				try {

					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			zawartosc += ile;
			notifyAll();
//		} else {
//			zawartosc += ile;
//		}

	//	notifyAll();
	}
}
