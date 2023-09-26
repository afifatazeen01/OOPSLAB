import java.util.Scanner;
class calci{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    float a;
    float b;
    char op;
    float res;
    System.out.println("enter a number");
    a = sc.nextFloat();
    System.out.println("enter b number");
    b = sc.nextFloat();
    System.out.println("enter operator");
    op = sc.next().charAt(0);
    if(op == '+'){
      res=a+b;
      System.out.println(" result is : " + res);
      }
    else if(op == '-'){
       res=a-b;
       System.out.println("result is: " + res);
       }
    else if(op == '*'){
        res=a*b;
        System.out.println("result is: " + res);
        }
    else if(op == '/'){
         res= a/b;
         System.out.println("result is: " + res);
         }
     else{
        System.out.println("invalid operator");
        }
       }
       }
       
    
  
