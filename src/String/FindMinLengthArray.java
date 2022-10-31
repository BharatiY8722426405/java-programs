package String;

public class FindMinLengthArray {

	public static void main(String[] args) {
    String [] a= {"1234","12","123455","1" };
    String min=a[0];
    for(int i=0;i<a.length;i++) {
    	if(min.length()>a[i].length())
    	{
    		min=a[i];
    		//min=a[i];
			
    	}
	}
    System.out.println(min);

}}
