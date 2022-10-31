package AssignmentsPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintDuplicateWithCountNum {

	public static void main(String[] args) {
    LinkedHashSet<Integer>h=new LinkedHashSet<Integer>();
    int []a= {4,3,2,3,1};
    for(int i=0;i<a.length;i++)
    {
    	h.add(a[i]);
    }

//System.out.println(h);    
for(Integer f:h)
    {	
	int count=0;

    	for(int i=0;i<a.length;i++)
    	{
    	if(f==a[i])
    	{
    		count++;
    		
    	}
    
	}    
    	System.out.println(f+" repeating"+count+"time");
    	}
    
	}
}
