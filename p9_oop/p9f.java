
import java.util.*;
class IllegalvalueException extends Exception
{
    public IllegalvalueException(String a)
    {
        super(a);
    }
}

class UserTrail
{
        int val1;
        int val2;

        UserTrail(int val1, int val2)
        {
            this.val1 = val1;
            this.val2 = val2;
        }

        public boolean show()
        {
            return (val1>0 && val2>0);   
        }

        
}

class p9f
{
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter Value_1 : ");
        int val1 = sca.nextInt();

        System.out.print("Enter Value_2 : ");
        int val2 = sca.nextInt();

        UserTrail ut = new UserTrail(val1,val2);

        try{
            if(!(ut.show()))
                throw new IllegalvalueException("Less than 0");
        }
        catch (Exception e) {
            System.out.println();
            System.out.println("IllegalvalueException : Less than 0 ...!!!!");
        }
    }
}