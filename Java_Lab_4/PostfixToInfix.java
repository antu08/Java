
/**
 * Write a description of class UsePostFixToInFix here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;

public class PostFixToInfix 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Postfix Expression (separated by spaces): ");
        String input = sc.nextLine();
        sc.close();

        String tokens[] = input.split(" "); 
        Stack stack = new Stack(tokens.length); 

        for (int i = 0; i < tokens.length; i++) 
        {
            String current = tokens[i];

            if (current.equals("+") || current.equals("-") || current.equals("*") || current.equals("/")) {
                
                String operand2 = stack.pop();
                String operand1 = stack.pop();

                String newExpression = "(" + operand1 + " " + current + " " + operand2 + ")";
                
                stack.push(newExpression);
            }
            else 
            {
                stack.push(current);
            }
        }

        String result = stack.pop();
        System.out.println("Infix Expression: " + result);
    }
}
