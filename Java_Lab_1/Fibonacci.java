import java.util.*;

public class Fibonacci
{
    public static void generateFibonacci(int n)
    {
        int num1 = 0, num2 = 1;

        if(n < 0)
        {
            System.out.println("Invalid Number");
        }
        else if(n == 0)
        {
            System.out.println(n );
        }
        else if(n == 1)
        {
            System.out.println(num1 + "," + num2);
        }
        else if(n >= 2)
        {
            System.out.print(num1 + "," + num2);
            for(int i = 2; i < n; i++)
            {
                int nextnum = num1 + num2;
                System.out.print("," + nextnum);
                num1 = num2;
                num2 = nextnum;
            }
        }
        
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nth terms :");   
        int n = scanner.nextInt();
        generateFibonacci(n);
    }
}