import java.util.Scanner;
class BubbleSort{

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
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("enter size of array:");
    n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("enter array elemsts:");
    for(int i=0;i<n;i++){
     arr[i]=sc.nextInt();
     }
     bbs(arr,n);
     System.out.println("sorted array is;");
    for(int i=0;i<n;i++){
    System.out.println(arr[i] );
    }
    }
    }
     
