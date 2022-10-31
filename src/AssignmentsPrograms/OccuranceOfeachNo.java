package AssignmentsPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

import Java.Hashset;

public class OccuranceOfeachNo {

	public static void main(String[] args) {
		int []a= {4,3,2,3,1};
		HashSet<Integer> set= new HashSet<Integer>();
		for(int  i=0;i<a.length;i++)

		{
			set.add(a[i]);

		}
		System.out.println(set);
		for(Integer d:set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{    	 
				if (d==a[i])
				{
					count++;

				}
			}

			System.out.println(d+"=="+count);

		}
	}
}

