import java.util.*;
class CalcAverage
{
    public double avgFirst(int n)
    {
        return (n+1)/2;
    
}
}
class p9b
{
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        CalcAverage c = new CalcAverage();
        System.out.print("\nEnter the number : ");
        
        try{
        int num = sca.nextInt();
        if(num<=0)
            throw new IllegalArgumentException("number less than 1...!!!");
        else
            System.out.println(c.avgFirst(num));
        }

        catch(IllegalArgumentException e)
        {
            System.out.println("Not a natural number....!!!");
        }
        catch(InputMismatchException e2)
        {
            System.out.println("not a integer...!!!");
        }
        
        
    }
}