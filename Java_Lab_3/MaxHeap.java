
/**
 * Write a description of class MaxHeap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class MaxHeap 
{
    
    int[] heap;
    int size;
    int capacity;

    public MaxHeap(int capacity) 
    {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    public void insert(int element) 
    {
        if (size == capacity) 
        {
            System.out.println("Heap is full! Cannot insert more elements.");
            return;
        }

        heap[size] = element;
        int current = size;
        size++;

        while (current > 0 && heap[current] > heap[(current - 1) / 2]) 
        {
            int temp = heap[current];
            heap[current] = heap[(current - 1) / 2];
            heap[(current - 1) / 2] = temp;

            current = (current - 1) / 2;
        }
    }

    public int delete() 
    {
        if (size == 0) 
        {
            System.out.println("Heap is empty! Nothing to delete.");
            return -1;
        }

        int maxElement = heap[0];
        heap[0] = heap[size - 1];
        size--;

        heapify(0);
        return maxElement;
    }

    public void heapify(int index) 
    {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;
 
        if (left < size && heap[left] > heap[largest]) 
        {
            largest = left;
        }

        if (right < size && heap[right] > heap[largest]) 
        {
            largest = right;
        }

        if (largest != index) 
        {
            int temp = heap[index];
            heap[index] = heap[largest];
            heap[largest] = temp;

            heapify(largest);
        }
    }

    public void build_heap(int[] array) 
    {
        size = array.length;
        heap = array;

        for (int i = (size / 2) - 1; i >= 0; i--) 
        {
            heapify(i);
        }
    }

    public void display_heap() 
    {
        if (size == 0) 
        {
            System.out.println("Heap is empty!");
            return;
        }
        
        System.out.print("Heap elements: ");
        for (int i = 0; i < size; i++) 
        {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void heapSort(int[] array) 
    {
        MaxHeap heapObj = new MaxHeap(array.length);
        heapObj.build_heap(array);

        for (int i = array.length - 1; i >= 0; i--) 
        {
            array[i] = heapObj.delete();
        }
    }
}

