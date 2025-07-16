
/**
 * Write a description of class CircularQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class CircularQueue
{
    int[] queue;
    int N;  // SIZE OF THE ARRAY
    int front;
    int rear;
    CircularQueue(int size)
    {
        N = size;
        queue = new int[N];
        front = -1;
        rear = -1;
    }
    
    public boolean isEmpty()
    {
        return front == -1;
    }

    public boolean isFull()
    {
        return ((rear + 1) % N) == front;
    }
    
    public void enqueue(int x)
    {
        if (isFull())
        {
            System.out.println("Queue is Full");
            return;
        }
        if (isEmpty())
        {
            front = rear = 0;
        }
        else
        {
            rear = (rear+1)%N;
        }
        queue[rear] = x;
        System.out.println("The Enqueued element is : " + x);
    }
    
    public void dequeue()
    {
        if (isEmpty())
        {
            System.out.println("No element is there");
            return;
        }
        int output = queue[front];
        System.out.println("The Dequeued element is : " + output);
        
        if( front == rear)
        {
            front = rear = -1;
        }
        else
        {
            front=(front+1)%N;
        }
    }
    
    public void displayQueue()
    {
        if (isEmpty())
        {
            System.out.println("The Queue is Empty");
            return;
        }
        
        System.out.println("Queue elements are: ");
        int output = front;
        do
        {
            System.out.print(queue[output] + " ");
            output = (output + 1) % N;
        }
        while (output != (rear + 1) % N);
        System.out.println();
    }
}
