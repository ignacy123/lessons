package lesson7;

public class MyListItem {
	private String value;
	private MyListItem next;

	MyListItem(String value) {
		this.value = value;
	}

	public MyListItem getNext() {
		return next;
	}

	public void setNext(MyListItem next) {
		this.next = next;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "MyListItem [value=" + value + ", next=" + next + "]";
	}

	public static void main(String[] args) {
		MyListItem item1 = new MyListItem("pierwszy");
		MyListItem item2 = new MyListItem("drugi");
		System.out.println(item1);
		System.out.println(item2);
		item1.setNext(item2);
		System.out.println(item1);
		System.out.println(item2);
		
		System.out.println(item1.getNext().getValue());

	}

}
