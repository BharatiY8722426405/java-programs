package String;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintuniqueChar {
	public static void main(String args[])
	{
String ab="maintenance";
LinkedHashSet<Character> h=new LinkedHashSet<Character>();
	for(int i=0;i<ab.length();i++)
	{
	h.add(ab.charAt(i));
	}
	System.out.println(h);
	
	for( Character ch:h)
	{
		int count=0;
		for(int i=0;i<ab.length();i++)
		{
			if(ch==ab.charAt(i))
			{
			count++;
			
			}
		}
		if(count==1) {
		System.out.println(ch     +"="+    count);

		
		
	}
	}

}
}
