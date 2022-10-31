package Java;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		LinkedHashSet<Object> link = new LinkedHashSet<>();
		link.add(100);
		link.add(200);
		link.add("java");
		link.add("session");
		link.add(null);
		link.add(null);
		System.out.println(link);
		System.out.println(link.isEmpty());
		System.out.println(link.remove(100));
		System.out.println(link);
		System.out.println(link.size());
		if (link.contains("java")) {
			System.out.println("is there");

		} else {
			System.out.println("not");

		}
		for (Object set : link) {
			System.out.println(set);
		}

		Iterator<Object> i = link.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
