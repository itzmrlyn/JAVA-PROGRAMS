import java.util.Scanner;
import java.lang.Exception;
class MyException extends Exception
{
    public MyException(String str)
    {
        System.out.println(str);
    }
}
public class avg {
    public static void main(String[] args){
        try {
            int i, n;
            double sum=0,average;
            int elem[]=new int[40];
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter number of elements: ");
            n = reader.nextInt();
            System.out.println("Enter the elements: ");
            for (i = 0; i < n; i++) {
                elem[i] = reader.nextInt();
            }
            for(i=0;i<n;i++) {
                if (elem[i] >= 0) {
                    sum = elem[i] + sum;
                }
                else
                    throw new MyException("Number is negative");
            }
                average = sum/n;
                System.out.print("Average is :" +average);
        }
        catch (MyException m) {
            
        }
    }
}