import java.util.*;

public class PrimeFactor 
{
    public static void calPrimeFactor(int n) 
    {
        if (n <= 0) 
        {
            System.out.println("Invalid Input");
        } 
        else 
        {
            System.out.print("Prime factors of the number are: ");
            
            
            while (n % 2 == 0) 
            {
                System.out.print(2 + " ");
                n = n / 2;
            }
            
            
            for (int i = 3; i <= Math.sqrt(n); i += 2) 
            {
                while (n % i == 0) 
                {
                    System.out.print(i + " ");
                    n = n / i;
                }
            }
            
            if (n > 2) 
            {
                System.out.print(n);
            }

            System.out.println(); 
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        calPrimeFactor(n);
    }
}
