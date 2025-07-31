
/**
 * Write a description of class UseSLL here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
class UseSLL 
{
    public static void main(String[] args) 
    {
        SLL list = new SLL();
        Scanner sc = new Scanner(System.in);
        int choice, data;
        
        do 
        {
            System.out.println(" 1.Insert at Beginning, 2.Delete at Beginning 3.Insert at End, 4.Delete by Value, 5.Get Sum of Elements, 6.Display List, 0.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter value: ");
                    data = sc.nextInt();
                    list.insertAtBegin(data);
                    break;
                case 2:
                    System.out.println("Deleted value: " + list.deleteAtBegin());
                    break;
                case 3:
                    System.out.print("Enter value: ");
                    data = sc.nextInt();
                    list.insertAtEnd(data);
                    break;
                case 4:
                    System.out.print("Enter value to delete: ");
                    data = sc.nextInt();
                    list.deleteByValue(data);
                    break;
                case 5:
                    System.out.println("Sum of elements: " + list.getSum());
                    break;
                case 6:
                    list.display();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
        while (choice != 0);
        sc.close();
    }
}