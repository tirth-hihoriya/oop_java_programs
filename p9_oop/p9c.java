import java.util.*;

class Number
{
    int a;
    int b;
    double result;

    Number(int x, int y)
    {
        a = x;
        b = y;
    }

    public void add()
    {
        result = a+b;
        System.out.println("Addition" + result);
    }
    public void sub()
    {
        result = a-b;
        System.out.println("Subtraction" + result);

    }
    public void mul()
    {
        result = a*b;
        System.out.println("Multiplication" +  result);

    }
    public void div() throws ArithmeticException
    {
        try{
        result = a/b;
        System.out.println("Division" + result);

        }
        catch(ArithmeticException ae)
        {
            System.out.println("Divide by 0 ");
        }
    }

}

class p9c
{
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.print("\nEnter Value_1 : ");
        int val1 = sca.nextInt();

        System.out.print("\nEnter Value_2 : ");
        int val2 = sca.nextInt();



        Number n = new Number(val1,val2);
        n.add();
        n.sub();
        n.mul();
        n.div();
    }
}