
/**
 * Write a description of class Bag here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Bag
{
    public Book[] books; 
    public int size;

    public Bag() 
    {
        books = new Book[10];
        size = 0;
    }

    public void insertBook(Book book) 
    {
        if (size < 10) 
        {
            books[size] = book;
            size = size + 1;
            System.out.println("Book is added");
        } 
        else 
        {
            System.out.println("Bag is full");
        }
    }

    public void searchBooksByKeyword(String keyword) 
    {
        boolean found = false;
        System.out.println("keyword for searching books: " + keyword);
        for (int i = 0; i < size; i++) 
        {
            if (books[i].containsKeyword(keyword)) 
            {
                books[i].displayBook();
                found = true;
            }
        }
        
        if (!found) 
        {
            System.out.println("No books found");
        }
    }

    public void searchBookWithMostOccurrences(String keyword) 
    {
        Book maxBook = null;
        int maxCount = 0;

        for (int i = 0; i < size; i++) 
        {
            int count = books[i].countKeywordOccurrences(keyword);
            if (count > maxCount) 
            {
                maxCount = count;
                maxBook = books[i];
            }
        }

        if (maxBook != null) 
        {
            System.out.println("Book with the most occurrences of '" + keyword + "':");
            maxBook.displayBook();
            System.out.println("Occurrences: " + maxCount);
        } 
        else 
        {
            System.out.println(" No books contain the keyword.");
        }
    }
}
