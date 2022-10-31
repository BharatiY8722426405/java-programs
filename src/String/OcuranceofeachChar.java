package String;

import java.util.HashSet;

import Java.Hashset;

public class OcuranceofeachChar {

	public static void main(String[] args) {
		String a="bharati";
		HashSet<Character> set= new  HashSet<Character>();
		for(int  i=0;i<a.length();i++)

		{
			//System.out.println(i);
			set.add(a.charAt(i));

		}
		System.out.println(set);
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<a.length();i++)
			{    	 
				if (ch==a.charAt(i))
				{
					count++;

				}
			}

			System.out.println(ch+""+count);

		}
	}
}

