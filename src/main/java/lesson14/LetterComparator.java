package lesson14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LetterComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		for(int i = 0; i<o1.length() && i<o2.length();i++){
			char c1 = o1.charAt(i);
			char c2 = o2.charAt(i);
			String a = c1 + "";
			String b = c2 + "";
			if(a.toUpperCase().equals(b)){
				return -1;
			}
			if(b.toUpperCase().equals(a)){
				return 1;
			}
			if(c1 == c2){
				continue;
			}
			return c1-c2;
		}
		return 0;
	}
public static void main(String[] args) {
	LetterComparator com = new LetterComparator();
	String a = "qEW";
	String b = "qew";
	List <String> list = new ArrayList<String>();
	list.add(a);
	list.add(b);
	System.out.println(list);
	Collections.sort(list, com);
	System.out.println(list);
}
}
