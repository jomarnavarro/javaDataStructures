package collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionExamples {

	public static void main(String[] args) {
		
		String [] strArray = new String[3];
		strArray[0] = "Mayra";
		System.out.println(strArray.length);
		strArray[1] = "API testing";
		System.out.println(strArray.length);
		strArray[2] = "Colombia";
		System.out.println(strArray.length);
		ArrayList x = new ArrayList();
		System.out.println(x.size());
		x.add("Mayra");
		System.out.println(x.size());
		x.add("Api Testing");
		System.out.println(x.size());
		x.add("Colombia");
		System.out.println(x.size());
		Collection coll2 = new LinkedList();
		
		System.out.println(coll2.size());
		coll2.add("Mayra");
		System.out.println(coll2.size());
		coll2.add("Api Testing");
		System.out.println(coll2.size());
		coll2.add("Colombia");
		System.out.println(coll2.size());
		
		Collection coll = new ArrayList();
		coll.add("message");
		coll.add(5);
		coll.add(false);
		System.out.println(coll.contains(true));
		System.out.println(coll.remove("message"));
		
		Iterator it = coll.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//
		for(Object o: coll) {
			System.out.println(o);
		}
		
		
		Collection<String> strColl = new ArrayList<>();
		strColl.add("Hello");
		strColl.add("world");
		//strColl.add(5);  //Si removemos el comentario se ocasiona un error.
		
		it = strColl.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
				
		for(String s: strColl) {
			System.out.println(s);
		}

	}

}
