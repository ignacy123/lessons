package lesson14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NameComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if (o1.substring(o1.length() - 1, o1.length()).equals("a") &&! o2.substring(o2.length() - 1, o2.length()).equals("a")) {
			return -1;
		}
		if (o2.substring(o2.length() - 1, o2.length()).equals("a") &&! o1.substring(o1.length() - 1, o1.length()).equals("a")) {
			return 1;
		}
		for(int i = 0; i<o1.length() && i<o2.length();i++){
			char c1 = o1.charAt(i);
			char c2 = o2.charAt(i);
			if(c1 == c2){
				continue;
			}
			return c1-c2;
		}
		return 0;
		/*ArrayList<String> list = new ArrayList<String>();
		list.add(o2);
		list.add(o1);
		if(o1.substring(o1.length() - 1, o1.length()).equals("a") && o2.substring(o2.length() - 1, o2.length()).equals("a")){
			Collections.sort(list);
			if(list.get(0).equals("o1")){
				return -1;
			}
			return 1;
		}
		if (o1.substring(o1.length() - 1, o1.length()).equals("a")) {
			return -1;
		}
		if (o2.substring(o2.length() - 1, o2.length()).equals("a")) {
			return 1;
		}
		if(o2.equals(o1)){
			return 0;
		}

		Collections.sort(list);
		if(list.get(0).equals("o1")){
			return -1;
		}
		return 1;*/
	}

}
