
/**
 * Write a description of class UseStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;

class UseStack 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();
        Stack stk = new Stack(size);

        while (true) 
        {
            System.out.println("1. for Push, 2. for Pop, 3.for Peek, 4. to Display, 5. for Exit");
            int choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    if (stk.isFull()) 
                    {
                        System.out.println("Stack is Full ");
                        break;
                    }
                    
                    System.out.print("Enter character to push: ");
                    char element = sc.next().charAt(0);
                    stk.push(element);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    stk.displayStack();
                    break;
                case 5:
                    System.out.println(" To exit");
                    return;
                default:
                    System.out.println("INVALID INPUT");
            }
        }
    }
}
