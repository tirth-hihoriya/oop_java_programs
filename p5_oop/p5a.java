import java.util.Scanner;

class p5a
{
    public static void main(String args[])
    {
        int sum=0;
        int a[]={3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
        
        for(int i=0;i<15;i++)
        {
            sum+=a[i];
        }
        a[15] = sum;
        a[16] = sum/15;

       int min=a[0];

        for(int j=0;j<15;j++)
        {
            if(a[j] < min)
                min = a[j];
        }

        a[17] = min;
        





        System.out.print("\n");

        for(int k=0;k<18;k++)
        {
            System.out.print(a[k]+",");
        }
    }
}
