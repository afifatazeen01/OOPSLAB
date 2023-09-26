import java.util.Scanner;
class LinearSearch{

     public static int search(int arr[],int n,int x){
         for(int i=0;i<n;i++){
         if(arr[i]==x){
           return i;
             }
           }
            return -1;
      }
      
      
         
     public  static void main(String args[])
     {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter size of array");
     int n;
     n=sc.nextInt();
     int x;
     System.out.println("eneter element to search:");
     x=sc.nextInt();
     int[] arr=new int[n];
     System.out.println("enter array elements");
     for(int i=0;i<n;i++){
     arr[i]=sc.nextInt();
     }
     System.out.println("array you enterred is:");
     for(int i=0;i<n;i++){
      System.out.print(arr[i]+"\t");
      }
     int result=search(arr,n,x);
     if(result==-1){
        System.out.println("element not found ");
      }
      else{
      System.out.println("element  found at position:" + result);
      }
      
 }
 }
     
