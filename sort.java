import java.util.*;

 class sort {
     public static void main(String[] args)
     {
	 int n,i,j;
	 String temp;
	 Scanner reader = new Scanner(System.in);

	 System.out.print("Enter the size of the array : ");
	 n = reader.nextInt();

	 System.out.println("\nEnter Values to be inserted : \n");

	 String[] values = new String[n];

	 for(i=0;i<n;i++)
	     {
		 values[i]=reader.next();
	     }

	 for(i=0;i<n;i++)
	     {
		 for(j=0;j<n;j++)
		     {
			 if(values[i].compareTo(values[j])>0)
			     {
				 temp=values[i];
				 values[i]=values[j];
				 values[j]=temp;
			     }
		     }
	     }

	 System.out.println("The Values in the sorted order ");

	 for(i=n-1;i>=0;i--)
	     {
		 System.out.println(values[i]);
	     }
	 
     }
}
