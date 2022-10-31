package Java;
import java.util.TreeMap;
public class Treemap {
public static void main(String[] args) {
TreeMap<Integer,String> map=new TreeMap<Integer,String>();
map.put(01, "Java");
map.put(02, "session");
map.put(03, "Api");
map.put(04, "appium");
map.put(05, "Api");
map.put(null, "bhh");
map.put(0001,null);
map.put(999,null);
System.out.println(map);
System.out.println(map.size());
System.out.println(map.containsKey(04));
System.out.println(map.replace(04, "selenium"));
System.out.println(map.get(04));
System.out.println(map);
}
}