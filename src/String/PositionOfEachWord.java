package String;

import java.util.LinkedHashSet;

import Java.LinkedHashset;

public class PositionOfEachWord {

	public static void main(String[] args) {
     LinkedHashSet<String> set=new LinkedHashSet();
     String s="Keep calm and say no sugar";
     String[] str = s.split(" ");
     for(int i=0;i<str.length;i++)
     {
    	 set.add(str[i]);
     }
     for(String st:set)
    	 for(int i=0;i<str.length;i++)
    	 {
    		 if(st.equals(str[i]))
    		System.out.println(st+"=is present in "+(i+1)+"position");
    	 }
    	 
	}

}
