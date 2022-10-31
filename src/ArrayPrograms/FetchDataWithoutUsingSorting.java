package ArrayPrograms;

public class FetchDataWithoutUsingSorting {
	public static void main(String[] args)
	{
		int[] arr= {1,2,54,98,98,86,4};
		int fmax=arr[0];
		int smax=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(fmax<=arr[i])
			{
				if(fmax!=arr[i])
				{
					smax=fmax;
				}
				fmax=arr[i];
			}
		
		else if(smax<arr[i]||smax==fmax){
		smax=arr[i];
	}
	}

System.out.println(fmax);
System.out.println(smax);

	}


		
	
	
	
	}
	
