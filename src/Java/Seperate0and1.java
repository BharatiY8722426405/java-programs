package Java;
public class Seperate0and1 {
public static void main(String[] args) {
int arr[]= {0,1,1,0,0,0};
int[] temp=new int[arr.length];
int m=0;
int n=arr.length-1;//5
int p=arr.length+1;//7

for(int i=0;i<arr.length;i++)
{
	if(arr[i]==0)
	{
		temp[m]=arr[i];
		m++;
	}

	else if(arr[i]==2)
	{
		temp[p]=arr[i];
		p++;
	}
	else if(arr[i]==1) {
		temp[n]=arr[i];
		n--;
	}
}
for(int i=0;i<temp.length;i++)
System.out.println(temp[i]+" ");
	}

}
