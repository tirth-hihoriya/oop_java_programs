import java.util.Scanner;


class p5b
{
    public static void main(String args[])
    {
        int size;
        Scanner sca = new Scanner (System.in);
        System.out.print("Enter the size of array: ");
        size = sca.nextInt();

        int[] a= new int[size];
        System.out.println("Enter the elements of the array");
        for (int x=0;x<size;x++)
        {
          a[x]=sca.nextInt();
        }


       
        System.out.print("Ascending order : ");
       

        //  int key;
        // for (int i = 1; i < a.length; ++i) { 
        //     int j = i - 1; 
        //     key =
        //     while (j >= 0 && a[j] > key) 
        //      {                                      //insertion sort O(n^2)
        //           a[j + 1] = a[j]; 
        //            j = j - 1; 
        //      } 
        //     a[j + 1] = key; 
        // } 

        for(int i=0;i<size-1;i++)
        {
            for (int j=0;j<size-i-1;j++)
            {
                if(a[j]>a[j+1])                  //Bubble sort  O(n^2)
            {
                int temp=a[j];
                a[j]=a[j+1];  
                a[j+1]=temp;   
            }

            }
            
        }

         
        for (int x=0;x<size;x++)
        {
            System.out.print(a[x] + ",");
        }



        System.out.print("\nDescending order : ");
        
        for(int i=0;i<size-1;i++)
        {
            for (int j=0;j<size-i-1;j++)
            {
                if(a[j]<a[j+1])                  //Bubble sort  O(n^2)
            {
                int temp=a[j];
                a[j]=a[j+1];  
                a[j+1]=temp;   
            }

            }
            
        }

        for (int x=0;x<size;x++)
        {
            System.out.print(a[x] + ",");
        }

    }
}