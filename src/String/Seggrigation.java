package String;

public class Seggrigation {

	public static void main(String[] args) {
     String s="Bha%$&&^*RT76676ati@*123#";
     String a="";
     String spl="";
     String num="";
     for(int i=0;i<s.length();i++)
     {
    	 if(s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z') {
    		 a=a+s.charAt(i);
    		 
    	 }
    	 else if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
    		 num=num+s.charAt(i);
    	 }
    	 else {
    		 spl=spl+s.charAt(i);
    	 }
     }
     System.out.println(a+"|||"+num+"|||"+spl);
	}

}
