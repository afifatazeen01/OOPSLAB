import java.util.Scanner;
class palin{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter number:");
    n = sc.nextInt();
    int n1=n;
    int rev=0;
    int rem;
    while(n>0){
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
        }
    if(n1 == rev){
       System.out.println("palindrome");
       }
     else {
     System.out.println(" Not palindrome");
     }
     }
     }
