import java.util.Scanner;
class Shape{
       public double getArea(){
       return 0.0;
       }
       public double getPerimeter(){
       return 0.0;
       }
   }
class Circle extends Shape{
       private  final double pi=3.14;
        public double getArea(double radius){
             return pi*radius*radius;
            }
        public  double getPerimeter(double radius){
            return 2*pi*radius;
            }
         }
         
         
class Square extends Shape{
         public double getArea(double side){
               return side*side;
               }
          public double getPerimeter(double side){
                return 4*side;
               }
           }     
           
class Rectangle extends Shape{
         public double getArea(double len,double brth){
               return  len*brth;
               }
          public double getPerimeter(double len,double brth){
                return 2*(len+brth);
               }
           }     
           
 
 
           
class Math{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         
         
         Circle c=new Circle();
         System.out.println("enter radius of circle:");
         double r=sc.nextDouble();
         System.out.println("Area of circle is:"+ c.getArea(r));
         System.out.println("Perimeter of circle is:"+ c.getPerimeter(r)); 
         
         
         System.out.println("enter side of square");
         Square s=new Square();
         double S=sc.nextDouble();
         System.out.println("Area of Square  is:"+s.getArea(S));
         System.out.println("Perimeter of Square is" +s.getPerimeter(S));
         
         System.out.println("enter length and breadth of a Rectangle:");
         Rectangle R=new Rectangle();
         double l=sc.nextDouble();
         double b=sc.nextDouble();
         System.out.println("Area of Rectangle is:"+R.getArea(l,b));
         System.out.println("Perimeter of Rectangle is:" + R.getPerimeter(l,b));
         }
      }
