package Java;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
HashMap<Integer,String> map=new HashMap<Integer,String>();
map.put(01, "Java");
map.put(02, "session");
map.put(03, "Api");
map.put(04, "appium");
map.put(05, "Api");
map.put(null, "bbbb");
map.put(null, "mmmm");
map.put(0, null);
map.put(2, null);
map.put(3, null);
System.out.println(map);
System.out.println(map.remove("appium"));
System.out.println(map.size());
System.out.println(map.containsKey(04));
System.out.println(map.replace(04, "selenium"));
System.out.println(map.get(04));
System.out.println(map);
}

}
