package tw.joe.myproject;

import java.util.LinkedList;

public class LinkedListTest {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		LinkedList linkedList=new LinkedList();
		linkedList.add("mary");
		linkedList.add("mary");
		linkedList.add("john");
		linkedList.add(6);
		linkedList.add(new Integer(6));
		linkedList.add(3.14);
		int size1 = linkedList.size();
		System.out.println(linkedList+":"+size1);

		
		linkedList.remove(4);
		linkedList.remove("mary");
		int size = linkedList.size();
		System.out.println(linkedList +":"+size);

	}

}
