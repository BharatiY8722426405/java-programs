package String;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class duplicatecharcount {
	public static void main(String args[])
	{
String ab="bharati";
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
		System.out.println(ch     +"="+    count);

		
		
	}


}
}