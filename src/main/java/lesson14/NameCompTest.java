package lesson14;

import java.util.ArrayList;
import java.util.Collections;

public class NameCompTest {
	public static void main(String[] args) {
		NameComparator comparator = new NameComparator();
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("adam");
		list1.add("anna");
		list1.add("joanna");
		list1.add("dawid");
		list1.add("bartek");
		System.out.println(list1);
		Collections.sort(list1, comparator);
		System.out.println(list1);
	}

}
