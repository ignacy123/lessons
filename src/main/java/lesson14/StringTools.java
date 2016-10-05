package lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringTools {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("qwer");
		list.add("qwerty");
		list.add("asdfg");
		System.out.println(list);
		List<Integer> list2 = new ArrayList<Integer>(
				Arrays.asList(new Integer[] { 1, 4, 7892, 156, 2, 3, 7, 9, 0, 6, 6 }));
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
		Collections.sort(list);
		System.out.println(list);
		Comparator<Integer> comparator = new ReverseOrderIntegerComparator();
		Collections.sort(list2, comparator);
		System.out.println(list2);
		Collections.sort(list2, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 % 2 == 0 && o2 % 2 == 1) {
					return -1;
				}
				if (o1 % 2 == 1 && o2 % 2 == 0) {
					return 1;
				}
				return o1 - o2;
			}
		});
		System.out.println(list2);
		list.add("qwERTY");
		list.add("qwerty");
		Collections.sort(list);
		System.out.println(list);
	}
	
}
