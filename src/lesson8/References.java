package lesson8;

public class References {
	public static void main(String[] args) {
	int a = 10;
	int b = a;
	System.out.println(a+","+b);
	a = 7;
	System.out.println(a+","+b);
	MyInt myA = new MyInt();
	myA.setA(10);
	MyInt myB = myA;
	System.out.println(myA.getA()+","+myB.getA());
	myA.setA(7);
	System.out.println(myA.getA()+","+myB.getA());
	myB.setA(11);
	System.out.println(myA.getA()+","+myB.getA());
	new MyInt();
}

}
class MyInt {
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}
