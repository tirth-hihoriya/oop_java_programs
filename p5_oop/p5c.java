import java.util.Scanner;

class p5c
{
    public static void main(String args[])
    {
        Scanner sca = new Scanner(System.in);
        int n;

        System.out.print("Enter the dimension of square matrix: ");
        n= sca.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];
        int[][] d = new int[n][n];

        


        
        System.out.println("Enter the element of 1st MATRIX :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sca.nextInt();
            }
        }


        System.out.println("Enter the element of 2nd MATRIX :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j] = sca.nextInt();
            }
        }

        System.out.println("Addtion of two MATRIX is :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[i][j] =a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
       
        System.out.println();
        System.out.println("MATRIX multiplication is :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    d[i][j] +=a[i][k] * b[k][j];
                    
                }
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
        


        




    }
}