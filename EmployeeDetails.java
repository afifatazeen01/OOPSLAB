import java.util.Scanner;
class EmployeeDetails
{             
       public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
              int n;
        System.out.println("enter no of employees:");
        n=sc.nextInt();
        int[] id=new int[n];
        int[] age=new int[n];
        int[] salary=new  int[n];
        
        Scanner s=new Scanner(System.in);
        String[] emp_name=new String[n];
        String[] emp_gen=new String[n];
        String[] emp_add= new String[n];
        
        System.out.println("enter id's of employees:");
         for(int i=0;i<n;i++){
             id[i]=sc.nextInt();
             }
         System.out.println("enter ages of employees:");
          for(int i=0;i<n;i++){
             age[i]=sc.nextInt();
             }
         System.out.println("enter salaries of employees:");
             for(int i=0;i<n;i++){
             salary[i]=sc.nextInt();
             }
        
          System.out.println("enter names of employees:");
           for(int i=0;i<n;i++){
             emp_name[i]=s.nextLine();
             }
         System.out.println("enter genders of employees:");
             for(int i=0;i<n;i++){
             emp_gen[i]=s.nextLine();
             }
         System.out.println("enter address of employees:");
               for(int i=0;i<n;i++){
             emp_add[i]=s.nextLine();
             }
        int idi;
        System.out.println("enter id of employee which you want details:");
        idi=sc.nextInt();
        for(int i=0;i<n;i++){
                         if(idi==id[i]){
                         System.out.println("employee details are:" + id[i] +"  "+ emp_name[i]+ "  "+age[i] +"  "+ salary[i] +"  "+ emp_gen[i]+"  "+ emp_add[i]);
                         }
                         else{
                         System.out.println("id not found ");
}
}
}
    }
                
