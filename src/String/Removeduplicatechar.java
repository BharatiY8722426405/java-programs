package String;

import java.util.HashSet;

import Java.Hashset;

public class Removeduplicatechar {

	public static void main(String[] args) {
     String a="bharati";
   HashSet<Character> set= new  HashSet<Character>();
     for(int  i=0;i<a.length();i++)
    	 
     {
    	 set.add(a.charAt(i));
    	
     }
	 System.out.println(set);
     for(Character ch:set)
     {
    	 System.out.println(ch);
     }
     
	}

}
