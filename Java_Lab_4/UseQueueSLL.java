
/**
 * Write a description of class UseQueueSLL here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
class UseQueueSLL 
{
    public static void main(String[] args) 
    {
        QueueSLL queue = new QueueSLL();
        Scanner sc = new Scanner(System.in);
        int choice, data;
        
        do 
        {
            System.out.println("1. Enqueue, 2. Dequeue, 3. Peek, 4. Check if Queue is Empty, 5. Display Queue, 0 for exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    data = sc.nextInt();
                    queue.enqueue(data);
                    break;
                case 2:
                    System.out.println("Dequeued value: " + queue.dequeue());
                    break;
                case 3:
                    System.out.println("Front element: " + queue.peek());
                    break;
                case 4:
                    System.out.println("Is queue empty? " + queue.isEmpty());
                    break;
                case 5:
                    queue.display();
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
