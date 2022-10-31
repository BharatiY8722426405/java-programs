package String;

import java.util.LinkedHashSet;

public class PrintDuplicateWithCount {

	public static void main(String[] args) {
      LinkedHashSet<String> set=new LinkedHashSet<>();
      String a="i i i love Shiva Shiva";
      String[] b = a.split(" ");
      for(int i=0;i<b.length;i++)
      {
    	  set.add(b[i]);
    	  
      }
      for(String st:set)
      {
    	  int count=0;
      for(int i=0;i<b.length;i++)
      {
    	  if(st.equals(b[i]))
    	  {
    		  count++;
    		  }
      }
    
      System.out.println(st+" =is repeating "+count+" time");

      }
	}
}
