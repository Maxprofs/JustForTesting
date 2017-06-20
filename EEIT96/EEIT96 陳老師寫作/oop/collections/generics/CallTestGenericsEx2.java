package tw.leonchen.myproject.oop.collections.generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;

public class CallTestGenericsEx2 {

	public static void main(String[] args) {
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(6);
		list2.add(12);
		list2.add(7);
		list2.add(9);
		list2.add(26);
		
		list2.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {				
				return o2-o1;
			}
		});
		
		System.out.println("list2=" + list2);
		
		//ListIterator<Integer> i1 = list2.listIterator();
		ListIterator<Integer> i1 = list2.listIterator(2);
		
//		while(i1.hasNext()){
//			int value2 = i1.next();
//			System.out.println("value2:" + value2);
//		}
		
		while(i1.hasPrevious()){
			int value3 = i1.previous();
			System.out.println("value3:" + value3);
		}
		
//		for(int i=0;i<list2.size();i++){
//			System.out.println(list2.get(i));
//		}
//		
//		for(int value:list2){
//			System.out.println("value:" + value);
//		}

	}

}
