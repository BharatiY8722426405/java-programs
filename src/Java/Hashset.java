package Java;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
   HashSet<Object> h=new HashSet<Object>();
   h.add("bharati");
   h.add(100);
   h.add("bharati");
   h.add(03);
   h.add("test");
   h.add("software");
   h.add(null);
   h.add(null);
   System.out.println(h);
   
	}

}
