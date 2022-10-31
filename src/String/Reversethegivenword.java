package String;

public class Reversethegivenword {

	public static void main(String[] args) {
		
    String s="i love kedranath";
   String[] st = s.split(" ");
    for(int i=st.length-1;i>=0;i--)
    {
    	System.out.print(st[i]+" ");
    }
	}

}
