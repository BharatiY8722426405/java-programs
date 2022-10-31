package String;

public class Swap1standLastword {

	public static void main(String[] args) {
    String st="i love kedaranth";
    String[] st1 = st.split(" ");
    String temp=st1[0];
    st1[0]=st1[st1.length-1]; 
    st1[st1.length-1]=temp;
    for(int i=0;i<st1.length;i++)
    {
    	System.out.println(st1[i]+" ");
    }
    
    
	}

}
