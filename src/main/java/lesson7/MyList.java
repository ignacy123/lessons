package lesson7;

public class MyList {
	MyListItem firstItem = null;
	MyListItem lastItem = null;
	MyListItem lastItem2 = null;

	public void addItem(String item) {
		if (firstItem == null) {
			firstItem = new MyListItem(item);
			firstItem.setNext(lastItem);
			lastItem = firstItem;

		} else {

			MyListItem lastItem2 = new MyListItem(item);
			this.lastItem2 = lastItem2;
			lastItem.setNext(lastItem2);
			lastItem = lastItem2;

		}

	}

	public void showList() {
		if (firstItem == null) {
			System.out.println("Lista jest pusta.");
		} else {
			System.out.println("Elementy listy:");

			MyListItem currentItem = firstItem;
			while (currentItem != null) {
				System.out.println(currentItem.getValue());
				currentItem = currentItem.getNext();
			}
		}

	}

	public void insertAfter(String whatAfter, String item) {
		MyListItem a = firstItem;

		while (a.getValue() != whatAfter) {
			a = a.getNext();
		}
		MyListItem b = a.getNext();
		MyListItem c = new MyListItem(item);
		a.setNext(c);
		c.setNext(b);

	}

	public void insertBefore(String whatBefore, String item) {
		MyListItem a = firstItem;
		MyListItem b = a.getNext();
		while (b.getValue() != whatBefore) {
			a = a.getNext();
			b = b.getNext();
		}
		MyListItem c = new MyListItem(item);
		a.setNext(c);
		c.setNext(b);

	}

	public void deleteItem(String whattodelete) {
		if (whattodelete.equals(firstItem.getValue())) {
			if(firstItem.getNext() == null){
				firstItem = null;
				lastItem = firstItem;
			}
			else{
			firstItem.setNext(null);
		    firstItem = firstItem.getNext();
			}
		} else {
			MyListItem a = firstItem;
			MyListItem b = a.getNext();
			MyListItem c = b.getNext();

			while (b.getValue() != whattodelete) {
				if (whattodelete.equals(firstItem.getValue())) {
					break;

				}
				a = a.getNext();
				b = b.getNext();
				c = c.getNext();

			}

			a.setNext(c);

		}
	}

	public int itemCounter() {
		int counter = 0;
		MyListItem a = firstItem;
		for (; a != null; a = a.getNext()) {
			counter++;

		}
		return counter;

	}

	public static void main(String[] args) {
		MyList list = new MyList();
		list.addItem("chleb");
		list.addItem("maslo");
		list.addItem("mleko");
		list.addItem("chipsy");
		list.deleteItem("chipsy");
		list.insertAfter("maslo", "ziemniaki");
		list.insertBefore("mleko", "cebula");
		list.deleteItem("cebula");
		list.deleteItem("mleko");

		list.deleteItem("chleb");
		list.deleteItem("maslo");
		list.deleteItem("ziemniaki");
		list.addItem("dzem");
		list.addItem("czosnek");
		list.showList();
		System.out.println(list.itemCounter());
	}
}
