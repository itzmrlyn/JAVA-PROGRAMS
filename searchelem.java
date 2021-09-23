import java.util.Scanner;
public class searchelem {
    public static void main(String  [] args) {
      int n,k,flag=0;
      Scanner reader=new Scanner(System.in);
      System.out.print("Enter the number of elements in the array:");
      n=reader.nextInt();
      int a[] = new int[n];
      System.out.println("Enter  elements of array:");
      for(int i=0;i<n;i++)
      {
          a[i]=reader.nextInt();
       }
      System.out.print("Enter the element to be search:");
      k=reader.nextInt();
      for(int i=0;i<n;i++)
    {
       if(a[i]==k)
       {
         flag=1;
         System.out.print("Element found at position "+(i+1));
        }
       }
        if(flag==0)
        System.out.print("Element not found .");
     
    }
  }