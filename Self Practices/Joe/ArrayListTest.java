package tw.joe.myproject;

import java.util.ArrayList;

public class ArrayListTest {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add("mary");
		arrayList.add("mary");
		arrayList.add("john");
		arrayList.add(6);
		arrayList.add(new Integer(6));
		arrayList.add(3.14);
		int size1 = arrayList.size();
		System.out.println(arrayList+":"+size1);

		
		arrayList.remove(4);
		arrayList.remove("mary");
		int size = arrayList.size();
		System.out.println(arrayList +":"+size);

	}

}
