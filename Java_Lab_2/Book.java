
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Book 
{
    public String bookName;
    public String author;
    public Page[] pages;
    public int pageCount;

    public Book(String bookName, String author, int maxPages) 
    {
        this.bookName = bookName;
        this.author = author;
        this.pages = new Page[maxPages];
        this.pageCount = 0;
    }

    public void addPage(Page page) 
    {
        if (pageCount < pages.length) 
        {
            pages[pageCount] = page;
            pageCount = pageCount + 1;
        } 
        else 
        {
            System.out.println("Cannot add more pages");
        }
    }

    public int countKeywordOccurrences(String keyword) 
    {
        int totalOccurrences = 0;
        for (int i = 0; i <pageCount; i++) 
        {
            totalOccurrences = totalOccurrences + pages[i].countKeywordOccurrences(keyword);
        }
        return totalOccurrences;
    }

    public boolean containsKeyword(String keyword) 
    {
        return (countKeywordOccurrences(keyword) > 0);
    }

    public void displayBook() 
    {
        System.out.println("Book: " + bookName);
        System.out.println("Author Name: " + author);
        System.out.println("Total Pages: " + pageCount);
    }
}
