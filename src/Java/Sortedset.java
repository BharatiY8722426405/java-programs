package Java;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedset {

	public static void main(String[] args) {
		SortedSet<Object> set = new TreeSet<>();
		set.add("Info");
		set.add("IBM");
		set.add("TestYantra");
		set.add("Wipro");
		set.add("walmart");
		set.add("flipkart");
		System.out.println(set);
		//for (Object s : set) {
			//System.out.print(s+" 7");

		//}
		System.out.println();
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.headSet("IBM"));
		System.out.println(set.tailSet("flipkart"));

	}

}
