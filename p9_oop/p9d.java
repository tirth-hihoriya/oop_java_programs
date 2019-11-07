import java.util.*;



class LowBalanceException extends Exception
{
    public LowBalanceException(String s)
    {
        super(s);
    }
}

class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException(String s)
    {
        super(s);
    }
}

class BankAccount
{
    int accNo;
    String custName;
    String accType;
    float balance;

    public BankAccount(int accNo,String custName, String accType, float balance)
    {
        this.accNo = accNo;
        this.accType = accType;
        this.custName = custName;
        deposite(balance);
    }

    public void deposite(float amt)
    {
        try{
        
        if(amt<=0)
            throw new IllegalArgumentException();
        else if((amt)<1000 && accType.equals("saving"))
            throw new LowBalanceException("low_balance");
        else if((amt)<5000 && accType.equals("current"))
            throw new LowBalanceException("low_balance");
        else
            balance += amt;
        }

        catch(IllegalArgumentException e)
        {
            System.out.println("Not a natural number...!!!");
        }
        catch(LowBalanceException lb)
        {
            System.out.println("Balance is LOW..!!!");
        }

    }

    public void withdraw(float amt)
    {
        try{
        
        if(amt<=0)
            throw new IllegalArgumentException();
        else if((balance-amt)<1000 && accType.equals("saving"))
            throw new InsufficientBalanceException("Insufficient_balance....!!!");
        else if((balance-amt)<5000 && accType.equals("current"))
            throw new InsufficientBalanceException("Insufficient_balance.....!!!");
        else
            balance -= amt;
        }

        catch(IllegalArgumentException e)
        {
            System.out.println("Not a natural number...!!!");
        }

        catch(InsufficientBalanceException ib)
        {
            System.out.println("Balance is LOW...... !!!");
        }
    }

    public float getBalance()
    {
        return balance;
    }

    public void getAccDetails()
    {
        System.out.println("Account Number : " + accNo);
        System.out.println("Account Holder name : " + custName);
        System.out.println("Account Type : " + accType);
        System.out.println("Account Balance : " + getBalance());


    }
}


class p9d
{
    public static void main(String[] args) {
        Scanner sca  = new Scanner(System.in);

        System.out.print("\nEnter yout NAME : ");
        String name = sca.nextLine();
        System.out.print("\nEnter the account type : ");
        String type = sca.nextLine();
        System.out.print("\nENter the initial_amount to deposite : ");
        int int_amt = sca.nextInt();

        BankAccount b = new BankAccount(123456, name, type, int_amt);
        int c;
        
        do{
        System.out.println("\nEnter 1 to DEPOSITE");
        System.out.println("Enter 2 to WITHDRAW");
        System.out.println("Enter 3 to see the BALANCE");
        System.out.println("Enter 4 to see the Account_detalis");

        System.out.println("Enter 0 to EXIT");
        System.out.print("\nEnter the option :");
        c = sca.nextInt();
        
        switch(c)
        {
            case 1:
                System.out.println("Enter the amount to DEPOSITE : ");
                float amt = sca.nextFloat(); 
                b.deposite(amt);
                break;
            case 2:
                System.out.println("Enter the amount to WITHDRAW : ");
                amt = sca.nextFloat(); 
                b.withdraw(amt);
                break;
            case 3:
                System.out.println(b.getBalance());
                break;
            case 4:
                b.getAccDetails();
                break;
            
                
        }
    }while(c!=0);
    }
}