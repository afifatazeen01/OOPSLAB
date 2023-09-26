import java.util.Scanner;
class prime{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n;
       System.out.println("enter number:");
       n=sc.nextInt();
       int i;
       for(i=2;i<n;i++){
       int c=0;
         if(n%i==0){
              for(int j=1;j<=i;j++){
                 if(i%j==0){
                     c++;
                     }
                     }
                   if(c==2){
                   System.out.println(i);
                 }
            }
         }
       }
       }
