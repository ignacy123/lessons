package lesson19;

public class Paleczka {
	boolean jestUzywana = false;
	final int numer;
	public Paleczka(int numer) {
		this.numer = numer;
	}
	public void setJestUzywana(boolean jestUzywana) {
		this.jestUzywana = jestUzywana;
	}
	
	public boolean isJestUzywana() {
		// TODO Auto-generated method stub
		return jestUzywana;
	}

	public synchronized void wez() {
		while (this.jestUzywana) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.setJestUzywana(true);
		//notifyAll();

	}

	public synchronized void odloz() {
		this.setJestUzywana(false);
		notifyAll();
	}
	
	public void wezLock(int numerFilozofa){
		System.out.println("Filozof numer: "+numerFilozofa+" wzial paleczke o numerze: "+this.numer);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "paleczka "+numer;
	}
}
