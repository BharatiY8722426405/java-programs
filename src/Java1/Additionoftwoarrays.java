package Java1;

public class Additionoftwoarrays {

public static void main(String[] args) {
int []a= {4,2,1,3,5,8};
int []b= {1,2,3,4,5,9,9};
int c=a.length;
if(a.length<b.length)
{
	c=b.length;
	}
for(int i=0;i<c;i++)
try {
	System.out.println(a[i]+b[i]);

} catch (Exception e) {
	if(a.length<b.length)
	{
		System.out.println(b[i]);
	}
	else
	{
		System.out.println(a[i]);
	}
}

	}

}
