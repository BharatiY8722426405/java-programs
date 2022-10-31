package JP;

public class Palindrome {
	public static void main(String args[])
	{
		String s="garag";
		
		String rev="";
		for(int i=0;i<s.length();i++)
		{
		
		rev=s.charAt(i)+rev;
			}
		if(rev.equals(s))
		{
			System.out.println("palin");
		}
		else
		{
			System.out.println("not");
		}
	}

}
