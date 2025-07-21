
/**
 * Write a description of class SLL here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

class SLL 
{
    private Node head;

    public SLL() 
    {
        this.head = null;
    }

    public void insertAtBegin(int d) 
    {
        Node newNode = new Node(d, head);
        head = newNode;
    }

    public int deleteAtBegin() 
    {
        if (head == null) 
        {
            System.out.println("List is empty!");
            return -1;
        }
        int value = head.data;
        head = head.next;
        return value;
    }

    public void insertAtEnd(int d) 
    {
        Node newNode = new Node(d);
        if (head == null) 
        {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) 
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void deleteByValue(int d) 
    {
        while (head != null && head.data == d) 
        {
            head = head.next;
        }
        Node temp = head;
        while (temp != null && temp.next != null) 
        {
            if (temp.next.data == d) 
            {
                temp.next = temp.next.next;
            } else 
            {
                temp = temp.next;
            }
        }
    }

    public int getSum() 
    {
        int sum = 0;
        Node temp = head;
        while (temp != null) 
        {
            sum += temp.data;
            temp = temp.next;
        }
        return sum;
    }

    public void display() 
    {
        Node temp = head;
        while (temp != null) 
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

