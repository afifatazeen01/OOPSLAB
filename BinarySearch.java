import java.util.Scanner;
class BinarySearch{
   static int bs(int arr[],int low,int high,int x){
      if(high>=low){
      int mid=(low+high)/2;
      if(arr[mid]==x)
        return mid;
      else if(arr[mid]>x)
          bs(arr,low,mid-1,x);
       else
        bs(arr,mid+1,high,x);
        }
     return -1;
     }
  static void bbs(int arr[],int n){
  int temp=0;
     for(int i = 0;i < n-1;i++){
       for(int j = 0;j < n-i-1;j++){
         if(arr[j] > arr[j+1]){
           temp = arr[j];
           arr[j] = arr[j+1];
           arr[j+1] = temp;
         
       }
   }
}
}     
          
  public static void main(String args[]){
     Scanner sc= new Scanner(System.in);
     int n;
     int x;
     System.out.println("enter size of array:");
     n=sc.nextInt();
     int[] arr=new int[n];
      System.out.println("enter array elements");
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        bbs(arr,n);
        System.out.println("sorted array is;");
     for(int i=0;i<n;i++){
    System.out.println(arr[i] );
    }
     System.out.println("enter search element");
       x=sc.nextInt();
      int low=arr[0];
      int high=arr[n-1];
      int result=bs(arr,low,high,x);
      if(result==-1)
      System.out.println("element not found");
      else
      System.out.println("element found at position" + result);
      
      }
      }
      
