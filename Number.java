import java.util.Scanner;
class Number{
   public static void main(String args[])
   {
         Scanner sc=new Scanner(System.in);
         int[] b=new int[5];
         int[] a= new int[5];
         int  j=0;
         for(int i=0;i<5;i++){
                         if(i==0){
                         System.out.println("enter value between 10 and 100:");
                         a[i]=sc.nextInt();
                         System.out.println("your unique values are:" + a[i]);
                         b[j]=a[i];
                         j++;
                         }
           else{
                  System.out.println("enter  value between  10 and 100:");
                  a[i]=sc.nextInt();
                  System.out.println("your unique values are:");
                  b[j]=a[i];
                  int k=0;
                  int count=0;
                  while(k<=j){
                        if(b[k]==a[i]){
                                if(count<1){
                                System.out.println(b[k]);
                                   count++;
                                   k++;
                                   }
                                   else{
                                   k++;
                                   j--;
                                        }   
                             }
                               else{
                                      System.out.println(b[k]);
                                      k++;                                 
                                       }
                          }
                             j++;
                              }
                                           
   
   }
   }
   }
