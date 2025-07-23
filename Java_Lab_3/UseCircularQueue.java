
/**
 * Write a description of class UseCircularQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;

class UseCircularQueue
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int N = sc.nextInt();
        CircularQueue cq = new CircularQueue(N);
        
        System.out.print("Enter array element: ");
        for(int i = 0 ; i < N; i++)
        {
            int x = sc.nextInt();
            cq.enqueue(x);
        }
        
        while(true)
        {
            System.out.println("Enter 1. for Enqueue, 2. for Dequeue, 3. for Display array element, 4. for IsEmpty check, 5. for isFull check, 6. for exit");
            int choice = sc.nextInt();
        
            switch(choice)
            {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int val = sc.nextInt();
                    cq.enqueue(val);
                    break;
                case 2:
                    cq.dequeue();
                    break;
                case 3:
                    cq.displayQueue();
                    break;
                case 4:
                    cq.isEmpty();
                    break;
                case 5:
                    cq.isFull();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("INVALID INPUT");
                    break;
            }
            
        }
        
    }
}