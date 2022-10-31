package ArrayPrograms;

public class Firstmin {

	public static void main(String[] args) {
		int []a= {4,3,5,2,1};
		int fmin=100;
		int smin=100;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<fmin) {
				smin=fmin;
				fmin=a[i];
				
				
			}
			else if(a[i]<smin)
			{
				smin=a[i];
			}
		}
		System.out.println(fmin);
		System.out.println(smin);

	}

}
