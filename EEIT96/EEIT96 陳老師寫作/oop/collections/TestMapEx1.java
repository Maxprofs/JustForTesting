package tw.leonchen.myproject.oop.collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestMapEx1 {

	public static void main(String[] args) {
		Map map1 = new LinkedHashMap();
		
		map1.put("1st", "mary");
		map1.put("2nd", "john");
		map1.put("3rd", "judy");
		map1.put("3rd", "jerry");
		map1.put(null, null);
		
		map1.remove("3rd");
		
		Set keys = map1.keySet();
		Set mapping = map1.entrySet();
		Collection values = map1.values();
		
		System.out.println("keys:" + keys);
		System.out.println("values:" + values);
		System.out.println("mapping:" + mapping);
		
		String second = (String)map1.get("2nd");
		System.out.println("second:" + second);
	}

}
