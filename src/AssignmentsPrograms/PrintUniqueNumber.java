package AssignmentsPrograms;

import java.util.LinkedHashSet;

public class PrintUniqueNumber {

	public static void main(String[] args) {
    int[] a= {4,3,2,3,1};
    LinkedHashSet<Integer> h=new LinkedHashSet<>();
    for(int i=0;i<a.length;i++)
    {
    	h.add(a[i]);
    	
    }
    System.out.println(h);
    for(Integer arr:h)
    {
    	int count=0;
    	for(int i=0;i<a.length;i++)
    	{
    		if(arr==a[i])
    		{
    			count++;
    			
    		}
       	}
    }
	}

}
