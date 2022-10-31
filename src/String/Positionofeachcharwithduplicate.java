package String;

import java.util.HashSet;

public class Positionofeachcharwithduplicate {

	public static void main(String[] args) {
		HashSet<Character> set=new HashSet<Character>();
		String a="tester";
		for(int i=0;i<a.length();i++)
		{
			set.add(a.charAt(i));
		}
		System.out.println(set);
		for(Character s:set)
		{
			for(int i=0;i<a.length();i++)
				//for(int i=a.length()-1;i>=0;i--)
			{
				if(s==a.charAt(i))
				{
					System.out.println(s+""+(i+1));
					break;
				}
			}
		}

	}

}
