package ArrayPrograms;

import java.util.ArrayList;

public class AescendingOrder {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
	
		int[] arr= {8,3,4,32,4,4,5};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
			
				}
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}

	}

}
