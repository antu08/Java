
/**
 * Write a description of class Stack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

class Stack
{
    
    String arr[]; 
    int top;       
    int size;      

    Stack(int size) 
    {
        this.size = size;
        arr = new String[size];
        top = -1;  
    }

    void push(String value) 
    {
        if (top == size - 1) 
        {
            System.out.println("Stack is full! Cannot push " + value);
            return;
        }
        top = top + 1;
        arr[top] = value;
    }

    String pop() 
    {
        if (top == -1) 
        {
            System.out.println("Stack empty");
            return "";
        }
        String value = arr[top];
        top = top - 1;
        return value;
    }

    String peek() 
    {
        if (top == -1) 
        {
            return "";
        }
        return arr[top];
    }

    boolean isEmpty() 
    {
        if (top == -1) 
        {
            return true;
        }
        return false;
    }

    boolean isFull() 
    {
        if (top == size - 1) 
        {
            return true;
        }
        return false;
    }
}