package tw.joe.myproject;

import java.util.HashSet;

public class HashSetTest {

	@SuppressWarnings({ "unchecked", "rawtypes" })

	public static void main(String[] args) {

		HashSet hashSet = new HashSet();
		hashSet.add("Mary");
		hashSet.add("Mary");
		hashSet.add(6);
		hashSet.add(new Integer(6));
		hashSet.add("John");
		hashSet.add(3.14);
		System.out.println("hashSet: " + hashSet);

		int size = hashSet.size();
		System.out.println(size);

		hashSet.clear();
		int size1 = hashSet.size();
		System.out.println(size1);
	}

}
