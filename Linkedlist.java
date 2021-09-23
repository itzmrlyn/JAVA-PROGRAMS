import java.util.*;
public class Linkedlist
{
    public static void main(String[] args)
    {
        int choice;
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> lst = new LinkedList<Integer>();
        LinkedList<Integer> lst1 = new LinkedList<Integer>();
        do
        {
            System.out.println("Enter the operation you want to perform");
            System.out.println("\n1.Add\n2.Display List\n3.Clear List\n4.Exit\n ");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the element to add");
                    int n1=sc.nextInt();
                    lst.add(n1);
                    break;

                case 2:
                    System.out.println(lst);
                    break;

                case 3:
                    lst.clear();
                    System.out.println(lst);
                    break;

                case 4:
                    System.out.println("Exit point!");
                    break;

                default:
                    System.out.println("Enter a valid choice!");
                    break;
            }
        }while(choice!=4);

    }
}