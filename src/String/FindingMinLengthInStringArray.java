package String;

public class FindingMinLengthInStringArray {

	public static void main(String[] args) {
    String [] s= {"anbnb","bbbbb","jfj","jffj","as","adf","bh"};
    String a=s[0];
    for(int i=0;i<s.length;i++)
    {
    	if(s[i].length()<a.length())
    	{
    		a=s[i];
    	}
    }
    for(int i=0;i<s.length;i++)
    {
    	if(s[i].length()==a.length()) {
    		System.out.println(s[i]);
    	}
    }
    		}

}
