
/**
 * Write a description of class UseMaxHeap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class UseMaxHeap 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        MaxHeap heap = new MaxHeap(10);

        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(6);
        heap.insert(1);
        heap.insert(8);
        heap.insert(9);
        heap.insert(4);

        System.out.println("Heap after insertions:");
        heap.display_heap();

        int deletedElement = heap.delete();
        System.out.println("Deleted Max Element: " + deletedElement);

        System.out.println("Heap after deletion:");
        heap.display_heap();

        int[] array = {3, 1, 6, 5, 2, 4};
        System.out.println("Array before sorting:");
        for (int num : array) 
        {
            System.out.print(num + " ");
        }
        System.out.println();

        MaxHeap.heapSort(array);

        System.out.println("Array after sorting:");
        for (int num : array) 
        {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}
