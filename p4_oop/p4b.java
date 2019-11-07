import java.util.Scanner;

class p4b
{
    public static void main(String args[])
    {
        int number;
        System.out.println("Enter the number : ");
        Scanner sca = new Scanner(System.in);
        number = sca.nextInt();
        if(number>=2)
        {

        for(int i=2;i<number;i+=2)
        {
            System.out.println(i);
        }
        }
         else
         System.out.println("Invalid input.");
    }
}