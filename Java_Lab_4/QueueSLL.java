
/**
 * Write a description of class QueueSLL here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

class QueueSLL 
{
    private Node front, rear;

    public QueueSLL() 
    {
        this.front = this.rear = null;
    }

    public void enqueue(int data) 
    {
        Node newNode = new Node(data);
        if (rear == null) 
        {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() 
    {
        if (front == null) 
        {
            System.out.println("Queue is empty!");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null) 
        {
            rear = null;
        }
        return value;
    }

    public int peek() 
    {
        if (front == null) 
        {
            System.out.println("Queue is empty!");
            return -1;
        }
        return front.data;
    }
    
    public boolean isEmpty() 
    {
        return front == null;
    }

    public void display() 
    {
        if (front == null) 
        {
            System.out.println("Queue is empty!");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
