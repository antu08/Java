
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

class BankAccount 
{
    String accountName;
    String accountNumber;
    int pinNumber;
    double depositAmount;
    double interestRate;
    static int staticCounter = 1000;

    BankAccount(String accountName, int pinNumber, double depositAmount, double interestRate) 
    {
        if (depositAmount < 1000) 
        {
            System.out.println("ERROR: Initial deposit must be at least Rs. 1000!");
            return;
        }

        this.accountName = accountName;
        this.pinNumber = pinNumber;
        this.depositAmount = depositAmount;
        this.interestRate = interestRate;
        staticCounter = staticCounter + 1;
        this.accountNumber = "ACC" + staticCounter;
    }

    void deposit(double amount) 
    {
        if (amount <= 0) 
        {
            System.out.println("ERROR: Deposit amount must be greater than zero!");
            return;
        }
        depositAmount = depositAmount + amount;
        System.out.println("SUCCESS: Rs. " + amount + " deposited successfully!");
    }

    void withdraw(int PIN, double amount) 
    {
        if (PIN != pinNumber) 
        {
            System.out.println("ERROR: Incorrect PIN! Access Denied.");
            return;
        }
        if (amount > depositAmount) 
        {
            System.out.println("ERROR: Insufficient balance! Cannot withdraw.");
            return;
        }
        depositAmount = depositAmount - amount;
        System.out.println("SUCCESS: Rs. " + amount + " withdrawn successfully!");
    }

    void displayAccount(int PIN) 
    {
        if (PIN != pinNumber) 
        {
            System.out.println("ERROR: Incorrect PIN! Cannot display account details.");
            return;
        }
        System.out.println("=== ACCOUNT DETAILS ===");
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs. " + depositAmount);
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    double checkBalance() 
    {
        return depositAmount;
    }
}

