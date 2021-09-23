
import java.util.Scanner;
public class matsym{
     public static void main(String [] args) {
     int row,col,flag=0;
      Scanner reader=new Scanner(System.in);
      System.out.print("Enter the number of rows and columns:");
      row=reader.nextInt();
      col=reader.nextInt();
      int a[][] = new int[row][col];
      System.out.println("Enter  elements of matrix:");
      for(int i=0;i<row;i++)
      {
         for(int j=0;j<col;j++)
          {
            a[i][j]=reader.nextInt();
          }
      }
      System.out.println("Original matrix:  ");
      for(int i=0;i<row;i++)
      {
         for(int j=0;j<col;j++)
          {
            System.out.print(+a[i][j] + " ");
           }
      System.out.println(" ");
     
      }


    int b[][]=new int[col][row];
    for(int i=0;i<col;i++)
   {
     for(int j=0;j<row;j++)
     {
         b[i][j]=a[j][i];
      }
   }


   System.out.println("Transpose of  matrix:  ");
      for(int i=0;i<col;i++)
      {
         for(int j=0;j<row;j++)
          {
            System.out.print(+b[i][j] + " ");
           }
      System.out.println(" ");
     
      }
     

       if(row!=col)
      System.out.print("Matrix is not symmetric.");
      else
      {
       for(int i=0;i<row;i++)
       {
          for(int j=0;j<col;j++)
          {
           if(a[i][j]!=b[i][j])
           flag=1;
           break;
          }
        }
         
       if(flag==0)
       System.out.print("Matrix is symmetric.");
       else
       System.out.print("Matrix is not symmetric.");
       }
     }
   }  