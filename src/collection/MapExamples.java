package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapExamples {

	public static void main(String[] args) {
		Map<String, String> studentBirthDate = new HashMap<>();
		studentBirthDate.put("Marco", "1972-07-10");
		studentBirthDate.put("Omar", "1976-03-31");
		studentBirthDate.put("Mario", "1980-10-19");
				
		System.out.println(studentBirthDate.containsKey("Mario"));
		System.out.println(studentBirthDate.containsValue("1980-10-20"));
		
		for(String key: studentBirthDate.keySet()) {
			System.out.println(key + ": " + studentBirthDate.get(key));
		}
		
		for(Map.Entry<String, String>  entry: studentBirthDate.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
