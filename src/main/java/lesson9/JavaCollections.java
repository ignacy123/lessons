package lesson9;

import java.util.ArrayList;

public class JavaCollections {
	public static void main(String[] args) {
		int f = 0;
		ArrayList list = new ArrayList();
		list.add("asdf");
		list.add(6);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		String ac = "ac";
		list.clear();
		list.add(4);
		list.add(3);
		list.add("12ewds");
		list.add(ac);
		list.remove(1);
		System.out.println(list);
		list.remove(ac);
		printList(list);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("asws");

		ArrayList list3 = list2;
		list3.add(3);
		System.out.println(list2);
	}

	public static void printList(ArrayList a) {
		System.out.println(a);
		System.out.println(a.size());

	}
}
