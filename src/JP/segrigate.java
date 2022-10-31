package JP;

public class segrigate {

	public static void main(String[] args) {
    String s="ab34@#$";
    String a="";
    String b="";
    String c="";
    for(int i=0;i<s.length();i++) {
    	if(s.charAt(i)>='a'&&s.charAt(i)<='z')
{
    		a=a+s.charAt(i);
    		
}
    	else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
    	{
    		b=b+s.charAt(i);
    	}
    	c=c+s.charAt(i);
    		
    }
    	System.out.println(a+b+c);
    	//System.out.println(b);
    	//System.out.println(c);
    }
	

}
