package Java1;

public class SecondmaxWithsort {

 public static void main(String[] args) {
  int arr[] = {4,1,3,9,2,5};
  for(int i=0;i<arr.length;i++) {
   for(int j=0;j<arr.length;j++) {
    if(arr[i]<arr[j]) {
     int temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
     
    }
   }
  }
  System.out.println(arr[arr.length-2]);

 }

}