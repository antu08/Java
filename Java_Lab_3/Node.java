
/**
 * Write a description of class SLL here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

class Node 
{
    int data;
    Node next;

    public Node(int d) 
    {
        this.data = d;
        this.next = null;
    }
 
    public Node(int d, Node n) 
    {
        this.data = d;
        this.next = n;
    }
    
    public void setNext(Node n) 
    {
        this.next = n;
    }
}
