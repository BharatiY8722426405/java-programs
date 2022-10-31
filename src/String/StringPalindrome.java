package String;

public class StringPalindrome {

	public static void main(String[] args) {
    String s1="GARAG";
    String rev="";
    for(int i=s1.length()-1;i>=0;i--)
    {
    	rev=rev+s1.charAt(i);
    	System.out.println(i);	
    }
    	if(rev.equals(s1))
    	{
    		System.out.println("PALINDROME");
    	}
    	else
    	{
    		System.out.println("not");
    	}
	}

}
