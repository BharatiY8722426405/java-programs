package AssignmentsPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Printpositionandcountnowithduplicate {

	public static void main(String[] args) {
 int[] a= {4,3,2,3,1};
 LinkedList<Integer>set=new LinkedList<Integer>();
 for(int i=0;i<a.length;i++)
 {
	 set.add(a[i]);
	 //System.out.println(i);
	 
 }
 for(Integer g:set)
 {
	 for(int i=0;i<a.length;i++)
	 {
		 if(g==a[i])
		 {
			 System.out.println(g+" "+(i+1));
			 break;
		 }
	 }
		 
 }
 
 
	}

}
