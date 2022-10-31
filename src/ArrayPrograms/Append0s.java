package ArrayPrograms;
public class Append0s {
   public static void main(String[] args) {
    int[] a={2,0,1,3,0,0};
    int temp[]=new int[a.length];
    int m=0;
    int n=(a.length/2);
    int o=(a.length/2)+1;
    int p=(a.length-1);
    for(int i=0;i<a.length;i++)
    {
    	if(a[i]==0) {
    		temp[m]=0;
    		m++;
    		}
    	else if (a[i]==2) {
    		temp[n]=2;
    		n++;
    		}
    	else if(a[i]==1)
    	{
    		temp[o]=1;
    		o++;
        }
    	else if(a[i]==3)
    	{
    		temp[p]=3;
    		p--;
    }
    }
    	for(int  i=0;i<temp.length;i++)
    	{
    		System.out.println(temp[i]);
    	    	}
    }
    
 
    }


