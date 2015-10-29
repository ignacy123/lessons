package lesson18;

public class ThreadStringBuilder {
	private String str = "";

	public void append(char c) {
		str = str + c;
	}
	public void append(String str){
		this.str = this.str + str;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return str;
	}

	public static void main(String[] args) {
		String phrase1 = "Litwo, ojczyzno moja";
		String phrase2 = "Ty jesteś jak zdrowie";
		String phrase3 = "Ala ma kota";
		ThreadStringBuilder sb = new ThreadStringBuilder();
		Thread t1 = new Thread(new Poet(phrase1, sb));
		Thread t2 = new Thread(new Poet(phrase2, sb));
		Thread t3 = new Thread(new Poet(phrase3, sb));
		t1.start();
		t2.start();
		t3.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sb);
	}

	static class Poet implements Runnable {
		final String phrase;
		final ThreadStringBuilder sb;

		public Poet(String phrase, ThreadStringBuilder sb) {
			this.phrase = phrase;
			this.sb = sb;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int j = 5000; j>1; j--){
				//synchronized (sb) {
					for(int i = 0; i<phrase.length(); i++){
						sb.append(phrase.charAt(i));
					}
					//sb.append(phrase);
					sb.append('\n');
				//}

			}
		}
	}

}
