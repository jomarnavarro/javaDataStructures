package collection;

import java.util.ArrayList;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;

public class ListExamples {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("message");
		list.add(5);
		list.add(false);
		list.add(0, "hello");
		
		
		System.out.println(list.contains(true));
		System.out.println(list.remove("message"));
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.hasNext());
		}
		
		//
		for(Object o: list) {
			System.out.println(o);
		}
		
		Collection<String> anotherStrCollection = new ArrayList<String>();
		anotherStrCollection.add("another String 0");
		anotherStrCollection.add("another String 1");
		anotherStrCollection.add("another String 2");
		
		List<String> strList = new ArrayList<>();
		strList.add("Hello");
		strList.add("world");
		strList.addAll(anotherStrCollection);
		//strList.add(5);  //Si removemos el comentario se ocasiona un error.
		
		it = strList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.hasNext());
		}
				
		for(String s: strList) {
			System.out.println(s);
		}


	}

}
