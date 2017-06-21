package tw.joe.myproject;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("1st","John");
		map.put("2nd", "Mary");
		map.put("3rd", "Joanna");
		map.put("3rd", "Jose");
		
		Set setKey=map.keySet();
		Set entrySet=map.entrySet();
		Collection mapping=map.values();
		
		System.out.println("Setkey"+setKey);
		System.out.println("EntrySet"+entrySet);
		System.out.println("Mapping"+mapping);

	}

}
