 package ArrayPrograms;

public class FirstmaximumWithouSorting {

	public static void main(String[] args) {
int[] arr= {12,54,3,6,86,4,100};
int fmax=arr[0];
for(int i=0;i<arr.length;i++) {
	if(arr[i]>fmax){
		fmax=arr[i];
	
		
	}
}
System.out.println("FIRST MAX VALUE"+fmax);
	}

}
