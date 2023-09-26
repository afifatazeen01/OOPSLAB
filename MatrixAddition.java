import java.util.Scanner;
class MatrixAddition{

   static void print(int m[][],int row,int col){
      for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
          System.out.print(m[i][j] +" ");
          }
     System.out.println();
  }
}


  static int[][] add(int a[][],int b[][],int row,int col){
  int[][] c=new int[row][col];
       for(int i=0;i<row;i++){
       for(int j=0;j<col;j++){
       c[i][j]=a[i][j]+b[i][j];
       }
       }
     return c;
     }
       

public static void main(String args[]){
   Scanner sc= new Scanner(System.in);
   int row;
   int col;
   System.out.println("enter row size of matrix:");
   row=sc.nextInt();
   System.out.println("enter col size of matrix:");
   col=sc.nextInt();
   int[][] a=new int[row][col];
   int[][] b=new int[row][col];
    System.out.print("enter matrix a:");
    for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
    a[i][j]=sc.nextInt();
    }
    System.out.println();
 }
 
 print(a,row,col);
 System.out.print("enter matrix b:");
    for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
    b[i][j]=sc.nextInt();
    
    System.out.println();
   }
 }
 
 print(a,row,col);
 
 int c[][]=add(a,b,row,col);
 System.out.println("resultant matrix is:");
 print(c,row,col);
 }
 }
  
 
