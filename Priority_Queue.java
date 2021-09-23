import java.util.*;

public class Priority_Queue
{
    public static void main(String[] args)
    {
        int choice;
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q=new PriorityQueue<Integer>();
        do
        {
            System.out.println("Enter the operation you want to perform");
            System.out.println("1.Add element\n2.remove\n3.To find size of Queue\n4.Display Queue\n5.Exit\n");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the element to add");
                    int n1=sc.nextInt();
                    q.add(n1);
                    break;


                case 2:
                    System.out.println("Removed top element!"+q.poll());
                    break;


                case 3:
                    System.out.println("size of the Queue is "+q.size());
                    break;

                case 4:
                    System.out.println(q);
                    break;

                case 5:
                    System.out.println("Exit point!");
                    break;

                default:
                    System.out.println("Enter a valid choice!");
                    break;

            }
        }while(choice!=5);

    }
}