package ArrayPrograms;

public class Additionoftwoarrays {

public static void main(String[] args) {
int []a= {4,2,1,3,5,8};
int []b= {1,2,3,4,5};
int length=a.length;
if(a.length<b.length)
{
	length=b.length;
	}
for(int i=0;i<length;i++)
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
