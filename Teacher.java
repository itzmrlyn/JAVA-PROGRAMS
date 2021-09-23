import java.util.Scanner;

class Employee{
Scanner sc=new Scanner(System.in);
   int empid;
   String name;
   int salary;
   String add;
   
   Employee(){
empid=0;
name=" ";
salary=0;
add=" ";


   
   System.out.println(" \n enter empid ");
   empid=sc.nextInt();
   System.out.println(" \n enter name ");
   name=sc.next();
   System.out.println(" \n enter salary ");
   salary=sc.nextInt();
   System.out.println(" \n enter address ");
   add=sc.next();
   }
}

class Teacher extends Employee{
Scanner sc= new Scanner(System.in);

String department;
String subtaught;
   Teacher(){
 department=" ";
 subtaught=" ";
  System.out.print(" \n enter department ");
  department=sc.next();
  System.out.print(" \n subject taught ");
  subtaught=sc.next();
   }

void display()
{
System.out.println("\n\n Empid "+empid);
System.out.println("Name "+name);
System.out.println("salary "+salary);
System.out.println("address "+add);
System.out.println("department "+department);
System.out.println("subject taught "+subtaught);

}



   public static void main(String args[]){
 
 
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter no of emplyees ");
  n=sc.nextInt();
  Teacher t[]=new Teacher[n];
 Teacher ob=new Teacher();
 
  for(int i=1;i<n;i++)
  {
 
  t[i]=new Teacher();
  t[i].display();
  ob.display();
 
  }
 
 
 
 
 
   }  
   

}
