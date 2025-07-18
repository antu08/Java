
/**
 * Write a description of class Page here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class Page 
{
    private String text;

    public Page(String text) 
    {
        this.text = text;
    }

    public String getText() 
    {
        return text;
    }

    public int countKeywordOccurrences(String keyword) 
    {
        String[] words = text.split("\\s+");
        int count = 0;
        for (String word : words) 
        {
            if (word.equalsIgnoreCase(keyword)) 
            {
                count++;
            }
        }
        return count;
    }
}

