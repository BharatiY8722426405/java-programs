package Java;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
Hashtable<Integer,String> map=new Hashtable<Integer,String>();
map.put(01, "Java");
map.put(02, "session");
map.put(03, "Api");
map.put(04, "appium");
map.put(05, "Api");
System.out.println(map);
System.out.println(map.remove("appium"));
System.out.println(map.size());
System.out.println(map.contains(04));
System.out.println(map.replace(04, "selenium"));
System.out.println(map.get(01));
System.out.println(map);

;
	}

}
