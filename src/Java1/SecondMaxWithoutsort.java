package Java1;

public class SecondMaxWithoutsort {

	public static void main(String[] args) {
		int []a= {4,3,5,2,1};
		int fmax=a[0];
		int smax=a[0];
		for(int i=0;i<a.length;i++) {
			if(smax>a[i]) {
				fmax=smax;
				a[i]=fmax;
			}
			else if(a[i]>smax)
			{
				a[i]=smax;
			}
		}
		//System.out.println(fmin);
		System.out.println(smax);
		}

	}


