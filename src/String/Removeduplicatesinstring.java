package String;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Removeduplicatesinstring {

	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
      String a="Keep calm and say om namah Shivay Shivay ";
      String b = a.toLowerCase();
      String[] c = a.split(" ");
      for(int i=0;i<c.length;i++)
      {
    	  set.add(c[i]);
    }
      for(String s1:set)
      {
    	  //int count=0;
    	  System.out.println(s1);
    	  
      }
      
      
      
      
	}

}
