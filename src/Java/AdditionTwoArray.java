package Java;

public class AdditionTwoArray {

	public static void main(String[] args) {
     int [] a= {2,4,5,5};
     int [] b= {4,5,6};
     int [] c= new int[a.length];
     for(int i=0;i<a.length;i++)
     {
    	 c[i]=a[i]+b[i];
    	 System.out.println(c[i]);
     }
	}

}
