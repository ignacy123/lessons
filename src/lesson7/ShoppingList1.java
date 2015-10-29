package lesson7;

public class ShoppingList1 {
	private String[] list = new String[3];

	public void addItem(String item) {
		int i = 0;
		for (; i < list.length && list[i] != null; i++)
			;

		if (i < list.length) {
			list[i] = item;
		}
		else {
			String[] newList = new String [list.length+1];
			for (int g = 0; g< list.length; g++){
				newList[g] = list[g];
			}
			newList[newList.length-1] = item;
			list = newList;
			
		}

	}
	public void deleteItem(String item){
		int i = 0;
		for (; i < list.length; i++){
			if (list[i].equals(item)){
				list[i] = null;
				break;
			}
		}
		for (; i+1 < list.length; i++){
			
			String a = list[i+1];
			list[i] = a;
		}
		list[i] = null;
		
	}

	public void showList() {
		System.out.println("Lista zakupow:");
		for (int i = 0; i < list.length; i++) {

			System.out.println(list[i]);
		}

	}

	public static void main(String[] args) {
		ShoppingList1 list = new ShoppingList1();
		list.addItem("ziemniaki");
		list.addItem("chleb");
		list.addItem("mleko");
		list.addItem("maslo");
		list.showList();
		list.deleteItem("chleb");
		list.showList();
	}
}
